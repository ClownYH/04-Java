package main.java.com.ohgiraffers.section04.sort;

public class Application03 {
    public static void main(String[] args){
        // 최소값 정렬 알고리즘

        int[] arr = {2, 5, 4, 6, 1, 3};
        int min;
        int temp;

        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        for (int x : arr) {
            System.out.print(x);
        }
    }
}
