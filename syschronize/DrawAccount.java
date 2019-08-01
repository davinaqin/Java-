package edu.swun.syschronize;

public class DrawAccount implements Runnable {
    Bank bank;

    public DrawAccount(Bank bank){
        this.bank = bank;
    }
    @Override
    public void run() {
        this.bank.drawAccount();
    }
}
