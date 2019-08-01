package edu.swun.wrap;

public class WrapTest2 {
    public static void main(String[] args) {
        int score = 100;
        //自动装箱
        Integer score1 = score;

        //手动拆箱，拆为double
        double d = score1.doubleValue();

        //手动拆箱,拆为long
        long l = score1.longValue();

        //手动拆箱，拆为int
        int i = score1.intValue();

        System.out.println("score对应的Interger类型结果为："+score1);
        System.out.println("score对应的double类型结果为："+d);
        System.out.println("score对应的long类型结果为："+l);
        System.out.println("重新由Integer转换为int类型的结果为："+i);
    }
}
