package edu.swun.string;

public class StringDemo2 {
    public static void main(String[] args) {
        String str = new String("JAVA编程基础，我喜欢java编程");

        //查找字符‘A’在字符串第一次出现的位置
        int index = str.indexOf('A');
        System.out.println("字符串‘A’在字符串第一次出现的位置是"+index);

        //查找字符串“编程”在字符串第一次出现的位置
        System.out.println("字符串“编程”在字符串第一次出现的位置"+str.indexOf("编程"));

        //查找字符‘A’在字符串最后一次出现的位置
        System.out.println("字符‘A’在字符串最后一次出现的位置"+str.lastIndexOf('A'));

        //查找字符串“编程”在字符串最后一次出现的位置
        System.out.println("字符串“编程”在字符串最后一次出现的位置"+str.lastIndexOf("编程"));




    }
}
