package com.cf.design.factory.simple;

/**
 * @author chengfan
 * @date 2020-01-09 16:05:05
 */
public class Test1 {

    public static void main(String[] args) {
        //生产篮球
        Ball basketball = BallFactory.createBall("basketball");
        System.out.println("生产的是" + basketball.getName() + "，价格是" + basketball.getPrice());
        //生产足球
        Ball football = BallFactory.createBall("football");
        System.out.println("生产的是" + football.getName() + "，价格是" + football.getPrice());
    }

}
