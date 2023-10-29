package main.java.com.ohgiraffers.room_escape;

import java.util.Scanner;

public class Character { // 캐릭터를 생성

    public void makeCharacter() {
        Sheet[] characters = new Sheet[3];

        characters[0] = new Sheet("김철수", "학생", 2, 3, 4, 3);
        characters[1] = new Sheet("박순희", "공무원", 3, 3, 2, 4);
        characters[2] = new Sheet("오달구", "군인", 3, 4, 3, 2);

        CharacterRegister characterRegister = new CharacterRegister();
        characterRegister.regist(characters);
    }

    public void showCharacter(){
        Play play = new Play();
        play.play();

    }

}