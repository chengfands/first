package com.cf.fanxing;

/**
 * 泛型类
 * 可以声明泛型边界 <T extends Number>
 * @author chengfan
 * @date 2019-10-22 09:49:36
 */
public class FanXingClass<T> {

    private T t;

    public FanXingClass(T t){
        this.t =  t;
    }
    /**
     * 此方法虽然使用了泛型，但是不算泛型方法
     * 此方法返回值已经在泛型类中声明，所以可以用T这个泛型
     * 如果换一个泛型E，显然是不行的，因为没有声明过
     */
    public T getT(){
        return t;
    }
//    public E getT(){
//        return t;
//    }
    public void showValue(FanXingClass<T> fx){
        System.out.println(fx.getT());
    }

    /**
     * 可以为泛型指定边界，如下：传入的实参必须是Number的子类
     */
    public void showValue1(FanXingClass<? extends Number> fx1){
        System.out.println(fx1.getT());
    }

    /**
     * 泛型方法里面添加边界限制
     */
    public <M extends Number> void showValue2(FanXingClass<M> fx2){
        System.out.println(fx2.getT());
    }
}
