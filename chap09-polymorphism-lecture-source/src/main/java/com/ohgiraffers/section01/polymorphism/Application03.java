package main.java.com.ohgiraffers.section01.polymorphism;

public class Application03 {
    public static void main(String[] args){

       Animal animal = new Animal();
       Animal animal1 = new Tiger();


       Application03.feed(animal);
       Application03.feed(animal1);

       Rabbit rabbit = new Rabbit();
       Tiger tiger = new Tiger();

       feed(rabbit);
       feed(tiger);

       feed(new Tiger());
       feed(new Rabbit()); // 참조해올 주소가 없기 때문에 메소드를 실행한 후 가비지 콜렉터에 의해 수거됨
    }

    public static void feed(Animal animal){
        animal.eat();
    }
}
