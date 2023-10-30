package main.java.com.ohgiraffers.section01.understand.car;

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

    @Override
    public String toString() {
        return "OldCar{" +
                "name='" + name + '\'' +
                ", oilType='" + oilType + '\'' +
                '}';
    }
}
