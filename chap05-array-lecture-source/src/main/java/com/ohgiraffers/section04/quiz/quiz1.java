package main.java.com.ohgiraffers.section04.quiz;

import java.util.Scanner;

public class quiz1 {
    public static void main(String[] args) {
        // 포카드 만들기
        // 랜덤한 카드를 4장 뽑아서 포카드인지 아닌지 확인하고 포카드일 시 "포 카드!", 그외에는 "꽝!"이 나오도록 출력
        /*
         * 예시
         * 포 카드를 뽑는 운 게임
         * ===========================================
         * 게임 진행 여부 묻기
         * 당신이 뽑은 카드는
         * SPADE ACE, CLOVER KING, CLOVER 4, HEART 3
         * 꽝!*/

        Scanner scanner = new Scanner(System.in);

        String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] cardNumber = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

        System.out.println("포 카드를 뽑는 운 게임");
        System.out.println("==========================================");
        System.out.println("게임을 진행하시겠습니까?(yes/no)");

        String answer = scanner.nextLine();

        for(;;){
            if (answer.equals("yes")){

                for (int i = 1; i <= 4; i++) {

                    String shape1 = shapes[(int) (Math.random() * shapes.length)];
                    String shape2 = shapes[(int) (Math.random() * shapes.length)];
                    String shape3 = shapes[(int) (Math.random() * shapes.length)];
                    String shape4 = shapes[(int) (Math.random() * shapes.length)];
                    String cardNum1 = cardNumber[(int) (Math.random() * cardNumber.length)];
                    String cardNum2 = cardNumber[(int) (Math.random() * cardNumber.length)];
                    String cardNum3 = cardNumber[(int) (Math.random() * cardNumber.length)];
                    String cardNum4 = cardNumber[(int) (Math.random() * cardNumber.length)];

                    System.out.println("당신이 뽑은 카드는");
                    System.out.println("--------------------------------------");
                    System.out.println(shape1 + " " + cardNum1 + ", " + shape2 + " " + cardNum2 + ", " + shape3 + " " + cardNum3 + ", " + shape4 + " " + cardNum4);


                    if (shape1.equals(shape2)) {
                        if (shape2.equals(shape3)) {
                            if (shape3.equals(shape4)) {
                                if (cardNum1.equals(cardNum2)) {
                                    if (cardNum2.equals(cardNum3)) {
                                        if (cardNum3.equals(cardNum4)) {
                                            System.out.println();
                                            System.out.println("포 카드! 운이 좋으시네요.");
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        System.out.println();
                        System.out.print("꽝! 다음 기회에~");
                        System.out.println();
                        return;
                    }


                }


            }else if(answer.equals("no")){
                System.out.println("안녕히~.");
                return;
            }else{
                System.out.println("다시 시작해주세요");
                return;
            }

        }
    }
}
