package main.java.com.ohgiraffers.Example;

import main.java.com.ohgiraffers.Example.dto.MemberDTO;
import main.java.com.ohgiraffers.Example.service.MemberService;

import java.util.Scanner;

public class Application {

    public static void main(String[] args){

        // main에서 scanner를 통해 사용자에게 인증 방식을 입력 받는다.
        // 인증 방식이 결정되면 사용자에게 아이디 비밀번호를 입력받는다.
        // 입력 받은 인증에 따라 사용자에게 sns 인증 방식을 제공한다.
        Scanner scanner = new Scanner(System.in);

        MemberService memberService= new MemberService();

        // 인증방식 선택
        System.out.println("어떤 인증 방식을 선택하시겠습니까?");
        System.out.println("1. 계정 등록  | 2. 로그인  | 9. 프로그램 종료");
        int num = scanner.nextInt();

        switch (num){
            case 1 :
                System.out.println("계정 등록을 실행합니다.");
                memberService.signUpMember();
                break;
            case 2 :
                System.out.println("로그인을 진행합니다.");
                System.out.println("인증할 방식을 입력해주세요.");
                System.out.println("google | kakao | naver");
                String auth = scanner.next();

                memberService.findMember(auth, )
        }
        // 계정 입력

    }




}
