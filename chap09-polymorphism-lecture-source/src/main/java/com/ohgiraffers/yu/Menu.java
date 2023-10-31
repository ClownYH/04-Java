package main.java.com.ohgiraffers.yu;

import java.util.Scanner;

public class Menu {

    public static void menu(Scanner sc){
        Regis_Login regisLogin = new Regis_Login();


        log1: while(true){
            System.out.println("1. 회원가입     2. 로그인     9. 프로그램 종료하기");
            String choice = sc.next();
            Scissor_Paper_Rock scissorPaperRock = new Scissor_Paper_Rock();

            switch (choice){
                case "1" : regisLogin.register(sc); break;
                case "2" : regisLogin.login(sc); scissorPaperRock.SPRgame(sc); break;
                case "9" :
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("입력하신 번호가 맞지 않습니다. 다시 입력해주세요.");
                    continue ;
            }
        }
    }

    public static void loginMenu(Scanner sc){
        Regis_Login regisLogin = new Regis_Login();


        log1: while(true){
            System.out.println("1. 가위바위보 게임     2. 로그아웃     9. 프로그램 종료하기");
            int choice = sc.nextInt();
            Scissor_Paper_Rock scissorPaperRock = new Scissor_Paper_Rock();

            switch (choice){
                case 1 : scissorPaperRock.SPRgame(sc); break;
                case 2 :
                    System.out.println("로그아웃 합니다~ ");
                    menu(sc); break;
                case 9 :
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("입력하신 번호가 맞지 않습니다. 다시 입력해주세요.");
                    continue ;
            }
        }
    }

    public static void adminMenu(Scanner sc){
        Regis_Login regisLogin = new Regis_Login();


        log1: while(true){
            System.out.println("1. 가위바위보 게임     2. 로그아웃     3. 가입한 회원목록     4. 아이디 삭제     9. 프로그램 종료하기");
            int choice = sc.nextInt();
            Scissor_Paper_Rock scissorPaperRock = new Scissor_Paper_Rock();

            switch (choice){
                case 1 : scissorPaperRock.SPRgame(sc); break;
                case 2 :
                    System.out.println("로그아웃 합니다~ ");
                    menu(sc); break;
                case 3 : UserDatabase.allUserData(); break;
                case 4 : regisLogin.deleteUser(sc); break;
                case 9 :
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("입력하신 번호가 맞지 않습니다. 다시 입력해주세요.");
                    continue ;
            }
        }
    }
}
