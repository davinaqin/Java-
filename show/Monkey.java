package edu.swun.show;

public class Monkey extends Animal implements IAct {
    private String variety;

    public Monkey(String name,int age,String variety){
        this.name = name;
        this.age = age;
        this.variety = variety;
    }

    @Override
    public void miaoshu() {
        System.out.println("表演者："+this.name);
        System.out.println("年龄："+this.age);
        System.out.println("品种："+this.variety);
    }

    @Override
    public void skill() {
        System.out.println("技能：骑独轮车过独木桥");
    }

    @Override
    public void act() {
        System.out.println("爱好：喜欢模仿人的动作表情");
    }
}
