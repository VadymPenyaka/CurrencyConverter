package org.projects;

import com.google.gson.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class CurencyService {
    public Map<String, Double> getRatesHttpGetRequset() throws IOException {
        URL url = new URL("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json");
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonArray jsonArray = root.getAsJsonArray();
        Map ratesMap = new HashMap<String, Double>();

        for (int i = 0; i < jsonArray.size(); ++i) {
            JsonElement element= jsonArray.get(i);
            JsonObject jsonObject = element.getAsJsonObject();

            ratesMap.put(jsonObject.get("cc").getAsString(), jsonObject.get("rate").getAsDouble());
        }

        return ratesMap;
    }

}
