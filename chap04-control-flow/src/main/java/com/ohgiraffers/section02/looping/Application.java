package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        A_for a = new A_for();
        B_while b = new B_while();
        Scanner scanner = new Scanner(System.in);

//        a.testSimpleForStatement();
//
//        System.out.println("==================================");
//
//        a.testForExample();
//
//        System.out.println("==================================");
//
//        a.testForExample2();

//        System.out.println("===================================");
//
//        a.testForExample4();

//        System.out.println("===================================");
//
//
//        System.out.println("구구단을 실행하겠습니다.");
//        System.out.println("구구단을 실행하고 싶은 수를 입력해주세요.(1 ~ 9)");
//        int num = scanner.nextInt();
//        a.gugudan(num);
//        System.out.println("===================================");
//
//
//        System.out.println("아무 것이나 입력해주세요.");
//        b.testSimpleWhileStatement();
//
//        System.out.println("===================================");
//
//        System.out.println("1단부터 N단까지 출력하는 구구단 프로그램을 시작합니다.(숫자를 눌러주세요)");
//        int num = scanner.nextInt();
//

        //    System.out.println("n단을 출력하는 프로그램 입니다. n의 값을 입력 해주세요 : ");
        //    int num = scanner.nextInt();

        System.out.println("1단부터 입력 단 까지 구구단을 출력하는 프로그램 입니다.");
        System.out.println("출력을 원하는 단을 입력 해주세요 : ");
        b.doWhileGugudan();


    }
}
