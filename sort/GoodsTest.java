package edu.swun.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoodsTest {
    public static void main(String[] args) {
        Goods one = new Goods("goods001","电脑",5000);
        Goods two = new Goods("goods002","电风扇",1000);
        Goods three = new Goods("goods003","电视机",3000);
        List<Goods> list = new ArrayList<Goods>();
        list.add(one);
        list.add(two);
        list.add(three);
        System.out.println("排序前");
        for(Goods g : list){
            System.out.println(g);
        }
        System.out.println("排序后");
        Collections.sort(list);
        for(Goods g : list){
            System.out.println(g);
        }
    }
}
