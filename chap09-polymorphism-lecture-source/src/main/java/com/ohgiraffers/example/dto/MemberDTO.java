package main.java.com.ohgiraffers.example.dto;

public class MemberDTO {

    private String SnsAuth;

    private String id;

    private String pwd;

    public MemberDTO(String snsAuth, String id, String pwd) {
        SnsAuth = snsAuth;
        this.id = id;
        this.pwd = pwd;
    }

    public String getSnsAuth() {
        return SnsAuth;
    }

    public void setSnsAuth(String snsAuth) {
        SnsAuth = snsAuth;
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
}
