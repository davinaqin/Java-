package edu.swun.show;

public class Lion extends Animal implements IAct {
    private String color;
    public Lion(String name,int age,String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
    @Override
    public void miaoshu() {
        System.out.println("表演者："+this.name);
        System.out.println("年龄："+this.age);
        System.out.println("毛色："+this.color);
    }

    @Override
    public void skill() {
        System.out.println("爱好：喜欢吃各种肉");
    }

    @Override
    public void act() {
        System.out.println("擅长：钻火圈");
    }
}
