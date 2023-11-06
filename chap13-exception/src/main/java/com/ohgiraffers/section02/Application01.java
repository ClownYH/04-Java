package main.java.com.ohgiraffers.section02;

import main.java.com.ohgiraffers.section02.exception.MoneyNegativeException;
import main.java.com.ohgiraffers.section02.exception.NotEnoughMoneyException;
import main.java.com.ohgiraffers.section02.exception.PriceNegativeException;

public class Application01 {

    public static void main(String[] args){
        ExceptionTest et = new ExceptionTest();
        try{
            et.checkedEnoughMoney(1000, 5000);
        }catch (PriceNegativeException e){
            System.out.println("PriceNegativeException 발생");
            System.out.println(e.getMessage());
        }catch (MoneyNegativeException e){
            System.out.println("MoneyNegativeException 발생");
            System.out.println(e.getMessage());
        }catch (NotEnoughMoneyException e){
            System.out.println("NotEnoughMoneyException 발생");
            System.out.println(e.getMessage());
        }
    }
}
