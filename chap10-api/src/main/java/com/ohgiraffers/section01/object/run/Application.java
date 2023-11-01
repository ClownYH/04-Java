package main.java.com.ohgiraffers.section01.object.run;

import main.java.com.ohgiraffers.section01.object.book.Book;

public class Application {

    public static void main(String[] args){

        /*
        * 모든 클래스는 object 클래스의 후손이다.
        * 따라서 object 클래스가 가진 메소드를 자신의 것처럼 사용할 수 있다.
        * 또한 부모 클래스가 가지는 메소드를 오버라이딩 해서 사용하는 것도 가능하다.
        *
        * Object 클래스의 메소드 중 관례상 많이 오버라이딩 해서 사용하는 메소드들이 있다.
        * toString(), equals(), hashCode() 이다.
        * */

        Book book = new Book(1, "홍길동전", "허균", 5000);
        Book book1 = new Book(2, "목민심서", "정약용", 5000);
        Book book2 = new Book(2, "목민심서", "정약용", 5000);
        Book book3 = book;

        System.out.println("book.toString " + book);
        System.out.println("book2.toString" + book2.toString());
        System.out.println("book2.toString" + book1.toString());

    }
}
