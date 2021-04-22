package com.cf.ztest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author chengfan
 * @date 2021-04-18 18:14:25
 */
public class Z418 {


    public static void main(String[] args) {

        A a = new A(){
        };
        new Thread(()-> System.out.println(a.getResult(2))).start();
    }
}


interface A{
    default int getResult(int a){
        return 2*a;
    }
}

class ReadWrite{

    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\chengfan\\Desktop\\新建 Microsoft Excel 工作表.xlsx");
        FileInputStream in = new FileInputStream(file);
        File file2 = new File("C:\\Users\\chengfan\\Desktop\\新建 Microsoft Excel 工作表2.xlsx");
        FileOutputStream out = new FileOutputStream(file2);
        byte[] w = new byte[1024];
        int len;
        while ((len=in.read(w))!=-1){
            out.write(w,0,len);
        };
    }
}



class ListTest{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add(3);
            System.out.println(list);
        },"线程1").start();
        new Thread(()->{
            list.add(4);
            System.out.println(list);
        },"线程1").start();
    }
}


class ForTest{
    public static void main(String[] args) {
        for(int i = 1, j = 0; i < 5; i ++, j++){
            System.out.println("i = " + i + " j = " + j);
        }

    }
}