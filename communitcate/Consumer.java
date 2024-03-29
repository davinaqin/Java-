package edu.swun.communitcate;

public class Consumer implements Runnable{
    Queue queue;

    public Consumer(Queue queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        int i = 0;
        while (true){
            queue.get();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
