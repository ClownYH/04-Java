package main.java.com.ohgiraffers.Pocketmon;

import main.java.com.ohgiraffers.section06.singleton.EagerSingleton;

import java.util.Random;
import java.util.Scanner;

public class Actions {

    private static Actions actions = new Actions();
    public void pocketBall(int hp){
        Pokemon Pokemon  = new Pokemon();
        Random random =new Random();

        if(0 < hp && hp <= 10){
            if (percentage(90)){
                actions.catchPokemon();
            }else {
                actions.lossPokemon();
            }

        } else if (10 < hp && hp <= 40) {
            if (percentage(60)){
                actions.catchPokemon();
            }else {
                actions.lossPokemon();
            }

        } else if (40 < hp && hp <= 70) {
            if (percentage(30)){
                actions.catchPokemon();
            }else {
                actions.lossPokemon();
            }
        } else {
            if (percentage(1)) {
                actions.catchPokemon();
            }else {
                actions.lossPokemon();
            }
        }
    }


    public int Attack(int hp) {
        Pokemon Pokemon  = new Pokemon();

        if (hp > 0) {
            if(percentage(50)){
                hp -= 30;
                System.out.println("현재 남은 hp : " + hp);
            }else{
                System.out.println("공격이 실패하였습니다");
            }
        }
        if(hp>0) {
            return hp;
        }else{
            System.out.println("포켓몬이 죽었습니다.");
            System.exit(0);
            return 0;
        }
    }


    public void flee(){
        System.out.println("도망치셨습니다.");
        System.exit(0);
    }

    public boolean percentage(int num){
        Random ra = new Random();
        int randomNo = ra.nextInt(100)+1;
        if(randomNo > num){
            return false;
        }else{
            return true;
        }
    }

    public void catchPokemon(){
        System.out.println("축하합니다! 포켓몬을 잡았습니다.!");System.exit(0);
    }
    public void lossPokemon(){
        System.out.println("포켓몬을 놓쳤습니다!");
    }

    public static void action1(int hp){
        Scanner sc = new Scanner(System.in);
        Actions actions = new Actions();
        int choice;
        while(true){
            System.out.println("무엇을 하시겠습니까? ");
            System.out.println("1.공격하기       2.포캣볼       3.도망치기");
            choice = sc.nextInt();
            switch(choice){
                case 1 :
                    System.out.println(" ");
                    System.out.println("포캣몬을 공격했습니다.");
                    hp = actions.Attack(hp);
                    continue;
                case 2 :
                    System.out.println(" ");
                    System.out.println("포켓볼을 던지셨습니다.");
                    actions.pocketBall(hp);
                    continue;
                case 3 :
                    System.out.println(" ");
                    System.out.println("전투에서 도망치셨습니다.");
                    actions.flee();
                    break;
            }
        }
    }

    public static Actions getInstance(){
        return actions;
    }

}
