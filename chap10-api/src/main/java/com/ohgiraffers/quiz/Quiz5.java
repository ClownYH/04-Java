package main.java.com.ohgiraffers.quiz;

import java.util.Scanner;

public class Quiz5 {

    public static void main(String[] args){

        /*
        * 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.(마름모형)
        *
        * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
        * 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
        *
        * 입력은 5
        * */

        // 5줄을 만듬
        // 4 3 2 1 0의 공백칸 을 만듬 "@"
        // 1 3 5 7 9의 별칸을 만듬 "*"

        // 4줄을만듬
        // 1 2 3 4의 공백칸을 만듬 "@"
        // 7 5 3 1의 별칸을 만듬 "*"

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for(int i = 0; i < num; i++){
            for(int j = num - 1; j > i; j--){
                System.out.print("@");
            }

            for(int k = 0; k < 2 * i + 1; k++){
                System.out.print("*");
            }
            System.out.println(); // 한줄 내림, 1바퀴에 한줄을 작성
        }

        for(int i = 0; i < num - 1; i++){
            for(int j = 0; j < i + 1; j++){
                System.out.print("@");
            }

            for(int k = 2 * num -2 ; k > i*2 + 1  ;k--){
                System.out.print("*");
            }
            System.out.println();
        }





    }
}
