package com.cf.design.build;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chengfan
 * @date 2020-01-14 13:45:15
 */
public abstract class CarModel {

    //这个参数是各个基本方法执行的顺序
    private List<String> sequence = new ArrayList<>();

    /**
     * 启动
     */
    public abstract void start();
    /**
     * 喇叭响
     */
    public abstract void alarm();
    /**
     * 引擎响
     */
    public abstract void engineBoom();
    /**
     * 熄火
     */
    public abstract void stop();
    /**
     * 运行顺序
     */
    public void setSequence(List<String> sequence){
        this.sequence = sequence;
    }

    /**
     * 按顺序运行
     */
    final public void run(){
        if(this.sequence != null && this.sequence.size() > 0){
            for(String actionName : this.sequence){
                if(actionName.equalsIgnoreCase("start")){
                    this.start();
                    //启动汽车
                }else if(actionName.equalsIgnoreCase("stop")){
                    //停止汽车
                    this.stop();
                }else if(actionName.equalsIgnoreCase("alarm")){
                    //喇叭开始叫了
                    this.alarm();
                }else if(actionName.equalsIgnoreCase("engineBoom")){
                    //引擎开始轰鸣
                    this.engineBoom();
                }
            }
        }

    }



}
