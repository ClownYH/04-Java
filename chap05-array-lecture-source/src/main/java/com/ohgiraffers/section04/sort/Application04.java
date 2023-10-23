package main.java.com.ohgiraffers.section04.sort;

import java.util.Arrays;

public class Application04 {
    public static void main(String[] args){

        /*
        * 버블 정렬에 대한 알고리즘
        * 인접한 두 개의 원소를 검사하여 정렬하는 방법
        * 구현이 쉽다는 장점이 있다.
        * 이미 정렬된 데이터를 정렬할 때 가장 빠르다.
        * 그러나 다른 정렬에 비해 정렬 속도가 느리며 역순으로 정렬할 때 가장 느린 속도를 가진다.
        * */

        int [] arr = {2, 5, 4, 6, 1, 3};
        int temp;
        Arrays.sort(arr);
        for(int x : arr){
            System.out.print(x + " ");
        }

        System.out.println();


        for(int i = arr.length - 1; i >= 0; i--){
            for(int j = 0; j < i; j++){

                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for(int x: arr){
            System.out.println(x);
        }
    }
}
