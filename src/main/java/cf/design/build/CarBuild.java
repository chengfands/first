package cf.design.build;

import java.util.List;

/**
 * @author chengfan
 * @date 2020-01-14 13:53:00
 */
public abstract class CarBuild {

    public abstract void setSequence(List<String> sequence);

    /**
     * 生产所需要的的对象
     */
    public abstract CarModel createModel();

}
