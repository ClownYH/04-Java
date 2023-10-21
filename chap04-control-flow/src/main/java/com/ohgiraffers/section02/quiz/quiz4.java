package main.java.com.ohgiraffers.section02.quiz;

import java.util.Scanner;

public class quiz4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        /*<백준 문제>
        백준 조건문 7단계 문제 일부 수정*/

/*
3개의 주사위를 던져서 상금을 받는 게임 프로그램을 제작한다.

3개 모두 같은 눈이라면  20,000원+(눈의 숫자) × 2,000원의 상금을 받게 된다.
3개 중 2개가 같은 눈이라면  1,500원+(눈의 숫자) × 100원의 상금을 받게 된다.
모두 다른 숫자의 눈이라면 “꽝”을 출력한다.

게임 프로그램을 작성하시오.

1. if 조건문을 1회 이상 사용해야 한다.
2. 입력한 내용이 ‘굴리기’가 아니라면 다음과 같이 실행한다.
System.out.println("주사위를 굴리지 않아 프로그램을 종료합니다.");
3. 6면체 주사위 코드는 다음과 같다.
return (int) (Math.random() * 6) + 1;

[출력 내용 예시 (주사위 숫자가 모두 다른 경우)]
===주사위 게임을 시작합니다.===
첫 번째 주사위를 굴립니다 '굴리기'를 입력하세요.
굴리기(사용자 입력)
첫 번째 주사위: 3
두 번째 주사위를 굴립니다 '굴리기'를 입력하세요.
굴리기(사용자 입력)
두 번째 주사위: 4
세 번째 주사위를 굴립니다 '굴리기'를 입력하세요.
굴리기(사용자 입력)
세 번째 주사위: 2
꽝!
*/
        System.out.println("===주사위 게임을 시작합니다.===");
        System.out.println("===========================");

        int a = 0;
        int b = 0;
        int c = 0;

        for(;;){

            System.out.println("첫 번째 주사위를 굴립니다 '굴리기'를 입력하세요.");

            String first = scanner.next();
            a = (int)(Math.random() * 6) + 1;

            if(first.equals("굴리기")){

                System.out.println("===========================");
                System.out.println(a);
                System.out.println("===========================");
                System.out.println("두 번째 주사위를 굴립니다 '굴리기'를 입력하세요.");

                String second = scanner.next();
                b = (int)(Math.random() * 6) + 1;

                if(second.equals("굴리기")){

                    System.out.println("===========================");
                    System.out.println(b);
                    System.out.println("===========================");
                    System.out.println("세 번째 주사위를 굴립니다 '굴리기'를 입력하세요.");

                    String third = scanner.next();
                    c = (int)(Math.random() * 6) + 1;

                    if(third.equals("굴리기")){

                        System.out.println("===========================");
                        System.out.println(c);
                        System.out.println("===========================");
                        if(a == b){
                            if(a == c){ // a,b,c
                                System.out.println("세 개 전부 성공하셨어요! 축하합니다!!");
                                System.out.println("상금 " + (20000 * (a + b + c)) * 2000 + "원을 획득하셨습니다.");
                                return;
                            }else{ // a, b
                                System.out.println("두 개 맞추셨네요. 축하합니다.");
                                System.out.println("상금 " + (15000 * (a + b + c)) * 100 + "원을 획득하셨습니다.");
                                return;
                            }
                        }else if(a == c){
                            if(a != b){ // a, c
                                System.out.println("두 개 맞추셨네요. 축하합니다.");
                                System.out.println("상금 " + (15000 * (a + b + c)) * 100 + "원을 획득하셨습니다.");
                                return;
                            }
                        }else if(b == c){ // b, c
                            if(a != b){
                                System.out.println("두 개 맞추셨네요. 축하합니다.");
                                System.out.println("상금 " + (15000 * (a + b + c)) * 100 + "원을 획득하셨습니다.");
                                return;
                            }
                        }else{ // 모두 다른 값일 경우
                            System.out.println("꽝!");
                            System.out.println("다음 기회에~");
                            return;
                        }

                    }else{
                        System.out.println("주사위를 굴리지 않아 프로그램을 종료합니다.");
                        return;
                    }
                }else{
                    System.out.println("주사위를 굴리지 않아 프로그램을 종료합니다.");
                    return;
                }

            }else{
                System.out.println("주사위를 굴리지 않아 프로그램을 종료합니다.");
                return;
            }
        }

    }
}
