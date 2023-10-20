package main.java.com.ohgiraffers.section02.quiz;

import java.util.Scanner;

public class quiz6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        /* 백준 반복문 1단계 구구단 만들기
        * N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오.
        * 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
        * 출력형식과 같게 N*1부터 N*9까지 출력한다.*/

        int i = 0;

        System.out.println("숫자를 입력하세요.(1<= n <=9)");
        int n = scanner.nextInt();

        for(i = 1; i <= 9; i++){
            System.out.println(n + " * " + i + " = " + (n * i));
        }

    }
}
