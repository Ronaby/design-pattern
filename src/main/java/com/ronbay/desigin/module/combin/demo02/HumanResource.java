package com.ronbay.desigin.module.combin.demo02;

/**
 * @Description: 人员部门抽象类
 * @Author
 * @Date 2023/3/24
 * @Version 1.0
 */
public abstract class HumanResource {

    private Long id;
    private double salary;

    public Long getId() {
        return id;
    }

    public HumanResource(Long id) {
        this.id = id;
    }

    public abstract Double countSalary();
}
