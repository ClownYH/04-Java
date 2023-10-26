package main.java.com.ohgiraffers.Pocketmon;

public class Pokemon {

    private static Pokemon Pokemon = new Pokemon();
    String name;
    int hp;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return  name + " 의 체력이  " + hp +"이 남았습니다.";
    }

    private static Pokemon getInstance(){return Pokemon;}

    public static void wildPokemon(){
        Pokemon pokemon1 = new Pokemon();

        String pokemonNames [] = {"파이리","꼬북이","이상해씨"};
        pokemon1.setName(pokemonNames[(int)(Math.random()*3)]);
        pokemon1.setHp(100);

        System.out.println("앗! 야생의 "+pokemon1.name+"나타났다!");

        System.out.println(pokemon1.name+"의 hp : " + pokemon1.hp);
        Actions.action1(pokemon1.hp);
    }

}
