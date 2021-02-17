package cf.fanxing;

import java.util.Random;

/**
 * 未传入泛型实参时，与泛型类的定义相同，在声明类的时候，需将泛型的声明也一起加到类中
 * 在实现类实现泛型接口时，如已将泛型类型传入实参类型，则所有使用泛型的地方都要替换成传入的实参类型
 * @author chengfan
 * @date 2019-10-22 13:48:31
 */
public class FanXingImpl implements FanXingInterface<String> {

    private String[] strs = {"aa","bb","cc"};

    @Override
    public String aa() {
        return strs[new Random().nextInt()];
    }

    public static void main(String[] args) {
        String[] strs = {"aa","bb","cc"};
        //nextInt(),不带参数表示随机生成[-2^31,2^31),带参数x表示随机[0,x)
        System.out.println(strs[new Random().nextInt(3)]);
        //生成6位随机数
        StringBuilder f = new StringBuilder();
        for(int a = 0 ; a< 6 ; a++){
            f.append(new Random().nextInt(10));
        }
        System.out.println(f.toString());

    }
}
