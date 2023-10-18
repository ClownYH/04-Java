package com.ohgiraffers.section01.arithmetic;

public class Application {
    public static void main(String[] args){

        /*
         * 산술 연산자
         * 산술 연산자는 주로 사칙연산과 관련된 연산자로 가장 기본적이면서도 많이 사용되는 연산자이다.
         * 연산의 실행이 가능하기 위해 필요한 값이나 변수가 두개인 이항 연산자로 분류되며
         * 피연산자들의 연산 방향은 왼쪽에서 오른쪽이다.
         *
         * 연산자의 우선순위는 우리가 알고 있는 수학과 동일하다.
         * */

        /* 산술연산자의 종류
         * '+' : 왼쪽의 피연산자에 오른쪽의 피연산자를 더함
         * '-' : 왼쪽의 피연산자에 오른쪽의 피연산자를 뺌
         * '*' : 왼쪽의 피연산자에 오른쪽의 피연산자를 곱함
         * '/' : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눔
         * '%' : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 나머지를 반환
         * */

        int num1 = 20;
        int num2 = 7;

        System.out.println("num1 + num2 = " + (num1 + num2)); // 연산식에 괄호가 없다면 문자열로 받아들인다.
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1 / num2 = " + (num1 / num2));
        System.out.println("num1 % num2 = " + (num1 % num2));
    }
}
