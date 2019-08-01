package edu.swun.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Count {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("speech.txt");
            int ch ,count=0;
            while ((ch=fis.read())!=-1){
                System.out.print((char)ch);
                count++;
            }
            fis.close();
            System.out.println();
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
