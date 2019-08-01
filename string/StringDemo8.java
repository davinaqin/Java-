package edu.swun.string;

public class StringDemo8 {
    public static void main(String[] args) {
        //定义一个字符串“欢迎来到”
        StringBuilder str = new StringBuilder("欢迎来到");
        //在"欢迎来到"后面添加内容，将字符串变成"欢迎来到imooc"
        System.out.println(str.append("imooc"));
        //使用delete方法删除"欢迎来到",然后插入“你好！”
        System.out.println("删除插入后："+str.delete(0,4).insert(0,"你好！"));
        //将字符串变成“你好，imooc”
        System.out.println("替换后"+str.replace(2,3,","));
    }
}
