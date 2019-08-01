package edu.swun.inputstream;

import java.io.*;

public class Pratice {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("test.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);
            String str = "你好吗？\r\n我很好！";
            bw.write(str);
            bw.close();
            osw.close();
            fos.close();
            FileInputStream fis = new FileInputStream("test.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            char[] cbuf = new char[10];
            int n=0;
            while ((n=br.read(cbuf))!=-1){
                System.out.println(cbuf);
            }
            br.close();
            isr.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
