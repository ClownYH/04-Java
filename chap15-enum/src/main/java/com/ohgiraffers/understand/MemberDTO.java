package main.java.com.ohgiraffers.understand;

import main.java.com.ohgiraffers.understand.type.HType;

public class MemberDTO {
    private String name;
    private int weight;
    private HType hType;

    public MemberDTO(String name, int weight) {
        this.name = name;
        this.weight = weight;
        this.hType = gethType();
    }

    public HType gethType() {
        return hType;
   }

    public void sethType(HType type) {
        this.hType = type;
    }

}
