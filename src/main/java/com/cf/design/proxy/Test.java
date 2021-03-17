package com.cf.design.proxy;

/**
 * @author chengfan
 * @date 2020-01-15 13:53:21
 */
public class Test {

    public static void main(String[] args) throws Exception{

        //玩家操作
//        IGamePlayer player = new GamePlayer(null);
//        System.out.println("-------玩家操作-------");
//        player.login("小小","123456");
//        player.killBoss();
//        player.levelUp();

        //代练操作
        IGamePlayer proxy = new GamePlayerProxy();
        System.out.println("-------代练操作-------");
        proxy.login("小小","123456");
        proxy.killBoss();
        proxy.levelUp();
    }
}
