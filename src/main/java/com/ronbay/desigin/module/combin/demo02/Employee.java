package com.ronbay.desigin.module.combin.demo02;

/**
 * @Description: 员工
 * @Author
 * @Date 2023/3/24
 * @Version 1.0
 */
public class Employee extends HumanResource{

    private Long id;
    private Double salary;

    public Employee(Long id, Double salary) {
        super(id);
        this.salary = salary;
    }

    @Override
    public Double countSalary() {
        return this.salary;
    }
}
