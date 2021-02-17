package cf.design.build;

/**
 * @author chengfan
 * @date 2020-01-14 13:58:32
 */
public class BWMModel extends CarModel {

    @Override
    public void start() {
        System.out.println("宝马启动");
    }

    @Override
    public void alarm() {
        System.out.println("宝马喇叭响");
    }

    @Override
    public void engineBoom() {
        System.out.println("宝马引擎响");
    }

    @Override
    public void stop() {
        System.out.println("宝马熄火");
    }
}
