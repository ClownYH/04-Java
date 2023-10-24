package main.java.com.ohgiraffers.section01.user_type;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args){

        String id = "user01";
        String pwd = "pass01";
        String name = "기유";
        int age = 20;
        char gender = '남';
        String[] hobbys = new String[] {"축구", "헬스", "테니스"};

        print(id, name, age, gender, hobbys);
        System.out.println("-------1년이 지나고--------");
        age = modifyAge(age);
        print(id, name, age, gender, hobbys);



        String id1 = "user02";
        String pwd1 = "pass02";
        String name1 = "민식";
        int age1 = 20;
        char gender1 = '남';
        String[] hobbys1 = new String[] {"축구", "헬스", "요리"};

        print(id1, name1, age1, gender1, hobbys1);

        /* 위와 같이 변수를 개별적으로 활용해서 생기는 문제점
        * 1. 변수명을 다 관리해야 하는 어려움이 생긴다.
        * 2. 모든 회원 정보를 인자로 메소드 호출 시 값을 전달해야 하면 너무 많은 값들을 인자로 전달해야 해서 한 눈에 안들어온다.
        * 3. 리턴은 1개의 값만 가능하기 때문에 회원정보를 묶어서 리턴 값으로 사용할 수 없다.(자료형이 서로 다르기 때문이다.)
        * */

        Member kiyu = new Member();
        kiyu.name = "기유";
        kiyu.age = 20;
        kiyu.id = "kiyu";
        kiyu.pwd = "pass";
        kiyu.hobby = new String[]{"축구", "헬스", "농구"};

        System.out.println(kiyu.toString());
        System.out.println("---------------1년이 지나고-----------------");
        kiyu = modifyMember(kiyu);
        System.out.println(kiyu.toString());


        Member minsik = new Member();
        minsik.name = "민식";
        minsik.age = 18;
        minsik.pwd = "pass";
        minsik.gender = '남';
    }

    public static void print(String id, String name, int age, char gender, String[] hobbys){

        System.out.println(id + "님이 " + " 로그인을 하셨습니다.");
        System.out.println("로그인한 사용자 이름은 " + name + " 나이는 " + age + " 성별은 " + "취미는 : ");
        for(String hobby : hobbys){
            System.out.println(hobby + " ");
        }
        System.out.println("입니다.");
    }


    public static int modifyAge(int age){
        if(age < 0){
            return 0;
        }

        return age + 1;
    }

    public static Member modifyMember(Member member){
        member.age = member.age + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("취미가 변경 되셨나요?");
        String value = scanner.nextLine();
        if(value.equals("y")){
            // 취미 다시 입력받기
        }
        return member;
    }
}
