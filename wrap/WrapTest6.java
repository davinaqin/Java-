package edu.swun.wrap;

public class WrapTest6 {
    public static void main(String[] args) {
        float f1 = 88.99f;

        String s = Float.toString(f1);
        System.out.println(s+20);

        String str = "188.25";
        double d = Double.valueOf(str);
        System.out.println(d+20);
    }
}
