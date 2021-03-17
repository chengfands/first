package com.cf.design.proxy;

/**
 * @author chengfan
 * @date 2020-01-15 13:46:43
 */
public interface IGamePlayer {

    /**
     * 登录
     */
    void login(String userName, String password);

    /**
     * 打怪
     */
    void killBoss();

    /**
     * 升级
     */
    void levelUp();

}
