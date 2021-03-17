package com.cf.design.adapter.adapter;

import java.util.Map;

/**
 * 外部人员信息接口
 * @author chengfan
 * @date 2019-12-20 09:56:33
 */
public interface IOutUser {

    /**
     * 获取个人信息
     */
    Map<String,String> getPersonInfo();

    /**
     * 获取工作信息
     */
    Map<String,String> getWorkInfo();
}
