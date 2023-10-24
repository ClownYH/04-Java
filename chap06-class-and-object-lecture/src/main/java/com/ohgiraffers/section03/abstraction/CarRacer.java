package main.java.com.ohgiraffers.section03.abstraction;

public class CarRacer {

    private final Car car = new Car();


    /**
     * this.car의 시동을 거는 메서드
     * 시동을 거는 메서드
     * @return void
     */
    public void startUp(){
        car.startUp();
    }

    /**
     * this.car go 메서드를 호출하여 앞으로 가는 기능
     * @return void
     */
    public void stepAccelator(){
        car.go();
    }

    /**
     * this.car.stop() 메서드를 호출하여 자동차를 멈춘다.
     */
    public void setUpBreak(){
        car.stop();
    }

    /**
     * this.car.turnOff() 메서드를 호출하여 시동을 끈다.
     */
    public void turnOff(){
        car.turnOff();
    }
}
