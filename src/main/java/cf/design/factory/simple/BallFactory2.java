package cf.design.factory.simple;

/**
 * @author chengfan
 * @date 2020-01-09 16:10:13
 */
public class BallFactory2 {

    public static <T extends Ball> Ball createBall(Class<T> c){
        Ball ball = null;
        try{
            ball = (Ball)Class.forName(c.getName()).newInstance();
        }catch(Exception e){
            System.out.println("生产球失败");
        }
        return ball;
    }

}
