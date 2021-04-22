package com.cf.ztest;

/**
 * @author chengfan
 * @date 2021-04-13 12:53:36
 */
public class Context {

    private Istrategy istrategy;

    public Context(Istrategy istrategy){
        this.istrategy = istrategy;
    }

    public void sell(){
        this.istrategy.sell();
    }

}
