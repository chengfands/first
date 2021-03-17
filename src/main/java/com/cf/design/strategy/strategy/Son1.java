package com.cf.design.strategy.strategy;

/**
 * @author chengfan
 * @date 2019-10-10 14:09:04
 */
public class Son1 implements Father {

    @Override
    public void operate() {
        System.out.println("Son1执行");
    }
}
