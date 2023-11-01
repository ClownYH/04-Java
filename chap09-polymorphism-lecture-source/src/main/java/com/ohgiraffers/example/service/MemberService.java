package main.java.com.ohgiraffers.example.service;

import main.java.com.ohgiraffers.example.auth.GoogleAuth;
import main.java.com.ohgiraffers.example.auth.KakaoAuth;
import main.java.com.ohgiraffers.example.auth.NaverAuth;
import main.java.com.ohgiraffers.example.auth.SnsAuth;
import main.java.com.ohgiraffers.example.dto.MemberDTO;

import java.util.Scanner;

public class MemberService {

    private SnsAuth snsAuth;
    Scanner scanner = new Scanner(System.in);

    public void signUpMember() {

        MemberReposity memberReposity = new MemberReposity();

        // 가입하고자 하는 사이트 선택
        System.out.println("가입하고자 하는 계정을 선택해주세요.");
        System.out.println("1. google | 2. kakao | 3. naver");
        int authType0 = scanner.nextInt();

        switch (authType0) {
            case 1: // 구글 계정 생성
                String auth1 = "google";
                System.out.println("구글 계정을 선택하셨습니다.");
                System.out.println("아이디를 입력하세요.");
                String id1 = scanner.next();
                System.out.println("비밀번호를 입력하세요.");
                String pwd1 = scanner.next();
                MemberDTO google = new MemberDTO(auth1, id1, pwd1);
                memberReposity.store(google); // 계정 정보 저장

                break;

            case 2:
                String auth2 = "kakao"; // 카카오 계정 생성
                System.out.println("카카오 계정을 선택하셨습니다.");
                System.out.println("아이디를 입력하세요.");
                String id2 = scanner.next();
                System.out.println("비밀번호를 입력하세요.");
                String pwd2 = scanner.next();
                MemberDTO kakao = new MemberDTO(auth2, id2, pwd2);
                memberReposity.store(kakao); // 계정 정보 저장

                break;

            case 3:
                String auth3 = "naver"; // 네이버 계정 생성
                System.out.println("네이버 계정을 선택하셨습니다.");
                System.out.println("아이디를 입력하세요.");
                String id3 = scanner.next();
                System.out.println("비밀번호를 입력하세요.");
                String pwd3 = scanner.next();
                MemberDTO naver = new MemberDTO(auth3, id3, pwd3);
                memberReposity.store(naver); // 계정 정보 저장

                break;
        }
    }
    public boolean findMember(String authType, MemberDTO memberDTO){

        // 인증 방식 대조
        switch (authType){

            case "google" : // 구글 계정 로그인

                System.out.println("아이디를 입력하세요.");
                String id1 = scanner.next();
                if(id1.equals(MemberReposity.member.getId()) && MemberReposity.member.getId().equals(id1)) { // 아이디 대조
                    System.out.println("비밀번호를 입력하세요.");
                    String pwd1 = scanner.next();
                    if (pwd1.equals(MemberReposity.member.getPwd()) && (MemberReposity.member.getPwd().equals(pwd1))) { // 비밀번호 대조
                        GoogleAuth googleAuth = new GoogleAuth();
                        snsAuth = googleAuth;
                        break;
                    } else {
                        System.out.println("잘못된 비밀번호입니다.");

                    }
                }else{
                        System.out.println("잘못된 아이디입니다.");
                }
                break;

            case "naver" : // 네이버 계정 로그인

                System.out.println("아이디를 입력하세요.");
                String id2 = scanner.next();
                if(id2.equals(MemberReposity.member.getId()) && MemberReposity.member.getId().equals(id2)){ // 아이디 대조
                    System.out.println("비밀번호를 입력하세요.");
                    String pwd2 = scanner.next();
                    if(pwd2.equals(MemberReposity.member.getPwd()) && (MemberReposity.member.getPwd().equals(pwd2))){ // 비밀번호 대조
                        NaverAuth naverAuth = new NaverAuth();
                        snsAuth = naverAuth; break;
                    } else {
                        System.out.println("잘못된 비밀번호입니다.");

                    }
                }else{
                    System.out.println("잘못된 아이디입니다.");
                }

            case "kakao" : // 카카오 계정 로그인

                System.out.println("아이디를 입력하세요.");
                String id3 = scanner.next();
                if(id3.equals(MemberReposity.member.getId()) && MemberReposity.member.getId().equals(id3)){ // 아이디 대조
                    System.out.println("비밀번호를 입력하세요.");
                    String pwd3 = scanner.next();
                    if(pwd3.equals(MemberReposity.member.getPwd()) && (MemberReposity.member.getPwd().equals(pwd3))){ // 비밀번호 대조
                        KakaoAuth kakaoAuth = new KakaoAuth();
                        snsAuth = kakaoAuth; break;
                    }else{
                        System.out.println("잘못된 비밀번호입니다.");
                    }

                }else {
                    System.out.println("잘못된 아이디입니다.");
                }



            default:
                System.out.println("존재하지 않는 인증 유형입니다."); return false;
        }

        boolean result = snsAuth.login(memberDTO); // 계정 인증 결과(참과 거짓)
        return result;
    }


}
