package com.ohgiraffers.section05.logical;

public class Application2 {
    public static void main(String[] args){
        /*
        * 논리 연산자의 우선순위와 활용
        * 논리 and 연산자와 논리 or 연산자의 우선순위
        * && : 11순위
        * || : 12순위
        * 논리 and 연산자 우선순위가 논리 or 연산자보다 우선순위가 높다.
        * */

        int num1 = 55;
        System.out.println("1 부터 100 사이 인지 확인 : " + ((num1 > 1) && (num1 <= 100)));

        int num2 = 166;
        System.out.println("1부터 100 사이인지 확인 : " + ((num2 >= 1) && (num2 <= 100)));

        /*
        * 연산자 우선순위를 고려한다면 논리 and 연산이 먼저 수행되기 때문에 괄호는 묶지 않아도 된다.
        * 하지만 연산자 우선순위를 디테일하게 학습하고 개발하는 개발자가 적은 현실로 논리적으로
        * 먼저 실행하는 내용을 괄호로 묶어주는게 좋다.
        * */

        char ch5 = 'f';
        System.out.println("영문자인지 확인 : " + ((ch5 >='A' && ch5<= 'Z') || (ch5 >= 'a' && ch5 <='z'))); // or 연산자는 앞이 true인 경우 뒷 부분을 연산하지 않는다.
        System.out.println("영문자인지 확인 : " + ((ch5 >= 65 && ch5 <= 90) || (ch5 >= 97 && ch5 <= 122)));

        char ch6 = 'F';
        System.out.println("영문자인지 확인 : " + ((ch6 >= 'A' && ch6 <= 'Z') || (ch6 >= 'a' && ch6 <= 'z')));
        System.out.println("영문자인지 확인 : " + ((ch6 >= 65 && ch6 <= 90) || (ch6 >= 97 && ch6 <= 122)));
    }
}
