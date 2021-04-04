package com.cf.thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 多线程实现抢票
 * @author chengfan
 * @date 2021-03-31 19:37:17
 */
public class MyThread3 implements Runnable {

    private  int tickets = 3;

    ReentrantLock lock = new ReentrantLock();

    private  Object OBJECT = new Object();

    @Override
    public void run() {
            lock.lock();
            if(tickets > 0){
                System.out.println(Thread.currentThread().getName() + "抢到了第" + tickets + "张票");
                tickets --;
            }
            lock.unlock();
    }
}


class Test3{
    public static void main(String[] args) {
        MyThread3 myThread3 = new MyThread3();
        new Thread(myThread3,"用户1").start();
        new Thread(myThread3,"用户2").start();
        new Thread(myThread3,"用户3").start();
        new Thread(myThread3,"用户4").start();
        new Thread(myThread3,"用户5").start();

    }
 }
