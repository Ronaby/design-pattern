package com.ronbay.desigin.module.combin.demo02;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Depatment
 * @Description: 部门
 * @Author
 * @Date 2023/3/24
 * @Version 1.0
 */
public class Depatment extends HumanResource{
    private List<HumanResource> subNodes = new ArrayList<>();

    public Depatment(Long id) {
        super(id);
    }

    @Override
    public Double countSalary() {
        double salary = 0d;
        for (HumanResource humanResource:subNodes){
            salary += humanResource.countSalary();
        }
        return salary;
    }

}
