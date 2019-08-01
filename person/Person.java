package edu.swun.person;

public class Person {
    public static int age;

    public Object getHeart() {
        class Heart {
            public int age = 13;
            int temp = 22;

            public String beat(){
                return age + "岁的心脏在跳动";
            }
        }
        return new Heart().beat();
    }
}