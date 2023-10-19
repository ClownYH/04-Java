package main.java.com.ohgiraffers.section01.method;

public class Application3 { // 전역 스코프 {}
    public static void main(String[] args){ // 지역 스코프 {}
        /*
        * 전달인자(argument)와 매개변수(parameter)를 이용한 메소드 호출
        *
        * 변수의 종류
        * 1. 지역변수
        * 2. 매개변수
        * 3. 전역변수(필드)
        * 4. 클래스(static)변수
        * ! 번외 클래스 속성(method, variable 포함)
        *
        * 지역변수는 선언한 메소드 블럭 내부에서만 사용이 가능하다..
        * 이것을 지역변수의 스코프라고 한다.
        * 다른 메소드간 서로 공유해야 하는 값이 존재하는 경우 메소드 호출 시 사용하는 괄호를 이용해서
        * 값을 전달할 수 있다.
        * 이 때 전달하는 값을 전달인자(argument)라고 부르고, 메소드 선언부 괄호 안에 전달 인자를 받기 위해 선언하는 변수를
        * 매개변수(parameter)라고 부른다.
        * */

        int num; // 이렇게 한 지역에 속한 변수, 지역변수

        Application3 app3 = new Application3();
        app3.testMethode(28);

        byte bytAge = 20;
        app3.testMethode(bytAge);

        long longAge = 30;
        app3.testMethode((int)longAge); // testMethode가 int로 되어 있기 때문에 자료타입을 맞춰줘야 한다.

        app3.testMethode(330);
        app3.testMethode(bytAge * 30);
    }

    public void testMethode(int age){ // (int age) : 매개변수, 그 안에 실제 입력하는 값 : 전달인자
        System.out.println("당신의 나이는 " + age + "세입니다.");
    }
}
