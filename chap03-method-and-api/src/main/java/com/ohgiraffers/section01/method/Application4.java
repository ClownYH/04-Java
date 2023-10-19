package main.java.com.ohgiraffers.section01.method;

public class Application4 {
    public static void main(String[] args){

        Application4 app4 = new Application4();
        app4.testMethod("홀길동", 20, '남'); //testMethod에서 gender를 char로 설정했기 때문에 ''를 쓴다.

        String name = "유관순";
        int age = 20;
        char gender = '여';
        app4.testMethod(name, age, gender);
    }

    public void testMethod(String name, int age, final char gender){
        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "세이며, 성별은 " + gender + "입니다.");

    }

    public void info100(String name, int age, final String gender){
        name = name + " " + 100;
        age = age * 100;
//        gender = gender + "100"; // gender를 final로 상수화 시켰기 때문에 변화를 줄 수 없다.

        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "세이며, 성별은 " + gender + "입니다.");

    }
}
