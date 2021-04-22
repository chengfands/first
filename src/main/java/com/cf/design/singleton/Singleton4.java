package com.cf.design.singleton;

import java.lang.reflect.Proxy;

/**
 * 单例：懒汉式（推荐）
 * @author chengfan
 * @date 2021-03-17 22:06:35
 */
public class Singleton4 {

    /*

     volatile关键字除了保证线程可见，还可以防止jvm指令重排优化

     因为 singleton = new Singleton() 这句话大致可以分为三步：
          1、为对象分配内存空间；
          2、初始化对象；
          3、引用singleton指向内存地址。
    但是由于JVM具有指令重排的特性，执行顺序有可能变成 1-3-2。指令重排在单线程下不会出现问题，但是在多线程下会导致一个线程获得一个未初始化的实例。
    例如：线程T1执行了1和3，此时T2调用 getInstance() 后发现 singleton 不为空，因此返回 singleton， 但是此时的 singleton 还没有被初始化。

    使用 volatile 会禁止JVM指令重排，从而保证在多线程下也能正常执行。

    */

    private  static volatile Singleton4 instance = null;
    private Singleton4(){
    }

    public static Singleton4 getInstance(){
        //如果已经创建了一个实例，则直接返回，不必进入同步代码块，不用竞争锁，节约资源
        if(instance == null){
            synchronized (Singleton4.class){
                //防止多线程安全，如果同时进入上一个if(instance == null)，如果这里不再加if，会导致一个线程创建之后，另一个线程再次创建
                if(instance == null){
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
