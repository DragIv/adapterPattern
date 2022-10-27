package Сurrencies;

import Сurrencies.adapters.EuroAdapter;
import Сurrencies.interfaces.valueDollarI;
import Сurrencies.interfaces.valueEuroI;
import Сurrencies.money.Dollar;
import Сurrencies.money.Euro;


public class EuroTestAdapter {
    public static void main(String[] args) {
        valueEuroI euro = new Euro();
        valueDollarI dol = new Dollar();

        valueDollarI euroAdapter = new EuroAdapter(euro);

        System.out.println("Dollar:");
        System.out.println(dol.valueDollar());

        System.out.println("\nEuro:");
        System.out.println(euro.valueEuro());

        System.out.println("\n1 euro in dollars:");
        testEuro(euroAdapter);
    }

    static void testEuro(valueDollarI dollar) {
        System.out.println(dollar.valueDollar());
    }

}
