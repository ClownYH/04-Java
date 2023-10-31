package main.java.com.ohgiraffers.Example.auth;

import main.java.com.ohgiraffers.Example.dto.MemberDTO;

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
