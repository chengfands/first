package com.cf.fanxing;

/**
 * @author chengfan
 * @date 2019-10-21 09:50:30
 */
public class FanXingTest1 {


    public static void main(String[] args) {
        //泛型类测试
        FanXingClass<Integer> cf = new FanXingClass<>(123456);
        FanXingClass<String> cfs = new FanXingClass<>("aaaa");
        cf.showValue(cf);
        cfs.showValue(cfs);
        //泛型方法测试
        FanXingMethod method = new FanXingMethod();
        method.ggg(cf,cfs);

        //泛型类中存在泛型方法测试
        //声明泛型实参类型为Number
        Special<Number> special = new Special<>();
        //调用成员方法show1()
        //Integer、Double、Float、Byte、Long、Short均是Number的子类，可以直接使用
        special.show1(1.1);
        //传入其他类型则会报错
        //special.show1("1");

        //调用泛型方法show2(),show3()，均可，说明泛型类的类型与泛型方法的类型是不同的类型（哪怕都声明为T）
        special.show2("1");
        special.show2(1.1);
        special.show3("1");
        special.show3(1.1);

        //带可变参数列表的泛型方法
        special.show4(1,"1",new Object(),null,1L,1.1);
        special.show5(1,"1",new Object(),null,1L,1.1);
        Object o = 1.1;
        System.out.println(o);


    }
}
