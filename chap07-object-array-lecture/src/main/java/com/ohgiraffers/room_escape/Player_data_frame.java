package main.java.com.ohgiraffers.room_escape;

public class Player_data_frame {

    // 플레이어의 데이터 취급
    private String name;
    private String job;
    private int hp;
    private int str;
    private int dex;
    private int wis;

    public Player_data_frame(){};

    Player_data_frame(String name, String job, int hp, int str, int dex, int wis){
        this.name = name;
        this.job = job;
        this.hp = hp;
        this.str = str;
        this.dex = dex;
        this.wis = wis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }
    public void setJob(String job){
        this.job = job;
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
        return "당신의 이름은 "+ name +
                "이고 직업은 "+ job +"입니다. 당신의 체력은 " + hp +
                "이고, 당신이 가진 힘은 " + str +
                "이며, 민첩성은 " + dex +
                ", 행운은 " + wis +
                "입니다.";
    }
}
