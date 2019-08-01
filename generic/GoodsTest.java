package edu.swun.generic;

import java.util.ArrayList;
import java.util.List;

public class GoodsTest {
    public static void main(String[] args) {
        //定义book相关的List
        List<Book> books = new ArrayList<>();
        books.add(new Book());
        books.add(new Book());
        //定义cloths相关的List
        List<Cloths> cloths = new ArrayList<>();
        cloths.add(new Cloths());
        cloths.add(new Cloths());
        //定义shoes相关的List
        List<Shoes> shoes = new ArrayList<>();
        shoes.add(new Shoes());
        shoes.add(new Shoes());

        GoodsSeller gs = new GoodsSeller();
        gs.sellGoods(books);
        gs.sellGoods(shoes);
        gs.sellGoods(cloths);
    }
}
