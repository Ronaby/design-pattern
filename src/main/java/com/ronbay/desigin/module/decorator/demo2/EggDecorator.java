package com.ronbay.desigin.module.decorator.demo2;

/**
 * @ClassName: EggDecorator
 * @Description: 鸡蛋煎饼装饰者类
 * @Author
 * @Date 2022/3/23
 * @Version 1.0
 */
public class EggDecorator extends BattercakeDecotator{

    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    public void doSomething() {

    }

    @Override
    public String getMsg(){
        return this.getMsg() + "1个鸡蛋";
    }

    @Override
    public int getPrice(){
        return this.getPrice() + 1;
    }
}
