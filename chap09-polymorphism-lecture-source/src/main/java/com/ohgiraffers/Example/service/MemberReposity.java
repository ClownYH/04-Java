package main.java.com.ohgiraffers.Example.service;

import main.java.com.ohgiraffers.Example.dto.MemberDTO;

public class MemberReposity {

    public static MemberDTO member = new MemberDTO("","","");

    public static MemberDTO store(MemberDTO memberDTO){

        member = memberDTO;

        return member;
    }
}
