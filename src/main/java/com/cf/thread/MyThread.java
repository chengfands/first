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

    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(-123000));
        System.out.println(reverse(123000));
        System.out.println(reverse(12003000));
        System.out.println(reverse(-12003000));
    }

    /**
     * 数字反转  首位去0
     * @author chengfan
     */
    private static int reverse(int a){
        boolean f = true;
        if(a < 0){
            f = false;
            a = -a;
        }
        if(a == 0){
            return a;
        }
        StringBuffer buffer = new StringBuffer(String.valueOf(a));
        buffer.reverse();
        return f?Integer.parseInt(buffer.toString()):-Integer.parseInt(buffer.toString());
    }


}

