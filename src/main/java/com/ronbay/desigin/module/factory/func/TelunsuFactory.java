package com.ronbay.desigin.module.factory.func;

import com.ronbay.desigin.module.factory.Milk;
import com.ronbay.desigin.module.factory.Telunsu;

public class TelunsuFactory implements Factory{
    @Override
    public Milk getMilk() {
        return new Telunsu();
    }
}
