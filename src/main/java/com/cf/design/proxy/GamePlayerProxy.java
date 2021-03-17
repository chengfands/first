package com.cf.design.proxy;

/**
 * 游戏代练
 * @author chengfan
 * @date 2020-01-15 13:55:58
 */
public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer playerProxy;

    public GamePlayerProxy() throws Exception{
        this.playerProxy = new GamePlayer(this);
    }

    @Override
    public void login(String userName, String password) {
        this.playerProxy.login(userName,password);
    }

    @Override
    public void killBoss() {
        this.playerProxy.killBoss();
    }

    @Override
    public void levelUp() {
        this.playerProxy.levelUp();
    }
}
