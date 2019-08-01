package edu.swun.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOuputStreamDemo {
    public static void main(String[] args) {
        FileOutputStream fos ;
        FileInputStream fis;
        try {
            fos = new FileOutputStream("immoc.txt",true);
            fos.write(50);
            fos.write('a');
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
