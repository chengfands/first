package com.cf.design.template;

/**
 * @author chengfan
 * @date 2020-01-13 15:47:09
 */
public class H2HummerModel extends HummerModel {

    @Override
    public void start() {
        System.out.println("H2悍马启动");
    }

    @Override
    public void alarm() {
        System.out.println("H2悍马鸣笛");
    }

    @Override
    public void engineBoom() {
        System.out.println("H2悍马引擎响");
    }

    @Override
    public void stop() {
        System.out.println("H2悍马熄火");
    }

    /**
     * 不鸣笛
     */
    public boolean isAlarm(){
        return false;
    }
}
