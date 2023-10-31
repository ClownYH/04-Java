package main.java.com.ohgiraffers.section02;

public class SmartPhone extends Product{

    public SmartPhone(){}

    @Override
    public void abstractMethod(){
        System.out.println("Product 클래스의 추상 메서드를 호출함");
    }

    public void printSmartPhone(){
        System.out.println("Smart 폰의 클래스의 print 메서드를 호출함");
    }
}
