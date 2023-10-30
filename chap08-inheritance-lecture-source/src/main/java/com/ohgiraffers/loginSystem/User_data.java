package main.java.com.ohgiraffers.loginSystem;

public class User_data {

    private String name;
    private String id;
    private String pwd;

    public User_data(String name, String id, String pwd) {
        this.name = name;
        this.id = id;
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "이름 : '" + name + '\'' +
                "| 아이디 : " + id + '\'' +
                "| 비밀번호 : " + pwd
                ;
    }
}
