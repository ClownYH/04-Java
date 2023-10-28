package main.java.com.ohgiraffers.room_escape;

public class Sheet {

    // 플레이어의 데이터 취급
    private String name;
    private String job;
    private int hp;
    private int str;
    private int dex;
    private int luk;

    public Sheet(){};

    Sheet(String name, String job, int hp, int str, int dex, int luk){
        this.name = name;
        this.job = job;
        this.hp = hp;
        this.str = str;
        this.dex = dex;
        this.luk = luk;
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
    public int getluk(){
        return luk;
    }
    public void setluk(int luk){
        this.luk = luk;
    }


    public String getInfo(){

        return "캐릭터명 : "+ name +
                ", 직업 : "+ job +", 체력 : " + hp +
                ", 힘 : " + str +
                ", 민첩성 : " + dex +
                ", 행운 : " + luk;
    }
}
