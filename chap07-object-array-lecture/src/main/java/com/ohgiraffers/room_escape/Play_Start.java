package main.java.com.ohgiraffers.room_escape;

public class Play_Start {
    Character character = new Character();
    Player_data_frame playerDataFrame = new Player_data_frame();
    public void Play_Start() {
        System.out.println("게임을 시작합니다.");
        System.out.println("캐릭터를 생성하겠습니다.");
        Player_data_frame[] selectedCharacters = Character.characterCreating();
        Start(selectedCharacters);

        // selectedCharacters 배열을 사용하여 정보에 접근할 수 있습니다.

    }

    public void Start(Player_data_frame[] selectedCharacters){
        System.out.println("당신의 이야기를 시작합니다.");

        for (Player_data_frame player : selectedCharacters) {
            if (player != null) {
                System.out.println(player.getInfo());
            }
        }
        System.out.println("당신은 어젯밤 외식을 하고 돌아오는 중 누군가 뒤통수를 강하게 내려쳐 기절했고, 정신을 차렸을 때는 모르는 장소에 있는 스스로를 발견했습니다.");
        System.out.println("당신이 있는 곳은 단칸방으로 보였고 눈 앞에는 문이 있습니다.");
        

    }
}
