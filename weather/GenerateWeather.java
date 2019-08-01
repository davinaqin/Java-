package edu.swun.weather;

import edu.swun.generic.GenericMethod;

import java.util.Random;

public class GenerateWeather implements Runnable{
    Weather weather ;

    public GenerateWeather(Weather weather){
        this.weather = weather;
    }

    @Override
    public void run() {
        for (int i=0;i<100;i++){
            this.weather.generate();
        }

    }
}
