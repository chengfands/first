package cf.design.factory.factory2;


/**
 * @author chengfan
 * @date 2020-01-09 10:14:04
 */
public class HumanFactory extends AbstractHumanFactory {

    @Override
    public <T extends Human> Human createHuman(Class<T> c) {
        Human human = null;
        try{
            human = (Human)Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            System.out.println("人类生成错误");
        }
        return human;
    }
}
