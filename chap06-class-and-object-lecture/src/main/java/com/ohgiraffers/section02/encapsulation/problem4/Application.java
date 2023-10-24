package main.java.com.ohgiraffers.section02.encapsulation.problem4;

public class Application {
    public static void main(String[] args){

        /* 접근제어자의 필요성 */
        Monster monster = new Monster();
        monster.setKind("프랑켄슈타인");
        monster.setHp(500);
        System.out.println(monster.getHp() + " " + monster.getKind());
        System.out.println(monster instanceof Object); // instanceof 서로 같은 자료형인지 확인하는 용도이다.
        System.out.println(monster.toString()); // 출력값의 패키지 루트를 확인해 구별한다. 이런 println() 출력은 사실 println(Object명.toString())이 생략된 상태이다.
    }
}
