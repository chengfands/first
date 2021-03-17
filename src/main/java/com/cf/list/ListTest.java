package com.cf.list;

import java.util.ArrayList;
import java.util.List;

/**
 * list常用方法
 * @author chengfan
 * @date 2019-10-28 16:20:43
 */
public class ListTest {

    public static void main(String[] args) {
        //list接口中的方法足够使用才使用向上转型；如果需要使用特有方法,需ArrayList<Integer> list = new ArrayList<>();

        //---------------list常用的通用方法---------------------//
        List<Integer> list = new ArrayList<>();
        //add()方法
        list.add(1);
        list.add(3);
        list.add(7);
        list.add(10);
        //输出[1, 3, 7, 10]
        System.out.println(list);
        //在指定索引处插入元素
        list.add(1,8);
        //输出[1, 8, 3, 7, 10]
        System.out.println(list);
        List<Integer> list2 = new ArrayList<>();
        list2.add(13);
        list2.add(18);
        //addAll  list2添加到集合list后面
        list.addAll(list2);
        //[1, 8, 3, 7, 10, 13, 18]
        System.out.println(list);
        //list2插入到集合指定处
        list.addAll(2,list2);
        //[1, 8, 13, 18, 3, 7, 10, 13, 18]
        System.out.println(list);
        //indexOf  返回第一次出现该元素的位置索引，若不存在则返回-1
        System.out.println(list.indexOf(13));
        System.out.println(list.indexOf(14));
        //lastIndexOf  返回最后一次出现该元素的位置索引，若不存在则返回-1
        System.out.println(list.lastIndexOf(13));
        System.out.println(list.lastIndexOf(14));
        //remove()  1:参数传int表示移除索引处的元素  2:参数传Object表示移除匹配的第一个元素，返回boolean
        list.remove(1);
        list.remove(Integer.valueOf(13));
        System.out .println(list);
        //set()  替换指定索引的元素
        list.set(1,1000);
        System.out.println(list);
        //subList(a,b)  截取两个索引之间的list，包左不包右
        System.out.println(list.subList(1,3));


    }
}
