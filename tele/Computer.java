package edu.swun.tele;

public class Computer implements INet {
    @Override
    public void network() {
        System.out.println("电脑可以上网");
    }

    @Override
    public void connection() {
        System.out.println("网络连接");
    }
}
