package edu.swun.string;

public class StringDemo6 {
    public static void main(String[] args) {
        String s1 = "imooc";
        s1 = "hello "+s1;
        System.out.println(s1);

        String s3 = new String("hello imooc");
        System.out.println("字串："+s3.substring(0,5));

        System.out.println(s3);

    }
}
