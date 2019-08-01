package edu.swun.set;

import java.util.ArrayList;
import java.util.Date;


public class NoticeTest {
    public static void main(String[] args) {
        //创建对象，生成三条公告
        Notice one = new Notice(1,"欢迎来到慕课网","管理员",new Date());
        Notice two = new Notice(2,"请按时交作业","老师",new Date());
        Notice three = new Notice(3,"考勤通知","老师",new Date());

        //添加公告
        ArrayList noticeList = new ArrayList();
        noticeList.add(one);
        noticeList.add(two);
        noticeList.add(three);

        //显示公告
        System.out.println("公告的内容为：");
        for(int i = 0;i < noticeList.size();i++){
            System.out.println(i+1+":"+((Notice)noticeList.get(i)).getTitle());
        }

        //在第一条公告后边添加一条新公告
        Notice four = new Notice(4,"在线编辑器","管理员",new Date());
        noticeList.add(1,four);
        System.out.println("*******************************");
        System.out.println("第一条公告后边添加一条新公告后：");
        for(int i = 0;i < noticeList.size();i++){
            System.out.println(i+1+":"+((Notice)noticeList.get(i)).getTitle());
        }

        //删除按时交作业的公告
        noticeList.remove(2);
        System.out.println("*******************************");
        System.out.println("删除按时交作业的公告后：");
        for(int i = 0;i < noticeList.size();i++){
            System.out.println(i+1+":"+((Notice)noticeList.get(i)).getTitle());
        }

        //将第二条改为“JAVA在线编辑器”
        ((Notice)noticeList.get(1)).setTitle("JAVA在线编辑器");
        System.out.println("*******************************");
        System.out.println("修改后公告的内容为："+((Notice)noticeList.get(1)).getTitle());
    }
}
