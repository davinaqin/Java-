package edu.swun.wrap;

public class WrapTest3 {
    public static void main(String[] args) {
        int t1 = 2;
        //基本数据类型转为字符串
        String t2 = Integer.toString(t1);

        //字符串转为基本数据类型
        //方式一，通过包装类的parse
        int t3 = Integer.parseInt(t2);

        //方式二，通过包装类的valueOf，先将字符串转换为包装类，再通过自动拆箱完成基本类型的转换
        int t4 = Integer.valueOf(t2);
    }
}
