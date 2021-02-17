package cf.design.build;

import java.util.List;

/**
 * @author chengfan
 * @date 2020-01-14 13:57:07
 */
public class BWMCarBuild extends CarBuild {

    private BWMModel bwmModel = new BWMModel();

    @Override
    public void setSequence(List<String> sequence) {
        this.bwmModel.setSequence(sequence);
    }

    @Override
    public CarModel createModel() {
        return this.bwmModel;
    }
}
