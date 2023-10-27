package main.java.com.ohgiraffers.section02.uses;

public class Member { //사용자의 정보를 입력하는곳
    private int num;
    private String id;
    private String pwd;
    private String name;
    private int age;
    private char gender;

    public Member(){}
    Member(int num, String id, String pwd, String name, int age, char gender){ //접근제한자 default는 안써줘도 기본적으로 적용됨
        this.num = num;
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


    public String getInfo() { // ((no==1) - 6) 인스턴스의 필드를 문자열로 만들어서 반환한다.
        return "Member{" +
                "num=" + num +
                ", id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}