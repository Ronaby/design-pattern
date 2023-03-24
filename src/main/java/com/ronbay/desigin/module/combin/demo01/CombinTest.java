package com.ronbay.desigin.module.combin.demo01;

/**
 * @Description: 组合模式测试类
 * @Author
 * @Date 2023/3/24
 * @Version 1.0
 */
public class CombinTest {

    public static void main(String[] args) {
        City shanghai = new City(1000);//直辖市-比如北京2000人
        City beijing = new City(2000);//直辖市--比如上海3000人
        Province china = new Province();
        china.add(shanghai);
        china.add(beijing);

        Province shanxi = new Province();  //山西省
        shanxi.add(new City(1000));  //大同市
        shanxi.add(new City(1200));  //太原市
        china.add(shanxi);
        //树型结构
        /**
         * china
         *     |_北京
         *     |_上海
         *     |_大同
         *         ｜_大同
         *         ｜_太原
         *
         */
        System.out.println(china.count());
    }
}
