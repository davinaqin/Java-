package edu.swun.thread1;

public class MyThread extends Thread {
    public MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            System.out.println(getName()+"正在运行"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
