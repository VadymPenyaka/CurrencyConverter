package org.projects.entity;

import java.time.LocalDate;
import java.util.Objects;

public class Currency {
    private String name;
    private String ukrName;
    private double rate;
    private LocalDate exchangeDate;

    public Currency(String name, String ukrName, double rate, LocalDate exchangedate) {
        this.name = name;
        this.ukrName = ukrName;
        this.rate = rate;
        this.exchangeDate = exchangedate;
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
        return exchangeDate;
    }

    public void setExchangedate(LocalDate exchangedate) {
        this.exchangeDate = exchangedate;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", Ukr. name='" + ukrName + '\'' +
                ", rate=" + rate +
                ", exchange date=" + exchangeDate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Currency that)) return false;

        if (Double.compare(that.rate, rate) != 0) return false;
        if (!Objects.equals(name, that.name)) return false;
        if (!Objects.equals(ukrName, that.ukrName)) return false;
        return Objects.equals(exchangeDate, that.exchangeDate);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (ukrName != null ? ukrName.hashCode() : 0);
        temp = Double.doubleToLongBits(rate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (exchangeDate != null ? exchangeDate.hashCode() : 0);
        return result;
    }
}
