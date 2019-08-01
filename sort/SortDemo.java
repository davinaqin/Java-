package edu.swun.sort;

import java.util.*;

public class SortDemo {
    public static void main(String[] args) {
        //对整形数据进行排序
        List<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(1);
        list.add(3);
        list.add(50);
        list.add(-2);
        Collections.sort(list);
        for(Integer i : list){
            System.out.print(i+" ");
        }
        System.out.println();
        List<String> list1 = new ArrayList<String>();
        list1.add("hello");
        list1.add("apple");
        list1.add("world");
        list1.add("before");
        Collections.sort(list1);
        for (String s : list1){
            System.out.print(s+" ");
        }
    }
}
