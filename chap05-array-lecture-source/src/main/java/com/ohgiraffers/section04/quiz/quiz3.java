package main.java.com.ohgiraffers.section04.quiz;

import java.util.Scanner;

public class quiz3 {
    public static void main(String[] args){
        ///  문제 1 번

        //    염라대왕이 화나셨다! 명부 리스트에서 몇 명을 추출하여
        //        //    그 중에 한 명을 지옥에 보낼려고 한다.


        // 배열과 for문을 한 번씩 써야한다.
        //    보이는 출력은 아래와 같다.
    /* EX)
    *  사람들을 몇 명 뽑을까요?
    *      3
    * 1번째 운 없는 자의 이름을 입력하세요 :
      홍길동
      2번째 운 없는 자의 이름을 입력하세요 :
      고길동
      3번째 운 없는 자의 이름을 입력하세요 :
      강수진
      *
      * 지옥에 갈 사람은 누구입니다!
    *
    * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("염라대왕이 화나셨다! 명부 리스트에서 몇 명을 추출하여 그 중에 한 명을 지옥에 보낼려고 한다.");
        System.out.println("지옥에 갈 사람은 몇 명입니까?");
        int num = scanner.nextInt();
        String[] prison = new String[num];


        for (int i = 0; i < prison.length; i++) {
            System.out.println(i + 1 + "번째 운 없는 자의 이름을 입력하세요.");
            prison[i] = scanner.next();

        }

        System.out.println("지옥에 갈 사람은 " + prison[(int)(Math.random() * prison.length)] + "입니다.");

    }
}
