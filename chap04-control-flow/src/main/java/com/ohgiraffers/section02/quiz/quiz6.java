package main.java.com.ohgiraffers.section02.quiz;

import java.util.Scanner;

public class quiz6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* 백준 반복문 1단계 구구단 만들기
         * N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오.
         * 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
         * 출력형식과 같게 N*1부터 N*9까지 출력한다.*/

        int i = 0;
        boolean out = false;



        for (; ; ) {

            System.out.println("숫자를 입력하세요.(1<= n <=9)");
            int n = scanner.nextInt();
            System.out.println(n + "단입니다.");

            if (n >= 1) {

                if (n <= 9) {

                    for (i = 1; i <= 9; i++) {


                        System.out.println(n + " * " + i + " = " + (n * i));


                    }


                    System.out.println("다시 시작하시겠습니까?(y/n)");
                    String ans = scanner.next();


                    if (ans.equals("y")){
                        out = true;
                        System.out.println("다시 시작합니다.");
                    }else if(ans.equals("n")){
                        System.out.println("종료합니다.");
                        return;
                    }else{
                        System.out.println("다시 선택해주세요.(y/n)");
                    }


                } else {

                    System.out.println("n 값의 범위를 벗어났습니다.");

                }
            } else {

                System.out.println("n 값의 범위를 벗어났습니다.");

            }

        }
    }
}
