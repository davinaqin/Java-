package edu.swun.sort;

import java.util.Comparator;

public class NameComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        //按名字升序排序
        String name1 = o1.getName();
        String name2 = o2.getName();
        return name1.compareTo(name2);
    }

}
