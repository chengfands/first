package com.cf.ztest;

import com.cf.duotai.E;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author chengfan
 * @date 2021-04-13 20:10:18
 */
public class Z413 {

    public static void main(String[] args) {

        String str = "good";
        char[] ch = {'a','b','c'};
        change(str,ch);
        System.out.println(str);
        System.out.println(ch);
    }
    public static void change(String str,char[] ch){
        str = "666";
        ch[1] = 'g';
    }
}



class Test1{

    static String a;
    public static void main(String[] args) {
        System.out.println("a="+a);
    }

}

abstract class Test2{
    public int a = 5;
    public abstract void m(int a);



    public void m(){

    }

}

class Demo {
    public static void main(String[] args){
        char ch = '中';
        System.out.println(ch);
        //0<char<65535
        System.out.println((Character.MIN_VALUE + 0) + "<char<" + (Character.MAX_VALUE + 0));
    }
}
class Demo2 {
    public static void main(String[] args){
        System.out.println(getResult(2));
    }

    public static int getResult(int a){
        int result = 0;
        switch (a){
            case 1:
                result = result + a + 1;
            case 2:
                result = result + a + 2;
            case 3:
                result = result + a + 3;
            case 4:
                result = result + a + 4;
        }
        return result;
    }
}
class Demo3 {
    public static void main(String[] args){
        Thread t = new Thread(){
            @Override
            public void run(){
                ping();
            }
        };
        t.run();
        System.out.println("pong");
    }

    public static void ping(){
        System.out.println("ping");
    }
}

class Demo4 {
    public static void main(String[] args){
        try{
            throw new IOException();
        }catch (FileNotFoundException f){
            System.out.println("a");
            return;
        }catch (IOException i){
            System.out.println("b");
            return;
        }catch (Exception e){
            System.out.println("c");
            return;
        }finally {
            System.out.println("d");
        }
    }
}

class Demo5 {

    public Demo5(){
        System.out.println("Demo5-A");
    }

    static {
        System.out.println("Demo5-B");
    }

    {
        System.out.println("Demo5-C");
    }


}
class Demo6 extends Demo5 {

    public Demo6(){
        System.out.println("Demo6-A");
    }

    static {
        System.out.println("Demo6-B");
    }

    {
        System.out.println("Demo6-C");
    }

    public static void main(String[] args) {
        new Demo5();
    }
}

class Demo7 {
    public static void main(String[] args) {
        System.out.println(cal(3));
    }

    public static long cal(int a){
        if(a == 1){
            return 1;
        }
        int result = 0;
        for (int i = 1; i < a+1; i++) {
            int sum = 1;
            for (int j = 1; j < i+1; j++) {
                sum *= j;
            }
            result += sum;
        }
        return result;
    }



}