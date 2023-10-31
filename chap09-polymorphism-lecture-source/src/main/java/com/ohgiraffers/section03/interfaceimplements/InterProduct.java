package main.java.com.ohgiraffers.section03.interfaceimplements;

import java.io.Serializable;
public interface InterProduct extends Serializable{
    /*
    * 인터페이스가 인터페이스로 상속받을 시에는 extends 키워드를 이요하며
    * 이 때는 여러 인터페이스를 다중 상속 받을 수 있다.
    * */

    /*
    * 인터페이스는 상수 필드만 작성이 가능하다.
    * public static final 제어자 조합을 상수 필드라고 부른다.
    * 반드시 선언과 동시에 초기화를 해줘야 한다.
    * 이유) 인터페이스는 생성자가 없기 때문
    * */
    public static final int MAX_NUM = 100;

    // 인터페이스는 상수 필드만 가질 수 있기 때문에 모든 필드는 묵시적으로 public static final이 된다.
    int MIN_NUM = 10;

    // 인터페이스는 생성자를 가질 수 없다.
    // 인터페이스를 사용하는 목적은 추상 메서드를 묶어서 제공하기 위함이다.
    // 그렇기 때문에 INTERFACE를 생성하여 사용하는 일이 없이 어딘가에 상속하여 구현 후 사용하게 된다.
//    public InterProduct(){}

    // 추상 메서드는 몸체를 갖지 않기 때문에 오류가 발생된다.
//    public abstract void nonStaticMethod(){}

    public abstract void nonStaticMethod();
    /*
    * 인터페이스 안에 작성한 메서드는 묵시적으로 public abstract의 의미를 가진다. (다른 접근제한자 사용불가)
    * 따라서 인터페이스의 메서드를 오버라이딩 하는 경우
    * 반드시 접근 제한자를 public으로 해야 오버라이딩이 가능하다.
    * */
    void abstMethod();

    // static 키워드를 이용하여 작성하는 경우 가능하다. (jdk 1.8 추가된 기능)
    public static void staticMethod(){
        System.out.println("InterProduct 클래스의 static Method 호출");
    }

    // default 키워드를 이용하여 작성하는 경우 가능하다. (jdk 1.8 추가 기능)
    public default void defaultMethod(){
        System.out.println("InterProduct 클래스의 default 메서드");
    }
}
