package org.projects.service;

import org.projects.entity.Currency;
import org.projects.exception.CustomException;

import java.util.Scanner;

public class ConverterServiceImpl implements ConverterService {//вибір купити чи продати валюту
    private Scanner scanner = new Scanner(System.in);
    private final CurrencyService curencyService;

    private int action;
    private double amount;

    private double result;

    public ConverterServiceImpl(CurrencyService curencyService) {
        this.curencyService = curencyService;
    }


    @Override
    public double getExchangeResult(String convertFromCurency, String convertToCurrency) {
        Currency currency1 = curencyService.getCurrencyByName(convertFromCurency).orElseThrow(new CustomException("df"));

        return curencyService.getCurrencyByName(convertFromCurency)*curencyService.getCurrencyByName(convertToCurrency).orElseThrow(new CustomException(""));
    }


    //    public double convertToUAH (double amount, Currency currencyData) {
//        return currencyData.getRate()*amount;
//    }
//
//    public double convertUAHToCurrency (double amount, Currency currencyData) {
//        return 1/currencyData.getRate()*amount;
//    }
}




//    public double getResult() {
//        return result;
//    }
//
//    public ConverterServiceImpl(int action, double amount) {
//        this.action = action;
//        this.amount = amount;
//    }
//
//    public double setAmount(double amount) throws CustomException {
//        if (amount<=0) {
//            throw new CustomException("Incorrect amount");
//        }
//        return amount;
//    }
//
//    public Currency setCurrency (String currencyName)  {
//        Currency currencyData;
//        try {
//            currencyData = curencyService.getCurrencyDateByName(currencyName);
//        } catch (CustomException e) {
//            throw new RuntimeException(e);
//        }
//        return currencyData;
//    }
//
//    public void choseAndPerformExchange (int action, double amount, String currencyName) throws CustomException {
//        if (action == 1) {
//            result = curencyService.convertToUAH(setAmount(amount), setCurrency(currencyName));
//        }
//        result = curencyService.convertUAHToCurrency(setAmount(amount), setCurrency(currencyName));
//
//    }