package edu.swun.inputstream;

import java.io.*;

public class GoodsTest {
    public static void main(String[] args) {
        Goods goods1 = new Goods("gd001","面条",20);
        Goods goods2 = new Goods("gd002","食用油",40);
        FileOutputStream fos = null;
        FileInputStream fis;
        try {
            fos = new FileOutputStream("objectinputstream-demo.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(goods1);
            oos.writeObject(goods2);
            oos.flush();
            oos.close();
            fos.close();
            fis = new FileInputStream("objectinputstream-demo.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Goods g1 = (Goods) ois.readObject();
            Goods g2 = (Goods) ois.readObject();
            System.out.println(g1);
            System.out.println(g2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }


    }
}
