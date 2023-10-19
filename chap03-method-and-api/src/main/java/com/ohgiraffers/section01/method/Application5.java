package main.java.com.ohgiraffers.section01.method;

public class Application5 {
    public static void main(String[] args){
        /*
        * return ?
        * 모든 메소드 내부에는 return; 이 존재한다.
        * void 메소드의 경우 return;을 명시적으로 작성하지 않아도 마지막줄에 컴파일러가 자동으로 추가해준다.
        * return은 현재 메소드를 강제 종료하고 호출한 구문으로 다시 돌아가는 명령어이다.
        *
        * 컴파일러란?
        * 특적 프로그래밍 언어로 쓰여있는 문서를 다른 프로그래밍 언어 혹은 컴퓨터 언어로 옮기는 일을 하는 프로그램
        * */

        System.out.println("main() 메소드를 시작함");

        Application5 app5 = new Application5();
        app5.testMethod();
    }

    public void testMethod(){
        System.out.println("testMethod() 동작 확인");


        // return문이 존재하나 보이지 않을 뿐이다. 만약 return문을 작성하였다면 그 이후 어떤 작업을 넣어도 에러가 난다.


    }
}
