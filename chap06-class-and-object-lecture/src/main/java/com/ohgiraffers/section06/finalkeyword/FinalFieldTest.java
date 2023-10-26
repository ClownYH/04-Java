package main.java.com.ohgiraffers.section06.finalkeyword;

public class FinalFieldTest {

    /*
    * 필기
    * final
    * : final은 중단의 의미를 가지는 키워드이다.
    * final 키워드를 사용할 수 있는 위치는 다양한 편이며 의미가 약간 다르지만, 결국 변경은 불가의 의미이다.
    * 1. 지역변수 : 초기화 이후 값 변경 불가 final String value = "final";
    * 2. 매개변수 : 호출시 전달한 인자 변경 불가 method(final String value;)
    * 3. 전역변수 : 인스턴스 생성 후 초기화 이후에 값 변경 불가
    * 4. 클래스 (Static) 변수 : 프로그램 start 이후 값 변경 불가
    * 5. non-static 메소드 : 메소드 재작성(overriding) 불가
    * 6. static 메소드 : 메소드 재작성(overriding) 불가
    * 7. 클래스 : 상속 불가
    *
    * final은 변경 불가의 의미를 가진다.
    * 따라서 초기 인스턴스(생성된 객체)가 생성되고 나면 기본값 0이 필드에 들어가는데,
    * 그 초기화 이후 값을 변경할 수 없기 때문에 선언하면서 바로 초기화를 해 주어야 한다.
    * 그렇지 않으면 compile error가 발생한다.
    * */

//    private final int nonStaticNum1; // final 키워드는 상수가 되기 때문에 초기값을 지정해주지 않으면 에러가 난다.

    private final int NON_STATIC_NUM = 1;

    private final String NON_STATIC_NAME;

    public FinalFieldTest(String nonStaticName){ // 기본생성자를 자동으로 생성하지 않기 때문에 만들어줘야 하는 유형
        this.NON_STATIC_NAME = nonStaticName;
    }

//    private static final int STATIC_NUM; // static 영역에 미리 올리는 유형이기 때문에 이미 생성되기 때문에 이런 식으로는 불가

//    public FinalFieldTest(int nonStaticNum){
//        this.NON_STATIC_NUM = nonStaticNum;
//    }
    private static final int STATIC_NUM = 10;

    private static final double STATIC_DOUBLE;

    static {
        STATIC_DOUBLE = 10.0;
    } // 이렇게 쓰면 static 영역에 같이 올라가기 때문에 final로 지정해도 에러가 나지 않는다.



}
