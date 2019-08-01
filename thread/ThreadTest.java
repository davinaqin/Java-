package edu.swun.thread;
class MyThead extends Thread{
    @Override
    public void run() {
        System.out.println(getName()+"该线程正在执行");
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        System.out.println("主线程1");
        MyThead myThead = new MyThead();
        myThead.start();//启动线程
        System.out.println("主线程2");
    }
}
