package com.cf.design.singleton;

/**
 * @author chengfan
 * @date 2021-03-25 20:17:39
 */
public class Singleton {

    private static Singleton singleton = null;

    private Singleton(){

    }

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
