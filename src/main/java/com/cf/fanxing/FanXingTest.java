package com.cf.fanxing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 泛型
 * 定义：参数化类型，类似方法的参数一样，以类型形参传递，使用时为类型实参
 * 作用：简单易用，避免强制类型转换，类型安全；类型使用错误时编译期就会报错，不使用泛型运行才会报错
 * 特性：泛型只在编译阶段有效
 * @author chengfan
 * @date 2019-10-21 09:50:30
 */
public class FanXingTest {


    public static void main(String[] args) {
        //下面结果说明：泛型只在编译期有效，泛型信息不会进入到运行期
        List<Integer> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        //List使用了泛型，获取list泛型的类型(class.getTypeParameters())，下面都输出<E>
        System.out.println(Arrays.toString(list1.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(list2.getClass().getTypeParameters()));

    }
}
