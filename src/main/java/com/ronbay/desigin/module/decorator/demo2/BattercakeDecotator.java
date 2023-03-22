package com.ronbay.desigin.module.decorator.demo2;

/**
 * @ClassName: BattercakeDecotator
 * @Description: 煎饼装饰器类
 * @Author
 * @Date 2022/3/23
 * @Version 1.0
 */
public abstract class BattercakeDecotator extends Battercake {

    /**
     * 静态代理，委派
     */
    private Battercake battercake;

    public BattercakeDecotator(Battercake battercake) {
        this.battercake = battercake;
    }

    public abstract void doSomething();

    @Override
    public String getMsg(){
        return this.battercake.getMsg();
    }

    @Override
    public int getPrice(){
        return this.battercake.getPrice();
    }
}
