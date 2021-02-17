package cf.fanxing;

/**
 * 泛型方法
 * 泛型类，是在实例化类的时候指明泛型的具体类型；泛型方法，是在调用方法的时候指明泛型的具体类型 。
 * @author chengfan
 * @date 2019-10-22 14:27:02
 */
public  class FanXingMethod {

    /**
     * 修饰符与返回值中间的<T>必不可少，这表示泛型方法，而泛型类中使用了泛型的成员方法并非泛型方法
     * 泛型的数量可以为任意多个
     */
    public <E,K,M,N> E ggg(FanXingClass<E> cf1,FanXingClass<K> cf2){
        System.out.println("E泛型类中getT()值："+cf1.getT());
        System.out.println("K泛型类中getT()值："+cf2.getT());
        return cf1.getT();
    }


}
