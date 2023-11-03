package main.java.com.ohgiraffers.understand;

import main.java.com.ohgiraffers.understand.type.HType;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args){

        // 회원 제한은 없으며 체력을 관리해야 한다.
        // 10명의 회원 유형도 자율이다.

        List<MemberDTO> members = new ArrayList<>();
        members.add(new MemberDTO("김씨", 50));
        members.add(new MemberDTO("이씨", 60));
        members.add(new MemberDTO("박씨", 40));
        members.add(new MemberDTO("정씨", 70));
        members.add(new MemberDTO("조씨", 50));
        members.add(new MemberDTO("유씨", 90));
        members.add(new MemberDTO("장씨", 100));
        members.add(new MemberDTO("백씨", 80));
        members.add(new MemberDTO("송씨", 40));
        members.add(new MemberDTO("여씨", 50));


        Scanner scanner = new Scanner(System.in);
        String[] value = scanner.nextLine().split(" ");


        //회원 분류
        for (int i = 0; i < members.size(); i++) {
            String result = value[i];
            members.get(i).sethType(HType.valueOf(result));
        }


        // 기유의 상태 (초기상태는 100)
        Kiyu kiyu = new Kiyu();
        kiyu.setHp(100);
        kiyu.setMoney(0);



        // member 10명만큼 일 시키기
        for(int i =0; i < members.size(); i++){

            kiyu.setMoney(members.get(i).gethType().getCash());
            kiyu.setHp(members.get(i).gethType().getDamage());

        }

        // 결과
        System.out.println(kiyu.getHp());
        System.out.println(kiyu.getMoney());


    }

}

