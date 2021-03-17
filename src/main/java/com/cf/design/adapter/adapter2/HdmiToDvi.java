package com.cf.design.adapter.adapter2;

/**
 * 类适配器
 * @author chengfan
 * @date 2019-12-11 15:46:33
 */
public class HdmiToDvi extends HdmiImpl implements Dvi {

    @Override
    public void dvi() {
        System.out.println("类适配器");
        this.hdmi();
        //hdmi转dvi
        System.out.println("接收hdmi接口信息，转换成dvi接口信息");
        //转换完成
        System.out.println("转换完成");
    }
}
