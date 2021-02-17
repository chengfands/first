package cf.design.strategy.strategy;

/**
 * @author chengfan
 * @date 2019-10-10 14:16:28
 */
public class Test {

    public static void main(String[] args) {
        //1
        Context context1 = new Context(new Son1());
        context1.operate();
        //2
        Context context2 = new Context(new Son2());
        context2.operate();
        //3
        Context context3 = new Context(new Son3());
        context3.operate();

    }
}
