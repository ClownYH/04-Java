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
        /*
         *  1~n 까지의 값을 입력받으면 실행하고 아니면 다시 입력받는다.
         *  1~n 중에 한 수를 입력받으면 해당 1부터 해당 수 까지의 구구단을 출력한다.
         *
         * */
/*        do while을 이용하여 사용자에게  1단 부터 N단 까지 출력하는 구구단 프로그램을 보여줍니다.

        프로그램은 다음과 같습니다.

                EX) 사용자 입력 값이 6이라면 1~6단 까지의 단을 출력해주세요

        ! 중첩 반복문을 사용해야 합니다.
        2의 배수의 단은 출력하지 않으며
        사용자가 10의 이상의 값을 입력하는 경우 9단까지만 출력을 하고 프로그램을 종료해주세요*/

        Scanner scanner = new Scanner(System.in);
        int num = 0;
        do{
            num = scanner.nextInt();
            for(int i = 1; i <= num ; i++){
                for(int o = 1; o < 10; o++){
//                    if(i % 2 == 0){
//                        continue; // continue는 건너뛰는 것을 의미, 이렇게 하면 짝수값은 건너뛰기 때문에 홀수만 출력하게 됨
//                    }
                    if(num < 10){
                        System.out.println(i + " * " + o + " = " + (i * o));
                    }else{
                        num = 9;
                        System.out.println(i + " * " + o + " = " + (i * o));
                    }

                }
            }break;
        }while(num < 10);

    }
}
