package org.projects.currency;

public class CurrencyServiceTest {
//    private static final CurencyServiceImpl curencyService = new CurencyServiceImpl();
//
//    @BeforeClass
//    public static void setup () throws IOException,CustomException {
//        curencyService.getRatesHttpGetRequset();
//    }
//
//    @Test
//    public void getRatesHttpGetRequsetTest() {
//        Assert.assertNotNull(CurencyServiceImpl.getCurrencyHashMap());
//    }
//
//    @Test
//    public void createCurrencyTest () throws CustomException {
//        Currency actual = curencyService.getCurrencyDateByName("AUD");
//        actual.setRate(0);
//        Currency expected = new Currency("AUD", "Австралійський долар", actual.getRate(), actual.getExchangedate());
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void getCurrencyDateByNameTest () throws CustomException {
//        Currency expected = (Currency) CurencyServiceImpl.getCurrencyHashMap().get("USD");
//        Currency actual = curencyService.getCurrencyDateByName("USD");
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void getCurrencyDateByNameExceptionTest () {
//        Assert.assertThrows(CustomException.class, () ->{
//            curencyService.getCurrencyDateByName("Incorect name");
//        });
//    }
//
//    @Test
//    public void paeseStringToLocalDateTest () {
//        LocalDate expected = LocalDate.of(2000, 1, 1);
//        LocalDate actual = curencyService.paeseStringToLocalDate("01.01.2000");
//
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void convertToUAH_convertUAHToCurrencyTest () {
//        Currency currencyData = new Currency("Name", "UkrName", 10, LocalDate.now());
//        double expected = 20.0;
//        double actual = curencyService.convertToUAH(2, currencyData);
//        Assert.assertEquals(expected, actual, 0.0001);
//        actual = curencyService.convertUAHToCurrency(2, currencyData);
//        expected = 0.2;
//        Assert.assertEquals(expected, actual, 0.0001);
//    }
}
