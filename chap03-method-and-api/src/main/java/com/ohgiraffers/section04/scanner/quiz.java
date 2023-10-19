package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class quiz {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // "일 식비가 얼마나 되나요?(금액만 입력해주세요.)"가 출력된 후,
        // 일 식비를 입력했을 때, 10000원을 이상이면 "과소비된 식비입니다.",
        // 5000원을 이상이면 "검소한 식비입니다.",
        // 5000원 미만이면 "굶는 중입니다."가 화면에 출력되도록 하세요.
        // 이 때 메서드 한 개를 이용하되, static을 쓰지 않고 return 값 반환을 이용해서 만들어 보세요.
        quiz qz = new quiz();

        System.out.println("일 식비가 어떻게 되나요?(금액만 입력해 주세요.)");
        int ans = qz.cal();

        String result = (ans >= 10000)? "과소비된 식비" : (ans >= 5000)? "검소한 식비" : "굶는 중";
        System.out.println(result + "입니다.");

//                계산기 만들기
//        계산기에 필요한 기능은 + , - , * , / , %  총 5가지 연산자다.
//        ((예시))
//        첫 번 째 숫자를 입력하세요 :
//        2
//        연산할 기호를 쓰세요 :
//        +
//        두 번 째 숫자를 입력하세요 :
//        2
//        결과는 4입니다

        System.out.println("첫 번째 숫자를 입력하세요.");
        int num1 = sc.nextInt();

        System.out.println("===================");

        System.out.println("연산할 기호를 쓰세요.");
        String icon = sc.next();

        System.out.println("===================");

        System.out.println("두 번째 숫자를 입력하세요.");
        int num2 = sc.nextInt();

        if(icon == "+"){
            System.out.println(quiz.cal1(num1, num2));}else if(icon == "-"){
            System.out.println(quiz.cal2(num1, num2));}else if(icon == "*"){
            System.out.println(quiz.cal3(num1, num2));}else if(icon == "/"){
            System.out.println(quiz.cal4(num1, num2));}else{
            System.out.println(quiz.cal5(num1, num2));};


    }

    public int cal(){
        Scanner sc = new Scanner(System.in);
        int calc = sc.nextInt();

        return calc;

    }

    public static int cal1(int num1, int num2){

        int result1 = num1 + num2;

        return result1;

    }
    public static int cal2(int num1, int num2){

        int result2 = num1 - num2;

        return result2;

    }
    public static int cal3(int num1, int num2){

        int result3 = num1 * num2;

        return result3;

    }
    public static int cal4(int num1, int num2){

        int result4 = num1 / num2;

        return  result4;

    }
    public static int cal5(int num1, int num2){

        int result5 = num1 % num2;

        return result5;

    }
}
