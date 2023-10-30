package main.java.com.ohgiraffers.section01.understand.employee;

import main.java.com.ohgiraffers.section01.understand.car.ElectricCar;
import main.java.com.ohgiraffers.section01.understand.car.OldCar;

public class Seller {

    private String name;

    private int result; // 판매 수당

    public Seller(String name){
        this.name = name;
    }

//    public void sale(){
//
//    }

    public void oldCarSale(OldCar[] oldCar){
        for (OldCar car : oldCar) {
            result += car.getPrice();
        }
    }

    public void ElectronicCarSale(ElectricCar[] car){
        for (ElectricCar electricCar : car) {
            result += electricCar.getPrice();
        }
    }
    @Override
    public String toString() {
        return name + " 사원의 이번달 월급은 result = " + result;
    }
}
