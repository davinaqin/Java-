package edu.swun.syschronize;

public class Bank {
    private String count;
    private int balance;

    public Bank(String count, int balance) {
        this.count = count;
        this.balance = balance;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public synchronized void saveAccount(){
        int balance = this.getBalance();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        balance += 100;
        setBalance(balance);
        System.out.println("存款后的账户余额为"+this.getBalance());
    }

    public void drawAccount(){
        synchronized (this){
            int balance = this.getBalance();
            balance -= 200;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setBalance(balance);
            System.out.println("取款后的余额为："+this.getBalance());
        }

    }

    @Override
    public String toString() {
        return "账户："+this.getCount()+",余额："+this.getBalance();
    }
}
