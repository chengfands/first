package cf.lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * lambda应用
 * @author chengfan
 * @date 2019-12-02 15:55:52
 */
public class Test {


    /**
     * 1:根据name正序排序
     * 2:根据last name正序排序
     * 3:根据name length正序排序
     * 4:根据最后一个字母正序排序
     */
    public static void main(String[] args) {
        String[] uzis = {"Rafael N","Number D","Stanislas W","David FB","Roger FA","Andy M","Tomas B","Juan P"};

        //1.1 匿名内部类
        Arrays.sort(uzis, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //正序就"正着"（即o1,o2），倒序就o2,o1
                return o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.asList(uzis));
        //1.2 lambda表达式  自然排序（正序）  用下面第二种写法
//        Arrays.sort(uzis,(o1,o2) -> o1.compareTo(o2));
        Arrays.sort(uzis,Comparator.naturalOrder());
        System.out.println(Arrays.asList(uzis));
        //2.1 匿名内部类
        Arrays.sort(uzis, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.substring(s1.indexOf(" ") + 1).compareTo(s2.substring(s2.indexOf(" ") + 1));
            }
        });
        //2.2 lambda表达式 用下面第二种写法
//        Arrays.sort(uzis,(o1,o2) -> o1.substring(o1.indexOf(" ") + 1).compareTo(o2.substring(o2.indexOf(" ") + 1)));
        Arrays.sort(uzis,Comparator.comparing( o -> o.substring(o.indexOf(" ") + 1)));
        System.out.println(Arrays.asList(uzis));
        //3 lambda表达式
        Arrays.sort(uzis,Comparator.comparing(String :: length));
        System.out.println(Arrays.asList(uzis));
        //4 lambda表达式
        Arrays.sort(uzis,Comparator.comparing( o -> o.charAt(o.length()-1)));
        System.out.println(Arrays.asList(uzis));
    }
}
