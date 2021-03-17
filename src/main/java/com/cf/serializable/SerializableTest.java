package com.cf.serializable;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 序列化
 * 类想要序列化成功  需要两要素
 * 1：实现Serializable接口   2:所有属性必须是可序列化的，有任何属性不可序列化需要声明是短暂的
 * @author chengfan
 * @date 2019-10-23 14:00:22
 */
public class SerializableTest {


    public static void main(String[] args){
        Game game = new Game("LOL","好玩的游戏",9);
        try {
            FileOutputStream fileOut = new FileOutputStream("D:\\tmp\\employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(game);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in /tmp/employee.ser");
        }catch(IOException i) {
            i.printStackTrace();
        }

    }


}
