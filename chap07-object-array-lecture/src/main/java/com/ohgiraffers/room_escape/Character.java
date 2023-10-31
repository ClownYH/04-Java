package main.java.com.ohgiraffers.room_escape;

import java.util.Scanner;

public class Character { // 캐릭터를 생성

    public void makeCharacter() {
        Sheet[] characters = new Sheet[3]; // 객체 배열을 생성, 각각의 값을 대입

        characters[0] = new Sheet("김철수", "학생", 2, 3, 4, 3);
        characters[1] = new Sheet("박순희", "공무원", 3, 3, 2, 4);
        characters[2] = new Sheet("오달구", "군인", 3, 4, 3, 2);

        CharacterRegister characterRegister = new CharacterRegister(); // 캐릭터 등록 클래스를 생성
        characterRegister.regist(characters); // 캐릭터를 등록
    }

    public void showCharacter(){ // Play 객체 생성 후 play 메소드 호출
        Play play = new Play();
        play.play


                ();

    }

}