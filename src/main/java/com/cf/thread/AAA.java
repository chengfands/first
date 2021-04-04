package com.cf.thread;

/**
 * @author chengfan
 * @date 2021-04-01 22:53:52
 */
public interface AAA {

    void aaa();

    default void aa(){
        System.out.println("11");
    }

    static void bb(){
        System.out.println("22");
    }

}


