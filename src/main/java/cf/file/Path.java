package cf.file;

import java.io.File;

/**
 * 文件路径
 * @author chengfan
 * @date 2020-04-17 10:00:26
 */
public class Path {

    /**
     * getPath()获取的是构造file时的路径
     * getAbsolutePath()获取的是构造file时的全路径，如果是构造file时是相对路径，则返回当前目录+构造file时的路径
     * 文件路径的.和..  一个点表示当前目录，可以连同后面的/都不用写（默认当前目录），二个点表示上一级目录
     */
    public static void main(String[] args) {
        File file1 = new File("test\\test1.txt");
        File file2 = new File("D:\\aa\\test\\test2.txt");
        System.out.println(file1.getPath());
        System.out.println(file1.getAbsolutePath());
        System.out.println(file2.getPath());
        System.out.println(file2.getAbsolutePath());
    }

}
