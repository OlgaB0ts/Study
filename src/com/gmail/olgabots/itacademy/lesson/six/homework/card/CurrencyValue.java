package com.gmail.olgabots.itacademy.lesson.six.homework.card;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;

public class CurrencyValue {
    private BigDecimal amount;
    private Currency currency;

    public CurrencyValue(BigDecimal amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public boolean isCurrencyEquals(CurrencyValue sum) {
        return sum.currency.equals(this.currency);
    }

    public void add(CurrencyValue value) {
        this.amount = this.amount.add(value.getAmount());
    }

    public void subtract(CurrencyValue value) {
        this.amount = this.amount.subtract(value.getAmount());
    }

    /**
     * Compares this {@code CurrencyValue.amount} with the specified
     * {@code BigDecimal}.
     *
     * @param value {@code BigDecimal} to which this {@code amount} is
     *              to be compared.
     * @return -1, 0, or 1 as this {@code CurrencyValue.amount} is numerically
     * less than, equal to, or greater than {@code value}.
     */
    public int compareValueTo(CurrencyValue value) {
        return this.amount.compareTo(value.getAmount());
    }

    @Override
    public String toString() {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(CardOperations.LOCALE_BY);
        numberFormat.setCurrency(currency);
        numberFormat.setMaximumFractionDigits(currency.getDefaultFractionDigits());
        return numberFormat.format(amount);
    }
}
