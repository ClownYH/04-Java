package main.java.com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application02 {
    public static void main(String[] args){
        /* 배열의 사용 방법
        * 1. 배열의 선언
        * 2.
        * 3.
        * */

        /* 자료형[] 변수명;
        * 자료형 변수명[]; 로 선언한다.
        * */

        int[] iarray;
        int array[]; // 두 가지 형태 모두 가능하며, 아래 경우에도 컴파일러가 []를 배열이라고 받아들이고 변수명만을 주소로 인식한다.

        /*
        * 선언한 레퍼런스변수에 배열을 할당하여 대입할 수 있다.
        * new 연산자는 heap 영역에 공간을 할당하고 발생한 주소값을 반환하는 연산자이다.
        * 발생한 주소를 레퍼런스 변수(참조 변수)에 저장하여 이것을 사용하기 때문에 참조자료형(reference type)이라고 한다.
        * */

        iarray = new int[5];
        array = new int[10];
        int[] test = iarray; // 서로 같은 주소 공간을 공유하게 됨, 변수명만 다름
        iarray[0] = 30;

        /* heap 메모리는 이름으로 접근하는 것이 아닌 주소로 접근하는 영역으로
        * stack에 저장된 주소로 heap에 할당된 배열을 찾아갈 수 있다.
        * */
        System.out.println("iarray = " + iarray);
        System.out.println("array = " + array);
        System.out.println("test = " + test);

        /*
        * hashCode : 일반적으로 객체의 주소값을 10진수로 변환하여 생성한 객체의 고유한 정수값을 반환한다.
        * 동일객체인지 비교할 때 사용할 목적으로 쓰여지며, 동등객체를 동일객체로 취급하기 위한 용도로 overring 해서 사용한다.
        * (동일하면 동등하지만, 동등하다고 동일하지는 않다.)
        * */

        System.out.println("iarray의 hashCode : " + iarray.hashCode());
        System.out.println("array의 hashCode : " + array.hashCode());
        System.out.println("test의 hashCode : " + test.hashCode());

        System.out.println(iarray[0]);
        System.out.println(test[0]);

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        double[] darr = new double[size];

        System.out.println("darr의 hashCode : " + darr.hashCode());
        System.out.println("darr의 길이 : " + darr.length);

        darr = new double[30];
        System.out.println("수정 후 darr의 hashCode : " + darr.hashCode());
        System.out.println("수정 후 darr의 길이 : " + darr.length);

//        darr = null;
//        System.out.println("삭제 후 darr의 길이 : " + darr.length); // 길이를 참조하려고 하는데 공간이 존재하지 않기 때문에 에러
    }
}
