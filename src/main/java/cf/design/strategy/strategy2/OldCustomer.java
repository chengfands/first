package cf.design.strategy.strategy2;

import java.math.BigDecimal;

/**
 * 老客户
 * @author chengfan
 * @date 2019-10-10 14:25:52
 */
public class OldCustomer implements Istrategy{
    /**
     * 9折
     */
    @Override
    public void cost(BigDecimal total) {
        System.out.println("老客户9折，消费金额为：" + total.multiply(new BigDecimal(0.9)).setScale(2,BigDecimal.ROUND_HALF_UP));
    }
}
