package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args){
        /*
        * java.util.Scanner
        * 콘솔 화면에 값을 입력 받아 기능을 제공한다.
        *
        * 1-1. Scanner는 객체를 만들어서 사용한다.
        *
        * */
        Scanner sc = new Scanner(System.in); // System.in 시스템에 정의되어 있는 inputStream 개체를 가져다 씀

        System.out.println("이름을 입력해주세요 : ");
        String name = sc.nextLine(); // nextLine()은 입력을 name으로 받아서 문자열로 반환. 입력을 해줄 때까지 처리를 기다림. 단일 쓰레드. 동기화 되어 있는 것.
        System.out.println("안녕하세요 " + name + " 님!!"); // 만약 비동기화라면 name이 값을 가지지 못해 error

        System.out.println("나이를 입력해주세요 : ");
        int age = sc.nextInt(); //nextInt()는 입력을 받아 정수로 반환. 정수만 입력 가능하며 그 외에는 error
        System.out.println("입력하신 나이는 " + age + "세가 맞나요?");

        String value = sc.nextLine();
        System.out.println("d에러 확인");

        Long lnum = sc.nextLong();
        System.out.println("입력한 LONG : " + lnum);

        boolean isTrue = sc.nextBoolean();
        if(isTrue){
            System.out.println("참이다.");
        }else{
            System.out.println("거짓");
        }
        sc.nextLine();

        char charValue = sc.nextLine().charAt(1);
        System.out.println(charValue);


    }
}
