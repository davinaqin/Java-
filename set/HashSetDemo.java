package edu.swun.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        //将英文单词添加到HashSet中
        Set set = new HashSet();
        //向集合中添加元素
        set.add("blue");
        set.add("red");
        set.add("black");
        set.add("yellow");
        set.add("white");
        //显示集合
        System.out.println("集合中元素为：");
        Iterator iter = set.iterator();
//        while (iter.hasNext()){
//            System.out.print(iter.next()+" ");
//        }
        //在集合中插入新的单词
        set.add("green");
        iter = set.iterator();
        while (iter.hasNext()){
            System.out.print(iter.next()+" ");
        }

    }
}
