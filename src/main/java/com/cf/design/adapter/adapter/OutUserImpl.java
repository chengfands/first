package com.cf.design.adapter.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chengfan
 * @date 2019-12-20 09:58:26
 */
public class OutUserImpl implements IOutUser {

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

    /**
     * 工作信息
     */
    @Override
    public Map<String, String> getWorkInfo() {
        Map<String,String> map = new HashMap<>(2);
        map.put("job","扫地");
        map.put("address","美国");
        return map;
    }
}
