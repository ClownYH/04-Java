package main.java.com.ohgiraffers.room_escape;

import java.util.Scanner;

public class Application {

    public static void main(String[] args){
        //주말과제
        //콘솔 프로그램
        //객체지향 적으로

        // 방을 탈출해보자
        /*
        * 1. 방 가운데 플레이어가 서 있는 것을 가정
        * 2. 플레이어는 4면을 둘러볼 수 있어야 함, 목숨은 3개
        * 3. 처음 시작은 북쪽을 바라보고 있음
        * 4. 4면에 존재하는 사물들에서 힌트를 얻어서 북쪽에 문을 열어야 함
        * 5. 객체 배열을 이용해보자
        * */

        Scanner scanner = new Scanner(System.in);
        Player_data_frame data = new Player_data_frame();
        Character characterCreating = new Character();

        // 프로그램을 실행
        System.out.println("=========================");
        System.out.println("====== Room Escape ======");
        System.out.println("=========================");
        System.out.println();


        while(true) {
            // 메뉴창 제시
            System.out.println("원하시는 선택지를 골라주세요.");
            System.out.println("1. 게임 시작");
            System.out.println("9. 게임 종료");
            String menu = scanner.nextLine();
            switch (menu) {
                case "1" : // 1을 입력할 경우
                    System.out.println("캐릭터를 시작합니다.");
                    Play_Start playStart = new Play_Start();
                    playStart.Play_Start(); // 게임 시작으로 이동합니다.
                    break;

                case "9":
                    System.out.println("게임을 종료합니다.");
                    return;

                default:
                    System.out.println("잘못 선택하셨습니다. 다시 선택해주세요."); break;
            }
        }





    }
}
