package com.cf.design.factory.abstractt;

/**
 * @author chengfan
 * @date 2020-01-13 14:56:00
 */
public class MaleHumanFactory extends HumanFactory {

    @Override
    public Human createBlackHuman() {
        return new BlackMaleHuman();
    }

    @Override
    public Human createYellowHuman() {
        return new YellowMaleHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new WhiteMaleHuman();
    }
}
