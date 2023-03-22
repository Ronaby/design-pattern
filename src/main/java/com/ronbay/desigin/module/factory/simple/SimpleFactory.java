package com.ronbay.desigin.module.factory.simple;

import com.ronbay.desigin.module.factory.Mengniu;
import com.ronbay.desigin.module.factory.Milk;
import com.ronbay.desigin.module.factory.Telunsu;
import com.ronbay.desigin.module.factory.Yili;

public class SimpleFactory {

    public Milk getMilk(String name){
        if ("特仑苏".equals(name)){
            return new Telunsu();
        }else if ("蒙牛".equals(name)){
            return new Mengniu();
        }else if ("伊犁".equals(name)){
            return new Yili();

        }
        return null;
    }
}
