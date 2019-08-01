package edu.swun.test;
import edu.swun.tele.*;
public class Main{
    public static void main(String[] args) {
        FourthPhone phone = new FourthPhone();
        phone.call();
        phone.message();
        phone.vedio();
        phone.music();
        phone.photo();
        phone.network();
        System.out.println("=============================");
        IPhoto ip = new FourthPhone();
        ip.photo();
        ip = new Camera();
        ip.photo();
        System.out.println("=============================");
        System.out.println(INet.TEMP);
        INet net = new SmartWatch();
        System.out.println(net.TEMP);//20?30? 是20
        SmartWatch sw = new SmartWatch();
        System.out.println(sw.TEMP);
        System.out.println("============================");
        INet net1 = new SmartWatch();
        net1.connection();
        IPhoto net2 = new SmartWatch();
        net2.connection();
        System.out.println("============================");
        INet net3 = new FourthPhone();
        net3.connection();
        IPhoto ip2 = new FourthPhone();
        ip2.connection();
    }
}
