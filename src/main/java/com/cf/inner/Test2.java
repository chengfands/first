package com.cf.inner;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.BlockingQueue;

/**
 * 匿名内部类测试
 * @author chengfan
 * @date 2019-11-28 16:25:14
 */
public class Test2 {

    /**
     * 匿名内部类没有类名，没有构造方法，所以只能使用一次
     * 必须继承一个类或实现接口
     * 通常用来简化代码
     */
    public static void main(String[] args) {
        //使用匿名内部类简化接口实现或者继承类（不用新建一个实现类）
        Cola cola = new Cola(){
            @Override
            public BigDecimal sell(BigDecimal money){
                return money.multiply(new BigDecimal(50));
            }
        };
        System.out.println(cola.sell(new BigDecimal("10")));
        //用lambda表达式简化匿名内部类的使用，适用于函数式接口，即接口中只有一个抽象方法（可以有多个default方法）
        Cola cola1 = money -> money.multiply(new BigDecimal(50));
        System.out.println(cola1.sell(new BigDecimal("10")));
    }
}
