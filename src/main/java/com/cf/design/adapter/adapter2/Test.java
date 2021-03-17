package com.cf.design.adapter.adapter2;

/**
 * 类适配器测试
 * @author chengfan
 * @date 2019-12-19 17:19:25
 */
public class Test {

    public static void main(String[] args) {
        //类适配器
        Dvi dvi = new HdmiToDvi();
        dvi.dvi();
        //对象适配器
        Dvi dvi22= new HdmiToDvi22(new HdmiImpl());
        dvi22.dvi();
    }
}
