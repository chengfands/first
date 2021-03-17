package com.cf.design.build;

import java.util.List;

/**
 * @author chengfan
 * @date 2020-01-14 13:57:07
 */
public class BenzCarBuild extends CarBuild {

    private BenzModel benzModel = new BenzModel();

    @Override
    public void setSequence(List<String> sequence) {
        this.benzModel.setSequence(sequence);
    }

    @Override
    public CarModel createModel() {
        return this.benzModel;
    }
}
