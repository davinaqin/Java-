package edu.swun.string;

import java.io.UnsupportedEncodingException;

public class StringDemo4 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = new String("JAVA 编程 基础");
        byte[] arra = str.getBytes();
        for(int i=0;i<arra.length;i++){
            System.out.print(arra[i]+" ");
        }
        System.out.println();
        String str1 = new String(arra,"UTF-8");
        System.out.println(str1);

        byte[] arra1 = str.getBytes("GBK");
        String str2 = new String(arra1,"GBK");
        System.out.println(str2);
    }
}
