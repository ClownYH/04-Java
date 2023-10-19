package main.java.com.ohgiraffers.section01.method;

public class Application9 {
    public static void main(String[] args){

        /* 계산기 만들기 */

        int first = 100;
        int second = 50;

        int result = 0;


        Calculator calc = new Calculator(); // Calculator를 calc 변수 주소에 담아 일반 영역에 할당한다.

        result = calc.minNumberOf(first, second);
        System.out.println(result);


        result = Calculator.maxNumberOf(first, second);
        System.out.println(result);

        // 일반 필드와 static 필드 접근의 차이
        // static 영역에 모두 가져다 쓰지 않는 이유 : 성능 저하, 용량 문제
    }


}
