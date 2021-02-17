package cf.design.factory.simple;

/**
 * @author chengfan
 * @date 2020-01-09 15:59:20
 */
public class Football implements Ball {

    @Override
    public int getPrice() {
        return 200;
    }

    @Override
    public String getName() {
        return "足球";
    }
}
