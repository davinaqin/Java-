package edu.swun.communitcate;

public class Producer implements Runnable {
    Queue queue;

    public Producer(Queue queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        int i=0;
        while (true){
            this.queue.set(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
