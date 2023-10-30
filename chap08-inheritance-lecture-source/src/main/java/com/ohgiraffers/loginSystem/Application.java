package main.java.com.ohgiraffers.loginSystem;

import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        /* 회원 가입 및 로그인 시스템 + 가챠(?)까지 구현해보자
        * 1. 회원 정보를 입력해 그 정보들을 등록
        * 2. 등록된 데이터를 기반으로 로그인(상속을 통해 어드민 id 구현 = 확률 조작 요소 입력)
        * 3. 로그인 후 가챠 게임을 실행*/

        Scanner scanner = new Scanner(System.in);
        Service service = new Service();

        System.out.println("== System Helper ==");
        System.out.println("===================");
        System.out.println();


        while(true){
            System.out.println("메뉴를 선택해주세요.");
            System.out.println("1. 회원 가입");
            System.out.println("2. 로그인");
            System.out.println("9. 시스템 종료");

            String choice = scanner.next();

            switch(choice){
                case "1" :
                    System.out.println("회원가입 서비스를 선택하셨습니다.");
                    service.insertInfo(); break;
                case "2" :
                    System.out.println("로그인을 진행합니다.");
                    service.login(); break;
                case "9" :
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못 선택하셨습니다.");

            }
        }
    }
}
