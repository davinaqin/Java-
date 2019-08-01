package edu.swun.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("immoc.txt");
            int ch = 0;
            ch = fis.read();
            while (ch != -1)
            {
                System.out.print((char)ch);
                ch = fis.read();
            }

            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
