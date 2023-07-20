package org.projects;

import org.projects.currency.CurencyService;
import org.projects.exception.CustomException;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static CurencyService curencyService = new CurencyService();
    public static void main(String[] args) throws IOException, CustomException {
        System.out.println("Welcome to currency converter!");
        System.out.println("Enter curency:");

        curencyService.getRatesHttpGetRequset();


    }

    private static double choseAndPerformAction (double amount, String currencyName) {
        System.out.println("Chose сonvert currency to UAH(enter 1) or UAH to currency(enter any other number):");
        int action = scanner.nextInt();

        switch (action) {
            case 1 -> {
                try {
                    return curencyService.convertToUAH(amount, curencyService.getCurrencyDateByName(currencyName));
                } catch (CustomException e) {
                    throw new RuntimeException(e);
                }
            }
            default -> {
                try {
                    return curencyService.convertUAHToCurrency(amount, curencyService.getCurrencyDateByName(currencyName));
                } catch (CustomException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }


}