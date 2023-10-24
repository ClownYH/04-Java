package main.java.com.ohgiraffers.section02.encapsulation.problem1;

public class Application01 {
    public static void main(String[] args){
        Monster monster = new Monster(); // class는 무조건 object이다. 생성자로 만든 새로운 것은 각각 별개의 인스턴스이다.
        System.out.println(monster.hashCode());

        monster.name = "두차"; // 해당 주소에 있는 name을 두차로 바꾼 것
        monster.hp = 200;

        System.out.println("monster name : " + monster.name);
        System.out.println("monster hp : " + monster.hp);

        Monster monster2 = new Monster();
        System.out.println(monster2.hashCode());
        monster2.name = "뿌꾸"; // 해당 주소에 있는 name을 뿌꾸로 바꾼 것
        monster2.hp = -200;
        System.out.println("monster2 name : " + monster2.name); // 값을 입력하지 않을 경우, 문자열은 null(/u0000), 그 외에는 초기값으로 표기
        System.out.println("monster2 hp : " + monster2.hp);

        Monster monster3 = new Monster();
        monster3.name = "드라큘라";
        monster3.setHp(-200);
        System.out.println("monster3 name : " + monster3.name);
        System.out.println("monster3 hp : " + monster3.hp);

        Monster monster4 = new Monster();
        monster4.name = "프랑켄";
        monster4.setHp(1000);
        System.out.println("monster4 name : " + monster4.name);
        System.out.println("monster4 hp : " + monster4.hp);
    }
}
