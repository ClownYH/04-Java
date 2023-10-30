package main.java.com.ohgiraffers.section01.understand.car;

public class ElectricCar extends Car{

    private String carName;

    private String energy;

    public ElectricCar(String brand, int price, String carName, String energy) {
        super(brand, price); // 부모가 기본 생성자를 갖지 않기 때문에 따로 만들어줘야 한다. 그렇지 않으면 에러가 난다.
        this.carName = carName;
        this.energy = energy;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getEnergy() {
        return energy;
    }

    public void setEnergy(String energy) {
        this.energy = energy;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "carName='" + carName + '\'' +
                ", energy='" + energy + '\'' +
                '}';
    }
}
