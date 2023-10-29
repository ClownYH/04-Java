package main.java.com.ohgiraffers.room_escape;

import javax.xml.stream.events.Characters;

public class CharacterSheet {

    private final static Sheet[] characters; // stack 영역에 chararcters 라는 객체 배열을 선언
    private static int count; // stack 영역에 정수 count 선언

    static {
        characters = new Sheet[5]; // stack 영역의 객체 배열 characters는 5칸 객체 배열로 대입
    }


    public static boolean store(Sheet[] newCharacters) { // 객체 배열을 매개변수로 하여

        for (int i = 0; i < newCharacters.length; i++) { // 객체 배열의 길이만큼 반복

            characters[count++] = newCharacters[i]; // 객체 배열 주소가 한 개 증가할 때마다 매개변수 값을 하나씩 대입
        }

        return true; // 참값을 반환
    }

    public static Sheet[] select(){
        return characters;
    }
}
