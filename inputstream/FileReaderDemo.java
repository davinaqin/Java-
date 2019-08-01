package edu.swun.inputstream;

import java.io.*;

public class FileReaderDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("filereader-demo.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("filereader-demo-copy.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            char[] cbuf = new char[10];
            int n=0;
            while ((n=br.read(cbuf))!=-1){
                bw.write(cbuf,0,n);
                bw.flush();
            }
            br.close();
            fr.close();
            bw.close();
            fw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
