package com.cf.design.singleton;

/**
 * 单例：懒汉式（可用）
 * @author chengfan
 * @date 2021-03-17 22:06:35
 */
public class Singleton3 {

    private static Singleton3 instance = null;
    private Singleton3(){
    }

    /**
     * 加锁：保证同一时刻只能有一个线程访问getInstance
     * synchronized修饰整个方法，每次都要同步，效率低下
     */
    public synchronized static Singleton3 getInstance(){
        if(instance == null){
            instance = new Singleton3();
        }
        return instance;
    }

}
