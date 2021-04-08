package com.cf.thread;

/**
 * 5个人抢3张票
 * @author chengfan
 * @date 2021-04-07 18:02:52
 */
public class MyThread6 implements Runnable{

    private int tickets = 3;

    @Override
    public void run() {
        synchronized (MyThread6.class){
            if(tickets > 0){
                System.out.println(Thread.currentThread().getName() + "抢到了一张票");
                tickets --;
            }
        }
    }
}

class Test6{
    public static void main(String[] args) {
        MyThread6 thread6 = new MyThread6();
        new Thread(thread6,"小一").start();
        new Thread(thread6,"小二").start();
        new Thread(thread6,"小三").start();
        new Thread(thread6,"小四").start();
        new Thread(thread6,"小五").start();
    }
}
