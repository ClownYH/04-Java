package main.java.com.ohgiraffers.room_escape;

import java.util.Scanner;

public class Room_escape {

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

        System.out.println("방탈출 게임을 시작합니다.");

        // 캐릭터 생성
        System.out.println("캐릭터 생성을 시작합니다.");

        // 이름
        System.out.println("당신의 이름은 무엇입니까?");
        data.setName(scanner.next());
        

        // 직업
        System.out.println("당신의 직업을 선택해주세요.");
        System.out.println("1. 학생 | 2. 군인 | 3. 운동선수 | 4. 백수");
        String job = scanner.next();

        while(true) {
            switch (job) {
                case 1:
                    Select_job.student();
                    break;
                case 2:
                    Select_job.soldier();
                    break;
                case 3:
                    Select_job.athletic();
                    break;
                case 4:
                    Select_job.jail();
                    break;
                default: contine;
            }
        }





    }
}
