package com.ronbay.desigin.module.decorator.demo1;

/**
 * @ClassName: BattercakeTest
 * @Description: 客户端测试类
 * @Author
 * @Date 2022/3/23
 * @Version 1.0
 */
public class BattercakeTest {
    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getMsg() + "总价格：" + battercake.getPrice());

        BattercakeWithEgg battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getMsg() + "总价格:" + battercakeWithEgg.getPrice() );

        BattercakeWithEggAndSausage battercakeWithEggAndSausage = new BattercakeWithEggAndSausage();
        System.out.println(battercakeWithEggAndSausage.getMsg() + "总价格:" + battercakeWithEggAndSausage.getPrice() );
    }
}
