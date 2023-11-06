package main.java.com.ohgiraffers.section01.exception;

public class ExceptionTest {

    public void checkedEnoughMoney(int price, int money) throws Exception{ // throws : 호출한 쪽에서 처리
        System.out.println("가지고 있는 돈은 " + money + "원 입니다.");

        if(money >= price){
            System.out.println("상품을 구입하기 위한 금액이 충분합니다.");
        }else {
            throw new Exception(); // 예외를 강제화, 플로우를 멈추기 위해 이렇게 씀. return은 동작이 정상적으로 이루어졌다는 전제로 다음 동작이 실행 되버린다.
        }
        System.out.println("즐쇼~");
    }
}
