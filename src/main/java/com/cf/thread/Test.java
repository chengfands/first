package com.cf.thread;

import java.util.LinkedHashMap;

/**
 * @author chengfan
 * @date 2021-03-16 23:13:14
 */
public class Test {


    public static void main(String[] args) {
        Integer a = 127;
        Integer a2 = 127;
        Integer b = 128;
        Integer b2 = 128;
        //Integer和int比较会自动拆箱成int
        //Integer和Integer比较；如果是-128到127，则会有一个缓存，是相等的，否则就相当于new Integer() 不相等
        System.out.println(a == a2);//true
        System.out.println(b == b2);//false



    }
}
