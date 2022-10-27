package Сurrencies.adapters;

import Сurrencies.interfaces.valueDollarI;
import Сurrencies.interfaces.valueEuroI;
import Сurrencies.interfaces.valueRusI;

public class DollarAdapter implements valueRusI, valueEuroI {
    valueDollarI valuedollar;

    public DollarAdapter(valueDollarI valuedollar) {
        this.valuedollar = valuedollar;
    }

    @Override
    public double valueRus() {
       return valuedollar.valueDollar() / 61.3;
    }

    @Override
    public double valueEuro() {
        return valuedollar.valueDollar() / 0.8;
    }
}
