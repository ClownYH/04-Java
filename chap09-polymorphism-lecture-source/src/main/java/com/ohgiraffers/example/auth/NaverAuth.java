package main.java.com.ohgiraffers.example.auth;

import main.java.com.ohgiraffers.example.dto.MemberDTO;

public class NaverAuth implements SnsAuth {
    @Override
    public boolean login(MemberDTO memberDTO) {

        if(memberDTO.getSnsAuth().equals("naver")){
            return true;
        }else {
            return false;
        }
    }


}
