package edu.swun.map;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class GoodsTest {
    public static void main(String[] args) {
        int i = 0;
        Scanner s = new Scanner(System.in);
        HashMap<String,Goods> map = new HashMap<String, Goods>();
        System.out.println("请输入3条商品信息");
        while (i < 3){
            System.out.print("请输入商品标号:");
            String id = s.next();
            if(map.containsKey(id)){
                System.out.println("该商品信息已存在：");
                continue;
            }
            System.out.print("请输入商品名称：");
            String name = s.next();
            System.out.print("请输入商品价格:" );
            double price;
            try {
                price = s.nextDouble();
            }catch (InputMismatchException e){
                System.out.println("请输入数值型！");
                s.next();
                continue;
            }

            Goods goods = new Goods(id,name,price);
            //将商品信息添加到map里
            map.put(id,goods);
            i++;
        }
        //遍历map输出商品信息
        System.out.println("商品的全部信息为：");
        Iterator<Goods> it = map.values().iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
