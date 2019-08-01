package edu.swun.string;

public class StringDemo3 {
    public static void main(String[] args) {
        String str= new String("abcdefg");
        String sub = str.substring(2,5);
        String upperCase = sub.toUpperCase();
        String rep = upperCase.replaceAll("DE","MM");
        System.out.println(rep);
    }
}
