package edu.swun.communitcate;

public class Test {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Thread comsumerthread = new Thread(new Consumer(queue));
        Thread producerthread = new Thread(new Producer(queue));
        producerthread.start();
        comsumerthread.start();
    }
}
