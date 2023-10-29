package main.java.com.ohgiraffers.room_escape;

import java.util.Scanner;

public class Play {

    public void play() {
        CharacterSelect characterSelect = new CharacterSelect();
        MainGame mainGame = new MainGame();
        Scanner scanner = new Scanner(System.in);

        System.out.println("원하는 캐릭터의 이름을 입력해주세요.");
        String select = scanner.next();


        for (Sheet sheet : characterSelect.selectCharacters()) {

            if (sheet != null) {
                if((select.equals(sheet.getName())) && (sheet.getName().equals("김철수"))) {
                    System.out.println("당신은 김철수입니다.");
                    mainGame.mainKim();
                    return;
                }else if((select.equals(sheet.getName())) && (sheet.getName().equals("박순희"))){
                    System.out.println("당신은 박순희입니다.");
                    mainGame.mainPark();
                    return;
                }else if((select.equals(sheet.getName())) && (sheet.getName().equals("오달구"))) {
                    System.out.println("당신은 오달구입니다.");
                    mainGame.mainOh();
                    return;
                }
            }




        }
    }
}
