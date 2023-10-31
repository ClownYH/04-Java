package main.java.com.ohgiraffers.yu;

import java.util.Scanner;

public class Regis_Login {

    //Register
    public void register(Scanner sc){
        // 아이디를 입력 받는다
        System.out.println("원하시는 아이디를 입력해주세요: ");
        String userid = sc.next();

        while(true){
            // 먼저 1차 비밀번호를 받는다
            System.out.println("원하시는 비밀번호를 입력해주세요: ");
            String password1 = sc.next();
            //2차 비밀번호를 받는다
            System.out.println("비밀번호를 다시 입력해주세요: ");
            String password2 = sc.next();
            //1, 2차 비밀번호 확인
            if(password1 .equals(password2)){
                UserDatabase.regisUser(userid, password2);
                System.out.println("회원가입이 완료되었습니다. ");
                break;
            }else {
                System.out.println("입력한 비밀번호가 일치하지 않습니다. 다시 시도해주세요.");
            }
        }

    }


    public void login(Scanner sc){

        System.out.println("로그인할 아이디를 입력해주세요: ");
        boolean isAdmin = false;


        log1: while (true){
            String loginId = sc.next();
            isAdmin = Admin.adminRegis(loginId, sc, isAdmin);
            if(isAdmin == true){
                Menu.adminMenu(sc);
            }else{
                for (int i = 0; i <= UserDatabase.getCount(); i++) {
                    if (loginId .equals(UserDatabase.userId[i]) ){
                        System.out.println("아이디가 일치합니다.");
                        System.out.println("비밀번호를 입력해주세요: ");

                        while (true){
                            String loginPassword = sc.next();
                            if(loginPassword .equals(UserDatabase.userPassword[i])){
                                System.out.println("비밀번호가 일치합니다. ");
                                System.out.println("로그인 되었습니다. \n");
                                Menu.loginMenu(sc);
                                break log1;
                            }else {
                                System.out.println("입력하신 비밀번호가 다릅니다. \n 비밀번호를 다시 입력해주세요");
                            }
                        }

                    }
                }
            }
            System.out.println("입력하신 아이디가 없습니다. \n 아이디를 다시 입력해주세요: ");
        }
    }

    public void deleteUser(Scanner sc){
        System.out.println("삭제할 아이디를 입력해주세요: ");
        String userId = sc.next();

        for (int i = 0; i <= UserDatabase.getCount(); i++) {
            if(userId.equals(UserDatabase.userId[i])){
                for (int j = i; j <= UserDatabase.getCount(); j++) {
                    UserDatabase.userId[j] = UserDatabase.userId[j+1];
                    UserDatabase.userPassword[j] = UserDatabase.userPassword[j+1];
                    UserDatabase.count--;
                }
            }
        }
        System.out.println("아이디가 삭제되었습니다. ");
    }







}
