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

    public static void play() {
        PlayingGame playingGame = new PlayingGame();
        Sheet player = playingGame.showAllCharacters();

        System.out.println("게임을 시작합니다.");
        System.out.println(player.getName());
    }
}