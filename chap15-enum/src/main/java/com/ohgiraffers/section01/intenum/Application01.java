package main.java.com.ohgiraffers.section01.intenum;

import javax.security.auth.Subject;

public class Application01 {

    public static void main(String[] args){

        int subject1 = Subjects.JAVA;
        int subject2 = Subjects.HTML;

        if(subject1 == subject2){
            System.out.println("두 과목은 같은 과목입니다.");
        }

        int num = 0;
        String subjectText= "";
        switch (num){
            case Subjects.JAVA: subjectText = "JAVA"; break; // 동일한 값을 가진 상수가 있을 때 이런 경우 먼저 존재하는 것을 사용한다. 그래서 뒤에 것은 이용하지 않는다.
            case Subjects.ORACLE: subjectText = "ORACLE"; break;
            case Subjects.JDBC: subjectText = "JDBC"; break;
        }
        System.out.println(subjectText);
        printSubject(Subjects.ORACLE);
        printSubject(2);
    }


    public static void printSubject(int subjectNumber){
        String sbj = "";
        switch (subjectNumber){
            case Subjects.JAVA: sbj = "jAVA"; break;
            case Subjects.ORACLE: sbj = "ORACLE"; break;
            case Subjects.JDBC: sbj = "JDBC"; break;
        }
        System.out.println("subject : " + sbj);
    }
}
