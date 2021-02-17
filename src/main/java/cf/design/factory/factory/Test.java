package cf.design.factory.factory;

import com.cf.design.factory.simple.Ball;
import com.cf.design.factory.simple.Basketball;
import com.cf.design.factory.simple.Football;

/**
 * @author chengfan
 * @date 2020-01-09 16:18:10
 */
public class Test {

    public static void main(String[] args) {
        AbstractBallFactory factory = new BallFactory();
        //生产篮球
        Ball basketball = factory.createBall(Basketball.class);
        System.out.println("生产的是" + basketball.getName() + "，价格是" + basketball.getPrice());
        //生产足球
        Ball football = factory.createBall(Football.class);
        System.out.println("生产的是" + football.getName() + "，价格是" + football.getPrice());
    }
}
