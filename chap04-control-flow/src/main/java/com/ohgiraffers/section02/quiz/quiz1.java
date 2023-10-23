package main.java.com.ohgiraffers.section02.quiz;

import java.util.Scanner;

public class quiz1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        // 음료 계산
        System.out.println("================== OhGiraffers vending machine ===========================");
        System.out.println("|  사이다(500)  |  콜라(600)  |  환타(700)  |  바카스(1000)  |  핫식스(1500)  |");
        System.out.println("==========================================================================");


        // 음료 선택시 가격을 제시




        int i = 1;
        char ans = 'n';
        int price = 0;

        while(true){
            System.out.print("음료를 선택해주세요 : ");
            String drink = scanner.next();

            switch (drink){
                case "사이다" : price += 500; break;
                case "콜라" : price += 600; break;
                case "환타" : price += 700; break;
                case "바카스" : price += 1000; break;
                case "핫식스" : price += 1500; break;
                default :
                    System.out.println("음료를 다시 선택해주세요."); continue;
            };
            System.out.println(drink + "를 선택하셨습니다.");

            System.out.println("계산하시겠습니까?(y/n)");
            ans = scanner.next().charAt(0);

            if(ans == 'y'){
                System.out.println("총금액은 " + price + "입니다.");
                break;
            }else{
                System.out.println("음료를 더 선택해주세요.");

            }
        }



    }
}
