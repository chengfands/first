package cf.duotai;

/**
 * @author chengfan
 * @date 2019-11-25 15:55:47
 */
public class B extends A {
    public String show(B obj){
        return ("B and B");
    }
    @Override
    public String show(A obj){
        return ("B and A");
    }
}
