package com.cf.design.singleton;

/**
 * 单例：饿汉式（可用）
 * @author chengfan
 * @date 2021-03-17 22:06:35
 */
public class Singleton1 {
    /**
     * static保证类加载时就实例化，防止多线程同步
     * 缺点：如果不被使用，浪费内存资源
     */
    private static final Singleton1 INSTANCE = new Singleton1();
    private Singleton1(){
    }
    public static Singleton1 getInstance(){
        return INSTANCE;
    }

}
