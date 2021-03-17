package com.cf.design.template;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author chengfan
 * @date 2020-01-13 15:49:02
 */
public class Test {

    public static void main(String[] args) throws Exception{

        System.out.println("-------H1型号悍马--------");
        System.out.println("H1型号的悍马是否需要喇叭声响？0-不需要 1-需要");
        String type=(new BufferedReader(new InputStreamReader(System.in))).readLine();
        H1HummerModel h1 = new H1HummerModel();
        if(type.equals("0")){
            h1.setAlarm(false);
        }
        h1.run();
        System.out.println("\n-------H2型号悍马--------");
        //H2不允许鸣笛
        HummerModel h2 = new H2HummerModel();
        h2.run();

    }

}
