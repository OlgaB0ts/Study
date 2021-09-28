package com.gmail.olgabots.itacademy.lesson.six.homework.card;

public class CreditCard {

    private long accountNumber;
    private CurrencyValue balance;

    public CreditCard(long accountNumber, CurrencyValue balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long getAccountNumber() {

        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {

        this.accountNumber = accountNumber;
    }

    public CurrencyValue getBalance() {

        return balance;
    }

    public void setBalance(CurrencyValue balance) {

        this.balance = balance;
    }

    public String getInfo() {
        return "Account number: ".concat(String.valueOf(accountNumber)).concat("\nBalance: ".concat(balance.toString()));
    }
}
