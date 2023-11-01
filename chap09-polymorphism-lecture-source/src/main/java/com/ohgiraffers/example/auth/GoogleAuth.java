package main.java.com.ohgiraffers.example.auth;

import main.java.com.ohgiraffers.example.dto.MemberDTO;

public class GoogleAuth implements SnsAuth{
    @Override
    public boolean login(MemberDTO memberDTO) {

        if(memberDTO.getSnsAuth().equals("google")){
            return true;
        }else {
            return false;
        }

    }
}
