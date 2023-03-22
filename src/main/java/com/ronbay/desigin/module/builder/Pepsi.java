package com.ronbay.desigin.module.builder;

/**
 * @ClassName: Pepsi
 * @Description: 百事实现类-实现ColdDrink
 * @Author
 * @Date 2021/11/23
 * @Version 1.0
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
