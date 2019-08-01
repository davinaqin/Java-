package edu.swun.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            System.out.print("请输入第一个整数：");
            int one = s.nextInt();
            System.out.print("请输入第二个整数：");
            int two = s.nextInt();
            System.out.println("商是："+(one/two));
        }catch (ArithmeticException e){
            System.out.println("除数不能为0");
            e.printStackTrace();
        }catch (InputMismatchException e){
            System.out.println("请输入整数");
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("出错啦");
            e.printStackTrace();
        } finally{
            System.out.println("运算结束");
        }
    }
}
