package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class quiz {
    public static void main(String[] args){
        // "일 식비가 얼마나 되나요?(금액만 입력해주세요.)"가 출력된 후,
        // 일 식비를 입력했을 때, 10000원을 이상이면 "과소비된 식비입니다.",
        // 5000원을 이상이면 "검소한 식비입니다.",
        // 5000원 미만이면 "굶는 중입니다."가 화면에 출력되도록 하세요.
        // 이 때 메서드 한 개를 이용하되, static을 쓰지 않고 return 값 반환을 이용해서 만들어 보세요.
        quiz ts = new quiz();

        System.out.println("일 식비가 어떻게 되나요?(금액만 입력해 주세요.)");
        int ans = ts.cal();

        String result = (ans >= 10000)? "과소비된 식비" : (ans >= 5000)? "검소한 식비" : "굶는 중";
        System.out.println(result + "입니다.");

    }

    public int cal(){
        Scanner sc = new Scanner(System.in);
        int calc = sc.nextInt();

        return calc;
    }
}
