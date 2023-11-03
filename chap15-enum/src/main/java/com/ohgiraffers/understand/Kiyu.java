package main.java.com.ohgiraffers.understand;

public class Kiyu {

    int money;

    int hp;

    public int getMoney() {
        return money;
    }

    public void setMoney(int cash) {
        this.money += cash;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int damage) {
        this.hp += hp;
        if(this.hp > 100){
            this.hp = 100;
        } else if (this.hp < 0) {
            System.out.println("기유 트레이너가 쓰러졌습니다. 119를 불러주세요.");
        }
    }
}
