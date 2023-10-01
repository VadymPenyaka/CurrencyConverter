package org.projects.http;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Connection {
    public static HttpURLConnection getConnection () throws IOException {
        URL url = new URL("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json");
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        return request;
    }
}
