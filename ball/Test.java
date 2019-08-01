package edu.swun.ball;

public class Test {
    public static void main(String[] args) {
        BallTest bt = new BallTest();
        BallTest.Inner_m inner_m = bt.new Inner_m();
        bt.playBall(inner_m);
        bt.info();
        bt.playBall(new Ball() {
            @Override
            public String play() {
                return "************************"+"\n"+"匿名内部类:打排球";
            }
        });

    }
}
