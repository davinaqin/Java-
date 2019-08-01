package edu.swun.inputstream;

import java.io.*;

public class ReaderDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("immoc-ch.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            FileOutputStream fos = new FileOutputStream("immoc-ch1.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            int n = 0;
            char[] cbuf = new char[10];
//            while ((n=isr.read())!=-1){
//                System.out.print((char)n);
//            }

            while ((n=isr.read(cbuf))!=-1){
//                String str = new String(cbuf,0,n);
//                System.out.print(str);
                osw.write(cbuf,0,n);
                osw.flush();
            }
            isr.close();
            fis.close();
            osw.close();
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
