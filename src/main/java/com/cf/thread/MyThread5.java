package com.cf.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 多线程实现抢票
 * @author chengfan
 * @date 2021-03-31 19:37:17
 */
public class MyThread5 implements Runnable {

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


class Test5{
    public static void main(String[] args) {
        MyThread5 thread5 = new MyThread5();
        ExecutorService threadPool = Executors.newFixedThreadPool(5);

        threadPool.submit(thread5);
        threadPool.submit(thread5);
        threadPool.submit(thread5);
        threadPool.submit(thread5);

    }
 }
