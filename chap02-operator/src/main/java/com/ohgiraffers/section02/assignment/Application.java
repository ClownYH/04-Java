package com.ohgiraffers.section02.assignment;

public class Application {
    public static void main(String[] args){
        /* 대입연산자와 산술 복합 대입 연산자
        *  '=' : 왼쪽의 피연사자에 오른쪽의 피연산자를 대입한다.
        * '+=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 더한 결과를 대입한다.
        * '-=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 뺀 결과를 대입한다.
        * '*=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 곱한 결과를 대입한다.
        * '/=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 결과를 대입한다.
        * '%=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 나머지 결과를 대입한다.
        * */

        int num = 12;
        System.out.println("num : " + num);

        // 3 증가
        num = num + 3;
        System.out.println(num);

        num += 3;
        System.out.println(num);

        num %= 2;
        System.out.println(num);

//        num = "dfd";>?>
//        num = "dfd";

        num = 12;
        num += 4.0;
        System.out.println(num);
    }
}
