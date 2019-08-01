package edu.swun.Exception;

public class TryDemo4 {

    public static void test1 () throws HotelAgeException {
        throw new HotelAgeException();
    }

    public static void test2() throws Exception {
        try {
            test1();
        } catch (HotelAgeException e) {
            throw new Exception("我是新产生的异常1",e);
        }
    }

    public static void test3() throws Exception{
        try {
            test2();
        } catch (Exception e) {
            Exception e1 = new Exception("我是新产生的异常2");
            e.initCause(e);
        }
    }

    public static void main(String[] args) {
        try {
            test3();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
