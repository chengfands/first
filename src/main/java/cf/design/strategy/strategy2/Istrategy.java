package cf.design.strategy.strategy2;

import java.math.BigDecimal;

/**
 * 销售策略
 * 1：新客户 无折扣   2：老客户 9折  3：VIP  8折
 * @author chengfan
 * @date 2019-10-10 14:22:08
 */
public interface Istrategy {


    /**
     * 公共方法是总消费金额，四舍五入两位小数
     */
    void cost(BigDecimal total);


}
