package cf.design.factory.factory2;


/**
 * @author chengfan
 * @date 2020-01-09 10:26:10
 */
public class Test {

    public static void main(String[] args) {
        //工厂
        AbstractHumanFactory factory = new HumanFactory();
        //黄种人
        Human yellowHuman = factory.createHuman(YellowHuman.class);
        System.out.println("生成黄种人");
        yellowHuman.getColor();
        yellowHuman.talk();
        //白种人
        Human whiteHuman = factory.createHuman(WhiteHuman.class);
        System.out.println("生成白种人");
        whiteHuman.getColor();
        whiteHuman.talk();
        //黑种人
        Human blackHuman = factory.createHuman(BlackHuman.class);
        System.out.println("生成黑种人");
        blackHuman.getColor();
        blackHuman.talk();

    }
}
