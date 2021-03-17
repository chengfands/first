package com.cf.design.factory.simple;

/**
 * @author chengfan
 * @date 2020-01-09 15:58:46
 */
public class Basketball implements Ball {

    @Override
    public int getPrice() {
        return 100;
    }

    @Override
    public String getName() {
        return "篮球";
    }
}
