package com.cf.date;

import java.util.Calendar;
import java.util.Date;

/**
 * 日期相关测试
 * @author chengfan
 * @date 2020-07-13 14:47:08
 */
public class DateTest {


    public static void main(String[] args) {

        //当前时间+3天
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DATE,3);
        System.out.println(cal.getTime());

    }


}
