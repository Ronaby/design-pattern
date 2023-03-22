package com.ronbay.desigin.module.decorator.demo1;

/**
 * @ClassName: BattercakeWithEggAndSausage
 * @Description: 鸡蛋加烤肠
 * @Author
 * @Date 2022/3/23
 * @Version 1.0
 */
public class BattercakeWithEggAndSausage extends BattercakeWithEgg{

    public String getMsg(){
       return super.getMsg() + "加1根烤肠";
    }

    public int getPrice(){
        return super.getPrice() + 2;
    }
}
