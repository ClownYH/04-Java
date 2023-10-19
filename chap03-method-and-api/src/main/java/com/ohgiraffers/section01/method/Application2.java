package main.java.com.ohgiraffers.section01.method;

public class Application2 {
    public static void main(String[] args){
        System.out.println("Application.main() 실행");
        Application2 app2 = new Application2();

        app2.methodA();
        app2.methodB();
        app2.methodC();

    }

    public void methodA() {
        System.out.println("methodA() 호출....");

        methodB();

        System.out.println("methodA() 종료....");
    }

    public void methodB() {
        System.out.println("method B 호출");

        methodC();

        System.out.println("method B 종료..");
    }

    public void methodC() {
        System.out.println("method C 호출");
        System.out.println("method C 종료..");
    }

}

