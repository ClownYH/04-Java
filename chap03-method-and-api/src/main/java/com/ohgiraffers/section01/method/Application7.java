package main.java.com.ohgiraffers.section01.method;

import org.w3c.dom.ls.LSOutput;

public class Application7 {
    public static void main(String[] args){
        /*
        * 두 수를 매개변수로 받아 더한 값을 반환하는 함수
        * 두 수를 매개변수로 받아 뺀 값을 반환하는 함수
        * 두 수를 매개변수로 받아 곱하는 값을 반환하는 함수
        * 두 수를 매개변수로 받아 나눈 값을 반환하는 함수
        *
        * 메서드에서 반환한 값을 받아서 화면에 출력해주세요*/

        Application7 app7 = new Application7();

        int alpha = 20;
        int beta = 10;

        app7.summary(alpha, beta);
        app7.subtract(alpha, beta);
        app7.multiply(alpha, beta);
        app7.divide(alpha, beta);


    }

    public void summary(int alpha, int beta) {

        int sum = alpha + beta;

        System.out.println(sum);
    }

/*     public int summary(int alpha, int beta){
    *
    *   return alpha + beta;
    * } // 값을 반환하려면 return을 써서 만드는 것이 옳다.*/

    public void subtract(int alpha, int beta) {

        int sub = alpha - beta;

        System.out.println(sub);
    }
        public void multiply(int alpha, int beta){

            int mul = alpha * beta;

            System.out.println(mul);

    }
    public void divide(int alpha, int beta){

        int div = alpha / beta;

        System.out.println(div);

    }
}
