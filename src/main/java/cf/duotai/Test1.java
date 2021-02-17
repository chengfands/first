package cf.duotai;

import java.util.List;

/**
 * @author chengfan
 * @date 2019-11-25 16:59:59
 */
public class Test1 {

    public static void main(String[] args) {
        //下例说明不止是继承可以向上转型，接口实现也可以
        List<Integer> list = new G<>();
        list.add(1);
        System.out.println(list);

    }
}
;