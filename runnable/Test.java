package edu.swun.runnable;
class PrintRunnable implements Runnable{
    int i = 1;
    @Override
    public void run() {
        int i = 1;
        while (i<=10){
            System.out.println(Thread.currentThread().getName()+"它正在运行"+(i++));
            //休眠1000毫秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
public class Test {
    public static void main(String[] args) {
        PrintRunnable pr1 = new PrintRunnable();
        Thread t1 = new Thread(pr1);
        t1.start();

        //PrintRunnable pr2 = new PrintRunnable();
//        Thread t2 = new Thread(pr1);
//        t2.start();
    }
}
