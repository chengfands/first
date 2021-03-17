package com.cf.file;

import java.io.File;

/**
 * 文件属性
 * @author chengfan
 * @date 2020-04-17 10:35:51
 */
public class Attribute {


    public static void main(String[] args) {
        File file = new File("D:\\aa");
        test(file);
    }


    /**
     * 遍历文件夹下的所有文件并测试文件属性
     */
    private static void test(File file){
        if(file.isDirectory()){
            //获取文件夹下的所有内容
            File[] files = file.listFiles();
            if(files == null || files.length <= 0){
                System.out.println("文件夹下面没有数据");
                return;
            }
            System.out.println("文件夹" + file.getName() + "有" + files.length + "个文件");
            //for循环遍历所有内容
            for(File f : files){
                if(f.isFile()){
                    //这是一个文件
                    System.out.println("文件" + f.getName());
                }else{
                    //文件夹，递归调用
                    test(f);
                }
            }
        }else{
            System.out.println("文件" + file.getName());
        }

    }

}
