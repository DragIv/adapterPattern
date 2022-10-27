package Сurrencies.adapters;

import Сurrencies.interfaces.valueDollarI;
import Сurrencies.interfaces.valueEuroI;

public class EuroAdapter implements valueDollarI {
    valueEuroI valueeuro;

    public EuroAdapter(valueEuroI valueeuro) {
        this.valueeuro = valueeuro;
    }

    @Override
    public double valueDollar() {
        return valueeuro.valueEuro();
    }
}
