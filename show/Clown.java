package edu.swun.show;

public class Clown extends Animal implements IAct {
    public Clown(String name ,int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public void miaoshu() {
        System.out.println("表演者："+this.name);
        System.out.println("艺龄："+this.age);
    }

    @Override
    public void skill() {
        System.out.println("技能：脚踩高跷，头上戴着彩色帽子，脸上画着夸张的彩妆");
    }

    @Override
    public void act() {
        System.out.println("脚踩高跷，进行在即魔术表演");
    }
}
