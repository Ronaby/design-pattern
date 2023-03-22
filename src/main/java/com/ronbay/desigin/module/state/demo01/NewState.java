package com.ronbay.desigin.module.state.demo01;

/**
 * @ClassName: NewState
 * @Description:
 * @Author
 * @Date 2022/1/4
 * @Version 1.0
 */
public class NewState implements State{
    @Override
    public void execute() {
        System.out.println("执行销售出库单新建状态的逻辑");
    }
}
