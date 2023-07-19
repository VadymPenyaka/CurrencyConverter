package org.projects;

import org.projects.currency.CurencyService;
import org.projects.exception.CustomException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, CustomException {
//        System.out.println("Hello world!");
//        CurencyService curencyService = new CurencyService();
//        Map<String, Double> ratesMap;
//        try {
//            ratesMap = curencyService.getRatesHttpGetRequset();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        for (String nameOfCurency:ratesMap.keySet()) {
//            System.out.print(nameOfCurency+"; ");
//        }

        CurencyService curencyService = new CurencyService();
        curencyService.getRatesHttpGetRequset();
        System.out.println(curencyService.convertToUAH(1, "USD"));

    }


}