package main.java.com.ohgiraffers.section01.exception;

public class Application02 {

    public static void main(String[] args){
        ExceptionTest et = new ExceptionTest();

        try {
            et.checkedEnoughMoney(100000, 100);

        }catch (Exception e){ // throws로 던지는 에러를 확인해야 catch로 받을 에러를 정할 수 있다.
            e.printStackTrace();
            System.out.println("에러 발생");
        }

        System.out.println("프로그램 종료");

    }
}
