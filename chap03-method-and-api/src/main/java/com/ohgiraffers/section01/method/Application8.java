package main.java.com.ohgiraffers.section01.method;

public class Application8 {
    public static void main(String[] args){
        /*
        * static 메서드
        *
        * static 메서드를 표출하는 방법
        * 클래스.메소드명();
        * */
        //권장하지 않는 방식
        Application8 app1 = new Application8();

        int result = app1.sumToNumbers(1, 2); // static 필드에서는 권장하지 않는 방식이다. 중복에 대한 오류 가능성, 오히려 성능 저하


        int result2 = Application8.sumToNumbers(1, 2); // 프로그램을 시작하기 전부터 이미 static 영역에 미리 올려놨기 때문


    }

    public static int sumToNumbers(int num1, int num2){ // static 을 넣었기 때문에 static 영역에 미리 올려놨기 때문
        return num1 + num2;
    }

    public void test(){ // static에 올려놓지 않았기 때문에 따로 생성자를 이용해야 한다.
        System.out.println("dfdfdf");
    }
}
