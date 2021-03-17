package com.cf.fanxing;

/**
 * 特殊情况：泛型类中存在泛型方法
 * @author chengfan
 * @date 2019-10-22 15:29:53
 */
public class Special<T> {

    /**
     * 普通成员方法  使用泛型类已声明的泛型T
     */
    public void show1(T t){
        System.out.println(t.toString());
    }

    /**
     * 声明一个泛型方法，泛型类型为E
     */
    public <E> void show2(E e){
        System.out.println(e.toString());
    }

    /**
     * 声明一个泛型方法，泛型类型为T，这个T是新的类型，不同于泛型类声明的T
     */
    public <T> void show3(T t){
        System.out.println(t.toString());
    }

    /**
     * @param args 可变参数列表  "..."是可变参数列表的标志，意思是作为K类型的都可以作参数传递
     * @param <K> 泛型类型
     */
    public <K> void show4(K... args){
        for(K k : args){
            System.out.println(k);
        }
    }
    public  void show5(Object... args){
        for(Object k : args){
            System.out.println(k);
        }
    }

    /**
     * 静态方法无法使用泛型类上声明的类型T，
     * 所以如果静态方法要用泛型，则需要把此方法定义为泛型方法
     * 声明的类型需要在static后面
     */
    //public static void show6(T t){}
    public  static <T> void show6(T t){
        System.out.println(t.toString());
    }

}
