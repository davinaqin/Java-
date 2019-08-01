package edu.swun.syschronize;

import edu.swun.ball.Ball;

public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank("1001",1000);
        SaveAccount sa = new SaveAccount(bank);
        DrawAccount da = new DrawAccount(bank);
        Thread savethread = new Thread(sa);
        Thread drawthread = new Thread(da);
        drawthread.start();
        savethread.start();

        try {
            savethread.join();
            drawthread.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(bank.toString());
    }
}
