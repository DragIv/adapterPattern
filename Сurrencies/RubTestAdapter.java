package Сurrencies;

import Сurrencies.adapters.RubAdapter;
import Сurrencies.interfaces.valueDollarI;
import Сurrencies.interfaces.valueRusI;
import Сurrencies.money.Dollar;
import Сurrencies.money.Rub;

public class RubTestAdapter {
    public static void main(String[] args) {
        valueRusI rub = new Rub();
        valueDollarI dol = new Dollar();
        valueDollarI rubAdapter = new RubAdapter(rub);

        System.out.println("Dollar:");
        System.out.println(dol.valueDollar());

        System.out.println("\nRub:");
        System.out.println(rub.valueRus());

        System.out.println("\n1 dollar in rubles:");
        testDollar(rubAdapter);
    }

    static void testDollar(valueDollarI dollar) {
        System.out.println(dollar.valueDollar());
    }
}
