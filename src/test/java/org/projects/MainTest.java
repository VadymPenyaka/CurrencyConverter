package org.projects;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.projects.service.CurrencyServiceImpl;
import org.projects.entity.Currency;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.time.LocalDate;

public class MainTest {
    private ByteArrayInputStream testIn;
    private final InputStream systemIn = System.in;
    @InjectMocks
    Main main = new Main();

    @Mock
    CurrencyServiceImpl curencyService;

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    @Test
    public void choseAndPerformExchangeTest () {
        provideInput("1");
        Currency currencyData = new Currency("AUD", "Австралійський долар", 1, LocalDate.now());
        Mockito.when(curencyService.convertUAHToCurrency(1, currencyData)).thenReturn(0.1);
        Assert.assertEquals(1.0, curencyService.convertToUAH(1, currencyData), 0);
    }

}
