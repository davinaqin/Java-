package edu.swun.show;

public class Bear extends Animal implements IAct{

    public Bear(String name,int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public void miaoshu() {
        System.out.println("表演者："+this.name);
        System.out.println("年龄："+this.age);
    }

    @Override
    public void skill() {
        System.out.println("爱好：喜欢卖萌");
    }

    @Override
    public void act() {
        System.out.println("爱好：挽着花篮，打着花篮，自立走秀");
    }
}
