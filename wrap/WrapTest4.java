package edu.swun.wrap;

public class WrapTest4 {
    public static void main(String[] args) {
        double a = 12.5;
        String str1 = Double.toString(a);

        String str2 = "2.8";
        double d = Double.parseDouble(str2);
        double d2 = Double.valueOf(str2);

        System.out.println("a 转换为String型后+10的结果为： "+(str1+10));
        System.out.println("str 转换为double型后+10的结果为： "+(10+d));
    }
}
