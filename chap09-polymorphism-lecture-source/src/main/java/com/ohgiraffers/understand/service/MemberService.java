package main.java.com.ohgiraffers.understand.service;

import main.java.com.ohgiraffers.understand.auth.SnsAuth;
import main.java.com.ohgiraffers.understand.dto.MemberDTO;

public class MemberService {

    private SnsAuth snsAuth;

    public MemberService(SnsAuth snsAuth) {
        this.snsAuth = snsAuth;
    }

    public boolean findMember(MemberDTO memberDTO){
        boolean result = snsAuth.login(memberDTO);

        return result;
    }
}