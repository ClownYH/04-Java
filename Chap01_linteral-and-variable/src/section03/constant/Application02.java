package section03.constant;

public class Application02 {

    public static void main(String[] args){

        /*
        * 필기
        * 상수의 명명 규칙은 변수의 명명규칙과 컴파일 에러를 발생시키는 규칙은 동일하다.
        * 단 개자들끼리 암묵적인 규칙에 일부 차이를 보인다.
        * 1. 모든 문자는 영문자 대문자 혹은 숫자만 사용한다.
        * 2. 단어와 단어 연결은 언더스코어(_)를 사용한다.
        * */

        final int AGE1 = 10;
        final int AGE2 = 20;
        final int AGE3 = 30;

        final int MAX_AGE = 50; // 상수필드는 예외적으로 스네이크 케이스를 쓴다.
        final int maxAge = 10; // 이렇게 쓰면 일반 변수와 구별이 힘들다
    }
}
