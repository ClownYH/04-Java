package section01.literal;

public class Application3 {
    public static void main(String[] args){
        /*
         * 9 + 9
         * "9" + 9
         * 9 + "9"
         * 9 + "9" + 9
         * "10과 20의 차 : " + (10 - 20)
         * "10과 20의 나누기 한 몫 : " + (10 / 20)
         * "10과 20의 나머지 : " + (10 % 20)
         * "기차가 " + 100 + "M/s" + "속도로 출발"
         */
        System.out.println(9 + 9);
        System.out.println("9" + 9);
        System.out.println(9 + "9");
        System.out.println(9 + "9" + 9);
        System.out.println("10과 20의 차 : " + (10 - 20)); //""밖에 있는 연산자는 연산자로 작용, 안에 있으면 문자열
        System.out.println("10과 20의 나누기 한 몫 : " + (10 / 20)); //()가 없어도 연산을 먼저 하지만 개발자간의 인식을 명확히 하기 위하여 넣어주는 것이 좋다.
        System.out.println("10과 20의 나머지 : " + (10 % 20));
        System.out.println("기차가 " + 100 + "M/s" + "속도로 출발");
    }
}
