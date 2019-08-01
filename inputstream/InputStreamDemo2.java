package edu.swun.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamDemo2 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("immoc.txt");
            byte[] b = new byte[100];
            fis.read(b,0,5);
            System.out.println(new String(b));
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
