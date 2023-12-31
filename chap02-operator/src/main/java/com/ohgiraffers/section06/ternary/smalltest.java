package com.ohgiraffers.section06.ternary;

public class smalltest {
    public static void main(String[] args) {


        System.out.println("========예시 문제=========");
        // ch1 = X, ch2 = Z 일때 그 값을 비교한 후 참이면 "참", 거짓이면 "거짓"으로 출력할 것

        char ch1 = 'X';
        char ch2 = 'Z';
        int x = ch1;
        int z = ch2;
        System.out.println(x);
        System.out.println(z);
        System.out.println(x > z);
        String result = (x > z) ? "참" : "거짓";
        System.out.println(result);

        System.out.println("========예시 문제=========");
        // 길동이의 첫달 월급은 100만원이다
        // 짝수달은 10프로 보너스를 받고, 홀수달은 15프로 보너스를 받는다
        // 길동이 연봉은? 출력 내용 = 길동이의 연봉은 XX만원입니다

        int gildong = 100;
        final float odd = 0.1f;
        final float even = 0.15f;
        int i;

        for (i = 1; i < 13; i++) {
            if (i % 2 == 0) {
                System.out.println((int) (even * gildong) + gildong);
            }
            ;
            if (i % 2 != 0) {
                System.out.println((int) (odd * gildong) + gildong);
            };
        };

        int oddSalary = 6 * (gildong + (int)(gildong * odd));
        int evenSalary = 6 * (gildong + (int)(gildong * even));

        int totalSalary = oddSalary + evenSalary;

        System.out.println("길동이의 연봉은 " +  totalSalary + "만원입니다.");

        System.out.println("========예시 문제=========");

        // A 마트의 이번 주 주류 판매 실적은 소주 :  45만원 , 맥주 : 30만원 , 와인 : 36만원 , 고량주 : 27만원 이다.

        // 마트의 주당 평균 총 매출이 140 만원일때

        // 그 주의 주류 별 평균 실적과 그 주의 총 매출을 정리하고(세금 10%),

        // 총 매출이 주당 평균 매출보다 높은지 나타내려고 한다.

        // 다음과 같은 양식을 가진다.


        // A마트 이번 주 주류 당 평균 실적은 ()만원이고, 세금을 제외한 총 매출은 ()만원이며 세금은 ()만원을 냈다.

        // 이번 주 총 매출은 평균 총 매출보다 높다/낮다. (삼항연산자 사용)

        int soju = 45;
        int beer = 30;
        int wine = 36;
        int chin = 27;
        float tax = 10f;
        int alch = soju + beer + wine + chin;
        int talch = (int)(alch * tax);
        String cont = (alch > 140)? "이번 주 총 매출은 평균 총 매출보다 높다.":"이번 주 총 매출은 평균 총 매출보다 낮다.";
        System.out.println("A마트 이번 주 주류 당 평균 실적은 " + alch + "만원이고, 세금을 제외한 총 매출은 " + (alch -talch) + "만원이며 세금은 " + talch + "만원을 냈다.");
        System.out.println(cont);

        System.out.println("========예시 문제=========");

        // 승객 두명의 놀이기구 탑승 가능여부를 출력하는 코드를 만드시오.
        // 놀이기구 탑승 기준은 키가 120cm 이상이다.
        // 승객 두명의 키는 각각 113cm 와 127cm 이다.

        // 화면에 보여지는 양식은 다음과 같다.
        // 키카 113cm 이므로 탑승 불가능합니다.
        // 키가 127cm 이므로 탑승 가능합니다.

        // 조건
        // 삼항 연산자를 사용하시오

        int a = 113;
        int b = 127;

        String heighta = (a>120)? "탑승 가능": "탑승 불가능";
        String heightb = (b>120)? "탑승 가능": "탑승 불가능";

        System.out.println("키가 " + a + "cm이므로 " + heighta + "합니다.");
        System.out.println("키가 " + b + "cm이므로 " + heightb + "합니다.");

        System.out.println("========예시 문제=========");

        //삼항연산자를 이용해 1이 4보다 작으면 바보 . 4보다 크면 천재를 출력
        String answer = (1<4)? "바보" : "천재";
        System.out.println(answer);

        System.out.println("========예시 문제=========");

//        자신의 나이를 집어넣고 20 보다 작으면 미성년자, 20보다 높으면 성인이 출력되도록 한다

        String age = (32>20)? "성인" : "미성년자" ;
        System.out.println(age);

        /*한 축구 구단의 직원 수는 약 1892명 이다.
        올해에 리그에서 순위가 18위 이하로 나온다면 강등 되어서 직원수는 15% 감소하고, 18위 이하를 기록하지 않는다면 구단의 직원수는 15% 증가한다.

        구단의 직원들에게 설명하기 위해 삼항연산자를 활용해 작성해보자.

        구단은 기적적으로 17위를 기록하였는데, 이후의 구단 직원수도 구해보자.
        */

        System.out.println("========예시 문제=========");

        int mem = 1892;
        int score = 17;
        int memnow = (score >= 18)? mem - (int)(mem * 0.15) : mem + (int)(mem * 0.15);

        System.out.println(memnow + "명");

        System.out.println("========예시 문제=========");
//        영어시험을 본 결과 1번 학생은 90점 2번 학생은 95점 3번 학생은 81점을 맞았다 평균을 구한 후 논리 연산자를 이용해 90점 이상~100점 이하라면 true를 출력, 아니라면 false를 출력하라.
        int student1 = 90;
        int student2 = 95;
        int student3 = 81;
        int aver = (student1 + student2 + student3) / 3;

        System.out.println(aver >= 90 && aver <= 100);



        System.out.println("========예시 문제=========");
        /* 300만원을 갖고 있는 김과장이 62만원인 지갑을 구매하려 한다. 실행되지 않는 코드의 오류를 수정해라. */

        String name = "김과장";
        int balance = 3000000;
        int walletPrice = 620000;

        String result0 = (balance >= walletPrice) ? name + " 님의 결제가 진행되었습니다. " :
                name + " 님의 남은 잔고" + (long) (balance - walletPrice) + "잔액 부족으로 결제가 진행되지 않았습니다.";

        System.out.println(result0);

        System.out.println("========예시 문제=========");
//        시험과목 3개의 점수가 50,40,60이다 평균 40을 넘기면 합격 못넘기면 불합격 출력
        int score1 = 50;
        int score2 = 40;
        int score3 = 60;
        int average = (score1 + score2 + score3) / 3;
        String excellent = (average >= 40)? "합격" : "불합격";
        System.out.println(excellent);
    }
}