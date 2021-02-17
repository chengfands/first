package cf.design.factory.simple;

/**
 * 工厂类
 * 一般是直接调用工厂类的static方法，不用new一个工厂类对象
 * @author chengfan
 * @date 2020-01-09 16:00:28
 */
public class BallFactory {

    public static Ball createBall(String str){
        Ball ball = null;
        switch (str){
            case "basketball":
                ball = new Basketball();
                break;
            case "football":
                ball = new Football();
                break;
        }
        return ball;
    }

}
