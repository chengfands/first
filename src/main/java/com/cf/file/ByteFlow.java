package com.cf.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 字节流
 * @author chengfan
 * @date 2020-04-17 13:48:24
 */
public class ByteFlow {


    public static void main(String[] args) throws IOException {
        //字节输入流读取文件
//        File file1 = new File("D:\\aa\\test\\test1.txt");
//        read(file1);
        //字节输出流写入文件
        File file2 = new File("D:\\aa\\test1\\test11.txt");
        write(file2);
    }


    /**
     * 字节输入流读取文件
     */
    private static void read(File file) throws IOException{
        if(!file.exists()){
            System.out.println("文件不存在");
            return;
        }
        FileInputStream in = new FileInputStream(file);
        //开始读取文件
        byte[] b = new byte[1024];
        //记录读取文件的字节个数，如果没有内容读取返回-1
        int size;
        //因为文件一次读取不完，循环读取
        do{
            size = in.read(b);
            if(size >= 0){
                String info = new String(b,0,size, StandardCharsets.UTF_8);
                System.out.println("读取的内容是" + info);
            }
        }while (size >= 0);
        //文件流必须关闭！！！！！！
        in.close();
    }

    /**
     * 字节输出流写入文件
     */
    private static void write(File file) throws IOException{
        //获取文件的上一级目录
        File parent = file.getParentFile();
        if(!parent.exists()){
            //不存在则创建父目录，要用mkdirs而不是mkdir，加s表示创建每一级不存在的
            parent.mkdirs();
        }
        //文件不存在，则创建一个
        if(!file.exists()){
            file.createNewFile();
        }
        //需要写入的文件
        String info = "这是我要写的内容haha";
        //创建文件写入对象
        FileOutputStream out = new FileOutputStream(file);
        out.write(info.getBytes());
        //清空缓存区
        out.flush();
        //关闭
        out.close();
    }


}
