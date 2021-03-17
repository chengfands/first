package com.cf.design.strategy.strategy2;

import java.math.BigDecimal;

/**
 * VIP客户
 * @author chengfan
 * @date 2019-10-10 14:25:52
 */
public class VipCustomer implements Istrategy{
    /**
     * 8折
     */
    @Override
    public void cost(BigDecimal total) {
        System.out.println("VIP客户8折，消费金额为：" + total.multiply(new BigDecimal(0.8).setScale(2,BigDecimal.ROUND_HALF_UP)));
    }
}
