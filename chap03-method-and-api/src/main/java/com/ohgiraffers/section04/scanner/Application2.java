package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("값을 입력해주세요.");
        String greeting = sc.nextLine(); // 입력한 문장까지 출력
        System.out.println(greeting);

        System.out.println("두 번째 값을 입력해주세요.");
        String greeting2 = sc.next(); // 입력한 단어까지만 출력
        System.out.println(greeting2);
    }
}
