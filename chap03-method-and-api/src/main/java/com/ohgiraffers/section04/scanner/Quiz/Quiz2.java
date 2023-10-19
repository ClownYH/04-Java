package main.java.com.ohgiraffers.section04.scanner.Quiz;

public class Quiz2 {
    public String isAdult(int age, String personName) {

        return (age <= 14) ? "14세 미만은 회원가입할 수 없습니다." : yesAdult(personName);
    }

    public String yesAdult(String personName) {
        return personName.equals("김과장") ? "vip" : personName.equals("박부장") ? "기존" : "신규";
    }
}
