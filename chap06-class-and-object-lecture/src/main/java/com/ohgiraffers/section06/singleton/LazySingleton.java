package main.java.com.ohgiraffers.section06.singleton;

public class LazySingleton { // 느린 초기화
    private static LazySingleton lazy;

    private LazySingleton(){
        System.out.println("lazy 생성됨");
    }

    public static LazySingleton getInstance(){
        if(lazy == null){
            System.out.println("lazy 가 null 인 상태");
            lazy = new LazySingleton();
            System.out.println("생성되었습니다.");
            return lazy;
        }
        System.out.println("lazy가 널이 아닌 상태");
        return lazy;
    }
}
