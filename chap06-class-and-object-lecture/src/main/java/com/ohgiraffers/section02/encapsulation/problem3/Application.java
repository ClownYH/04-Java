package main.java.com.ohgiraffers.section02.encapsulation.problem3;

public class Application {
    public static void main(String[] args){

        Monster monster = new Monster();
        monster.setInfo("드라큘라"); // 드라큘라
        monster.setHp(10);

        Monster monster1 = new Monster();
        monster1.setInfo("미이라"); // 미이라
        monster1.setHp(1000);

        Monster monster2 = new Monster();
        monster2.setInfo("프랑켄"); // 프랑켄
        monster2.setHp(500);

        System.out.println(monster.getInfo());
        System.out.println(monster1.getInfo());
        System.out.println(monster2.getInfo());

        monster2.kinds = "삼치";
    }
}
