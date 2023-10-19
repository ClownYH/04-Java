package main.java.com.ohgiraffers.section04.scanner.Quiz;

import main.java.com.ohgiraffers.section04.scanner.Quiz.Quiz2;

public class Quiz1 {
    public static void main(String[] args){

//        다음은 로그인 화면의 일부이다. 코드의 오류를 수정해라.
//        1. 메인 실행 클래스 폴더 경로: src/Quiz/Quiz1.java
//        2. 부가 기능 실행 클래스 폴더 경로: src/Quiz/Quiz2.java
//        3. 외부 클래스 파일은 Quiz2 이외엔 사용하지 않는다.
//        4. 출력 결과: 환영합니다, vip 회원 김과장 님!
        int age = 30;
        String personName = "김과장";
        Quiz2 quiz2 = new Quiz2();
        String result = quiz2.isAdult(age, personName);

        System.out.println("환영합니다, " + result + " 회원 " + personName + " 님!");


    }
}
