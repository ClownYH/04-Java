package main.java.com.ohgiraffers.section01.run;

import main.java.com.ohgiraffers.section01.*;

public class Application2 {

    public static void main(String[] args){
        /*
        * 와일드카드(WildCard)
        * 제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을 때
        * 그 객체의 타입 변수를 제한할 수 있다.
        * <?> : 제한 없음
        * <? extends Type> : 와일드카드의 상한 제한(Type과 Type의 후손을 이용해 생성한 인스턴스만 인자로 허용)
        * <? super Type> : 와일드카드의 하한 제한(Type과 Type의 부모를 이용해서 생성한 인스턴스만 인자로 허용)
        * */

        WildCardFarm wildCardFarm = new WildCardFarm();

//        wildCardFarm.anyType(new RabbitFarm<Mammal>(new Mammal()));
//        wildCardFarm.anyType(new RabbitFarm<Reptile>(new Reptile()));

        wildCardFarm.anyType(new RabbitFarm<>(new Rabbit()));
        wildCardFarm.anyType(new RabbitFarm<>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<>(new DrunkenBunny()));

//        wildCardFarm.extendsType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.extendsType(new RabbitFarm<>(new Bunny()));
        wildCardFarm.extendsType(new RabbitFarm<>(new DrunkenBunny()));

        wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));

        //아래의 내용을 테스트하기 전
        // RabbitFarm(T extends Rabbit>으로 타입으로 지정되어 있기 때문에
        // superType(RabbitFarm<? super Bunny>)로 정의를 하게 되면
        // 허용 범위가 Rabbit ~ Bunny 사이의 조상만 허용이 가능하다.
 //       wildCardFarm.superType(new RabbitFarm<Animal>(new Mammal()));


        // superType*RabbitFarm<? super Bunny>?로 정의가 되어 있기 때문에
        // Bunny와 관련이 없는 Reptile 타입을 지시할 수 없게 되는 것이다.
//        wildCardFarm.superType(new RabbitFarm<Reptile>(new Snake()));

//        wildCardFarm.superType(new RabbitFarm<Rabbit>(new DrunkenBuuny()));

    }
}
