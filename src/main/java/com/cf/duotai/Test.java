package com.cf.duotai;


/**
 * 经典案例测试
 * @author chengfan
 * @date 2019-11-25 15:56:59
 */
public class Test {


    /**
     * A   show(D obj)   show(A obj)
     * B   show(B obj)   show(A obj)
     * C   extends B
     * D   extends B
     */
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();
        /*
        * 重点：
        * (1)父类引用指向子类对象时，引用类型决定能调用的方法(即调用方法一定是父类已有的方法)，
        *    对象类型决定调用谁的方法(即如果子类中重写了此方法，调用子类的方法)
        * (2)继承链中对象方法的调用的优先级：
        *    this.show(O)、super.show(O)、this.show((super)O)、super.show((super)O);this表示当前对象
        *
        *
        * demo分析：
        * 4     根据上面(1)判断：A引用指向B对象，只能调用A已有的方法，即show(D obj)、show(A obj)；
        *       根据上(2)：this=B，this.show(b)，B中有show(b)，但是不在可调用方法内
        *                  super=A，super.show(b)，A中没有show(b)
        *                  this.show(super(b)) ，即this.show(a)，B中有，直接调用b.show(a)
        *
        * 1-3   A是父类，只需要调用this.show(O)、this.show((super)O)
        * 5-6   同4
        * 7     B.show(b)直接调用
        * 8     B和A中都没有show(c)，调用this.show(super(c))，即this.show(b)
        * 9     B中没有show(d)，A中有，直接调用A.show(d)
        *
        * */
        System.out.println("1--" + a1.show(b));
        System.out.println("2--" + a1.show(c));
        System.out.println("3--" + a1.show(d));
        System.out.println("4--" + a2.show(b));
        System.out.println("5--" + a2.show(c));
        System.out.println("6--" + a2.show(d));
        System.out.println("7--" + b.show(b));
        System.out.println("8--" + b.show(c));
        System.out.println("9--" + b.show(d));
    }


}
