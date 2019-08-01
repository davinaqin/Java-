package edu.swun.sort;

public class Goods implements Comparable<Goods>{
    private String id;
    private String name;
    private double price;

    public Goods(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "商品编号："+this.id+",商品名称："+this.name+",商品价格："+this.price;
    }

    @Override
    public int compareTo(Goods o) {
        double price1 = this.price;
        double price2 = o.price;
        return new Double(price2-price1).intValue();
    }
}
