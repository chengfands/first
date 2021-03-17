package com.cf.design.factory.factory;
import com.cf.design.factory.simple.Ball;

/**
 * @author chengfan
 * @date 2020-01-09 17:25:23
 */
public class BallFactory extends AbstractBallFactory {

    @Override
    public <T extends Ball> Ball createBall(Class<T> c) {
        Ball ball = null;
        try{
            ball = (Ball)Class.forName(c.getName()).newInstance();
        }catch(Exception e){
            System.out.println("生产球失败");
        }
        return ball;
    }
}
