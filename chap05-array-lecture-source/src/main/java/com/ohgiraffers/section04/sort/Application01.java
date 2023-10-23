package main.java.com.ohgiraffers.section04.sort;

public class Application01 {
    public static void main(String[] args){

        // 정렬

        int num1 = 10;
        int num2 = 20;

        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1);
        System.out.println(num2);

        int[] arr = {2, 1, 3};

        temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
