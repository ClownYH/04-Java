package main.java.com.ohgiraffers.section02.encapsulation.problem2;

public class Application01 {
    /*
    * 참조 자료형의 필드가 변경되는 경우 직접 참조를 하는 필드의 모든 값을 변경해야 하는 문제가 발생한다.
    * */

    public static void main(String[] args){
        Monster monster = new Monster(); // class는 무조건 object이다. 생성자로 만든 새로운 것은 각각 별개의 인스턴스이다.
        System.out.println(monster.hashCode());

        monster.kind = "두차";
        monster.hp = 200;

        System.out.println("monster name : " + monster.kind);
        System.out.println("monster hp : " + monster.hp);

        Monster monster2 = new Monster();
        System.out.println(monster2.hashCode());
        monster2.kind = "뿌꾸"; // 해당 주소에 있는 name을 뿌꾸로 바꾼 것
        monster2.hp = -200;
        System.out.println("monster2 name : " + monster2.kind); // 값을 입력하지 않을 경우, 문자열은 null(/u0000), 그 외에는 초기값으로 표기
        System.out.println("monster2 hp : " + monster2.hp);

        Monster monster3 = new Monster();
        monster3.kind = "드라큘라";
        monster3.setHp(-200);
        System.out.println("monster3 name : " + monster3.kind);
        System.out.println("monster3 hp : " + monster3.hp);

        Monster monster4 = new Monster();
        monster4.kind = "프랑켄";
        monster4.setHp(1000);
        System.out.println("monster4 name : " + monster4.kind);
        System.out.println("monster4 hp : " + monster4.hp);
    }
}
