package cf.inner;

/**
 * 内部类测试
 * @author chengfan
 * @date 2019-11-26 14:56:58
 */
public class Test {

    public static void main(String[] args) {

        Outter outter = new Outter();
        outter.out2();
        //成员内部类，需要用外部类实例创建
        Outter.MemberInner memberInner = outter.new MemberInner();
        memberInner.member1();

        //局部内部类
        outter.testPartInner(998);

        //静态内部类，不依赖外部类实例创建，访问内部类的静态成员直接“.静态成员”
        Outter.StaticInner staticInner = new Outter.StaticInner();
        staticInner.static1();
        Outter.StaticInner.static2();

        //匿名内部类  见Test2


    }
}
