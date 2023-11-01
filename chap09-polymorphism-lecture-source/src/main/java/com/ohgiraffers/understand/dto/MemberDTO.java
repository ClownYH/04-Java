package main.java.com.ohgiraffers.understand.dto;

public class MemberDTO {

    private String id;
    private String pass;

    public MemberDTO(){

    }
    public MemberDTO(String id, String pass) {
        this.id = id;
        this.pass = pass;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "id='" + id + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}