package edu.swun.Exception;

import java.util.Scanner;

public class TryDemo3 {

    public static void testAge() throws HotelAgeException {
            System.out.print("请输入年龄：");
            Scanner s = new Scanner(System.in);
            int age = s.nextInt();
            if(age <18 || age > 80) {
                throw new HotelAgeException();
            }else {
                System.out.println("欢迎入住");
            }
    }

    public static void main(String[] args) {
//        try {
//            testAge();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        try {
            testAge();
        } catch (HotelAgeException e) {
            System.out.println(e.getMessage());
            System.out.println("酒店前台工作人员不允许办理入住登记");
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
