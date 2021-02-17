package cf.design.factory.abstractt;

/**
 * @author chengfan
 * @date 2020-01-13 14:57:52
 */
public class Test {

    public static void main(String[] args) {
        //生成男人
        HumanFactory maleFactory = new MaleHumanFactory();
        Human blackMale = maleFactory.createBlackHuman();
        blackMale.getSex();
        blackMale.getColor();
        blackMale.talk();
        Human whiteMale = maleFactory.createWhiteHuman();
        whiteMale.getSex();
        whiteMale.getColor();
        whiteMale.talk();
        Human yellowMale = maleFactory.createYellowHuman();
        yellowMale.getSex();
        yellowMale.getColor();
        yellowMale.talk();
        //生成女人
        HumanFactory feMaleFactory = new FeMaleHumanFactory();
        Human blackFeMale = feMaleFactory.createBlackHuman();
        blackFeMale.getSex();
        blackFeMale.getColor();
        blackFeMale.talk();
        Human whiteFeMale = feMaleFactory.createWhiteHuman();
        whiteFeMale.getSex();
        whiteFeMale.getColor();
        whiteFeMale.talk();
        Human yellowFeMale = feMaleFactory.createYellowHuman();
        yellowFeMale.getSex();
        yellowFeMale.getColor();
        yellowFeMale.talk();

        

    }
}
