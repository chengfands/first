package com.cf.design.strategy.strategy;

/**
 * @author chengfan
 * @date 2019-10-10 14:13:32
 */
public class Context {
    private Father father;
    public Context(Father father){
        this.father = father;
    }
    public void operate(){
        this.father.operate();
    }
}
