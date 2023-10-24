package main.java.com.ohgiraffers.section04.quiz;

import java.util.Random;
import java.util.Scanner;

public class quiz1 {
    public static void main(String[] args) {
        // 포카드 만들기
        // 랜덤한 카드를 4장 뽑아서 포카드인지 아닌지 확인하고 포카드일 시 "포 카드!", 그외에는 "꽝!"이 나오도록 출력
        /*
         * 예시
         * 포 카드를 뽑는 운 게임
         * ==========================================
         * 게임을 진행하시겠습니까?(yes/no)
         * yes
         * 당신이 뽑은 카드는
         * ----------------------------------------
         * SPADE 2, CLUB 2, HEART 2, DIAMOND 2
         * 포 카드! 운이 좋으시네요.
         * 다음 게임을 진행하시겠습니까?(yes/no)
         * no
         * 안녕히~.
         */

        // 카드 모양과 숫자
        Scanner scanner = new Scanner(System.in);
        String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] cardNumber = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

        System.out.println("포 카드를 뽑는 운 게임");
        System.out.println("==========================================");
        System.out.println("게임을 진행하시겠습니까?(yes/no)");

        String answer = scanner.nextLine();

        while(true) {
            if (answer.equals("yes")) {
                // 카드 4장을 뽑습니다.
                int[] cards = new int[4];
                for (int i = 0; i < 4; i++) {
                    cards[i] = (int) (Math.random() * (cardNumber.length - i));
                    for (int j = 0; j < i; j++) {
                        if (cards[i] == cards[j]) {
                            i--;
                            break;
                        }
                    }
                }

                // 카드 4장의 모양과 숫자를 출력합니다.
                System.out.println("당신이 뽑은 카드는");
                for (int i = 0; i < 4; i++) {
                    System.out.println(shapes[cards[i] % 4] + " " + cardNumber[cards[i] % 13]);
                }

                // 카드 4장이 모두 같은 숫자인지 확인합니다.
                boolean isFourOfAKind = true;
                for (int i = 1; i < 4; i++) {
                    if (cards[0] != cards[i]) {
                        isFourOfAKind = false;
                        break;
                    }
                }

                if (isFourOfAKind) {
                    System.out.println("포 카드! 운이 좋으시네요.");
                } else {
                    System.out.println("꽝! 다음 기회에~");
                }

                // 다음 게임을 진행할지 묻습니다.
                System.out.println("다음 게임을 진행하시겠습니까?(yes/no)");

                while (true) {
                    answer = scanner.nextLine();
                    if (answer.equals("yes")) {
                        break;
                    } else if (answer.equals("no")) {
                        return;
                    } else {
                        System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                    }
                }
            }
            System.out.println("안녕히~.");
            return;
        }
    }
}