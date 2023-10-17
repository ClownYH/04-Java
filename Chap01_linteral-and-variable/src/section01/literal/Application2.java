package section01.literal;

public class Application2 {
    public static void main(String[] args){
        /* 수업 목표. 정수 리터럴 연산 형식의 값을 직접 연산한다. */

        /*
        * 1. 123 + 456
        * 2. 123 - 456
        * 3. 123 * 456
        * 4. 40 / 10
        * 5. 10 % 2
         */

        System.out.println(123 + 456);
        System.out.println(123 - 456);
        System.out.println(123 * 456);
        System.out.println(40 / 10);
        System.out.println(10 % 2); //몫 연산, 나누기한 후 나머지

        System.out.println("---------------");
        /*실수와 실수 리터럴 연산 */
        /*
        * 1. 1.23 + 1.23
        * 2. 1.23 - 1.23
        * 3. 1.23 * 1.23
        * 4. 1.23 / 1.23
        * 5. 1.23 % 1.23
         */
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 1.23);
        System.out.println(1.23 * 1.23);
        System.out.println(1.23 / 1.23);
        System.out.println(1.23 % 1.23);


        System.out.println("---------------");
        /* 정수와 실수 연산 */
        /*
         * 1. 1 + 0.5
         * 2. 1 - 0.5
         * 3. 1 * 0.5
         * 4. 1 / 0.5
         * 5. 1 % 1.0
         */
        System.out.println(1 + 0.5); //자동 형변환 실수가 정수보다 범위가 크기 때문
        System.out.println(1 - 0.5);
        System.out.println(1 * 0.5);
        System.out.println(1 / 0.5);
        System.out.println(1 % 1.0);

        System.out.println("-------문자와 문자의 연산--------");
        /* 목차 2. 문자의 연산 */
        /* 목차 2-1. 문자와 문자의 연산*/
        /* 필기. 문자끼리의 연산도 사칙연산에 mod 연산까지 가능하다. */
        /* 설명. 지금은 계산 결과가 왜 이렇게 나왔는지 보다 연산이 사용 가능하다는 것에 집중하자!! */
        // ('a' + 'b');
        // ('a' - 'b');
        // ('a' * 'b');
        // ('a' / 'b');
        // ('a' % 'b');
        System.out.println('a' + 'b'); //기본적으로는 문자형이지만, 연산시는 숫자형으로 계산(아스키 코드 표 참조, 외워 쓰는 거 아님)
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        /* 목차 2-2. 문자와 정수의 연산 */
        /* 필기. 문자에 정수를 연산하는 것도 가능하다. */
		/* 설명.
		 *  이 쯤 되면 문자 'a'는 숫자 97과 같다라는 것을 알 수 있다.
		 *  컴퓨터는 문자를 인식하지 못하고 숫자로만 인식할 수 있기 때문에, 모든 문자에 대응되는 숫자들이 매칭이 되어 있다. (아스키코드와 유니코드)


        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 2);
        System.out.println('a' / 2);
        System.out.println('a' % 2);

        /* 목차 3-2. 문자열과 다른 형태의 값 연산 */
        /* 필기. 문자열과의 연산은 '+' 연산만 가능하다. */
        /* 필기. 연산 결과는 다른 형태의 값들과도 문자열로 취급하여 문자열 이어붙이기(문자열 합치기) 결과가 나오게 된다. */
        System.out.println("================ 문자열과 다른 형태의 값 연산 ====================");
        /* 목차 3-2-1. 문자열과 정수의 연산 */
        System.out.println("hello" + 1004); //자동 형변환, 문자열이 가장 큰 표현체계이므로 둘 다 문자열로 인식
        System.out.println("hello" + 123);
        /* 목차 3-2-2. 문자열과 실수의 연산 */
        System.out.println("hello" + 123.456);
        /* 목차 3-2-3. 문자열과 문자의 연산 */
        System.out.println("hello" + 'a');
        /* 목차 3-2-4. 문자열과 논리값의 연산 */
        System.out.println("hello" + true); //불리언 타입은 문자열을 제외한 어느 것과도 연산이 안됨


        System.out.println("123" + "456");

        /* 논리값 연산 */
        /* 4-1. 논리값과 논리값 연산 */
//        System.out.println(true + false);
//        System.out.println(true + 1);
        System.out.println(true + "false");
        System.out.println("안녕" + 'f' + 'a' + 'l' + 's'+ 'e');

    }
}
