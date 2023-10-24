package main.java.com.ohgiraffers.section03.dto;

public class MemberDTO {
    /*
    * DTO(Data Transfer Object)의 약자로 계층간의 데이터 전송을 위해 도메인 모델 대신 사용되는 객체이다. */

    private int number; // 회원 정보
    private String name; // 회원 이름
    private int age;  // 회원 나이
    private char gender; // 회원 성별
    private double weight; // 몸무게
    private boolean isActivated; // 활동 상태

    // DTO는 getter setter를 자주 쓰는 편이다. 그러나 getter setter로 해결되지 않는 경우도 있다.

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }
}
