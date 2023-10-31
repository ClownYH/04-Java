package main.java.com.ohgiraffers.loginSystem;

import java.util.Scanner;

public class Game {
    public void game(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("아직 기다려 달라");
        System.out.println("GottA!!!");
        Boolean start = true;
        while(start){
            System.out.println("가챠를 돌리시겠습니까?");
            System.out.println("1. 시작 | 2. 종료");
            String gotta = scanner.next();
            switch (gotta){
                case "1" :
                    double percent = (Math.random() * 100);
                    if(percent <= 3){
                        System.out.println("당첨!");
                    }else if(percent <=10){
                        System.out.println("2등입니다!");
                    }else if(percent <= 40){
                        System.out.println("3등~");
                    } else{
                        System.out.println("꽝!");
                    }
                    break;
                case "2" :
                    return;
            }
        }
    }
}
