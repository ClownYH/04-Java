package section04.overflow;

public class Application01 {

    public static void main(String[] args){
        /*
        * 자료형 별 값의 최대 범위를 벗어나는 경우
        * 발생한 carry를 버림처리하고 sign bit를 반전시켜 최소값으로 순환시킴
        * */

        byte num1 = 127; // byte는 값의 최대 범위가 -128~127 까지다

        System.out.println("num1 : " + num1);
        num1++; // 127 + 1
        System.out.println(num1); //byte의 양수 표현값을 넘어 -128로 돌아간다.

        /*
        * 언더 플로우
        * 오버플로우와 반대 개념으로 최소 범위보다 작은 수를 발생시키는 경우 발생하는 현상이다.
        * */
        byte num2 = -128;
        System.out.println("num2 : " + num2);
        num2--;
        System.out.println(num2);

        /*
        * 이러한 현상이 발생해도 그냥 넘기는 경우가 발생할 수 있는데
        * 이러한 경우를 논리적 에러라고 표현한다. (논리적 에러는 개발자의 실수로 인해서 발생되는 것으로 디버깅이 가장 힘들다)
        * */
        int firstNum = 10000000; // 숫자에 대한 기본 자료형은 int이다.
        int secondNum = 700000;
        int multi = firstNum + secondNum;
        System.out.println(multi);

        // 오버플로우를 해결하기 위한 방법
        long multi2 = (long)firstNum * secondNum; // 더 큰 자료형을 사용해서 해결할 수 있다.(사용하지 않을 경우 오버플로우)
        System.out.println(multi2);

    }
}
