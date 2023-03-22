package com.ronbay.desigin.module.builder;

/**
 * @ClassName: VegBurger
 * @Description: 素餐-汉堡实现汉堡
 * @Author
 * @Date 2021/11/23
 * @Version 1.0
 */
public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
