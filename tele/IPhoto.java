package edu.swun.tele;
//具有拍照能力的接口
public interface IPhoto {
    public void photo();
    default void connection(){
        System.out.println("IPhoto中的默认方法");
    }
}
