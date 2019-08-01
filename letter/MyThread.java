package edu.swun.letter;

public class MyThread extends Thread {
    @Override
    public void run() {
        for(char c = 'a';c <= 'z';c++){
            System.out.print(c);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
    }
}
