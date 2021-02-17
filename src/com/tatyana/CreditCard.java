package com.tatyana;

public class CreditCard {

    private long number;

    public CreditCard(long number) {
        this.number = number;
    }

    public long getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "number=" + number +
                '}';
    }
}
