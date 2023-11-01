package main.java.com.ohgiraffers.example.service;

import main.java.com.ohgiraffers.example.dto.MemberDTO;

public class MemberReposity {

    public static MemberDTO member = new MemberDTO("","","");

    public static MemberDTO store(MemberDTO memberDTO){

        member = memberDTO;

        return member;
    }
}
