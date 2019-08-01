package edu.swun.thread;

class Mythread extends Thread{
    public void run(){
        for (int i=0;i<24;i++)
        System.out.println(getName()+"正在线程"+i);
    }
}

public class JoinDemo {
    public static void main(String[] args) {
        Mythread mt = new Mythread();
        mt.start();
        try {
            mt.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i=1;i<4;i++){
            System.out.println("主线程"+i);
        }
        System.out.println("主线程运行结束");
    }
}
