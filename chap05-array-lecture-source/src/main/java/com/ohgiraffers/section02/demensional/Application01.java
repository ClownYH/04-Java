package main.java.com.ohgiraffers.section02.demensional;

public class Application01 {
    public static void main(String[] args){
        /*
        * 다차원 배열
        * 다차원 배열은 2차원 이상의 배열을 의미한다.
        *
        * 배열의 인덱스마다 또 다른 배열의 주소를 보관하는 배열을 의미한다.
        * 즉, 2차원 배열은 1차원 배열 여러 개를 하나로 묶어서 관리하는 배열을 의미한다.
        * 더 많은 차원의 배열을 사용할 수 있지만 일반적으로 2차원 배열보다 높은 차원의 배열은 사용빈도가 적다.
        * */

        /*
        * 2차원 배열을 사용하는 방법
        * 1. 배열의 주소를 보관할 레퍼런스 변수를 선언(stack)
        * 2. 여러 개의 1차원 배열의 주소를 관리하는 배열을 생성(heap)
        * 3. 각 인덱스에서 관리하는 배열을 할당(heap)하여 주소를 보관하는 배열에 저장
        * 4. 생성한 여러 개의 1차원 배열에 차례로 접근해서 사용
        * */

        int[][] iarr1;
        int iarr2[][];
        int[] iarr3[];

        /* heap에 공간을 할당할 때는 new 연산자를 이용한다.
        * 배열의 주소를 관리하는 배열의 길이는 앞 부분에 정수형으로 표기하며 반드시 크기를 지정해줘야 한다.
        * */

        iarr1 = new int[3][]; // 값으로 주소를 가짐. 실수나 문자 등의 값을 가지지 않음. 배열이 동적일 경우 1차적으로 3칸 배열을 가지고
//        iarr2 = new int[][4]; : 오류
//        iarr3 = new int[][]; : 오류
        iarr1[0] = new int[3]; // 0번 칸에는 3칸 배열
        iarr1[1] = new int[4]; // 1번 칸에는 4칸 배열
        iarr1[2] = new int[5]; // 2번 칸에는 5칸 배열의 주소가 각각 들어있음

        iarr2 = new int[3][5]; // 배열을 고정했을 경우, 이 경우는 3칸까지 배열에, 한 칸당 5칸까지 배열의 주소가 들어있음
        System.out.println(iarr1[0]);

//        for(int i = 0; i < iarr1.length; i++){
//            System.out.println(iarr1[0]);
//        }

        for(int i = 0; i < iarr1.length; i++){
            for (int j = 0; j < iarr1[i].length; j++) {
                System.out.print(iarr1[i][j]);
            }
            System.out.println(); // 공백으로 하면 한 줄 띄어서 출력
        }

        System.out.println("------------------------------------------");


        int value = 0;
        for(int i = 0; i < iarr1.length; i++){ // iarr1.length = 3
            for(int j =0; j < iarr1[i].length; j++){ // iarr1[0] = 3, iarr1[1] = 4, iarr1[2] = 5

                iarr1[i][j] = ++value;

                System.out.print(iarr1[i][j] + " ");

            }
            System.out.println();
        }

    }
}
