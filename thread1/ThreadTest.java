package edu.swun.thread1;

public class ThreadTest {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread("线程1");
        MyThread mt2 = new MyThread("线程2");
        mt1.start();
        mt2.start();
    }
}
