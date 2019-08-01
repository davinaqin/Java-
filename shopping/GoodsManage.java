package edu.swun.shopping;

import java.util.HashSet;
import java.util.Set;

public class GoodsManage {
    private static int flag=0;
    private Set<Goods> goodsSet;

    public Set<Goods> getGoodsSet() {
        return goodsSet;
    }

    public void setGoodsSet(Set<Goods> goodsSet) {
        this.goodsSet = goodsSet;
    }

    public void importGoods(){
        Goods one = new Goods("goods001","手机",2300,"android手机");
        Goods two = new Goods("goods002","饮水机",299,"带净化功能的饮水机");
        Goods three = new Goods("goods003","笔记本电脑",4999,"15寸笔记本电脑");
        Goods four = new Goods("goods004","水杯",56,"不锈钢水杯");
        Set<Goods> goodsSet = new HashSet<Goods>();
        goodsSet.add(one);
        goodsSet.add(two);
        goodsSet.add(three);
        goodsSet.add(four);
        this.setGoodsSet(goodsSet);
        System.out.println("商品导入成功");
        flag = 1;
    }

    public void displayAllGoods(){
        if(flag == 0){
            System.out.println("还未导入商品");
        }else {
            for(Goods g : goodsSet){
                System.out.println(g.toString());
            }
        }
    }

}
