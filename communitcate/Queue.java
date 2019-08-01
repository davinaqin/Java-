package edu.swun.communitcate;

public class Queue {
    private int n;
    boolean flag = false;

    public synchronized int get() {
        if (!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        notifyAll();
        System.out.println("消费"+n);
        flag = false;//消费完毕，容器中没有数据
        return n;
    }

    public synchronized void set(int n) {
        this.n = n;
        if (flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        notifyAll();
        System.out.println("生产"+n);
        flag = true;//生产完毕，容器中有数据
    }
}
