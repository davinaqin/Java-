package edu.swun.ball;

public class BallTest {
    public class Inner_m implements Ball{
        @Override
        public String play() {
            return "成员内部类：打篮球";
        }
    }
    public void info(){
        class Inner_f implements Ball{
            @Override
            public String play() {
//                System.out.println("************************");
//                System.out.println("方法内部类：打乒乓球");
                return "*************************"+"\n"+"方法内部类：打乒乓球";
            }
        }
        playBall(new Inner_f());
    }
    void playBall(Ball ball){
        System.out.println(ball.play());
    }
}
