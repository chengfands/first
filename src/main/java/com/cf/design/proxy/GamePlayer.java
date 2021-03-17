package com.cf.design.proxy;

/**
 * 游戏玩家
 * @author chengfan
 * @date 2020-01-15 13:48:48
 */
public class GamePlayer implements IGamePlayer {

    /**
     * 用户名
     */
    private String userName;



    /**
     * 要使用代理类，且禁止new一个被代理的对象
     */
    public GamePlayer(IGamePlayer player) throws Exception{
        if(player == null){
            throw new Exception("禁止创建真实角色");
        }
    }


    @Override
    public void login(String userName, String password) {
        this.userName = userName;
        System.out.println(this.userName + "登录成功");
    }

    @Override
    public void killBoss() {
        System.out.println(this.userName + "正在打怪");
    }

    @Override
    public void levelUp() {
        System.out.println(this.userName + "升级了");
    }
}
