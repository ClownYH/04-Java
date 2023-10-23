package main.java.com.ohgiraffers.section04.quiz;

public class quiz4 {
    public static void main(String[] args){
//        피보나치 수열(An = An-1 + An-2)을 화면에 출력해라.
//        1. 결과값: {1 1 2 3 5 8 13 21 34}
//        2. for문과 배열을 이용해 코드를 간소화하여 작성해야 한다.
//        3. 9개 까지 출력한다.


        int[] arr = new int[9];

        arr[0] = 1;
        arr[1] = 1;

        System.out.println(arr[0]);
        System.out.println(arr[1]);

        for(int i = 0; i < 7; i++){ // arr[0]과 arr[1]은 이미 존재하기 때문에 arr[2]부터 arr[9]까지만 구하면 된다.(7개)


            arr[i + 2] = arr[i + 1] + arr[i];

            System.out.println(arr[i + 2]);
        }

    }
}
