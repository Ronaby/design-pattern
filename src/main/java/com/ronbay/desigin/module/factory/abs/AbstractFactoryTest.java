package com.ronbay.desigin.module.factory.abs;


public class AbstractFactoryTest {

    public static void main(String[] args) {
        //对于用户而言，更加简单了
        //用户只有选择的权利，更加简单了
        MilkFactory milkFactory = new MilkFactory();
        System.out.println(milkFactory.getMengniu());

    }
}
