package cf.design.build;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chengfan
 * @date 2020-01-14 14:04:24
 */
public class Director {

    private List<String> sequence = new ArrayList<>();
    private CarBuild benz = new BenzCarBuild();
    private CarBuild bwm = new BWMCarBuild();

    /**
     * 奔驰A型：只有启动，然后熄火
     */
    public CarModel createBenzAModel(){
        //清理场景，这里是一些初级程序员不注意的地方
        this.sequence.clear();
        //BenzAModel的执行顺序
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benz.setSequence(sequence);
        return benz.createModel();
    }

    /**
     * 奔驰B型：启动，喇叭响，然后熄火
     */
    public CarModel createBenzBModel(){
        //清理场景，这里是一些初级程序员不注意的地方
        this.sequence.clear();
        //BenzBModel的执行顺序
        this.sequence.add("start");
        this.sequence.add("alarm");
        this.sequence.add("stop");
        this.benz.setSequence(sequence);
        return benz.createModel();
    }

    /**
     * 宝马C型：启动....
     */
    public CarModel createBWMCModel(){
        //清理场景，这里是一些初级程序员不注意的地方
        this.sequence.clear();
        //BWMCModel的执行顺序
        this.sequence.add("start");
        this.bwm.setSequence(sequence);
        return bwm.createModel();
    }

    /**
     * 宝马D型：引擎响，然后熄火
     */
    public CarModel createBWMDModel(){
        //清理场景，这里是一些初级程序员不注意的地方
        this.sequence.clear();
        //BWMDModel的执行顺序
        this.sequence.add("engineBoom");
        this.sequence.add("stop");
        this.bwm.setSequence(sequence);
        return bwm.createModel();
    }




}
