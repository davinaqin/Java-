package edu.swun.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo2 {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("happy.jpg");
            FileOutputStream fos = new FileOutputStream("happycopy.jpg");
            byte[] b = new byte[1024];
            int n=0;
            while ((n = fis.read(b))!=-1){
                fos.write(b,0,n);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
