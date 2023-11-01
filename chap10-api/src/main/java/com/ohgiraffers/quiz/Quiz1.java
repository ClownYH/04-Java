package main.java.com.ohgiraffers.quiz;

public class Quiz1 {

    public static void main(String[] args){
        /*
        * 영어 대소문자와 공백으로 이루어진 문자열이 주어진다.
        * 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
        * 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
        *
        * 첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다.
        * 이 문자열의 길이는 1,000,000을 넘지 않는다. 단어는 공백 한 개로 구분되며,
        * 공백이 연속해서 나오는 경우는 없다. 또한 문자열은 공백으로 시작하거나 끝날 수 있다.
        *
        *
        *
        * The Curious Case of Benjamin Button |-> 6
        *
        * The first character is a blank |-> 6
        *
        * The last character is a blank |-> 6
         * */

        String str1 = "The Curious Case of Benjamin Button";
        String[] str1Arr = str1.split("[ ]");
        System.out.println(str1Arr.length);


        String str2 = " The first character is a blank";
        String[] str2Arr = str2.trim().split("[ ]"); // trim() 메소드를 호출해 앞 뒤의 공백을 제거한다.(맨 앞 공백을 문자열로 취급하기 때문)
        int count = 0;
        for(String str : str2Arr){
            if(str != null && !str.equals(" ")){

                count++;
            }
        }
        System.out.println(count);

        String str3 = "The last character is a blank ";
        String[] str3Arr = str3.trim().split("[ ]");
        System.out.println(str3Arr.length);




    }
}
