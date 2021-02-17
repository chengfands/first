package cf.design.adapter.adapter.add;

/**
 * 接口方法默认是public abstract
 * JAVA8后接口不止只有抽象方法，还可以有default和static修饰的方法，这些方法有方法体
 * @author chengfan
 * @date 2020-01-06 15:39:12
 */
public interface Big {

    void big();

    default void say(){
        System.out.println("默认方法：说");
    }

    static void run(){
        System.out.println("静态方法：跑");
    }
}
