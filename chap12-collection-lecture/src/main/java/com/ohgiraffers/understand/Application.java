package main.java.com.ohgiraffers.understand;

import java.util.*;

public class Application {

    public static void main(String[] args){

        // 로또 프로그램
        // 당첨번호 1 ~ 45, 6개 선택. 추첨
        // 구매자 1인당 10개 구매할 수 있다. 10명
        // 당첨자가 없으면 다시

        // 오름차순으로 당첨 번호 만들기
        TreeSet lotto = new TreeSet();

        for(int i = 0; i < 6; i++){
            int lottoNum = ((int)(Math.random() * 45) + 1);
            if (!lotto.contains(lottoNum)) {
                lotto.add(lottoNum);
            }
        }

        System.out.println(lotto);
        // 배열화
        Object[] obj1 = lotto.toArray();


        // 오름차순으로 고객이 뽑은 번호
        TreeSet number = new TreeSet();

        for(int i = 0; i < 6; i++){
            int lottoNum2 = ((int)(Math.random() * 45) + 1);
            if (!number.contains(lottoNum2)) {
                number.add(lottoNum2);
            }
        }

        // 배열화
        Object[] obj2 = number.toArray();



        // 10명을 반복
        for(int k = 0; k < 10; k ++) {
            System.out.println(k + 1 + "번째 고객님");

            // 1인의 당첨 번호와 비교
            for (int i = 0; i < 10; i++) {

                if (obj1[0] == obj2[0] && obj1[1] == obj2[1] && obj1[2] == obj2[2] && obj1[3] == obj2[3] && obj1[4] == obj2[4] && obj1[5] == obj2[5]) {
                    System.out.println("당첨 번호 : ");
                    for (int o = 0; o < obj1.length; o++) {
                        System.out.print("[" + obj1[o] + "]");
                    }
                    System.out.println(k + "번째 고객님의 " + i + 1 + "번째 당첨 번호 : ");
                    for (int p = 0; p < obj2.length; p++) {
                        System.out.print("[" + obj2[p] + "]");
                    }
                    System.out.println("당첨");
                    return;
                } else {

                    number.clear();
                    for (int j = 0; j < 6; j++) {
                        number.add((int) (Math.random() * 45) + 1);
                    }
                    obj2 = number.toArray();
                }

            }
        }

        System.out.println("당첨자가 없습니다.");

        System.out.println("당첨 번호 : ");
        for (int i = 0; i < obj1.length; i++) {
            System.out.println(obj1[i]);
        }

    }




}

