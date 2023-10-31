package main.java.com.ohgiraffers.section04.uses2;

public class DatabaseSaveProvider implements SaveProvider{
    @Override
    public boolean save(String data) {
        System.out.println("database save" + data);
        return false;
    }
}
