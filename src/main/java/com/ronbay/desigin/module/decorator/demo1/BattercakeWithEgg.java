package com.ronbay.desigin.module.decorator.demo1;

/**
 * @ClassName: BattercakeWithEgg
 * @Description: 加鸡蛋煎饼
 * @Author
 * @Date 2022/3/23
 * @Version 1.0
 */
public class BattercakeWithEgg extends Battercake{
    public String getMsg(){
        return super.getMsg() + "加一个鸡蛋";
    }

    /**
     * 加一个鸡蛋加1块
     * @return
     */
    public int getPrice(){
      return   super.getPrice() + 1;
    }
}
