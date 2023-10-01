package org.projects.service;

import org.projects.http.JsonInit;
import java.io.IOException;
import java.util.*;

public class CurrencyServiceImpl implements CurrencyService{
    private Map currencyHashMap;

    public CurrencyServiceImpl() throws IOException {
        currencyHashMap= JsonInit.getRatesHttpGetRequset();
    }


    @Override
    public Optional<Object> getCurrencyByName(String name) {
        return Optional.of( currencyHashMap.get(name));
    }
}

//    public Currency getCurrency (String currencyName)  {
//        Currency currency;
//        try {
//            currency = getCurrencyDateByName(currencyName);
//        } catch (CustomException e) {
//            throw new RuntimeException(e);
//        }
//        return currency;
//        return null;
//    }
