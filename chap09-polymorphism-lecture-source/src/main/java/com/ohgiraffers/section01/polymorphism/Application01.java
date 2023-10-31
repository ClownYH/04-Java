package main.java.com.ohgiraffers.section01.polymorphism;

public class Application01 {

    public static void main(String[] args){
        /*
        * 다형성
        * 다형성이란 하나의 인스턴스가 여러 가지 타입을 가질 수 있는 것을 의미한다.
        * 그렇기 때문에 하나의 타입으로 여러 가지 타입의 인스턴스를 처리할 수 있기도 하고
        * 하나의 메소드 호출로 객체 별로 각기 다른 방법으로 동작하게 할 수 있다.
        *
        * 다형성은 객체 지향 프로그래밍 3대 특징(캡슐화, 상속, 다형성) 중 하나이며,
        * 객체지향 프로그래밍의 꽃이라고 불리울 정도로 활용성이 높고 장점이 많다.
        * 하지만 학습하기 어렵다는 단점이 있다.
        *
        * 다형성의 장점
        * 1. 여러 타입의 객체를 하나의 타입으로 관리할 수 있기 때문에 유지보수성과 생산성이 증가된다.
        * 2. 상속을 기반으로 한 기술이기 때문에 상속 관계에 있는 모든 객체는 동일한 메세지를 수신할 수 있다.
        *    이러한 동일한 메세지를 수신받아 처리하는 내용을 객체별로 다르게 할 수 있다는 장점을 가지고 있다.
        *    (다양한 기능을 사용하는데 있어서 관리해야 할 메세지 종류가 줄어들게 된다.)
        *    하나의 호출로 여러 가지 동작을 수행할 수 있다는 측면에서는 오버로딩을 다형성으로 보기도 한다.
        *    다형성을 이해하기 쉬운 가장 좋은 예이기도 하다.
        *    하지만 이 부분은 이견이 많이 존재하기 때문에 다형성을 이해하는데 함고로만 사용된다.
        * 3. 확장성이 좋은 코들르 작성할 수 있다.
        * 4. 결합도를 낮춰서 유지보수성을 증가시킬 수 있다.
        * */
        System.out.println("Animal 생성");
        Animal animal = new Animal();
        animal.cry();
        animal.eat();
        animal.run();

        System.out.println();
        System.out.println("Rabbit 인스턴스 생성");
        Rabbit rabbit = new Rabbit();
        rabbit.cry();
        rabbit.eat();
        rabbit.run();

        System.out.println();
        System.out.println("Tiger 인스턴스 생성");
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.cry();
        tiger.run();

        Animal animal1 = new Rabbit(); // Rabbit의 jump가 Animal형태에 들어가지는 않음, 그러나 Rabbit의 주소를 넣는 것이기 때문에 정보는 그대로 존재.
        Animal animal2 = new Tiger(); // Tiger의 bite가 Animal형태에 들어가지 않음, 그러나 Tiger의 주소를 넣는 것이기 때문에 정보는 그대로 존재.

//        Rabbit r1 = new Animal(); //
//        Tiger t1 = new Animal(); //

        // 런타임 단계 (실제 메모리에 액세스될 때, 즉 동작할 때)
        System.out.println("동적 바인딩");
        System.out.println(animal1.getClass()); // Animal 형태로 출력되지만, 실제값은 Rabbit의 주소를 참고한 것이다.
        animal1.cry();
        animal2.cry();


        // 동적 바인딩이 아님 컴파일 단계(실행 단계 이전에 해석 단계)
        System.out.println("클래스 타입의 형변환 확인 ----");
        ((Rabbit)animal1).jump();
        ((Tiger)animal2).bite();

        System.out.println("형변환 오류");
//        ((Tiger)animal1).bite(); // 컴파일러는 속일 수 있지만 실제 실행시 런타임 오류 발생
//        ((Rabbit)animal2).jump();

        System.out.println("instanceof 확인");
        System.out.println("animal1이 Tiger와 같은지 확인 : " + (animal1 instanceof Tiger));
        System.out.println("animal1이 Rabbit과 같은지 확인 : " + (animal1 instanceof Rabbit));
        System.out.println("animal1이 Animal과 같은지 확인 : " + (animal1 instanceof Animal));
        System.out.println("animal 이 Rabbit과 같은가 " + (animal instanceof  Rabbit));
        System.out.println("animal 이 Rabbit과 같은가 " + (animal instanceof  Tiger)); // 자료형의 크기가 다르다.

        /*
        * 클래스 형변환은 up-casting과 down-casting으로 구분할 수 있다.
        * up-casting : 상위 타입으로 형 변환
        * down-casting : 하위 타입으로 형 변환
        * 또한 작성 여부에 따라 명시적과 묵시적 두 가지로 구분된다.
        * */

        Animal animal3 = (Animal) new Rabbit(); // up-casting 명시적 형변환
        Animal animal4 = new Rabbit(); // 묵시적 형변환
        Rabbit rabbit1 = (Rabbit) new Animal(); // down-casting 명시적 형변환
//        Rabbit rabbit2 = new Animal(); // 묵시적 형변환이나 에러
    }
}
