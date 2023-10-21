package main.java.com.ohgiraffers.section02.quiz;

import java.util.Scanner;

public class quiz3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // 백준 5단계 알람시계
        // "45분 일찍 알람 설정하기"
        //첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 이것은 설정한 알람 시간 H시 M분을 의미한다.
        //입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
        // 조건문


        System.out.println("알람을 설정합니다. 알람 시간은 입력한 시간보다 45분 더 일찍 울리도록 설정됩니다.");
        System.out.println("시를 입력해주세요.(0 ~ 23)");
        int hour = scanner.nextInt();
        System.out.println("분을 입력해주세요.(0 ~ 59)");
        int minute = scanner.nextInt();


        if(minute < 45){

            hour--;
            minute = 60 - (45 - minute);

            if(hour < 0){
                hour = 23;
            }

            System.out.println("알람 설정 시간");
            System.out.println(hour + " : " + minute);

        }else{

            System.out.println(hour + " : " + (minute - 45));
        }



    }

}
