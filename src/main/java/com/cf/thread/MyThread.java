package com.cf.thread;


/**
 * @author chengfan
 * @date 2021-03-16 22:17:12
 */
public class MyThread extends Thread {

    @Override
    public void run(){
        for(int i=0;i<2000;i++){
            System.out.println("thread"+i);
        }
    }






}

