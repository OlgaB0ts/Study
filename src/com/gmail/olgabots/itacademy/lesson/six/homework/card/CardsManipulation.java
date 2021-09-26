package com.gmail.olgabots.itacademy.lesson.six.homework.card;

import java.math.BigDecimal;
import java.util.Currency;


public class CardsManipulation {

    public static void execute() {
        Currency byCurrency = CardOperations.LOCALE_CURRENCY;

        CreditCard firstCard = CardOperations.createCreditCard(876854454l, new CurrencyValue(BigDecimal.valueOf(503.23), byCurrency));
        CardOperations.replenish(firstCard, new CurrencyValue(BigDecimal.valueOf(200), byCurrency));
        CardOperations.printCardInfo(firstCard);

        CreditCard secondCard = CardOperations.createCreditCard(9878755453l, new CurrencyValue(BigDecimal.valueOf(1000.76), byCurrency));
        CardOperations.replenish(secondCard, new CurrencyValue(BigDecimal.valueOf(50), byCurrency));
        CardOperations.printCardInfo(secondCard);

        CreditCard thirdCard = CardOperations.createCreditCard(321354312l, new CurrencyValue(BigDecimal.valueOf(200.98), byCurrency));
        CardOperations.withdraw(thirdCard, new CurrencyValue(BigDecimal.valueOf(50), byCurrency));
        CardOperations.printCardInfo(thirdCard);
    }


}
