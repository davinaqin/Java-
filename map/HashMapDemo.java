package edu.swun.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer, String>();
        map.put(2014,"德国");
        map.put(2010,"西班牙");
        map.put(2006,"意大利");
        map.put(2002,"巴西");
        map.put(1998,"法国");
        Iterator<String> it = map.values().iterator();
        System.out.println("使用迭代器输出");
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        System.out.println("使用EntrySet进行输出");
        Set<Map.Entry<Integer,String>> en = map.entrySet();
        for(Map.Entry i:en){
            System.out.println(i.getKey()+"-"+i.getValue());
        }
    }
}
