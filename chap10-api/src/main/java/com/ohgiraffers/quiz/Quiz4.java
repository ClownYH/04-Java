package main.java.com.ohgiraffers.quiz;

import java.util.Scanner;

public class Quiz4 {

    public static void main(String[] args){

        /*
        * 단어 S와 정수 i가 주어졌을 때, S의 i 번째 글자를 출력하는 프로그램을 작성하시오.
        *
        * 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어 S가 주어진다.
        * 단어의 길이는 최대 1000이다.
        * 둘째 줄에 정수 i가 주어진다. (1 <= i <= S)
        *
        * S의 i 번째 글자를 출력한다.
        *
        * Sprout, 3 -> r
        * Shiftpsh, 6 -> p
        * Baekjun, 4 -> k
        * */

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int i = scanner.nextInt();

        System.out.println(s.charAt(i - 1));


    }
}
