package main.java.com.ohgiraffers.section01.init;

public class Car {
    private String modelName;
    private int maxSpeed;
    private int price;

    public Car(String modelName, int maxSpeed, int price){
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public void driveMaxSpeed(){
        System.out.println("가격이 " + price + "만원인 " + modelName + "이(가) 최고시속 " + maxSpeed + "km/h로 달려갑니다.");
    }
}