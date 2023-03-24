package com.ronbay.desigin.module.combin.demo01;

/**
 * @ClassName: City
 * @Description: 城市人口数量
 * @Author
 * @Date 2023/3/24
 * @Version 1.0
 */
public class City implements Counter{
    /**
     * 城市的总人数
     */
    private Integer sum = 0;

    public City(Integer sum){
        this.sum = sum;
    }

    @Override
    public Integer count() {
        System.out.println("城市人口==" + sum);
        return sum;
    }
}
