package main.java.com.ohgiraffers.section02.enumtype;

public enum Subjects { // 상수 열거 필드라고도 부른다. 상수필드의 값을 정의하지 않았을 때 스스로를 사용한다. 권한을 설정할 때 많이 쓰인다.
    JAVA(0),
    ORACLE(1),
    JDBC(2),
    HTML(3),
    CSS(4),
    JAVASCRIPT(5);

    private int value; // 이런 선언이 생기면 기존 상수 나열의 마지막에 세미콜론으로 마쳐줘야 한다.

    Subjects(int value) { // enum에서 기본 생성자를 생성하면 기존의 상수 열거 필드는 하나 하나 자료형을 맞춰 value를 넣어줘야 한다.
        this.value = value;
    }
}
