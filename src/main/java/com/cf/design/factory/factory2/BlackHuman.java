package com.cf.design.factory.factory2;


/**
 * @author chengfan
 * @date 2020-01-09 10:09:39
 */
public class BlackHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("黑种人");
    }

    @Override
    public void talk() {
        System.out.println("黑种人说话");
    }
}
