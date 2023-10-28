package main.java.com.ohgiraffers.room_escape;

import java.util.Scanner;

public class PlayingGame {
    public void showAllCharacters() {
        CharacterSelect Select = new CharacterSelect();
        Scanner scanner = new Scanner(System.in);

        System.out.println("======== 캐릭터 목록 ========");
        for (Sheet sheet : Select.selectCharacters()) {
            if (sheet != null) {
                System.out.println(sheet.getInfo());
            }


        }
        System.out.println("캐릭터의 이름을 입력하세요.");

        String name = scanner.next();

        for (Sheet sheet : Select.selectCharacters()) {
            if (sheet.getName().equals(name)) {
                // 해당 캐릭터를 찾으면, 해당 캐릭터의 정보를 출력합니다.
                System.out.println(sheet.getInfo());
                System.out.println(sheet.getName() + "를 선택하셨습니다.");
                break;

            }


        }
    }

}
