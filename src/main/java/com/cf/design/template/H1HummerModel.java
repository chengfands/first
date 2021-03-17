package com.cf.design.template;

/**
 * @author chengfan
 * @date 2020-01-13 15:47:09
 */
public class H1HummerModel extends HummerModel {

    /**
     * 是否鸣笛
     */
    private boolean isAlarm = true;

    public boolean isAlarm() {
        return isAlarm;
    }
    public void setAlarm(boolean isAlarm){
        this.isAlarm = isAlarm;
    }

    @Override
    public void start() {
        System.out.println("H1悍马启动");
    }

    @Override
    public void alarm() {
        System.out.println("H1悍马鸣笛");
    }

    @Override
    public void engineBoom() {
        System.out.println("H1悍马引擎响");
    }

    @Override
    public void stop() {
        System.out.println("H1悍马熄火");
    }

}
