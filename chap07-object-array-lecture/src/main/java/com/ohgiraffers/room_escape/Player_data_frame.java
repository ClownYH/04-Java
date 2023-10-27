package main.java.com.ohgiraffers.room_escape;

public class Player_data_frame {

    // 플레이어의 데이터 취급
    private String name;
    private int hp;
    private int str;
    private int dex;
    private int wis;

    public Player_data_frame(){};

    Player_data_frame(int hp, int str, int dex, int wis){
         this.hp = hp;
        this.str = str;
        this.dex = dex;
        this.wis = wis;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getHp(){
        return hp;
    }
    public void setHp(int hp){
        this.hp = hp;
    }

    public int getStr(){
        return str;
    }
    public void setStr(int str){
        this.str = str;
    }
    public int getDex(){
        return dex;
    }
    public void setDex(int dex){
        this.dex = dex;
    }
    public int getWis(){
        return wis;
    }
    public void setWis(int wis){
        this.wis = wis;
    }


    public String getInfo() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", str=" + str +
                ", dex=" + dex +
                ", wis=" + wis +
                '}';
    }
}
