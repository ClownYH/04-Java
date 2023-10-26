package main.java.com.ohgiraffers.section06.singleton;

public class EagerSingleton { // 이른 초기화

    private static EagerSingleton eager = new EagerSingleton();

    private EagerSingleton(){
        System.out.println("eager 실행됨");
    }

    public static EagerSingleton getInstance(){
        return eager;
    }
}
