package cf.design.factory.abstractt;

/**
 * @author chengfan
 * @date 2020-01-13 14:56:00
 */
public class FeMaleHumanFactory extends HumanFactory {

    @Override
    public Human createBlackHuman() {
        return new BlackFeMaleHuman();
    }

    @Override
    public Human createYellowHuman() {
        return new YellowFeMaleHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new WhiteFeMaleHuman();
    }
}
