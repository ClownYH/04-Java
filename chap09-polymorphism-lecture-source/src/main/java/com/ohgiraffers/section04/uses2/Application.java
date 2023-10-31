package main.java.com.ohgiraffers.section04.uses2;

public class Application {
    public static void main(String[] args){
        Person person = new Person(new DatabaseSaveProvider());
        Person person1 = new Person(new FileSaveProvider());
        person1.doSomething();
        person.doSomething();
    }
}
