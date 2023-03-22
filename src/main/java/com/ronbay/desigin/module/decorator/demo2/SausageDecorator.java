package com.ronbay.desigin.module.decorator.demo2;

/**
 * @ClassName: SausageDecorator
 * @Description: 香肠装饰器
 * @Author
 * @Date 2022/3/23
 * @Version 1.0
 */
public class SausageDecorator extends BattercakeDecotator{

    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    public void doSomething() {

    }

    @Override
    public String getMsg() {
        return super.getMsg() + "1根香肠";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }
}
