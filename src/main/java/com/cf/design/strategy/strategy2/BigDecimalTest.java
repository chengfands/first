package com.cf.design.strategy.strategy2;

import java.math.BigDecimal;

/**
 * 精度测试
 * @author chengfan
 * @date 2019-10-10 14:31:38
 */
public class BigDecimalTest {

    public static void main(String[] args) {
        //ROUND_HALF_UP  四舍五入    <5舍    >=5入
        BigDecimal bigDecimal = new BigDecimal("1.224").setScale(2,BigDecimal.ROUND_HALF_UP);//1.22
        BigDecimal bigDecimal2 = new BigDecimal("1.225").setScale(2,BigDecimal.ROUND_HALF_UP);//1.23
        BigDecimal bigDecimal3 = new BigDecimal("1.2251").setScale(2,BigDecimal.ROUND_HALF_UP);//1.23
        System.out.println(bigDecimal);
        System.out.println(bigDecimal2);
        System.out.println(bigDecimal3);
        //ROUND_HALF_DOWN 四舍五入   <=5舍   >5入（比较整个舍弃部分，而不是精度下一位数字）
        BigDecimal bigDecimal4 = new BigDecimal("1.224").setScale(2,BigDecimal.ROUND_HALF_DOWN);//1.22
        BigDecimal bigDecimal5 = new BigDecimal("1.225").setScale(2,BigDecimal.ROUND_HALF_DOWN);//1.22
        BigDecimal bigDecimal6 = new BigDecimal("1.2251").setScale(2,BigDecimal.ROUND_HALF_DOWN);//1.23
        System.out.println(bigDecimal4);
        System.out.println(bigDecimal5);
        System.out.println(bigDecimal6);
        //ROUND_DOWN  直接舍弃
        BigDecimal bigDecimal7 = new BigDecimal("1.228").setScale(2,BigDecimal.ROUND_DOWN);//1.22
        BigDecimal bigDecimal8 = new BigDecimal("-1.228").setScale(2,BigDecimal.ROUND_DOWN);//-1.22
        System.out.println(bigDecimal7);
        System.out.println(bigDecimal8);
        //ROUND_UP   直接+1，无论正负
        BigDecimal bigDecimal9 = new BigDecimal("1.221").setScale(2,BigDecimal.ROUND_UP);//1.23
        BigDecimal bigDecimal10 = new BigDecimal("-1.221").setScale(2,BigDecimal.ROUND_UP);//-1.23
        System.out.println(bigDecimal9);
        System.out.println(bigDecimal10);
        //ROUND_CEILING   天花板（向上）,使数值变大
        BigDecimal bigDecimal11 = new BigDecimal("1.221").setScale(2,BigDecimal.ROUND_CEILING);//1.23
        BigDecimal bigDecimal12 = new BigDecimal("-1.221").setScale(2,BigDecimal.ROUND_CEILING);//-1.22
        System.out.println(bigDecimal11);
        System.out.println(bigDecimal12);
        //ROUND_FLOOR   地板（向下），使数值变小
        BigDecimal bigDecimal13 = new BigDecimal("1.221").setScale(2,BigDecimal.ROUND_FLOOR);//1.22
        BigDecimal bigDecimal14 = new BigDecimal("-1.221").setScale(2,BigDecimal.ROUND_FLOOR);//-1.23
        System.out.println(bigDecimal13);
        System.out.println(bigDecimal14);
    }
}
