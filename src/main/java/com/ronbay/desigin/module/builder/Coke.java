package com.ronbay.desigin.module.builder;

/**
 * @ClassName: Coke
 * @Description: 可乐-实现ColdDrink
 * @Author
 * @Date 2021/11/23
 * @Version 1.0
 */
public class Coke extends ColdDrink{
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
