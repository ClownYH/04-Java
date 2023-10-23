package main.java.com.ohgiraffers.section03.copy;

public class Application02 {
    public static void main(String[] args){

        String[] names = {"홍길동", "유관순", "이순신"};

        System.out.println("names의 hashCode : " + names.hashCode());

        // 매개변수
        // 함수를 호출할 때 값을 전달하기 위해서 사용하는 변수이다.

        print(names); // names의 주소값을 보내줬다.

        for (String x : names) {
            System.out.println("print 이후의 x의 값 : " + x);
        }

        System.out.println();

        String[] animals = getAnimals();
        System.out.println("리턴 받은 animals의 hashCode : " + animals.hashCode()); // 동일한 주소값을 반환받았다.

        for(String x : animals){
            System.out.println("print 전 = " + x);
        }

        print(animals);

        for (String x : animals) {
            System.out.println("print 후 = " + x);
        }


    }

    public static void print(String[] test){

        System.out.println("test의 hashCode : " + test.hashCode()); // 주소값을 공유하기 때문에 변경사항이 모두 똑같이 적용된다.

        for (int i = 0; i < test.length; i++) {
            test[i] = test[i] + "1";
        }
        System.out.println();
    }

    public static String[] getAnimals(){
        String[] animals = new String[]{"낙타", "호랑이", "나무늘보"};
        System.out.println("getAnimals의 hashCode : " + animals.hashCode());

        return animals; // 주소값 리턴
    }
}
