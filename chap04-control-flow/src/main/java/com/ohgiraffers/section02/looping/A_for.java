package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {

    /*
     * for[표현식]
     * for(초기값; 조건식; 증감식){
     *
     * }
     * */
    public void testSimpleForStatement() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public void testForExample() {
        // 반의 학생이 10명인 학생의 이름을 입력받기

        Scanner scanner = new Scanner(System.in);

//        System.out.println("1번째 학생의 이름을 입력해주세요. : ");
//        String name1 = scanner.nextLine(); // 이걸 10번 반복하는 것은 번거롭고 좋지 못하다.

        for (int i = 0; i < 10; i++) { //증감식으로 i*2을 넣으면 짝수만 구할 수도 있다. 단, 이 경우 i = 1 로 시작해야 한다.
            System.out.println(i + "번째 학생의 이름을 입력해주세요.");
            String student = scanner.nextLine();
            System.out.println(i + "번째 학생의 이름은 " + student + "입니다.");
        }

    }

    public void testForExample2() {
        // 1 ~ 10까지 수의 합을 구한다.

        // 1 ~ 10까지의 수는 1씩 증가된다.
        // 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 +10

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        System.out.println(sum);

        //반복문에서 조건문 사용하기

        for (int i = 0; i <= 10; i++) {
            if (i == 0) {
                System.out.println("0입니다.");
            } else if (i % 2 == 0) {
                System.out.println(i + "짝수입니다.");
            } else {
                System.out.println("홀수입니다.");
            }
        }
    }

    public void testForExample4() {
        /* 숫자 두 개를 입력받아 작은 수에서 큰 수까지의 합계를 구하세요.
         * 단, 두 숫자는 같은 숫자를 입력하지 않는다는 가정으로 해결을 합니다.
         * */

        /* 프로그램
         * 목표 : 두 수를 입력 받아서 작은 수부터 큰 수까지의 합계를 구한다.
         * 주의 : 두 수의 값은 같을 수 없다.
         *
         * 1. 두 수를 입력받아야 한다.
         * 2. 입력 받은 수가 같은지 비교한다.
         *  false. 두 수가 같지 않다면 다음으로 넘긴다.
         *  true. 두 수를 다시 입력 받는다.
         * 3. 같지 않다면 작은 수와 큰 수를 구한다.
         * 4. 작은 수부터 큰 수까지의 합계를 수한다.
         * */

        System.out.println("두 수를 입력받아 작은 수부터 큰 수까지의 합계를 구하는 프로그램입니다.");
        Scanner scanner = new Scanner(System.in);


//        * 2. 입력 받은 수가 같은지 비교한다.

        for (; ; ) {
//        * 1. 두 수를 입력받아야 한다.
            System.out.println("첫 번째 수를 입력해주세요 : ");
            int first = scanner.nextInt();
            System.out.println("두 번째 수를 입력해주세요 : ");
            int second = scanner.nextInt();

            if (first == second) { // 같은 경우 입력을 다시 받는다.
                System.out.println("두 수의 값이 같기 때문에 입력을 다시 받습니다.");
                System.out.println("첫 번째 수를 다시 입력해주세요.");
            } else { //같지 않은 경우 다음 진행
                // 3. 같지 않다면 작은 수와 큰 수를 구한다.
                int max = (first > second) ? first : second;
                int min = (first < second) ? first : second;
                int sum = 0;

                // 4. 작은 수부터 큰 수까지의 합계를 구한다.
                for (int i = min; i <= max; i++) {
                    sum += i;
                }
                System.out.println("입력한 두 수에서 작은 값은 " + min + " 큰 값은 " + max + "이고 합계는 " + sum + "입니다.");
                break;
            } // 반복문의 횟수가 명확할 때 for, 명확하지 않을 때 while

            if (first == second) {

            }
//        *  false. 두 수가 같지 않다면 다음으로 넘긴다.
//        *  true. 두 수를 다시 입력 받는다.
//        * 3. 같지 않다면 작은 수와 큰 수를 구한다.
//        * 4. 작은 수부터 큰 수까지의 합계를 수한다.
        }
    }

    /**
     * 구구단을 위한 함수 입니다.
     * n ~ 9단까지의 구구단
     * @param first : 해당 단을 수행함.
     * @return void
     * */ // 함수형 주석 : 개발자 협업을 위해 사용.
    public void gugudan(int first) {

        int i = 0;

        for(i = 1; i <10; i++){
            System.out.println(first + " * "  + i + " = " + (first * i));
                }

    }


}
