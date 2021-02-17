package cf.design.adapter.adapter2;

/**
 * 对象适配器
 * @author chengfan
 * @date 2020-01-06 16:46:09
 */
public class HdmiToDvi22 implements Dvi{

    private HdmiImpl hdmi;

    public HdmiToDvi22(HdmiImpl hdmi){
        this.hdmi = hdmi;
    }

    @Override
    public void dvi() {
        System.out.println("对象适配器");
        hdmi.hdmi();
        //hdmi转dvi
        System.out.println("接收hdmi接口信息，转换成dvi接口信息");
        //转换完成
        System.out.println("转换完成");
    }
}
