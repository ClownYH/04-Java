package main.java.com.ohgiraffers.section02.quiz;

import java.util.Scanner;

public class quiz5 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        /*첫째 줄에는 별 1개, 둘째 줄에는 2개 ….. N번째 줄에는 별 N개를 찍는 프로그램이다.
        N의 범위는 0 < N < 50이며, 범위를 벗어나는 숫자를 입력하면 각각의 범위를 벗어나는 숫자를 입력하면 다시 입력하라는 안내와 함께 숫자를 다시 입력해야한다.

                별을 출력한 이후에는 종료하시겠냐는 질문이 나오고 yes를 입력하면 그대로 프로그램 종료, no를 입력하면 새로운 숫자를 입력하라는 멘트가 나오며 프로그램이 계속된다

        별 출력 예시
        ex> N 값에 4 입력*/

        int i = 0;
        int j = 0;
        System.out.println("n번째 줄에 n개가 되도록 별 찍기");
        System.out.println("숫자를 입력해주세요.(0 < n < 50)");


        for(;;) { // 조건에 부합하지 않을 때까지 반복. 그렇기 때문에 ;;의 경우 계속 조건에 부합하기 때문에 무한히 반복한다.

            int num = scanner.nextInt(); // 숫자 입력

            if(num > 0){ // 0보다 큰가?

                if(num < 50){ // 50보다 작은가?

                    for(i = 1; i <= num; i++){ // 범위 안에 수일 경우 연산을 시작. 이부분에서 제일 오래 걸림.

                        for(j = 0; j < i; j++){ // j < num 일 경우 한 줄에 출력되는 *의 수가 모두 동일, j < i 일 경우 항상 j가 1보다 작기 때문에 행과 *의 수가 동일

                            System.out.print("*"); // print로 써야 같은 줄에 계속 입력함. println은 입력을 하고 줄을 바꿈.

                        }
                        System.out.println(""); // 별의 열을 구별해줌.

                    }

                    // 반복 종료 질문

                    System.out.println(" 종료하시겠습니까?(yes/no)");

                    String ans = scanner.next();

                    if(ans.equals("no")){ // 반복을 요구
                        System.out.println("다시 숫자를 입력해주세요.");
                    }else{ // 종료를 요구
                        if(ans.equals("yes")){
                            return;
                        }else{
                            System.out.println("yes나 no 이외의 대답은 no로 간주합니다.");
                            System.out.println("별찍기를 처음부터 다시 시작합니다. 숫자를 입력해주세요."); // yes나 no 이외의 답
                        }

                    }

                }else{ // 50보다 크다.

                    System.out.println("다시 입력해주세요.");

                }

            }else{ // 0보다 작다.

                System.out.println("다시 입력해주세요.");
            }
        }

    }
}
