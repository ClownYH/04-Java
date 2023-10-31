package main.java.com.ohgiraffers.section02;

import java.sql.Statement;

public abstract class Product {

    public Product(){

    }

    public void nonStaticMethod(){
        System.out.println("Product 클래스의 NonStaticMethod를 호출함");
    }

    public static void staticMethod(){
        System.out.println("Product 클래스의 NonStaticMethod를 호출함");
    }

    // 유통기한
    public abstract void abstractMethod();
    // abstract(추상적인) : 메소드의 몸체({}부, 내용을 비어도 됨)를 따로 만들지 않고 상속 받은 메소드에서 알아서 채우도록 하는 것, 자식들에게 구현 책임의 원칙을 적용시킴
}
