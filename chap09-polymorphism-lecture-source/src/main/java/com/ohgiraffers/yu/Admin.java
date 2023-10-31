package main.java.com.ohgiraffers.yu;

import java.util.Scanner;

public class Admin {
    private String username;
    private String password;


    // 생성자
    Admin(String username, String password){
        this.username = username;
        this.password = password;
    }


    public static final Admin admin = new Admin("admin", "admin");



    public static boolean adminRegis(String id, Scanner sc, boolean isAdmin){
        if(id.equals(admin.getUsername())){
            System.out.println("비밀번호를 입력해주세요");
            String password = sc.next();
            if (password.equals(admin.getPassword())){
                System.out.println("환영합니다. 관리자님!");
                isAdmin = true;
            }else {
            }
        }
        return isAdmin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
