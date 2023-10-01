package org.projects.http;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;

public class JsonInit {

    public static Map<String, Currency> getRatesHttpGetRequset() throws IOException {
        Map currencyHashMap = new HashMap<String, org.projects.entity.Currency>();
        HttpURLConnection request = Connection.getConnection();
        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonArray jsonArray = root.getAsJsonArray();
        for (int i = 0; i < jsonArray.size(); ++i) {
            JsonElement element= jsonArray.get(i);
            JsonObject jsonObject = element.getAsJsonObject();
            currencyHashMap.put(jsonObject.get("cc").getAsString(), createCurrency(jsonObject));//add to curency service
        }
        return currencyHashMap;
    }

    private static org.projects.entity.Currency createCurrency(JsonObject jsonObject){
        return new org.projects.entity.Currency(
                jsonObject.get("cc").getAsString(),
                jsonObject.get("txt").getAsString(),
                jsonObject.get("rate").getAsDouble(),
                paeseStringToLocalDate(jsonObject.get("exchangedate").getAsString()));
    }

    private static LocalDate paeseStringToLocalDate(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.MM.yyyy");
        return LocalDate.parse(date,formatter);
    }

}
