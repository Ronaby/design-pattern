package com.ronbay.desigin.module.factory.abs;

import com.ronbay.desigin.module.factory.Mengniu;
import com.ronbay.desigin.module.factory.Milk;
import com.ronbay.desigin.module.factory.Telunsu;
import com.ronbay.desigin.module.factory.Yili;

/**
 * 抽象工厂
 */
public abstract class AbstractFactory {

    abstract Milk getMengniu();

    abstract Milk getTelunsu();

    abstract Milk getYili();
}
