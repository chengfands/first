package cf.design.template;

/**
 * 悍马车模
 * @author chengfan
 * @date 2020-01-13 15:42:15
 */
public abstract class HummerModel {

    /**
     * 启动
     */
    public abstract void start();
    /**
     * 鸣笛
     */
    public abstract void alarm();
    /**
     * 引擎声
     */
    public abstract void engineBoom();
    /**
     * 熄火
     */
    public abstract void stop();

    /**
     * 运行
     * 模板方法一般用final修饰，防止恶意篡改
     */
    final public void run(){
        this.start();
        //由子类方法的返回值决定执行结果，isAlarm()即为“钩子方法”
        if(this.isAlarm()){
            this.alarm();
        }
        this.engineBoom();
        this.stop();
    }

    /**
     * 是否鸣笛   “钩子方法”
     */
    public boolean isAlarm(){
        return true;
    }
}
