package main.java.com.ohgiraffers.loginSystem;

import java.util.Scanner;

public class Service {
    public void insertInfo(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("몇 명의 정보를 입력하시겠습니까?");
        int insertHowMany = scanner.nextInt();
        User_data[] users = new User_data[insertHowMany];

            for (int i = 0; i < users.length; i++) {
                users[i] = new User_data("","","");

                users[i] = new User_data("", "", "");
                System.out.println("이름을 입력해주세요.");
                String insertName = scanner.next();
                users[i].setName(insertName);

                System.out.println("아이디를 입력해주세요.");
                String insertId = scanner.next();
                users[i].setId(insertId);

                System.out.println("비밀번호를 입력해주세요.");
                String insertPwd = scanner.next();
                users[i].setPwd(insertPwd);

            }

        Register register = new Register();
        register.regist(users);
    }



    public void login(){
        Scanner scanner = new Scanner(System.in);
        User_Finder userFinder = new User_Finder();
        User_data[] users = userFinder.finder();


        for(int i = 1; i < users.length; i++){
            i = 1;
            System.out.println("아이디를 입력해주세요.");
            String insertId = scanner.next();
            if(!(users[i].getId().equals(insertId) && insertId.equals(users[i].getId()))){
                System.out.println("잘못된 아이디입니다.");
            }else{
                System.out.println("비밀번호를 입력해주세요.");
                String insertPwd = scanner.next();
                for(i = 1; i < users.length;){
                    if(!(users[i].getPwd().equals(insertPwd) && insertPwd.equals(users[i].getPwd()) && users[i].getId().equals(insertId) && insertId.equals(users[i].getId()))){
                        System.out.println("잘못된 비밀번호입니다.");
                        break;
                    }else{
                        while(true){
                            if(users[0].getId().equals(insertId) && insertId.equals(users[0].getId())){
                                System.out.println("무엇을 하시겠습니까?");
                                System.out.println("1. 가챠 | 2. 확률 조절 | 3. 로그아웃");
                                String num = scanner.next();
                                switch (num){
                                    case "1" :
                                        Game game = new Game();
                                        game.game();
                                        break;
                                    case "2" :
                                        System.out.println("확률을 조절합니다.");

                                        break;
                                    case "3" :
                                        System.out.println("로그아웃하셨습니다.");
                                        return;
                                }
                            }
                            System.out.println("무엇을 하시겠습니까?");
                            System.out.println("1. 가챠 | 2. 로그아웃");
                            String num = scanner.next();
                            switch (num){
                                case "1" :
                                    Game game = new Game();
                                    game.game();
                                    break;
                                case "2" :
                                    System.out.println("로그아웃하셨습니다.");
                                    return;
                            }
                        }

                    }
                }

            }
        }

    }
}
