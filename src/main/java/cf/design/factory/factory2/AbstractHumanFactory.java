package cf.design.factory.factory2;


/**
 * @author chengfan
 * @date 2020-01-09 10:11:54
 */
public abstract class AbstractHumanFactory {

    public abstract <T extends Human> Human createHuman(Class<T> c);

}
