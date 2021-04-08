package com.cf.base;

/**
 * @author chengfan
 * @date 2021-03-25 13:23:55
 */
public class Math {

    /**
     * 运算
     */
    public static void main(String[] args) {
        //&：两个都为1才为1
//        System.out.println(1 & 2);  //0
//        System.out.println(1 & 3);  //1
//        //|：两个都为0才为0
//        System.out.println(1 | 2);  //3
//        System.out.println(1 | 3);  //3
//        //^：两个不相同才为1
//        System.out.println(1 ^ 2); //3
//        System.out.println(1 ^ 3); //2
//        //~：取反  0变1  1变0 包括符号位  计算机中二进制均为补码，要转换成十进制时先转原码，再转十进制
//        System.out.println(~ 4);   //0000 0100->1111 1011->1111 1010->10000101->-5
//        System.out.println(~ -4);  //1000 0100->1111 1011->1111 1100->0000 0011 ->3

        //>>位移后高位补0或1（根据正负）
        System.out.println(2 >> 2);//0000 0010->0000 0000->0
        System.out.println(-2 >> 2);//1000 0010->1111 1101->1111 1110->1111 1111->1111 1110-> 1000 0001->-1
        //<<左移低位补0（无论正负），即乘以2的n次方（n为右移位数）
        System.out.println(2 << 2);//0000 0010->0000 1000->8
        System.out.println(-2 << 2);//1000 0010->1111 1101->1111 1110->1111 1110 00->1111 1101 11->1000 0010 00->-8

        //>>>：无符号右移  高位补0
        System.out.println(-2 >>> 2); //1073741823
    }
}

class Math2{

    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(-123000));
        System.out.println(reverse(123000));
        System.out.println(reverse(12003000));
        System.out.println(reverse(-12003000));
    }

    /**
     * 数字反转
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
