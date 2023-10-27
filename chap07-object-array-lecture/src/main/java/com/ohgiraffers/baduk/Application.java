package main.java.com.ohgiraffers.baduk;

import java.util.Scanner;

public class Application {

    public static void main(String[] args){


        String[][] baduk = new String[10][10]; // 바둑판의 행렬 수


        for (int i = 0; i < baduk.length; i++) {
            for (int j = 0; j < baduk[i].length; j++){ // 바둑판의 형태에서 빈 공간 11 x 11
                baduk[i][j] = " ";
            }
        }
        boolean test = true;
        Scanner scanner = new Scanner(System.in);
        int turn = 1;
        // 빈 공간을 O나 X로 교체
        while (test){ // 조건이 참이기 때문에 무한반복
            System.out.println( ((turn % 2 == 0)? "홍팀" : "청팀") + " 님 차례입니다."); // 차례 정하기
            String[] index = scanner.nextLine().split(" "); // split는 입력값 기준으로 구분해준다는 의미(num1 num2)
            int first = Integer.parseInt(index[0]); // Interer.parseInt()는 매개변수 값을 문자열에서 숫자열로 바꿔준다.
            int second = Integer.parseInt(index[1]);

            if(turn % 2 == 0){ // 만약 청팀(이 경우 1(홀수)는 청팀, 2(짝수)는 홍팀이다.)이면서
                if(baduk[first][second].equals(" ")){ // 빈 공간(이 경우 돌을 둘 수 있는 곳) 이라면,
                    baduk[first][second] = "O"; // O를 둔다.
                }else{
                    System.out.println(((turn % 2 == 0)? "홍팀" : "청팀") + " 님 차례입니다."); //빈 공간이 아니라면 홍팀의 차례
                    continue;
                }
            }else{ // 홍팀이면서
                if(baduk[first][second].equals(" ")){ // 빈 공간이라면,
                    baduk[first][second] = "X"; // X를 둔다.
                }else{
                    System.out.println(((turn % 2 == 0)? "홍팀" : "청팀") + " 님 차례입니다."); // 빈 공간이 아니라면 청팀의 차례
                    continue;
                }
            }

            for (int i = 0; i < baduk.length; i++) {
                System.out.print("|"); // 세로열 구현
                for (int j=0; j < baduk[i].length; j++){
                    System.out.print(baduk[i][j] + "|"); // 가로열 구현
                }
                System.out.println(); // 줄바꾸기
            }
            turn++; // 턴 진행
        }
    }
}
