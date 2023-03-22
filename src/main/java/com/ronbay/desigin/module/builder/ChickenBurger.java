package com.ronbay.desigin.module.builder;

/**
 * @ClassName: ChickenBurger
 * @Description: 鸡肉汉堡
 * @Author
 * @Date 2021/11/23
 * @Version 1.0
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
