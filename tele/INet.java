package edu.swun.tele;

public interface INet {
    public void network();
    public static final int TEMP = 20;

    //default：默认方法，可带方法体
    // 可以被实现类重写（实现类中不强制实现），并通过接口的引用调用
    default void connection(){
        System.out.println("INet中的默认方法");
    }

    //static : 静态方法，可带方法体
    //不可以在实现类中重写，可通过接口调用
    static void stop(){
        System.out.println("INet中的静态方法");
    }
}
