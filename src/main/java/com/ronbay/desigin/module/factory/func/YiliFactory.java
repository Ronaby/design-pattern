package com.ronbay.desigin.module.factory.func;

import com.ronbay.desigin.module.factory.Milk;
import com.ronbay.desigin.module.factory.Yili;

public class YiliFactory implements Factory{
    @Override
    public Milk getMilk() {
        return new Yili();
    }
}
