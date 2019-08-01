package edu.swun.inputstream;

import java.io.*;

public class BufferInputStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("immoc.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            FileInputStream fis = new FileInputStream("immoc.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            long startTime = System.currentTimeMillis();
            bos.write(50);
            bos.write('a');
            bos.flush();
            int n = 0;
            n = bis.read();
            while (n!=-1){
                System.out.println((char)n);
                n = bis.read();
            }
            long endTime = System.currentTimeMillis();
            System.out.println(endTime-startTime);
            bis.close();
            bos.close();
            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
