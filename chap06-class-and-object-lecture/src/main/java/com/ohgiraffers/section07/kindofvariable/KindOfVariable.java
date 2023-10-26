package main.java.com.ohgiraffers.section07.kindofvariable;

public class KindOfVariable {

    /*
    * 클래스 영역에 작성하는 변수를 필드라고 한다.
    * 필드 == 멤버변수(클래스가 가지는 멤버라는 의미) == 전역변수(클래스 전역에서 사용할 수 있는 변수라는 의미)
    * */

    // non-static field를 인스턴스 변수라고 한다.

    private int globalNum;

    // static field를 정적필드(클래스변수)라고 한다. (정적(클래스) 영역에 생성되는 변수라는 의미이다.)

    private static int staticNum;

    private void testMethod(int num){ // 매개변수 내에서 사실상 num이 선언된 것이다.
    /*
    * 메소드 영역에서 작성하는 변수를 지역변수라고 한다.
    * 메소드의 괄호 안에 선언하는 변수를 매개변수라고 한다.
    * 매개변수도 일종의 지역변수로 생각하면 된다.
    * 지역변수와 매개변수 모두 메소드 호출 시 stack을 할당받아 stack생성된다.
    * */
    int localNum;
        System.out.println(num);
//        System.out.println(localNum); // 지역변수는 반드시 초기화해주어야 한다.(어떤 쓰레기 값이 있을지 모른다.)
        System.out.println(globalNum); // 전역변수는 기본값으로 초기화가 된다.
        System.out.println(staticNum);
    }

    public void testMethod2(){
//        System.out.println(localNum);
        System.out.println(globalNum);
        System.out.println(staticNum);
    }

}
