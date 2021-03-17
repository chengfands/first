package com.cf.design.adapter.adapter;

import java.util.Map;

/**
 * @author chengfan
 * @date 2020-01-07 10:46:01
 */
public class AdapterUser22 implements IUserInfo {

    private OutUserImpl outUser;

    private Map<String, String> userMap = null;
    private Map<String, String> workMap = null;

    public AdapterUser22(OutUserImpl outUser){
        this.outUser = outUser;
        this.userMap = outUser.getPersonInfo();
        this.workMap = outUser.getWorkInfo();
    }

    @Override
    public String getUserName() {
        return userMap.get("name");
    }

    @Override
    public String getTel() {
        return userMap.get("phone");
    }

    @Override
    public String getAddress() {
        return workMap.get("address");
    }

    @Override
    public String getJob() {
        return workMap.get("job");
    }
}
