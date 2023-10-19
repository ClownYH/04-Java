package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class quiz2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

//                계산기 만들기
//        계산기에 필요한 기능은 + , - , * , / , %  총 5가지 연산자다.
//        ((예시))
//        첫 번 째 숫자를 입력하세요 :
//        2
//        연산할 기호를 쓰세요 :
//        +
//        두 번 째 숫자를 입력하세요 :
//        2
//        결과는 4입니다

        System.out.println("첫 번째 숫자를 입력하세요.");
        int num1 = sc.nextInt();

        System.out.println("===================");

        System.out.println("연산할 기호를 쓰세요.");
        String icon = sc.next();
        char i = icon.charAt(0);


        System.out.println("===================");

        System.out.println("두 번째 숫자를 입력하세요.");
        int num2 = sc.nextInt();

        if(i == '+'){
            System.out.println((int)quiz2.cal1(num1, num2));}else if(i == '-'){
            System.out.println((int)quiz2.cal2(num1, num2));}else if(i == '*'){
            System.out.println((int)quiz2.cal3(num1, num2));}else if(i == '/'){
            System.out.println((int)quiz2.cal4(num1, num2));}else{
            System.out.println((int)quiz2.cal5(num1, num2));};


    }

    public static int cal1(int num1, int num2){

        int result1 = num1 + num2;

        return result1;

    }
    public static int cal2(int num1, int num2){

        int result2 = num1 - num2;

        return result2;

    }
    public static int cal3(int num1, int num2){

        int result3 = num1 * num2;

        return result3;

    }
    public static int cal4(int num1, int num2){

        int result4 = num1 / num2;

        return  result4;

    }
    public static int cal5(int num1, int num2){

        int result5 = num1 % num2;

        return result5;

    }
}
