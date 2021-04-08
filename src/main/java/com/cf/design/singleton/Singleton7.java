package com.cf.design.singleton;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author chengfan
 * @date 2021-04-07 17:46:29
 */
public class Singleton7 {

    private static volatile Singleton7 singleton7 = null;

    private Singleton7(){
    }

    public static Singleton7 getInstance(){
        if(singleton7 == null){
            synchronized (Singleton7.class){
                if(singleton7 == null){
                    singleton7 = new Singleton7();
                }
            }
        }
        return singleton7;
    }

}

class Test{
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //反射破坏
        Singleton7 instance = Singleton7.getInstance();
        Singleton7 instance2 = Singleton7.getInstance();
        Constructor<Singleton7> constructor = Singleton7.class.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        Singleton7 instance3 = constructor.newInstance();
        System.out.println(instance);
        System.out.println(instance2);
        System.out.println(instance3);
    }
}
