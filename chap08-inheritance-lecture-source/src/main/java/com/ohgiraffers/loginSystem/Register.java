package main.java.com.ohgiraffers.loginSystem;

public class Register {
    public void regist(User_data[] users){
        User_Information user_information = new User_Information();

        System.out.println("회원이 등록되었습니다.");

        for(User_data user : users){
            System.out.println(user.toString());
        }

        if(user_information.store(users)){
            System.out.println("총 " + users.length + "명이 등록되었습니다.");
        }

    }
}
