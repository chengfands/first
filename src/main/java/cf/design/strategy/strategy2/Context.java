package cf.design.strategy.strategy2;

import java.math.BigDecimal;

/**
 * 承载策略的容器
 * @author chengfan
 * @date 2019-10-10 15:15:44
 */
public class Context {

    private Istrategy istrategy;

    /**
     * 构造方法
     */
    public Context(Istrategy istrategy){
        this.istrategy = istrategy;
    }

    /**
     * 计算总金额
     */
    void calculate(BigDecimal total){
        this.istrategy.cost(total);
    }

}
