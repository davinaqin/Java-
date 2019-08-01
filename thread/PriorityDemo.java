package edu.swun.thread;

class MyThread extends Thread{
    String name;
    public MyThread(String name){
        this.name = name;
    }
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("线程"+name+"正在运行"+i);
        }
    }
}

public class PriorityDemo {
    public static void main(String[] args) {
//        System.out.println("主线程的优先级是"+Thread.currentThread().getPriority());
        MyThread mt1 = new MyThread("线程1");
        MyThread mt2 = new MyThread("线程2");
        mt1.setPriority(10);
        mt2.setPriority(1);
//        mt1.start();
        mt2.start();
        mt1.start();
//        System.out.println("线程一的优先级为"+mt1.getPriority());
    }
}
