package main.java.com.ohgiraffers.section05.parameter;

public class Application {

    public static void main(String[] args){
        ParameterTest pt = new ParameterTest();

        int num = 20; // 변수값은 직접 주소값에 영향을 주지 못한다.
        pt.testPrimaryTypeParameter(num);
        int[] iarr = new int[]{1,2,3,4,5,6,7}; // int 배열 또한 하나의 객체로 본다.(주소값을 공유)
        System.out.println("인자로 전달받은 값 : " + iarr[0]);
        pt.testPrimaryTypeArrayParameter(iarr);
        System.out.println("전달 후 iarr의 값 : " + iarr[0]);

        System.out.println();

        RectAngle r1 = new RectAngle(12.5, 22.5); // 생성자는 반환 타입이 없다. 클래스 이름을 그대로 따라간다.
        System.out.println("인자로 전달하는 r1의 값 : " + r1);
        pt.testClassTypeParameter(r1);

        System.out.println("변경 후 사각형의 넓이와 둘레 : ");
        r1.calcRound();
        r1.calcArea();

        // 가변 인자 : 있을 수도 있고 없을 수도 있다.
        pt.testVariableLengthArrayParameter("홍길동"); // ...hobby는 가변 인자이기 때문에 매개변수에 값을 넣어주지 않아도 가능
        pt.testVariableLengthArrayParameter("홍길동", "농구", "헬스", "무에타이", "뮤지컬");

        test(10, 20, 30, 40);
        test(10);
    }

    public static void test(int ...num){ // 가변 배열은 맨끝에 순서를 둬야 한다.
        System.out.println(num.length);
        System.out.println(num); // 가변 배열은 length를 먼저 재서 그만큼의 칸을 가진 배열을 만들고 그 안에 값을 집어넣는다.
        // 배열이 되었기 때문에 그냥 출력하면 주소값이 나온다.
    }
}
