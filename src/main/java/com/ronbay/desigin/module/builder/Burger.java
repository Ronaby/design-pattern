package com.ronbay.desigin.module.builder;

/**
 * @Description: Item 接口的抽象类，该类提供了默认的功能
 * @Author
 * @Date 2021/11/23
 * @Version 1.0
 */
public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }
    @Override
    public abstract float price();
}
