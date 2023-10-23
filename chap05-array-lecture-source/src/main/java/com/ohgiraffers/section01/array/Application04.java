package main.java.com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application04 {
    public static void main(String[] args){
        // 5명의 자바 점수를 정수로 입력 받아서 합계와 평균을 실수로 구하는 프로그램을 만들어 주세요.

        // 1. 5명의 학생의 자바 점수를 입력 받는다.

        Scanner scanner = new Scanner(System.in);

        // 합계로 받을 값
        int sum = 0;

        int[] score = new int[5];
//        score[0] = scanner.nextInt();
//        score[1] = scanner.nextInt();
//        score[2] = scanner.nextInt();
//        score[3] = scanner.nextInt();
//        score[4] = scanner.nextInt();

        for(int i = 0; i < score.length; i++){
            System.out.println(i + "번째 학생의 자바 점수를 입력해주세요. : ");
            score[i] = scanner.nextInt();
            sum += score[i];
        }
        System.out.println(score.length + "명의 자바 점수의 합 : " + sum);
        System.out.println(score.length + "명의 자바 점수 평균 : " + (double)sum / score.length);

    }
}
