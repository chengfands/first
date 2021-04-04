package com.cf.thread;

import java.util.ArrayList;
import java.util.List;

/**
 * 多线程实现抢票
 * @author chengfan
 * @date 2021-03-31 19:37:17
 */
public class MyThread2 implements Runnable {

    private  int tickets = 3;

    private  Object OBJECT = new Object();

    @Override
    public void run() {
        synchronized (OBJECT){
            if(tickets > 0){
                System.out.println(Thread.currentThread().getName() + "抢到了第" + tickets + "张票");
                tickets --;
            }
        }
    }



}


class Test2{
    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        new Thread(myThread2,"用户1").start();
        new Thread(myThread2,"用户2").start();
        new Thread(myThread2,"用户3").start();
        new Thread(myThread2,"用户4").start();
        new Thread(myThread2,"用户5").start();

    }
 }
