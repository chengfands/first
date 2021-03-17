package com.cf.design.strategy.strategy2;

import java.math.BigDecimal;

/**
 * @author chengfan
 * @date 2019-10-10 15:26:40
 */
public class Test {

    public static void main(String[] args) {
        //总金额
        BigDecimal total = new BigDecimal("100");
        //新客户
        Context context1 = new Context(new NewCustomer());
        context1.calculate(total);
        //老客户
        Context context2 = new Context(new OldCustomer());
        context2.calculate(total);
        //VIP客户
        Context context3 = new Context(new VipCustomer());
        context3.calculate(total);
    }
}
