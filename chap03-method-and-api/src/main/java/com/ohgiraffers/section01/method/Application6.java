package main.java.com.ohgiraffers.section01.method;

public class Application6 {
    public static void main(String[] args){
        /*
        * 메소드 리턴값 테스트
        * 메소드는 항상 마지막에 return 명령어가 존재한다.
        * return은 자신을 호출한 구문으로 복귀하는 것을 의미한다.
        * 복귀를 할 때는 그냥 복귀할 수도 있지만, 값을 가지고 복귀할 수도 있다.
        * 이 때 가지고 가는 값을 리턴값이라고 한다.
        *
        * return 값을 반환받기 위해서는 메소드 선언부에 리턴 타입을 명시해주어야 한다.
        * void는 아무 반환값도 가지지 않겠다는 리턴아비에 사용할 수 있는 키워드이다.
        * 반환값이 없는 경우 return을 생략해도 컴파일러가 자동으로 추가하지만,
        * 반환값이 있는 경우 return 구문을 반드시 명시적으로 작성하여야 한다.
        * 또한 메서드 선언부에 선언한 리턴타입 반환값의 자료형은 반드시 일치해야 한다.
        * */

        System.out.println("main() 메소드 시작함/...");

        /*
        * 메소드 작성 후 호출을 해보면 아무런 변화가 없으나 호출을 한 것이다. */
        Application6 app6 = new Application6();
        String returnValue = app6.test();
        System.out.println(returnValue + " 가 함수에서 전달한 값이 맞나요?");

        Application6 app2; // 메모리에 공간을 할당
        app2 = app6.appMethod(); // app2 주소에 new Appliacation6(); 형성
        System.out.println(app2);
    }
    public Application6 appMethod(){

        return new Application6();
    }

    public String test(){
        return "Hello World"; // void가 아니기 때문에 return 값을 명시해줘야 한다.

    }
}
