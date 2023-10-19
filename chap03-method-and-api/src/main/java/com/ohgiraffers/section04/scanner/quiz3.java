package main.java.com.ohgiraffers.section04.scanner;

public class quiz3 {
    public static void main(String[] args){
        //1번 문제

        // A와 B라는 무작위의 숫자를 출력해 그 합을 반환하는 함수를 만들어 주세요.
        // 답변 양식은  ("A의 값은 () B의 값은 () 이므로 합은 ()입니다.")
        // static 메소드를 활용해주세요

        int a = (int)(Math.random() * 10);
        int b = (int)(Math.random() * 10);

        int answer = sum(a, b);

        System.out.println("A의 값은 " + a + " B의 값은 " + b + "이므로 합은 " + answer + "입니다.");

        System.out.println("=================================================================");

        // 주문한 음식의 가격을 합을 출력하려고 한다.
        // 식당의 메뉴는 탕수육, 마파두부, 짜장면이 있으며,
        // 탕수육의 가격은 4만원
        // 마파두부의 가격은 2만원
        // 짜장면의 가격은 1만원 이다.

        // 탕수육, 마파두부, 짜장면 3그릇을 주문하였을 때 가격의 합을 출력하시오.
        // method 를 사용하시오.
        // 출력되는 값은 다음과 같다. "주문하신 음식 가격의 합은 : #만원 입니다."

        quiz3 q3 = new quiz3();

        int tCost = 4;
        int mCost = 2;
        int jCost = 1;

        int x = tCost;
        int y = mCost;
        int z = jCost * 3;
        int totalCost = q3.costSum(x, y, z);
        System.out.println("주문하신 음식 가격의 합은 : " + totalCost + "만원입니다.");
    }

    public static int sum(int a, int b){
        int result = a + b;
        return result;
    }

    public int costSum(int x, int y, int z){
        int total = x + y + z;
        return total;
    }
}
