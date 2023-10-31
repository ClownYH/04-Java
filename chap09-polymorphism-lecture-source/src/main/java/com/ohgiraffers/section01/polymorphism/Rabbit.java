package main.java.com.ohgiraffers.section01.polymorphism;

public class Rabbit extends Animal{

    @Override
    public void eat() {
//        super.eat(); // super를 this로 바꾸면 run time exception 오류가 난다. 스스로의 eat를 호출해 반복한다.
        System.out.println("토끼가 풀을 뜯어 먹고 있습니다.");
    }

    @Override
    public void run() {
        System.out.println("토끼가 달려갑니다. 깡총 깡총~~");
    }

    @Override
    public void cry() {
        System.out.println("토끼가 울음소리를 냅니다.");
    }

    public void jump(){
        System.out.println("토끼가 점프를 합니다.");
    }
}
