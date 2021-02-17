package cf.inner;

/**
 * 外部类
 * @author chengfan
 * @date 2019-11-25 20:04:32
 */
public class Outter {

    private int m = 10;
    private static int n = 10000;

    public void out1(){
        System.out.println("this is out1");
    }
    public void out2(){
        MemberInner memberInner = new MemberInner();
        System.out.println("this is out2");
        memberInner.member2();
    }

    /**
     * 成员内部类：作为外部类的一个成员，与外部类属性、方法并列
     * 注意：成员内部类中不能定义静态变量，但可以访问外部类的所有成员
     */
     class MemberInner{
        //private static int m_a = 11;   error
        private int x = 12;
        private int m = 13;
        void member1(){
            System.out.println(x);
            //13
            System.out.println(m);
            //13
            System.out.println(this.m);
            //如要使用外部类的非静态变量且内部类中定义了相同的变量名，采用“外部类名.this.变量名”
            System.out.println(Outter.this.m);
            System.out.println(n);
            out1();
        }
        void member2(){
            System.out.println("this is member2");
        }
    }

    /**
     * 局部内部类：在方法中定义的内部类
     * 注意：类前不允许访问权限修饰符存在，对外不可见
     */
    public void testPartInner(final int d){
        class PartInner{
            //private static int t_a = 11;   error
            private int s = 12;
            private int n = 13;
            PartInner(int e){
                part1(e);
            }
            void part1(int k){
                System.out.println(s);
                System.out.println(m);
                //如要使用外部类的非静态变量，采用“外部类名.this.变量名”
                System.out.println(Outter.this.m);
                //可以访问外部类的局部变量（即方法内的变量），但必须是final的，jdk1.8可以不加，会自动变成final
                System.out.println(k);
                out1();
            }
            void part2(final int q){
                final int z = 9;
                int y = 10;
            }
        }
        new PartInner(d);
    }


    /**
     * 静态内部类：static修饰
     * 注意：静态内部类中可以有静态和非静态成员，只能访问外部类的静态资源
     */
    static class StaticInner{
        static int l = 23;
        int u = 24;

        void static1(){
            System.out.println(n);
            //System.out.println(m);  只能访问外部类的静态变量
        }
        static void static2(){
            System.out.println(l);
            //System.out.println(m);  只能访问外部类的静态变量
        }
    }

    /**
     * 匿名内部类：一种特殊的局部内部类，具体见Outter2类
     */



}
