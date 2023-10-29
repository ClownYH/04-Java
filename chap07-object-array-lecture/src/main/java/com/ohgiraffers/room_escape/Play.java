package main.java.com.ohgiraffers.room_escape;

import java.util.Scanner;

public class Play {

    public void play() {
        CharacterSelect characterSelect = new CharacterSelect(); // 캐릭터선택 객체 생성
        MainGame mainGame = new MainGame(); // 메인게임 객체 생성
        Scanner scanner = new Scanner(System.in);

        System.out.println("원하는 캐릭터의 이름을 입력해주세요."); // 이름 입력
        String select = scanner.next();


        for (Sheet sheet : characterSelect.selectCharacters()) { // 시트타입을 참조하여 sheet를 선언 후 캐릭터선택 메소드를 호출, 반환 받은 값을 sheet에 하나씩 넣는다.

            if (sheet != null) { // 만약 sheet가 null이 아니라면
                if((select.equals(sheet.getName())) && (sheet.getName().equals("김철수"))) { // 입력 이름이 시트에 등록된 이름과 같으면서, 시트에 등록된 이름이 김철수인 경우(두 경우는 확연히 다르다.)
                    System.out.println("당신은 김철수입니다.");
                    mainGame.mainKim(); // 메인게임의 mainKim 메소드 호출
                    return;
                }else if((select.equals(sheet.getName())) && (sheet.getName().equals("박순희"))){ // 입력 이름이 시트에 등록된 이름과 같으면서, 시트에 등록된 이름이 박순희인 경우
                    System.out.println("당신은 박순희입니다.");
                    mainGame.mainPark(); // 메인게임의 mainPark 호출
                    return;
                }else if((select.equals(sheet.getName())) && (sheet.getName().equals("오달구"))) { // 입력 이름이 시트에 등록된 이름과 같으면서, 시트에 등록된 이름이 오달구인 경우
                    System.out.println("당신은 오달구입니다.");
                    mainGame.mainOh(); // 메인게임의 mainOh 호출
                    return;
                }
            }




        }
    }
}
