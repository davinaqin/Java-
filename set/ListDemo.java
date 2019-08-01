package edu.swun.set;


import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        //用ArrayList存储编程语言的名称并输出
        List list = new ArrayList();
        list.add("JAVA");
        list.add("Go");
        list.add("C");
        list.add("C++");
        list.add("swift");
        //输出列表中元素的个数
        System.out.println("列表中元素的个数是："+list.size());
        //遍历输出所有的编程语言
        System.out.println("***************************");
        for(int i = 0;i < list.size(); i ++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        //移除列表中的C++
        list.remove(3);
        System.out.println("***************************");
        System.out.println("移除列表中的C++后的元素为：");
        for(int i = 0;i < list.size(); i ++){
            System.out.print(list.get(i)+" ");
        }

    }
}
