package main.java.com.ohgiraffers.section01.understand.car;

/*
* 내연 기관 자동차의 경우 동일하게
* brand 명과 가격을 갖는다.
*
* */
public class OldCar extends Car{

    private String name;

    private String oilType;

    public OldCar(String brand, int price, String name, String oilType) {
        super(brand, price);
        this.name = name;
        this.oilType = oilType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOilType() {
        return oilType;
    }

    public void setOilType(String oilType) {
        this.oilType = oilType;
    }

    /* 내연기관 자동차의 경우
    * 판매 수수료가 10%이기 때문에
    * 판매가 * 0.1을 해준다. */
    @Override
    public double getPrice() {
        System.out.println("내연기관 자동차의 판매가는 " + super.getPrice() + "원 입니다.");
        return super.getPrice() * 0.1;
    }


    @Override
    public String toString() {
        return "OldCar{" +
                "name='" + name + '\'' +
                ", oilType='" + oilType + '\'' +
                '}';
    }
}
