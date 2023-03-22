package com.ronbay.desigin.module.decorator.demo2;

import com.sun.deploy.util.StringUtils;

/**
 * @ClassName: BattercakeTest
 * @Description: 客户端测试类
 * @Author
 * @Date 2022/3/23
 * @Version 1.0
 */
public class BattercakeTest {
    public static void main(String[] args) {

        Battercake battercake;
        //只买一个煎饼
        battercake = new BaseBattercake();

        //煎饼小，加1鸡蛋
        battercake = new EggDecorator(battercake);
        //煎饼太小，再加1鸡蛋
        battercake = new EggDecorator(battercake);

        //太饿了，再加1烤肠
        battercake = new SausageDecorator(battercake);
        System.out.println(battercake.getMsg() + ",总价格:" + battercake.getPrice());

    }
}
