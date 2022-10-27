package Сurrencies;

import Сurrencies.adapters.DollarAdapter;
import Сurrencies.interfaces.valueDollarI;
import Сurrencies.interfaces.valueEuroI;
import Сurrencies.interfaces.valueRusI;
import Сurrencies.money.Dollar;
import Сurrencies.money.Rub;

public class DollarTestAdapter {
    public static void main(String[] args) {
        valueRusI rub = new Rub();
        valueDollarI dol = new Dollar();
        valueRusI dollarAdapter = new DollarAdapter(dol);
        valueEuroI dollarAdapter2 = new DollarAdapter(dol);

        System.out.println("Dollar:");
        System.out.println(dol.valueDollar());

        System.out.println("\nRub:");
        System.out.println(rub.valueRus());

        System.out.println("\n1 ruble in dollars:");
        testRub(dollarAdapter);

        System.out.println("\n1 euro in dollars:");
        testEuro(dollarAdapter2);
    }

    static void testRub(valueRusI rub) {
        System.out.println(rub.valueRus());
    }
    static void testEuro(valueEuroI euro) {
        System.out.println(euro.valueEuro());
    }

}
