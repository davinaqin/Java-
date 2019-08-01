package edu.swun.file;

import java.io.File;
import java.io.IOException;

public class FileTest1 {
    public static void main(String[] args) {
        File file = new File("thread.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
                //获取绝对路径
                System.out.println(file.getAbsolutePath());
                //获取相对路径
                System.out.println(file.getPath());
                //获取文件名
                System.out.println(file.getName());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
