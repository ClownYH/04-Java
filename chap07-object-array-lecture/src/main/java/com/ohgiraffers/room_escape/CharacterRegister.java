package main.java.com.ohgiraffers.room_escape;

public class CharacterRegister {

    public void regist(Sheet[] characters){
        System.out.println("캐릭터를 출력합니다.");

        for(Sheet character : characters){
            System.out.println(character.getInfo());
        }



        if(CharacterSheet.store(characters)){
            System.out.println("총 " + characters.length + "명의 캐릭터가 존재합니다.");
        }
    }
}
