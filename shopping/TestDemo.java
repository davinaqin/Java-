package edu.swun.shopping;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestDemo {

    public static void MainMenu(){
        System.out.println("****************************");
        System.out.println("**主菜单**");
        System.out.println("1--商品管理");
        System.out.println("2--购物车");
        System.out.println("0-退出");
        System.out.println("****************************");
    }

    public static void GoodsManageMenu(){
        System.out.println("****************************");
        System.out.println("**商品管理**");
        System.out.println("1--商品信息导入");
        System.out.println("2--显示所有商品信息");
        System.out.println("3--返回上一级菜单");
        System.out.println("****************************");
    }

    public static void ShoppingCartMenu(){
        System.out.println("****************************");
        System.out.println("**购物车管理**");
        System.out.println("1--添加商品到购物车");
        System.out.println("2--修改购物车中商品的数量");
        System.out.println("3--修改购物车中所有商品的数量");
        System.out.println("4--结算");
        System.out.println("****************************");
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        GoodsManage gm = new GoodsManage();
        while (true){
            TestDemo.MainMenu();
            String input = s.next();
            if(input.equals("1")){

                while (true){
                    TestDemo.GoodsManageMenu();
                    String select = s.next();
                    if (select.equals("1")){
                        gm.importGoods();
                    }else if (select.equals("2")){
                        gm.displayAllGoods();
                    }else if(select.equals("3")){
                        break;
                    }
                }

            }else if(input.equals("2")){
                TestDemo.ShoppingCartMenu();
                ShoppingCart sc = new ShoppingCart();
                while (true){
                    String select = s.next();
                    if(select.equals("1")){
                        sc.addGoodsToCart(gm);
                    }
                }
            }else if(input.equals("0")){
                System.out.println("退出成功！");
                break;
            }else {
                System.out.println("请输入正确的数字");
            }
        }
    }
}
