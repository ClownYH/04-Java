package section02.variable;

public class Application02 {
    public static void main(String[] args) {
        /* 변수를 선언하고 값을 할당하여 사용할 수 있다. */
        /*
         * 변수를 사용하는 법
         * 1. 변수를 준비한다. (선언)
         * 2. 변수에 값을 대입한다. (값 대입 초기화)
         * 3. 변수를 사용한다.
         */

        /* 변수에는 자료형이 존재한다.
         *  자료형이란? 다양한 값의 형태별로 어느 정도의 크기를 하나의 값으로 취급할 것인지 미리 Compiler와 약속한 키워드이다.
         * 예) 앞에서 사용한 int 자료형은 정수 5byte 만큼 읽어서 하나의 값으로 취급하겠다는 약속이다.
         *       이러한 자료형은 기본 자료형(Primary Type)과 참고 자료형(Reference Type)으로 나뉘어 진다.
         * 그 중 기본 자료형 8가지를 먼저 확인한다.
         * */
        System.out.println("========= 변수 선언 ==========");
        //목차 1-1-1. 숫자를 취급하는 자료형
        // 1byte는 8개의 bit가 모여진 데이터 단위이다.
        // 1bit는 0과 1 둘 중 하나의 값만을 가질 수 있는 데이터의 최소 단위이다.
        // 자바는 기본적으로 데이터의 최소 단위를 1byte만큼 취급을 한다.
        byte bnum; // 1byte
        short snum; // 2byte
        int inum; // 4byte
        long lnum; // 8byte

        /* 실수를 취급하는 자료형은 2가지가 있다. */
        float fnum; // 4byte, 소수부를 표현하는데도 크기를 소모한다. int와는 쓰임이 다르다.
        double dnum;// 8byte

        /* 목차 1-1-2 문자를 취급하는 자료형 */
        // 문자를 취급하는 자료형은 한 가지이다.
        char ch; // 1byte

        /* 목차 1-1-3 논리값을 취급하는 자료형 */
        // 논리 데이터 형은 0과 1의 값으로 데이터를 취급하기 때문에 1bit로 표현이 가능하지만 최소단위가 1byte이기 때문에 1byte의 크기를 갖는다.
        boolean isTure; // 1byte

        System.out.println("========== 변수 초기화 ============");

        // 기본 자료형이 아니다.
        String str;

        // 목차 2. 변수에 값을 대입하기
        // * 위에서 한 변수 선언은 메모리에 값을 저장하기 위해 공간만 생성해 둔 상태이다.
        // * 그 공간에 대입 연산자를 이용하여 자료형에 저장하기로 한 형태의 값을 저장할 수 있다.
        // * 만약, 약속 내용과 다른 형태의 값을 대입하려고 한다면 Compiler는 에러를 발생시킨다.
        // *
        // * 설명
        // * 대입 연산자의 실행 방향은 오른쪽에서 왼쪽이다.
        // * 즉 오른쪽에 있는 값을 왼쪽의 공간에 대입한다는 의미이며, 왼쪽에는 항상 공간, 오른쪽에는 항상 값이 온다.
        // * 변수를 대입연산자 왼쪽에 사용하면 공간의 의미이고, 대입연산자 오른쪽에 사용하면 변수가 가진 값을 의미한다.
        // *
        /* 목차 2-1. 정수를 취급하는 자료형에 값 대입 */
        bnum = 1;
        snum = 2;
        inum = 4;
        lnum = 8L;//long은 뒤에 L(또는 l)을 붙여서 구분한다.

        // 목차 2-2. 실수를 취급하는 자료형에 값 대입
        fnum = 4.0f; // float는 뒤에 f(혹은 F)를 붙여서 구분한다.
//        fnum = 4.0; // 실수 형태의 값을 fnum에 사용하는 것은 불가능하다.
        dnum = 4.0;

        // 목차 2-3 문자를 취급하는 자료형에 값 대입
        ch = 'a';       //아스키 코드표를 참조하여 문자는 연산시 숫자로 변환된다.
        char ch2 = 97;  //아스키 코드표를 참조하여 숫자를 문자로 대입시 자료형에 따라 문자로 변환된다.

        /* 목차 2-4 논리를 취급하는 자료형에 값 대입 */
        isTure = true;
        isTure = false;

        /* 목차 2-5 문자열로 취급하는 자료형에 값 대입 */
        str = "안녕하세요";

        /* 숫자로 된 형태의 값을 그대로 사용하는 자료형은 byte, short, int, double 이다.
        * 일반적으로 사용하는 값을 독특한 형태가 아닌 일반적인 형태로 사용할 수 있는 자료형을 대표자료형이라고 하며
        * 정수는 int, 실수는 double이 대표 자료형이다.
        * */
        int point = 100;
        int bonus = 10;

        System.out.println("================ 변수 값 출력하기 =================");
        System.out.println("bnum의 값 :" + bnum);
        System.out.println("snum의 값 :" + snum);
        System.out.println("inum의 값 :" + inum);
        System.out.println("lnum의 값 :" + lnum);

        System.out.println("fnum의 값 :" + fnum);
        System.out.println("dnum의 값 :" + dnum);

        System.out.println("isTure의 값 :" + isTure);

        System.out.println("str의 값 :" + str);

        /* 목차 3-2. 변수를 이용해서 연산하기 */
        /* 변수에 저장된 값을 이용해서 연산을 할 수 있다. */
        System.out.println("포인트와 보너스의 합은 :" + (point + bonus));

        /* 목차 3-3. 대입연산자의 왼쪽과 오른쪽 편에 사용하기 */
        point = point + 100;
        System.out.println("point = point + 100 ?" + 100);

    }
}
