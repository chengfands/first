package com.cf.design.singleton;

/**
 * @author chengfan
 * @date 2021-04-09 00:49:16
 */
public class Object {

    public Object(){
        System.out.println("干坏事");
    }

    public static void main(String[] args) {
        Object object = new Object();
        System.out.println("a");
    }
}
