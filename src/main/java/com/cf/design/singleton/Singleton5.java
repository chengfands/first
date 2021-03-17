package com.cf.design.singleton;

import org.apache.commons.lang3.SerializationUtils;

import java.io.Serializable;
import java.lang.reflect.Constructor;

/**
 * 单例：静态内部类（推荐）
 * @author chengfan
 * @date 2021-03-17 22:06:35
 */
public class Singleton5 implements Serializable {

    private Singleton5(){
    }

    /**
     * 内部类（包括静态和非静态）只有在被调用时才会加载
     */
    private static class SingletonInstance{
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    /**
     * 调用getInstance()时加载内部类，且静态变量只会加载一次，保证了线程安全和只返回一个对象实例
     */
    public static Singleton5 getInstance(){
        return SingletonInstance.INSTANCE;
    }

    /**
     * 已经够用了，只是不够完美
     * 通过反射和反序列化可以生成两个实例
     */
    public static void main(String[] args) throws Exception{
        //反射
        Singleton5 singleton = Singleton5.getInstance();
        Constructor<Singleton5> constructor = Singleton5.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton5 newSingleton = constructor.newInstance();
        System.out.println(singleton == newSingleton);

        //反序列化
        Singleton5 instance = Singleton5.getInstance();
        byte[] serialize = SerializationUtils.serialize(instance);
        Singleton5 newInstance = SerializationUtils.deserialize(serialize);
        System.out.println(instance == newInstance);
    }

}
