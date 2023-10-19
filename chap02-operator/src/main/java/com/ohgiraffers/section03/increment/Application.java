package com.ohgiraffers.section03.increment;

public class Application {
    public static void main(String[] args){

        // 증강연산자에 대하여 공부하자
        /*
        * ++ X / X ++ : 앞 또는 뒤에 있는 피연산자의 값을 1만큼 증가시킨다.
        * -- X / X -- : 앞 또는 뒤에 있는 피연산자의 값을 1만큼 뺀다.
        * */

        int num = 10;
        int num2 = 20;
        int result = 1; // 변수에 값을 할당해주지 않으면 메모리를 할당 받지만 피연산자 값이 없기 때문에 선언 후 초기화가 일어나지 않는다.

        result = result * ++num; // (num = 11) 증감을 시행 후 곱셈을 진행(++이 앞)
        System.out.println(result);
        System.out.println(num); // 증감연산자는 피연산자의 값 자체를 바꿔버린다.

        result = 1;
        result = result * num++; // (num = 11, 앞에서 증가를 한 번 겪음) ++가 앞이냐 뒤냐에 따라 계산이 바뀐다. 곱셈을 진행한 후 증감을 시행(++이 뒤)
        System.out.println(result);
        System.out.println(num);

    }
}
