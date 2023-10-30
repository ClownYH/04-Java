package main.java.com.ohgiraffers.section01.extend;

public class Car {

    private boolean runningStatus;

    public Car(){
        super(); // 부모가 가진 기본 생성자를 호출. Car의 경우에는 Object가 부모이다.
        System.out.println("car 클래스의 기본 생성자를 호출함");
    }

    public void run(){
        runningStatus = true;
        System.out.println("자동차가 달립니다.");

    }

    public void soundHorn(){
        if(isRunning()){
            System.out.println("빵빵~");
        }else{
            System.out.println("주행중이 아닌 상태에서는 경적을 울릴 수 없습니다.");
        }
    }


    public boolean isRunning(){
        return runningStatus;
    }

    public void stop(){
        runningStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }
}
