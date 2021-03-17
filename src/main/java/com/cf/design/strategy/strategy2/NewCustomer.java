package com.cf.design.strategy.strategy2;

import java.math.BigDecimal;

/**
 * 新客户
 * @author chengfan
 * @date 2019-10-10 14:25:52
 */
public class NewCustomer implements Istrategy{
    /**
     * 无折扣
     */
    @Override
    public void cost(BigDecimal total) {
        System.out.println("新客户无折扣，消费金额为：" + total.setScale(2,BigDecimal.ROUND_HALF_UP));
    }
}
