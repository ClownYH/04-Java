package main.java.com.ohgiraffers.example.auth;

import main.java.com.ohgiraffers.example.dto.MemberDTO;

public class KakaoAuth implements SnsAuth{
    @Override
    public boolean login(MemberDTO memberDTO) {

        if(memberDTO.getSnsAuth().equals("kakao")){
            return true;
        }else {
            return false;
        }
    }
}
