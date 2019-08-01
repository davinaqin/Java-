package edu.swun.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemo {
    public static void main(String[] args) {
        try {
            int result = TryDemo.test();
            System.out.println("one和two的商是："+result);
        }catch (ArithmeticException e){
            System.out.println("要求除数不允许为0");
            e.printStackTrace();
        }catch (InputMismatchException e){
            System.out.println("请输入整数");
            e.printStackTrace();
        }
        TryDemo.test();
    }
    /**
     *
     * @return 返回两数之商
     * @throws ArithmeticException
     * @throws InputMismatchException
     */
    public static int test() throws ArithmeticException,InputMismatchException{
        Scanner s = new Scanner(System.in);
        System.out.print("请输入第一个整数：");
        int one = s.nextInt();
        System.out.print("请输入第二个整数：");
        int two = s.nextInt();
        System.out.println("运算结束");
        return one/two;
    }

}
