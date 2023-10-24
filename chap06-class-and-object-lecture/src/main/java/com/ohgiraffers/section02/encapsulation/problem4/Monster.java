package main.java.com.ohgiraffers.section02.encapsulation.problem4;

public class Monster { // 필드는 여기서 선언된 변수
    /*
    * 접근제한자
    * 클래스 혹은 클래스의 멤버에 참조연산자로 접근할 수 있는 범위를 제한하기 위한 키워드이다.
    * 1. public : 모든 패키지에 접근 허용.
    * 2. protected : 동일 패키지에 접근 허용. 단, 상속 관계에 있는 경우 다른 패키지에도 접근 가능
    * 3. default : 동일 패키지에서만 접근 허용.(기본 값으로 작성하지 않은면 default 접근 제한을 갖는다.)
    * 4. private : 해당 클래스 내부에서만 접근을 허용.
    *
    * 위의 네 가지 접근 제한자는 클래스의 멤버(필드, 메소드)에 모두 사용이 가능하다.
    * 단 클래스 선언 시 사용하는 접근 제한자는 public과 default만 사용이 가능하다.
    * 핃드 : 클래스에 선언된 변수
    * 멤버 : 클래스에 정의된 모든 속성을 의미 (필드 + 메소드)
    * */
    private String kind; // private 로 생성한 클래스는 같은 클래스 내에서만 참조 가능, 직접 접근 불가
    private int hp;

    public void setKind(String kind){ // setter를 선언해 간접 접근

        this.kind = kind;
    }

    public void setHp(int hp){
        if(hp > 0){
            this.hp = hp;
        }else{
            this.hp = 0;
            System.out.println("몬스터는 체력이 0보다 적으면 죽습니다.");
        }

    }

    public String getKind(){ // getter를 선언해 간접 접근
        return this.kind;
    }

    public int getHp(){
        return this.hp;
    }

    @Override // 덮어씌우기, 부모의 자료형을 자식에게도 적용
    public String toString(){
        return "입력한 종류는 " + kind + "이고 " + hp + " 입니다.";
    }
}
