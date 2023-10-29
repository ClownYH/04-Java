package main.java.com.ohgiraffers.room_escape;

public class CharacterSelect {

    public Sheet[] selectCharacters(){ // 캐릭터선택 메소드
        return CharacterSheet.select(); // 캐릭터 시트에 있는 셀렉트 메소드 호출해서 그 값을 반환
    }
}
