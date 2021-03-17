package com.cf.design.factory.factory2;


/**
 * @author chengfan
 * @date 2020-01-09 10:08:08
 */
public class YellowHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("黄种人");
    }

    @Override
    public void talk() {
        System.out.println("黄种人说话");
    }
}
