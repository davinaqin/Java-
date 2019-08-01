package edu.swun.show;

public class Parrot extends Animal implements IAct{

    private String variety;

    public Parrot(String name,int age,String variety){
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
        System.out.println("技能：擅长模仿");
    }

    @Override
    public void act() {
        System.out.println("喜欢吃坚果和松子");
    }
}
