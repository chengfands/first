package cf.design.adapter.adapter.add;

/**
 * @author chengfan
 * @date 2020-01-06 15:44:27
 */
public class Test {


    public static void main(String[] args) {

        //匿名内部类
//        Big big1 = new Big(){
//            @Override
//            public void big(){
//                System.out.println("接口抽象方法：大");
//            }
//        };
//        //lambda简化匿名内部类，适用于函数式接口，即接口中只有一个抽象方法（可以有多个default方法）
//        Big big2 = ()-> System.out.println("接口抽象方法：大");
//        //接口抽象方法
//        big2.big();
//        //接口default方法
//        big2.say();
//        //接口static方法
//        Big.run();

        Big big = new BigImpl();
        //接口抽象方法
        big.big();
        //接口default方法
        big.say();
        //接口static方法
        Big.run();
    }
}
