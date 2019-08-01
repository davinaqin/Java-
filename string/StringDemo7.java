package edu.swun.string;

public class StringDemo7 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("你好");
        //在“你好”后边添加内容，将字符串变为“你好，imooc"
//        sb.append(",");
//        sb.append("imooc");
//        System.out.println("str="+sb);
        System.out.println("str="+sb.append(',').append("imooc!"));
        //将字符串编程变成“你好，iMOOC!"
        //1.使用delete方法删除mooc,然后再插入MOOC
        System.out.println(sb.delete(4,8).insert(4,"MOOC"));
        //2.使用replace方法直接替换
        System.out.println(sb.replace(4,8,"MOOC"));

        //在“你好，iMOOC!"中取出“你好”并输出
        System.out.println(sb.substring(0,2));
    }
}
