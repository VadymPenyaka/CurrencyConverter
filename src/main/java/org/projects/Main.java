package org.projects;

import java.io.IOException;

public class Main {
//    private static Scanner scanner = new Scanner(System.in);
//    private static CurencyServiceImpl curencyService = new CurencyServiceImpl();
    public static void main(String[] args) throws IOException{


//        System.out.println("Welcome to currency converter!");
//        curencyService.getRatesHttpGetRequset();

//        ConverterService converterService = new ConverterService();
//        converterService.setCurrency("LKJLJL");
    }

//    private static double choseAndPerformExchange (double amount, CurrencyData currencyData) {
//        System.out.println("Chose сonvert currency to UAH(enter 1) or UAH to currency(enter any other number):");
//
//        if (scanner.nextInt() == 1) {
//            return curencyService.convertToUAH(amount, currencyData);
//        }
//
//        return curencyService.convertUAHToCurrency(amount, currencyData);
//    }

//    private static void perform () {
//        System.out.println("To print all currencies press 1, to continue enter any other number");
//        if (scanner.nextInt()==1){
//            Consumer<CurrencyData> printCurrencyData = System.out::println;
//            CurencyService.getCurrencyHashMap().values().stream().forEach(printCurrencyData);
//        }
//        System.out.println("Result: "+ choseAndPerformExchange(enterAmount(), enterCurrency()));
//        System.out.println("If you wont to continue press 1, or enter any other number if you wont ot exit");
//        if (scanner.nextInt()==1)
//            perform();
//    }

//    private static CurrencyData enterCurrency () {//make method return exception message
//        CurrencyData currencyData;
//        System.out.println("Enter curency:");
//        String name = scanner.nextLine();
//        try {
//            currencyData= curencyService.getCurrencyDateByName(name);
//        } catch (CustomException e) {
//            System.err.println("Incorect currency name");
//            currencyData=enterCurrency();
//        }
//        return currencyData;
//    }

//    private static double enterAmount () {
//        System.out.println("Enter amount:");
//        double amount = scanner.nextDouble();
//        scanner.nextLine();
//        if (amount<=0) {
//            System.err.println("Amount must be greater than zero!");
//            return enterAmount();
//        }
//        return amount;
//    }


}