package com.cf.thread;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 5个人抢10张票
 * @author chengfan
 * @date 2021-04-07 18:08:22
 */
public class MyThread7 implements Runnable{

    private int tickets = 10;
    @Override
    public void run() {
        while (tickets > 0){
            synchronized (MyThread7.class){
                if(tickets > 0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    tickets --;
                    System.out.println(Thread.currentThread().getName() + "抢到了一张票，还剩" + tickets + "张");
                }
            }
        }
    }
}

class Test7{
    public static void main(String[] args) {
        MyThread7 thread7 = new MyThread7();
        new Thread(thread7,"小一").start();
        new Thread(thread7,"小二").start();
        new Thread(thread7,"小三").start();
        new Thread(thread7,"小四").start();
        new Thread(thread7,"小五").start();
    }
}