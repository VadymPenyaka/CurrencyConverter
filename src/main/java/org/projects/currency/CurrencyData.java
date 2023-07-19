package org.projects.currency;

import java.time.LocalDate;
import java.util.Objects;

public class CurrencyData {
    private String name;
    private String ukrName;
    private double rate;
    private LocalDate exchangedate;

    public CurrencyData(String name, String ukrName, double rate, LocalDate exchangedate) {
        this.name = name;
        this.ukrName = ukrName;
        this.rate = rate;
        this.exchangedate = exchangedate;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUkrName() {
        return ukrName;
    }

    public void setUkrName(String ukrName) {
        this.ukrName = ukrName;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public LocalDate getExchangedate() {
        return exchangedate;
    }

    public void setExchangedate(LocalDate exchangedate) {
        this.exchangedate = exchangedate;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "name='" + name + '\'' +
                ", ukrName='" + ukrName + '\'' +
                ", rate=" + rate +
                ", exchangedate=" + exchangedate +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CurrencyData that)) return false;

        if (Double.compare(that.rate, rate) != 0) return false;
        if (!Objects.equals(name, that.name)) return false;
        if (!Objects.equals(ukrName, that.ukrName)) return false;
        return Objects.equals(exchangedate, that.exchangedate);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (ukrName != null ? ukrName.hashCode() : 0);
        temp = Double.doubleToLongBits(rate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (exchangedate != null ? exchangedate.hashCode() : 0);
        return result;
    }
}
