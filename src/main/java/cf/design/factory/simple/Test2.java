package cf.design.factory.simple;

/**
 * @author chengfan
 * @date 2020-01-09 16:18:10
 */
public class Test2 {

    public static void main(String[] args) {
        //生产篮球
        Ball basketball = BallFactory2.createBall(Basketball.class);
        System.out.println("生产的是" + basketball.getName() + "，价格是" + basketball.getPrice());
        //生产足球
        Ball football = BallFactory2.createBall(Football.class);
        System.out.println("生产的是" + football.getName() + "，价格是" + football.getPrice());
    }
}
