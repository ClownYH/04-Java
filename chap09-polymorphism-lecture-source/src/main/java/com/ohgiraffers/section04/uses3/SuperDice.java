package main.java.com.ohgiraffers.section04.uses3;

public class SuperDice implements Dice{
    private int min;
    private int max;
    public SuperDice(){
        this.max = 10;
        this.min = 1;
    }

    @Override
    public int getNumber() {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
