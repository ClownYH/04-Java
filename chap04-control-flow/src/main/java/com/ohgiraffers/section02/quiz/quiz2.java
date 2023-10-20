package main.java.com.ohgiraffers.section02.quiz;

import java.util.Scanner;

public class quiz2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//         up down 게임 만들기

        // 랜덤으로 생성된 수를 맞추는 게임입니다.
        // 조건문과 반복문을 사용하세요.

        System.out.println("Up Down 게임을 시작합니다.");

        // 1. 랜덤으로 생성하는 수의 범위는 1~50 입니다.

        int ans = (int)(Math.random() * 50) + 1; // 랜덤 수

//        System.out.println(ans);(정답 선공개)

        System.out.println("1부터 50까지의 숫자 중 하나를 입력해주세요.");

        for(;;){
            System.out.println("숫자를 입력해주세요.");
            int num = scanner.nextInt();
            if(num == ans){ // 4. 입력한 수가 랜덤으로 생선된 수와 같다면 "정답"이 출력되어야 합니다.
                System.out.println("정답입니다.");
                break;
            }else if(num < ans){ // 2. 입력한 수가 랜덤으로 생성된 수보다 낮다면 "up"
                System.out.println("Up!");
                System.out.println("========================");
            }else{ // 3. 입력한 수가 랜덤으로 생성된 수보다 높다면 "down"
                System.out.println("Down!");
                System.out.println("========================");
            }

        }






    }
}
