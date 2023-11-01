package main.java.com.ohgiraffers.understand.auth.impl;

import main.java.com.ohgiraffers.understand.auth.SnsAuth;
import main.java.com.ohgiraffers.understand.dto.MemberDTO;

public class KakaoAuth implements SnsAuth {
    @Override
    public boolean login(MemberDTO memberDTO) {
        MemberDTO kakaoMember = new MemberDTO("kakao", "pass");

        if(!kakaoMember.getId().equals(memberDTO.getId())){
            System.out.println("카카오 회원의 아이디가 같지 않습니다.");
            return false;
        }else{
            if(!kakaoMember.getPass().equals(memberDTO.getPass())){
                System.out.println("카카오 회원의 비밀번호가 같지 않습니다.");
                return false;
            }
        }

        return true;
    }
}