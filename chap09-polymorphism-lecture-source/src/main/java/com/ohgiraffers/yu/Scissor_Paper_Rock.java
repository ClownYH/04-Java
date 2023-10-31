package main.java.com.ohgiraffers.yu;

import java.util.Random;
import java.util.Scanner;

public class Scissor_Paper_Rock {
    public void SPRgame(Scanner sc) {
        System.out.println("가위 바위 보 게임을 시작합니다.");
        System.out.println("Scissor Paper Rock 중 하나를 입력하세요");
        String choice = sc.next();
        SPRmechanism(choice);
    }

    public void SPRmechanism(String choice) {
        String computerChoice = " ";
        SPRpercentage(computerChoice);

        int result = 0; // 0 == lose, 1 == draw, 2 == win
        log1: while (true) {
            switch (choice) {
                case "Scissor":
                    if (computerChoice.equals("Scissor")) {
                        result = 1;
                    } else if (computerChoice.equals("Paper")) {
                        result = 2;
                    } else {
                        result = 0;
                        break log1;
                    }
                case "Paper":
                    if (computerChoice.equals("Scissor")) {
                        result = 0;
                    } else if (computerChoice.equals("Paper")) {
                        result = 1;
                    } else {
                        result = 2;
                        break log1;
                    }
                case "Rock":
                    if (computerChoice.equals("Scissor")) {
                        result = 2;
                    } else if (computerChoice.equals("Paper")) {
                        result = 0;
                    } else {
                        result = 1;
                        break log1;
                    }
                default:
                    System.out.println("다시 입력해주세요~");
                    continue;
            }
        }

        switch (result) {
            case 2:
                System.out.println("Victory!");
                break;
            case 1:
                System.out.println("DRAW");
                break;
            case 0:
                System.out.println("You Lose...");
                break;
        }

    }

    public String SPRpercentage(String computerChoice){

        if (percentage(33)) {
            computerChoice = "Scissor";
        } else if (percentage(33)) {
            computerChoice = "Paper";
        } else {
            computerChoice = "Rock";
        }
        return computerChoice;
    }

    public boolean percentage( int num){
        Random ra = new Random();
        int randomNo = ra.nextInt(100) + 1;
        if (randomNo > num) {
            return false;
        } else {
            return true;
        }
    }
}

