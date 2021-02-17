package cf.file;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 一行一行读取、写入文件
 * @author chengfan
 * @date 2020-04-17 15:49:48
 */
public class Line {


    public static void main(String[] args) throws IOException{
        //一行一行读取文件
        File file1 = new File("D:\\aa\\test\\test3.ftl");
        readLine(file1);
        //一行一行写文件
        File file2 = new File("D:\\aa\\test3\\test33.ftl");
        writeLine(file2);
    }


    /**
     * 一行一行读取文件
     * 解决中文乱码
     * 流的关闭顺序：先开后关，后开先关
     */
    private static void readLine(File file) throws IOException {
        FileInputStream in = new FileInputStream(file);
        InputStreamReader reader = new InputStreamReader(in, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(reader);
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
        reader.close();
        in.close();
    }

    /**
     * 一行一行写文件
     * 解决中文乱码
     * 流的关闭顺序：先开后关，后开先关
     */
    private static void writeLine(File file) throws IOException{
        //判断文件父目录是否存在
        File parent = file.getParentFile();
        if(!parent.exists()){
            parent.mkdirs();
        }
        if(!file.exists()){
            file.createNewFile();
        }
        //需要写入的字符串
        String[] ss = {"要写的第一行","要写的第二行","要写的第三行","要写的第四行"};
        FileOutputStream out = new FileOutputStream(file);
        OutputStreamWriter writer = new OutputStreamWriter(out,StandardCharsets.UTF_8);
        BufferedWriter w = new BufferedWriter(writer);
        for(String s : ss){
            //  '\t'表示空四个字符，也称缩进，相当于按一下Tab键，'\n'表示换行
            w.write(s + "\t\n");
        }
        w.close();
        writer.close();
        out.close();
    }

}
