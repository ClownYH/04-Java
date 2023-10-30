package main.java.com.ohgiraffers.loginSystem;

public class User_Information {

    private final static User_data[] users;

    private static int count;

    static {

        users = new User_data[20];

    }

    public static boolean store(User_data[] NewUsers){

        for(int i = 0; i < NewUsers.length; i++){
            users[count++] = NewUsers[i];

        }
        return true;
    }

    public static User_data[] showAllUsers(){
        return users;
    }



}
