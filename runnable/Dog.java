package edu.swun.runnable;

public class Dog implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<3;i++){
            System.out.println(Thread.currentThread().getName()+"A-Dog");
        }
    }
}
