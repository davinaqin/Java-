package edu.swun.string;

public class StringDemo1 {
    public static void main(String[] args) {
        String str = "JAVA 编程 基础";
        int length = str.length();

        //
        System.out.println("字符串的长度是："+length);

        //charAt(int index)
        System.out.println(str.charAt(6));

        //substring(int beginIndex)，取出“编程 基础”
        System.out.println(str.substring(5));

        //substring(int beginIndex,int endIndex)，取出“编程”
        System.out.println(str.substring(5,7));





    }
}
