package main.java.com.ohgiraffers.section02.uses;

public class MemberFinder { //((no==2) - 3)
    public Member[] findAllMembers(){ //Member 클래스에서 값을 가져옴
        return MemberRepository.findAllMembers();
    }
}