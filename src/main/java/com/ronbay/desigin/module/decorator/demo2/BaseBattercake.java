package com.ronbay.desigin.module.decorator.demo2;

/**
 * @ClassName: BaseBattercake
 * @Description: 鸡蛋煎饼
 * @Author
 * @Date 2022/3/23
 * @Version 1.0
 */
public class BaseBattercake extends Battercake{
    @Override
    public String getMsg() {
        return "煎饼";
    }

    @Override
    public int getPrice() {
        return 5;
    }
}
