package com.cf.design.singleton;

import org.apache.commons.lang3.SerializationUtils;

import java.io.Serializable;

/**
 * @author chengfan
 * @date 2021-04-07 17:55:16
 */
public class Singleton8 implements Serializable{

    private static class Single{
        private static final Singleton8 SINGLETON_8 = new Singleton8();
    }

    public static Singleton8 getInstance(){
        return Single.SINGLETON_8;
    }

}

class Test8{
    public static void main(String[] args) {
        //序列化破坏
        Singleton8 instance = Singleton8.getInstance();
        Singleton8 instance2 = Singleton8.getInstance();
        System.out.println(instance);
        System.out.println(instance2);
        byte[] serialize = SerializationUtils.serialize(instance);
        Singleton8 instance3 = SerializationUtils.deserialize(serialize);
        System.out.println(instance3);
    }

}
