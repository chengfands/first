package com.cf.design.singleton;

/**
 * 单例：懒汉式（不可用）
 * @author chengfan
 * @date 2021-03-17 22:06:35
 */
public class Singleton2 {

    private static Singleton2 instance = null;
    private Singleton2(){
    }

    /**
     * 缺点：多线程的安全问题
     */
    public static Singleton2 getInstance(){
        if(instance == null){
            return new Singleton2();
        }
        return instance;
    }

}
