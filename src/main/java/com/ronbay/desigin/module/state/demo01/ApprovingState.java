package com.ronbay.desigin.module.state.demo01;

/**
 * @ClassName: ApprovingState
 * @Description:
 * @Author
 * @Date 2022/1/4
 * @Version 1.0
 */
public class ApprovingState implements State{
    @Override
    public void execute() {
        System.out.println("执行销售出库单待审批状态的逻辑");
    }
}
