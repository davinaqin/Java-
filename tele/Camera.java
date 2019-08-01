package edu.swun.tele;

public class Camera implements IPhoto{
    @Override
    public void photo() {
        System.out.println("相机具有拍照功能");
    }
}
