package edu.swun.tele;

public class FourthPhone extends ThirdPhone implements IPhoto,INet{

    public void game(){
        System.out.println("第四代手机可以玩游戏");
    }

    @Override
    public void photo() {
        System.out.println("第四代手机可以拍照");
    }

    @Override
    public void network(){
        System.out.println("第四代手机可以上网");
    }

}
