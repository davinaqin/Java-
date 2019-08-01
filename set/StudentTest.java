package edu.swun.set;

import java.util.HashSet;
import java.util.Iterator;

public class StudentTest {
    public static void main(String[] args) {
        Student one = new Student(3,"Willian",65);
        Student two = new Student(1,"Tom",87);
        Student three = new Student(2,"Lucy",95);

        HashSet set = new HashSet();
        set.add(one);
        set.add(two);
        set.add(three);

        Iterator it = set.iterator();
        while (it.hasNext()){
            Student s = (Student)it.next();
            System.out.println(s.toString());
        }

        //添加重复元素
        Student four = new Student(2,"Lucy",95);
        set.add(four);
        it = set.iterator();
        System.out.println("*****************************");
        System.out.println("添加重复的元素后：");
        while (it.hasNext()){
            Student s = (Student)it.next();
            System.out.println(s.toString());
        }
    }
}
