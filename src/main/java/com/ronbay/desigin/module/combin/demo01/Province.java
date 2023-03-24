package com.ronbay.desigin.module.combin.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 省份，省份包含城市
 * @Author
 * @Date 2023/3/24
 * @Version 1.0
 */
public class Province implements Counter{
    List<Counter> counterList = new ArrayList<>();

    @Override
    public Integer count() {
        int sum = 0;
        for (Counter counter:counterList){
            sum = sum + counter.count();
        }
        return sum;
    }

    public void add(Counter counter){
        counterList.add(counter);
    }

    public void remove(Counter counter){
        counterList.remove(counter);
    }
}
