package main.java.com.ohgiraffers.yu;

public class UserDatabase {
    //10명까지 받을 수 있는 데이터베이스를 생성
    public static String[] userId = new String[10];
    public static String[] userPassword = new String[10];

    public static int count = 0;


    public static void regisUser(String newId, String newPassword){
        userId[count] = newId;
        userPassword[count] = newPassword;
        count++;
    }


    //Getter and Setter for count

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        UserDatabase.count = count;
    }

    public static void allUserData(){
        for (int i = 0; i < count; i++) {
            System.out.println(i+1+"번 회원 id: "+userId[i]);
            System.out.println(i+1+"번 회원 pwd: "+userPassword[i]);
            System.out.println("\n");
        }
    }


}
