package edu.swun.show;

import java.util.Scanner;

public class test {
    public static void showlist(){
        System.out.println("**********欢迎拉倒太阳马戏团**********");
        System.out.println("**********请选择表演者**********");
        System.out.println("**********1.棕熊**********");
        System.out.println("**********2.狮子**********");
        System.out.println("**********3.猴子**********");
        System.out.println("**********4.鹦鹉**********");
        System.out.println("**********5.小丑**********");
    }
    public static void main(String[] args) {
        Monkey monkey = new Monkey("Tom",1,"金丝猴");
        Bear bear = new Bear("Bill",1);
        Lion lion = new Lion("Lain",2,"灰色");
        Clown clown = new Clown("Kahle",5);
        Parrot parrot = new Parrot("Rose",1,"杜鹃牡丹");
        while (true){
            test.showlist();
            Scanner s = new Scanner(System.in);
            int selenum = s.nextInt();
            switch (selenum){
                case 1:
                    bear.miaoshu();
                    bear.skill();
                    bear.act();
                    break;
                case 2:
                    lion.miaoshu();
                    lion.skill();
                    lion.act();
                    break;
                case 3:
                    monkey.miaoshu();
                    monkey.skill();
                    monkey.act();
                    break;
                case 4:
                    parrot.miaoshu();
                    parrot.skill();
                    parrot.act();
                    break;
                case 5:
                    clown.miaoshu();
                    clown.skill();
                    clown.act();
                    break;
            }
            System.out.println("**********是否继续观看（1/0）**********");
            int selenum2 = s.nextInt();
            if(selenum2 == 0){
                break;
            }
        }
    }
}
