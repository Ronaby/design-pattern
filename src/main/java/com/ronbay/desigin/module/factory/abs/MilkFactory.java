package com.ronbay.desigin.module.factory.abs;

import com.ronbay.desigin.module.factory.Milk;
import com.ronbay.desigin.module.factory.func.MengniuFactory;
import com.ronbay.desigin.module.factory.func.TelunsuFactory;
import com.ronbay.desigin.module.factory.func.YiliFactory;

public class MilkFactory extends AbstractFactory{
    @Override
    Milk getMengniu() {
        return new MengniuFactory().getMilk();
    }

    @Override
    Milk getTelunsu() {
        return new TelunsuFactory().getMilk();
    }

    @Override
    Milk getYili() {
        return new YiliFactory().getMilk();
    }
}
