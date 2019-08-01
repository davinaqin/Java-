package edu.swun.sort;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        //按名字升序排序
        Cat one = new Cat("huahua",1,"英国短毛猫");
        Cat two = new Cat("fanfan",2,"中华田园猫");
        Cat three = new Cat("maomao",3,"中华田园猫");
        List<Cat> list = new ArrayList<Cat>();
        list.add(one);
        list.add(two);
        list.add(three);
        //按名字排序前
        System.out.println("按名字升序排序前");
        for(Cat c : list){
            System.out.println(c+" ");
        }
        System.out.println("按名字升序排序后");
        Collections.sort(list,new NameComparator());
        for(Cat c : list){
            System.out.println(c+" ");
        }
        //按年龄降序排序后
        System.out.println("按年龄降序排序后");
        Collections.sort(list,new AgeComparator());
        for(Cat c : list){
            System.out.println(c+" ");
        }
    }
}
