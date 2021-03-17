package com.cf.design.build;

/**
 * @author chengfan
 * @date 2020-01-14 13:58:32
 */
public class BenzModel extends CarModel {

    @Override
    public void start() {
        System.out.println("奔驰启动");
    }

    @Override
    public void alarm() {
        System.out.println("奔驰喇叭响");
    }

    @Override
    public void engineBoom() {
        System.out.println("奔驰引擎响");
    }

    @Override
    public void stop() {
        System.out.println("奔驰熄火");
    }
}
