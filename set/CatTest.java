package edu.swun.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CatTest {
    public static void main(String[] args) {
        //定义宠物猫对象
        Cat one = new Cat("Lily",2,"美短");
        Cat two = new Cat("Lucy",12,"加菲猫");

        HashSet<Cat> set = new HashSet();
        set.add(one);
        set.add(two);
        //显示宠物毛信息
        Iterator<Cat> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next().toString());
        }

        //在添加一个好Lily属性一样的对象
        Cat three = new Cat("Lily",2,"美短");
        set.add(three);
        it = set.iterator();
        System.out.println("***************************");
        System.out.println("添加重复数据后的宠物猫信息");
        while (it.hasNext()){
            System.out.println(it.next().toString());
        }

        //添加和Lucy一样的
        Cat four = new Cat("Lucy02",12,"加菲猫");
        set.add(four);

        //在集合中查找Lucy的信息
        //方式一
        System.out.println("***************************");
        if(set.contains(two)){
            System.out.println("Lucy找到了");
        }else{
            System.out.println("Lucy没找到");
        }
        //方式二
        it = set.iterator();
        Cat cat;
        System.out.println("***************************");
        System.out.println("通过名字查找Lucy");
        while (it.hasNext()){
            cat = it.next();
            if(cat.getName()=="Lucy"){
                System.out.println("Lucy找到了");
                break;
            }
        }
        System.out.println("******************************");
//        System.out.println("删除Lucy02后：");
//
//        for (Cat c:set) {
//            if(c.getName().equals("Lucy02")){
//                set.remove(c);
//                break;
//            }
//        }
        System.out.println("删除年龄小于5个月的：");
        Set<Cat> set1 = new HashSet();
        for(Cat c:set){
            if(c.getMonth()<5){
                set1.add(c);
            }
        }
        set.removeAll(set1);
        for (Cat c1 :set){
            System.out.println(c1);
        }

        //删除集合中所有宠物猫信息
        System.out.println("******************************");
        if(set.removeAll(set)){
            System.out.println("成功删除");
        }else {
            System.out.println("删除失败");
        }

    }
}
