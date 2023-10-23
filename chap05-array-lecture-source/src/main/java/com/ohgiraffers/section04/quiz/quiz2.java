package main.java.com.ohgiraffers.section04.quiz;

import java.util.Scanner;

public class quiz2 {
    public static void main(String[] args){
        // 좋아하는 음식 5가지를 입력하고 그 중 오늘의 추천메뉴 한 가지를 선택하게 만들어주세요.
        /*
        * 예시
        좋아하는 음식 5가지를 적어주세요.
        1번 : 1
        1번 : 2
        1번 : 3
        1번 : 4
        1번 : 5
        적어주신 메뉴는
        1번. 1
        2번. 2
        3번. 3
        4번. 4
        5번. 5
        입니다.
        오늘의 추천메뉴는 4입니다.
         */

        // 좋아하는 음식 5가지를 한 배열로 선언
        Scanner scanner = new Scanner(System.in);
        String[] food = new String[5];

        System.out.println("좋아하는 음식 5가지를 적어주세요.");

        // 그 중 한가지를 랜덤하게 선택
        for(int i = 0; i < food.length; i++){
            System.out.print("1번 : ");
            food[i] = scanner.nextLine();
        }

        System.out.println("적어주신 메뉴는 ");

        for(int j = 0; j < food.length; j++){
            System.out.println((j + 1) + "번. " + food[j]);
        }

        System.out.println("입니다.");



        String today = food[(int)(Math.random() * food.length)];
        System.out.println("오늘의 추천메뉴는 " + today + "입니다.");

    }
}
