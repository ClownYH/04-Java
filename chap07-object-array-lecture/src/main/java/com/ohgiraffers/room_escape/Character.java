package main.java.com.ohgiraffers.room_escape;

import java.util.Scanner;

public class Character {

    public static Player_data_frame[] characterCreating(){

        Scanner scanner = new Scanner(System.in);
        Player_data_frame[] job = new Player_data_frame[3];
        // 캐릭터 이름 설정
        System.out.println("이름을 정해주세요.");
        String name = scanner.next();

        // 직업을 선택
        boolean isTrue = true;

        while(isTrue) {
            System.out.println("직업을 선택해주세요.(1. 학생, 2. 군인, 3. 백수");
            String num;
            num = scanner.next();

            switch (num) {
                case "1": // 학생을 선택
                    job[0] = new Player_data_frame(name, "학생", 3, 2, 2, 3);
                    System.out.println("-------------------------------");
                    System.out.println();
//                    System.out.println(job[0].getInfo());
                    isTrue =false;
                    break;

                case "2": // 군인을 선택
                    job[1] = new Player_data_frame(name, "군인", 3, 3, 2, 2);
                    System.out.println("-------------------------------");
                    System.out.println();
//                    System.out.println(job[1].getInfo());
                    isTrue =false;
                    break;

                case "3": // 백수를 선택
                    job[2] = new Player_data_frame(name, "백수", 2, 2, 3, 3);
                    System.out.println("-------------------------------");
                    System.out.println();
//                    System.out.println(job[2].getInfo());
                    isTrue =false;
                    break;

                default: // 기타 선택지
                    System.out.println("제대로 된 직업을 선택해 주세요.");
                    break;
            }


        }


    return job;
    }
}
