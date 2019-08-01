package edu.swun.generic;

public class NumGeneric<T> {
    private T num;

    public T getNum() {
        return num;
    }

    public void setNum(T num) {
        this.num = num;
    }
    //测试
    public static void main(String[] args) {
        NumGeneric<Integer> intNum = new NumGeneric<>();
        intNum.setNum(10);
        System.out.println(intNum.getNum());
    }
}
