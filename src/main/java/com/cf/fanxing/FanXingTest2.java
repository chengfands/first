package com.cf.fanxing;

/**
 * @author chengfan
 * @date 2019-10-25 11:02:32
 */
public class FanXingTest2 {


    public static void main(String[] args) {

        Special<FanXingModel> special = new Special<>();
        special.show3(1);
        special.show3(new FanXingModel1());
    }
}
