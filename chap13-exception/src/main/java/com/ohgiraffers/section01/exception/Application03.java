package main.java.com.ohgiraffers.section01.exception;

public class Application03 {

    public static void main(String[] args){
        ExceptionTest et = new ExceptionTest();

        try{
            et.checkedEnoughMoney(5000, 10000);
            System.out.println("상품 구매 완료");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");
    }
}
