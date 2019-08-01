package edu.swun.weather;


public class WeatherTest {
    public static void main(String[] args) {
        Weather weather = new Weather();
        Thread generatethread = new Thread(new GenerateWeather(weather));
        Thread readthread = new Thread(new ReadWeather(weather));
        generatethread.start();
        readthread.start();
    }
}
