package com.cf.thread;

import java.util.Queue;
import java.util.concurrent.*;

/**
 * 多线程实现抢票
 * @author chengfan
 * @date 2021-03-31 19:37:17
 */
public class MyThread4 implements Runnable {

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


class Test4{
    public static void main(String[] args) {
        MyThread4 myThread4 = new MyThread4();
        ThreadPoolExecutor pools = new ThreadPoolExecutor(5,100,1, TimeUnit.DAYS, new LinkedBlockingDeque<>(), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        pools.submit(myThread4);
        pools.submit(myThread4);
        pools.submit(myThread4);
        pools.submit(myThread4);
        pools.submit(myThread4);
        pools.submit(myThread4);
    }
 }
