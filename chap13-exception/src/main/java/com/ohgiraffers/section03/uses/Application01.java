package main.java.com.ohgiraffers.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application01 {

    public static void main(String[] args){

        BufferedReader in = null;
        try{
            in = new BufferedReader(new FileReader("text.dat"));
            String s;

            while ((s = in.readLine()) != null){
                System.out.println(s);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (in != null) {
                    in.close(); // 원본파일을 보호하기 위해 close(가비지 값에 의한 원본 훼손 방지, 리소스 낭비 방지)
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }


    }
}
