package org.projects.currency;

import com.google.gson.*;
import org.projects.exception.CustomException;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class CurencyService {
    static private Map currencyHashMap = new HashMap<String, CurrencyData>();
    public void getRatesHttpGetRequset() throws IOException {
        URL url = new URL("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json");
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonArray jsonArray = root.getAsJsonArray();
        for (int i = 0; i < jsonArray.size(); ++i) {
            JsonElement element= jsonArray.get(i);
            JsonObject jsonObject = element.getAsJsonObject();
            currencyHashMap.put(jsonObject.get("cc").getAsString(), createCurrency(jsonObject));
        }

    }

    public LocalDate paeseStringToLocalDate (String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.MM.yyyy");
        return LocalDate.parse(date,formatter);
    }

    public CurrencyData createCurrency (JsonObject jsonObject){
        return new CurrencyData(
                jsonObject.get("cc").getAsString(),
                jsonObject.get("txt").getAsString(),
                jsonObject.get("rate").getAsDouble(),
                paeseStringToLocalDate(jsonObject.get("exchangedate").getAsString()));
    }

    public double convertToUAH (double amount, CurrencyData currencyData) {
        return currencyData.getRate()*amount;
    }

    public double convertUAHToCurrency (double amount, CurrencyData currencyData) {
        return 1/currencyData.getRate()*amount;
    }

    public CurrencyData getCurrencyDateByName (String name) throws CustomException {
        if (!currencyHashMap.containsKey(name))
            throw new CustomException("Incorect currency name"); //create custom exception
        return (CurrencyData) currencyHashMap.get(name);
    }


}
