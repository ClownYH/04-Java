package main.java.com.ohgiraffers.section01.array;

public class Application05 {
    public static void main(String[] args){

        /* 랜덤한 카드를 한 장 뽑아서 출력해보자 */
        String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] cardNumber = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

        // 랜덤 : (Math.random() * 갯수(array.length))

        System.out.println("당신이 뽑은 카드는 " + shapes[(int)(Math.random()* shapes.length)] + " " + cardNumber[(int)(Math.random() * cardNumber.length)] + "입니다.");

    }
}
