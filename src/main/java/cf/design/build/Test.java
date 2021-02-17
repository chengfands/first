package cf.design.build;

/**
 * @author chengfan
 * @date 2020-01-14 14:16:22
 */
public class Test {


    public static void main(String[] args) {

        Director director = new Director();
        //需要benzA车模
        director.createBenzAModel().run();
        //需要benzB车模
        director.createBenzBModel().run();
        //需要BWMC车模
        director.createBWMCModel().run();
        //需要BWMD车模
        director.createBWMDModel().run();


    }



}
