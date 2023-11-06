package main.java.com.ohgiraffers.section02;

import main.java.com.ohgiraffers.section02.exception.MoneyNegativeException;
import main.java.com.ohgiraffers.section02.exception.NotEnoughMoneyException;
import main.java.com.ohgiraffers.section02.exception.PriceNegativeException;

public class ExceptionTest {

    public void checkedEnoughMoney(int price, int money)
            throws PriceNegativeException, MoneyNegativeException, NotEnoughMoneyException  {
        // throws : 호출한 쪽에서 처리


            System.out.println("가지고 있는 돈은 " + money + "원 입니다.");

            if (price < 0) {
                throw new PriceNegativeException("상품 가격은 음수일 수 없습니다.");
            }

            if (money < 0) {
                throw new MoneyNegativeException("가지고 있는 돈은 음수일 수 없습니다.");
            }

            if (money < price) {
                throw new NotEnoughMoneyException("가진 돈 보다 상품 가격이 더 비쌉니다.");
            }

            System.out.println("즐쇼~");

    }
}