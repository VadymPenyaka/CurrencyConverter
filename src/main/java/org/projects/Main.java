package org.projects;

import org.projects.currency.CurencyService;
import org.projects.currency.CurrencyData;
import org.projects.exception.CustomException;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static CurencyService curencyService = new CurencyService();
    public static void main(String[] args) throws IOException, CustomException {
        System.out.println("Welcome to currency converter!");
        curencyService.getRatesHttpGetRequset();
        perform();
    }

    private static double choseAndPerformExchange (double amount, CurrencyData currencyData) {
        System.out.println("Chose сonvert currency to UAH(enter 1) or UAH to currency(enter any other number):");
        int action = scanner.nextInt();

        switch (action) {
            case 1 -> {
                    return curencyService.convertToUAH(amount, currencyData);
            }
            default -> {
                    return curencyService.convertUAHToCurrency(amount, currencyData);
            }
        }

    }

    private static void perform () {
        System.out.println("Resullt: "+ choseAndPerformExchange(enterAmount(), enterCurrency()));
        System.out.println("If you wont to continue press 1, or enter any other number if you wont ot exit");
        if (scanner.nextInt()==1)
            perform();
    }

    private static CurrencyData enterCurrency () {//make method return exception message
        CurrencyData currencyData;
        System.out.println("Enter curency:");
//        scanner.nextLine();
        String name = scanner.nextLine();
        try {
            currencyData= curencyService.getCurrencyDateByName(name);
        } catch (CustomException e) {
            currencyData=enterCurrency();
        }
        return currencyData;
    }

    private static double enterAmount () {
        System.out.println("Enter amount:");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        if (amount<=0) {
            System.err.println("Amount must be greater than zero!");
            return enterAmount();
        }
        return amount;
    }


}