package org.projects;

import java.io.IOException;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        CurencyService curencyService = new CurencyService();
        Map<String, Double> ratesMap;
        try {
            ratesMap = curencyService.getRatesHttpGetRequset();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (String nameOfCurency:ratesMap.keySet()) {
            if (nameOfCurency.equals("USD")) {
                System.out.println(ratesMap.get(nameOfCurency));
            }
        }
    }


}