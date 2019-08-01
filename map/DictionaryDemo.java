package edu.swun.map;

import java.util.*;

public class DictionaryDemo {
    //案例一
    //完成一个类似字典的功能
    //将单词以及单词的注释存储到HashMap中
    //显示HashMap的内容
    //查找某个单词的注释
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String>();
        System.out.println("请输入三组数据：");
        Scanner s = new Scanner(System.in);
        for(int i = 0;i < 3;i ++){
            System.out.print("请输入key值：");
            String key = s.next();
            System.out.print("请输入value值：");
            String value = s.next();
            map.put(key,value);
        }
        System.out.println("****************************");
        System.out.println("打印输出所有的value");
        Iterator<String> it = map.values().iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        System.out.println("****************************");
        System.out.println("打印出key和value的值");
        //打印出key和value的值，通过entrySet()方法去完成
        Set<Map.Entry<String,String>> en = map.entrySet();
        for(Map.Entry i:en){
            System.out.println("key:"+i.getKey()+",value:"+i.getValue());
        }
        String strSearch = s.next();
        Set<String> set = map.keySet();
        System.out.println("****************************");
        System.out.print("请输入要查找的key:");
        for(String i:set){
            if(strSearch.equals(i)){
                System.out.println("找到了！"+"键值对为："+i+"-"+map.get(i));
                break;
            }
        }
    }
}
