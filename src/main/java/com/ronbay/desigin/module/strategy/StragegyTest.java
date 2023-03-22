package com.ronbay.desigin.module.strategy;

public class StragegyTest {

    public static void main(String[] args) {
        int res = new Context(new AddOperate()).excuteStrategy(5,3);
        System.out.println(res);
    }
}
