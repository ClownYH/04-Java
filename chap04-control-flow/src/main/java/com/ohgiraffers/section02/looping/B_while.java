package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_while {

    public void testSimpleWhileStatement() {
        /*
         * [while 표현식]
         * while(조건식){
         *
         * }
         * */

        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        int i = 1;

        while (i < value.length()) {
            i++;

            if (i % 2 == 0) {
                continue; // 건너뛴다.
            } else if (i == 11) {
                break;
            }
            System.out.println(i);
        }

        boolean isTrue = false;

        /*
         * do while[표현식]
         * do{
         *
         * }while(조건식);
         * */

        do { // 먼저 실행한 후 조건을 나중에 판별
            System.out.println("메뚜기 월드 게임");
            System.out.println("시작을 원하면 true, 시작을 원하지 않으면 false를 입력해주세요.");
            isTrue = scanner.nextBoolean();
        } while (isTrue);
    }

    public void doWhileGugudan() {
        /* do while을 이용하여 사용자에게 1단부터 N단까지 출력하는 구구단 프로그램 만들기(중첩 반복문 사용)
         * 예시
         * 1 * 1 = 1
         * .
         * .
         * .
         * 1 * 9 = 9
         * .
         * .
         * .
         * 6 * 9 =54
         *  */

    }
}
