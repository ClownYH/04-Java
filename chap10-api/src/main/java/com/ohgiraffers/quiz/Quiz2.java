package main.java.com.ohgiraffers.quiz;

import java.util.Scanner;

public class Quiz2 {

    public static void main(String[] args){

        /*
        * 문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.
        *
        * 입력의 첫 줄에는 테스트 케이스의 개수 T(1 ≤ T ≤ 10)가 주어진다.
        * 각 테스트 케이스는 한 줄에 하나의 문자열이 주어진다.
        * 문자열은 알파벳 A~Z 대문자로 이루어지며 알파벳 사이에 공백은 없으며 문자열의 길이는 1000보다 작다.
        *
        * 각 테스트 케이스에 대해서 주어진 문자열의 첫 글자와 마지막 글자를 연속하여 출력한다.
        *
        * 3
        * ACDKJFOWIEGHE -> AE
        * O -> OO
        * AB -> AB
        * */

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        String[] testCase = new String[num];

        for(int i = 0; i < num; i++){
            testCase[i] = scanner.next();
            // substring(몇 번째 문자부터 시작할지, 몇 번째 문자에서 끝낼지)
            System.out.println(testCase[i].substring(0, 1) + testCase[i].substring(testCase[i].length()-1, testCase[i].length()));
        }






    }
}
