package edu.swun.weather;



public class ReadWeather implements Runnable {
    Weather weather ;

    public ReadWeather(Weather weather){
        this.weather = weather;
    }

    @Override
    public void run() {
        for (int i=0;i<100;i++){
            this.weather.read();
        }

    }
}
