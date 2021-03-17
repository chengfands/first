package com.cf.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Collection三大接口：List、Set、Queue
 * list实现类：ArrayList
 * 底层是基于数组实现容量大小动态变化
 * 默认初始容量是10，需扩容时默认扩容1.5倍
 * @author chengfan
 * @date 2019-10-23 09:37:12
 */
public class ArrayListTest {


    public static void main(String[] args) {
        //for循环不要进行元素的删除（或添加），如需删除元素使用Iterator迭代器
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        /*for(Integer a : list){
            if(a == 3){
                list.remove(a);
              }
          }
          System.out.println(list);
          上面代码会抛异常ConcurrentModificationException，异常原因：
          找到报异常的位置if (modCount != expectedModCount) throw new ConcurrentModificationException();
          modCount:ArrayList的成员变量，表示集合实际被修改的次数
          expectedModCount:ArrayList中的一个内部类Itr中的成员变量，表示该迭代器期望集合被修改的次数
          再看list.remove()或者list.add()源码，可以发现只有modCount发生了改变，并没有对expectedModCount做任何操作
          */

        //迭代器遍历可以正常移除元素
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            if(it.next() == 3){
                it.remove();
            }
        }
        System.out.println(list);
        //JDK1.8中removeIf和lambda表达式直接进行元素移除
        list.removeIf(a -> a == 4);

        //lambda的foreach不能对list进行add,remove操作
//        list.forEach(a -> {
//            if(a == 4){
//                list.add(a);
//            }
//        });
        System.out.println(list);





    }
}
