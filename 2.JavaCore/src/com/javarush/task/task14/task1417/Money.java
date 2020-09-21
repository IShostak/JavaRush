package com.javarush.task.task14.task1417;

public abstract class Money {
    public Money(double amount) {
        this.setAmount(amount);
    }
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public abstract String getCurrencyName();
}

