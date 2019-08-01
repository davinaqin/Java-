package edu.swun.runnable;

public class TwoTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Thread t1 = new Thread(cat);
        Thread t2 = new Thread(dog);
        for (int i=0;i<3;i++){
            System.out.println("main thread");
        }
        t1.start();
        t2.start();
    }
}
