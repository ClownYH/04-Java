package main.java.com.ohgiraffers.section01.user_type;

public class Member {
    String id;
    String pwd;
    String name;
    int age;
    char gender;
    String[] hobby;

    public void setInt(int age){
        if(age < 0){
            System.out.println("나이는 0살보다 작을 수 없어요.");
        }
        this.age = age;
    }

    @Override
    public String toString(){

        System.out.println();

        return id + "님이 로그인하셨습니다. \n 로그인한 사용자의 이름은 " + name + " 나이는 " + age + " 성별은 " + gender
                 + " 취미는 " + hobby[0] + " " + hobby[1] + " " + hobby[2] + "입니다.";
    }
}
