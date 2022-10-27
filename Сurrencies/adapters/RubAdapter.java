package Сurrencies.adapters;

import Сurrencies.interfaces.valueDollarI;
import Сurrencies.interfaces.valueRusI;

public class RubAdapter implements valueDollarI {
    valueRusI valuerus;

    public RubAdapter(valueRusI valuerus) {
        this.valuerus = valuerus;
    }

    @Override
    public double valueDollar() {
        return valuerus.valueRus();
    }

}
