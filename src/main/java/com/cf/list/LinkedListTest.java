package com.cf.list;

import java.util.LinkedList;

/**
 * LinkedList
 * LinkedList和ArrayList都实现了list的接口，常用方法都一样
 * 1;继承于AbstractSequentialList的双向链表
 * 2:实现list接口，所以可以对它进行队列操作
 * 3:LinkedList 实现 Deque 接口，能将LinkedList当作双端队列使用
 * 4:实现了Cloneable接口，即覆盖了函数clone()，能克隆
 * 5:实现java.io.Serializable接口，所以LinkedList支持序列化，能通过序列化去传输
 * 6:非同步
 * @author chengfan
 * @date 2019-10-23 09:39:17
 */
public class LinkedListTest {


    /**
     * ArrayList和LinkedList区别
     * ArrayList在随机访问方面比较擅长，LinkedList在随机增删方面比较擅长
     * 对于需要快速插入，删除元素，使用LinkedList。因为ArrayList要想在数组中任意两个元素中间添加对象时，数组需要移动所有后面的对象。
     * 对于需要快速随机访问元素（get()），应该使用ArrayList，因为LinkedList要移动指针、遍历节点来定位，所以速度慢。
     * 对于“单线程环境” 或者 “多线程环境，但List仅仅只会被单个线程操作”，此时应该使用非同步的类(如ArrayList)。
     * 对于“多线程环境，且List可能同时被多个线程操作”，此时，应该使用同步的类(如Vector)。
     */



    /**
     * LinkedList的特有方法
     */
    public static void main(String[] args) {

        //------------------新增----------------//
        LinkedList<Integer> list = new LinkedList<>();
        //push()、addFirst()、offerFirst();  链表头部插入一个元素
        list.addFirst(1);
        list.offerFirst(2);
        list.push(3);
        //输出[3,2,1]
        System.out.println(list);
        //offer()、addLast()、offerLast();   链表尾部插入一个元素
        list.offer(4);
        list.addLast(5);
        list.offerLast(6);
        //输出[3,2,1,4,5,6]
        System.out.println(list);


        //------------------查----------------//
        //getFirst()、peek()、peekFirst()   查询链表头
        System.out.println(list.getFirst());
        System.out.println(list.peek());
        System.out.println(list.peekFirst());
        //getLast()、peekLast()     查询链表尾
        System.out.println(list.getLast());
        System.out.println(list.peekLast());



        //------------------删除----------------//
        //removeFirst()、pollFirst()、pop()、poll()  查询并删除链表头
        System.out.println(list.removeFirst());
        System.out.println(list.pollFirst());
        System.out.println(list.pop());
        System.out.println(list.poll());
        //removeLast()、pollLast()      查询并删除链表尾
        System.out.println(list.removeLast());
        System.out.println(list.pollLast());




    }
}
