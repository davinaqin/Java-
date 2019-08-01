package edu.swun.weather;

import java.util.Random;

public class Weather {
    private int temperature;
    private int  humidity;
    boolean flag = false;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public synchronized void generate(){
        if(flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Random rand = new Random();
        this.temperature = rand.nextInt(41);
        this.humidity = rand.nextInt(100);
        System.out.println("生成天气数据："+this.toString());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true;
        notifyAll();

    }

    public synchronized void read(){
        if(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("读取天气数据："+this.toString());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = false;
        notifyAll();
    }

    @Override
    public String toString() {
        return "[温度："+this.temperature+",湿度"+this.humidity+"]";
    }
}
