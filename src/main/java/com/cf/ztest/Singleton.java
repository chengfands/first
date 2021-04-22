package com.cf.ztest;

/**
 * @author chengfan
 * @date 2021-04-13 12:50:12
 */
public class Singleton {

    private static volatile Singleton singleton = null;

    public static Singleton getInstance(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    return new Singleton();
                }
            }
        }
        return singleton;
    }

}
