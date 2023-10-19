package main.java.com.ohgiraffers.section01.method;

public class Application1 { //
    // 이게 클래스
    public static void main(String[] args) { //이게 메소드, static : 프로그램을 실행할 때 미리 메모리에 적재하는 것

        /*
         * 메소드란?
         * 메소드(method)는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
         * */
        System.out.println("main()메서드 시작됨...");

        Application1 app1; // 메모리 공간을 확보
        app1 = new Application1(); // app1이 가진 주소에 Application1이 가진 속성을 할당
        // 생성자 new를 통해 메모리에, 새로운 Application1을 생성해서 클래스 app1라는 주소에 집어넣음, 주소가 다르면 동일한 형태여도 다른 존재
        // 이때 methodA, B, C 모두 함께 생성

        System.out.println("hashCode : " + app1.hashCode());

        Application1 app2 = new Application1();
        System.out.println("hashCode : " + app2.hashCode());
        // app1과 app2는 별개의 주소이기 때문에 동일한 변수여도 다른 값을 갖을 수 있다.

        System.out.println("============================");

        app1.methodA(); //app1 주소에 있는 메서드A를 실행함으로 static의 영향을 받을 수 있기 때문에 정상 실행됨

//        메서드a // 메서드는 일회성이다. 실행 후 소멸한다.
    }

//    메서드a(){
//        메서드b(){ // 이런 식으로 메서드 안에 메서드는 불가능하다.
//
//        }
//    }

    public void methodA() { // public : 누구나 쓸 수 있는 접근 제어자, void : 반환하지 않는다라는 반환 타입, methodA : 메서드 이름
        //() : 함수의 시그니처 부분, 매우 많이 따진다.
        System.out.println("methodA() 호출....");

        methodB();

        System.out.println("methodA() 종료....");
        // 프로그램은 원래 return 문이 있어야 종료한다. 단 이 메서드는 void이기 때문에 return을 요구하지 않음.
    }

    public void methodB() {
        System.out.println("method B 호출");

        methodC();

        System.out.println("method B 종료..");
    }

    public void methodC() {
        System.out.println("method C 호출");
        System.out.println("method C 종료..");
    }
}
