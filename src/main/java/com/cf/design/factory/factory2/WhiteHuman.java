package com.cf.design.factory.factory2;


/**
 * @author chengfan
 * @date 2020-01-09 10:10:08
 */
public class WhiteHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("白种人");
    }

    @Override
    public void talk() {
        System.out.println("白种人说话");
    }
}
