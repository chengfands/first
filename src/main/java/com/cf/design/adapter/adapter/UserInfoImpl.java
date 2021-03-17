package com.cf.design.adapter.adapter;

/**
 * @author chengfan
 * @date 2019-12-20 10:17:59
 */
public class UserInfoImpl implements IUserInfo {

    @Override
    public String getUserName() {
        return "大大";
    }

    @Override
    public String getTel() {
        return "13888888888";
    }

    @Override
    public String getAddress() {
        return "中国";
    }

    @Override
    public String getJob() {
        return "看门";
    }
}
