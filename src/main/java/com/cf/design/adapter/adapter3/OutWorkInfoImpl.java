package com.cf.design.adapter.adapter3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chengfan
 * @date 2020-01-07 14:03:38
 */
public class OutWorkInfoImpl implements IOutWorkInfo {

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
