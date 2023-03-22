package com.ronbay.desigin.module.factory.func;

import com.ronbay.desigin.module.factory.Mengniu;
import com.ronbay.desigin.module.factory.Milk;

public class MengniuFactory implements Factory{

    @Override
    public Milk getMilk() {
        return new Mengniu();
    }
}
