package cf.design.factory.factory;

import com.cf.design.factory.simple.Ball;

/**
 * @author chengfan
 * @date 2020-01-09 16:49:31
 */
public abstract class AbstractBallFactory {

    public abstract <T extends Ball> Ball createBall(Class<T> c);

}
