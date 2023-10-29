package main.java.com.ohgiraffers.room_escape;

public class CharacterRegister {

    public void regist(Sheet[] characters){
        System.out.println("캐릭터를 출력합니다."); // 캐릭터 목록을 출력

        for(Sheet character : characters){ // 매개변수로 받은 객체배열의 정보를 각각 출력
            System.out.println(character.getInfo());
        }



        if(CharacterSheet.store(characters)){ // 캐릭터시트 클래스에 있는 저장메소드에 캐릭터 배열을 대입
            System.out.println("총 " + characters.length + "명의 캐릭터가 존재합니다."); // 참 값을 반환받았기 때문에 총수를 출력
        }
    }
}
