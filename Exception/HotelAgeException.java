package edu.swun.Exception;

public class HotelAgeException extends Exception{
    public HotelAgeException(){
        super("18岁以下，80岁以上必须由亲友陪同");
    }
}
