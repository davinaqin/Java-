package edu.swun.file;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
//        File file1 = new File("D:\\IOTest\\score.txt");
//        File file1 = new File("D:\\IOTest","score.txt");
        File file = new File("D:\\IOTest");
        File file1 = new File(file,"score.txt");
        //判断为文件或者目录
        System.out.println("是否是目录："+file1.isDirectory());
        System.out.println("是否是文件："+file1.isFile());
        //创建目录
        File file2 = new File("D:\\IOTest\\set","HashSet");
        if(!file2.exists()){
            file2.mkdir();
        }
        //创建多级目录
        File file3 = new File("D:\\IOTest\\list\\LinkList");
        if(!file3.exists()){
            file3.mkdirs();
        }
        //创建文件
        if(!file1.exists()){
            try {
                file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
