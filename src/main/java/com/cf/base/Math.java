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
        System.out.println(1 & 2);
        System.out.println(1 & 3);
        System.out.println(1 | 2);
        System.out.println(1 | 3);
        System.out.println(1 ^ 2);
        System.out.println(1 ^ 3);
        System.out.println(~ 3);
        System.out.println(-2 >>> 2);
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
