package com.cf.thread;

/**
 * @author chengfan
 * @date 2021-03-16 23:13:14
 */
public class Test {


    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start();
        myThread.interrupt();
        //interrupted()是线程的静态方法
        System.out.println("第一次调用--------" + Thread.interrupted());
        System.out.println("第二次调用--------" + Thread.interrupted());



    }
}
