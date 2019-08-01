package edu.swun.generic;

public class GenericMethod {
    public<T> void ObjPrint(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        gm.ObjPrint("hello");
        gm.ObjPrint(123);
    }
}
