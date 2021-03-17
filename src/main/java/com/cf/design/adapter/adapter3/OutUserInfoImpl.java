package com.cf.design.adapter.adapter3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chengfan
 * @date 2019-12-20 09:58:26
 */
public class OutUserInfoImpl implements IOutUserInfo {

    /**
     * 个人信息
     */
    @Override
    public Map<String, String> getPersonInfo() {
        Map<String,String> map = new HashMap<>(2);
        map.put("name","小小");
        map.put("phone","13911111111");
        return map;
    }

}
