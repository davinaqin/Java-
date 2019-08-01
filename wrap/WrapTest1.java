package edu.swun.wrap;

public class WrapTest1 {
    public static void main(String[] args) {
        //自动装箱
        int t1 = 2;
        Integer t2=t1;
        System.out.println(t1);
        System.out.println(t2);

        //手动装箱
        Integer t3 = new Integer(t1);
        System.out.println(t3);

        System.out.println("========================");

        //自动拆箱
        int t4 = t2;

        //手动拆箱
        int t5 = t2.intValue();

    }
}
