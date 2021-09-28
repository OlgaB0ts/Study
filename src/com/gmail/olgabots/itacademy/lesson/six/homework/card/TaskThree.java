package com.gmail.olgabots.itacademy.lesson.six.homework.card;

import java.math.BigDecimal;


public class TaskThree {

    public void process() {

        CardOperations cardOperations = new CardOperations();
        CreditCard firstCard = cardOperations.createCreditCard(876854454L, new CurrencyValue(BigDecimal.valueOf(503.23), CardOperations.LOCALE_CURRENCY));
        cardOperations.replenish(firstCard, new CurrencyValue(BigDecimal.valueOf(200), CardOperations.LOCALE_CURRENCY));
        cardOperations.printCardInfo(firstCard);

        CreditCard secondCard = cardOperations.createCreditCard(9878755453L, new CurrencyValue(BigDecimal.valueOf(1000.76), CardOperations.LOCALE_CURRENCY));
        cardOperations.replenish(secondCard, new CurrencyValue(BigDecimal.valueOf(50), CardOperations.LOCALE_CURRENCY));
        cardOperations.printCardInfo(secondCard);

        CreditCard thirdCard = cardOperations.createCreditCard(321354312L, new CurrencyValue(BigDecimal.valueOf(200.98), CardOperations.LOCALE_CURRENCY));
        cardOperations.withdraw(thirdCard, new CurrencyValue(BigDecimal.valueOf(50), CardOperations.LOCALE_CURRENCY));
        cardOperations.printCardInfo(thirdCard);
    }


}
