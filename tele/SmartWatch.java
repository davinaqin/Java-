package edu.swun.tele;

public class SmartWatch implements INet,IPhoto{
    public static final int TEMP = 30;
    @Override
    public void network() {
        System.out.println("智能手表可以上网");
    }

    //重写
    @Override
    public void connection() {
        //INet.super.connection();//调用INet接口中的默认方法
        System.out.println("SmartPhone中的connection");
    }

    @Override
    public void photo() {
        System.out.println("智能手表能都拍照");
    }
}
