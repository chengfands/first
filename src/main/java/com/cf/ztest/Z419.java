package com.cf.ztest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chengfan
 * @date 2021-04-19 11:12:43
 */
public class Z419 {
    @Override
    public boolean equals(Object o){
        if(o == Z419.class){
            return true;
        }
        if(o instanceof Z419){
            return true;
        }
        return false;
    }

}


interface Istrategy1{
    void sell();
}

class Context1{
    private Istrategy1 is;
    public Context1(Istrategy1 is){
        this.is=is;
    }
    public void sell(){
        is.sell();
    }

    public static void main(String[] args) {
        String a="1";
        Map map = new HashMap();
        System.out.println(new Z419().equals(new Z419()));
    }
}