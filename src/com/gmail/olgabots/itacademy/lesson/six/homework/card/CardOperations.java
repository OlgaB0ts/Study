package com.gmail.olgabots.itacademy.lesson.six.homework.card;

import java.util.Currency;
import java.util.Locale;

public class CardOperations {

    public static final Locale LOCALE_BY = new Locale("ru", "BY");
    public static final Currency LOCALE_CURRENCY = Currency.getInstance(LOCALE_BY);

    /**
     * top up balance of {@code CreditCard} by amount {@code CurrencyValue}
     *
     * @param card  credit card is to be replenished
     * @param value replenishment amount
     */
    public void replenish(CreditCard card, CurrencyValue value) {
        System.out.println("\nReplenish in process...");
        if (card.getBalance().isCurrencyEquals(value)) {
            card.getBalance().add(value);
            System.out.println(value + " transferred to account number " + card.getAccountNumber());
            System.out.println("Replenishment is completed successful");
        } else {
            System.out.println("Can not add value. Currencies are different. Not available now how to convert.");
        }
    }

    /**
     * withdraws value of amount from credit card
     *
     * @param card  credit card which money is to be charged
     * @param value amount to be debited from the account
     */
    public void withdraw(CreditCard card, CurrencyValue value) {
        System.out.println("\nAmount of " + value.toString() + " is in the process of debiting from account " + card.getAccountNumber());
        if (card.getBalance().compareValueTo(value) == -1) {
            System.out.println("Withdraw failed. Insufficient funds on the account");
        } else {
            card.getBalance().subtract(value);
            getBanknotes(value);
            System.out.println("Withdraw completed successful");
        }
    }

    private void getBanknotes(CurrencyValue withdrawSum) {
        System.out.println("Take your money in amount: " + withdrawSum.toString());
    }

    public CreditCard createCreditCard(long accountNumber, CurrencyValue value) {
        CreditCard creditCard = new CreditCard(accountNumber, value);
        System.out.println("Credit card created.\n" + creditCard.getInfo());
        return creditCard;
    }

    public void printCardInfo(CreditCard card) {
        System.out.println("\nCard info:");
        System.out.println(card.getInfo());
        System.out.println("--------------------------------------");
    }

}
