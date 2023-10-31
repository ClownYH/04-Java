package main.java.com.ohgiraffers.Example.service;

import main.java.com.ohgiraffers.Example.auth.GoogleAuth;
import main.java.com.ohgiraffers.Example.auth.KakaoAuth;
import main.java.com.ohgiraffers.Example.auth.NaverAuth;
import main.java.com.ohgiraffers.Example.auth.SnsAuth;
import main.java.com.ohgiraffers.Example.dto.MemberDTO;

import java.util.Scanner;

public class MemberService {

    private SnsAuth snsAuth;

    public void signUpMember() {

        Scanner scanner = new Scanner(System.in);
        MemberReposity memberReposity = new MemberReposity();
        System.out.println("가입하고자 하는 계정을 선택해주세요.");
        System.out.println("1. google | 2. kakao | 3. naver");
        int authType0 = scanner.nextInt();
        switch (authType0) {
            case 1:
                String auth1 = "google";
                System.out.println("구글 계정을 선택하셨습니다.");
                System.out.println("아이디를 입력하세요.");
                String id1 = scanner.next();
                System.out.println("비밀번호를 입력하세요.");
                String pwd1 = scanner.next();
                MemberDTO google = new MemberDTO(auth1, id1, pwd1);
                memberReposity.store(google)
                break;

            case 2:
                String auth2 = "kakao";
                System.out.println("카카오 계정을 선택하셨습니다.");
                System.out.println("아이디를 입력하세요.");
                String id2 = scanner.next();
                System.out.println("비밀번호를 입력하세요.");
                String pwd2 = scanner.next();
                MemberDTO kakao = new MemberDTO(auth2, id2, pwd2);
                return kakao;
                break;

            case 3:
                String auth3 = "naver";
                System.out.println("네이버 계정을 선택하셨습니다.");
                System.out.println("아이디를 입력하세요.");
                String id3 = scanner.next();
                System.out.println("비밀번호를 입력하세요.");
                String pwd3 = scanner.next();
                MemberDTO naver = new MemberDTO(auth3, id3, pwd3);
                return naver;
                break;
        }
    }
    public boolean findMember(String authType, MemberDTO memberDTO){

        // 인증 방식 대조
        switch (authType){
            case "google" :
                GoogleAuth googleAuth = new GoogleAuth();
                snsAuth = googleAuth; break;
            case "naver" :
                NaverAuth naverAuth = new NaverAuth();
                snsAuth = naverAuth; break;
            case "kakao" :
                KakaoAuth kakaoAuth = new KakaoAuth();
                snsAuth = kakaoAuth; break;
            default:
                System.out.println("존재하지 않는 인증 유형입니다."); return false;
        }
        boolean result = snsAuth.login(memberDTO);
        return result;
    }


}
