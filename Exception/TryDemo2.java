package edu.swun.Exception;

import java.util.Scanner;

public class TryDemo2 {

    //18岁以下，80岁以上
    public static void testAge()  {
            try {
                System.out.print("请输入年龄：");
                Scanner s = new Scanner(System.in);
                int age = s.nextInt();
                if(age <18 || age > 80) {
                    throw new Exception("18岁以下，80岁以上必须由亲友陪同");
                }else {
                    System.out.println("欢迎入住");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    public static void main(String[] args) {
        testAge();
    }
}
