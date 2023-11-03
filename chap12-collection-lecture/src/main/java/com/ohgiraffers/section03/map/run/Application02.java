package main.java.com.ohgiraffers.section03.map.run;

import java.io.*;
import java.util.EmptyStackException;
import java.util.Properties;
import java.util.Stack;

public class Application02 {

    public static void main(String[] args){

        /*
        * Properties란
        * hashMap을 구현하여 사용 용법이 거의 유사하지만 key와 value 모두 문자열만 사용할 수 있는 자료구조이다.
        * 설정 파일의 값을 읽어서 어플리케이션에 적용할 때 사용한다.
        * */
        Properties prop = new Properties(); // 드라이버 커넥션에서 많이 쓰게 되는데, 프레임워크가 제공하는 편이다.

        prop.setProperty("driver", "oracle.kdbc.driver.OracleDriver");
        prop.setProperty("url", "localhost");
        prop.setProperty("user", "user");
        prop.setProperty("pass", "pass");
        System.out.println(prop);

//        try{ // 예외가 발생될 수 있는 코드를 묶는다.
//            // 엄마가 고기를 사오라고 했다.
//        }catch (/* 엄마 카드에 돈이 없는 경우*/){ // 대상 예외에 해당되면 아래의 코드 블럭에서 처리한다.
//            // 내 카드로 결제
//        }catch (/* 편의점을 못찾는 경우 */){
//            // 인터넷으로 주문
//        }catch (/* 엄마 카드와 내 카드 모두 돈이 없는 경우 */){
//            // 계산 취소
//        }

        try{ // try는 에러가 있는 코드를 넣으면 catch에서 그에 대한 대응을 한 후 이후 동작을 실행한다.
            prop.store(new FileOutputStream("driver.dat"), "jdbcDriver");
            prop.store(new FileWriter("driver.txt"), "jdbc driver");
            prop.storeToXML(new FileOutputStream("driver.xml"), "jdbc driver");
        }catch (FileNotFoundException e){ // 예외 또한 하나의 클래스
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

        Stack<Integer> integerStack = new Stack<>();
//        try {
//            integerStack.push(1);
//            integerStack.pop();
//            integerStack.pop();
//            integerStack.pop();
//            integerStack.pop();
//        }catch (EmptyStackException e){
//            e.printStackTrace();
//            System.out.println("setsetsetsetset");
//        }
//        System.out.println("setsetsetsetset");

        Properties pror2 = new Properties();

        try {
            pror2.load(new FileInputStream("driver.dat"));
            pror2.load(new FileReader("driver.txt"));
            pror2.loadFromXML(new FileInputStream("driver.xml"));

            pror2.list(System.out);
            System.out.println(pror2.getProperty("driver"));
            System.out.println(pror2.getProperty("url"));
            System.out.println(pror2.getProperty("user"));
            System.out.println(pror2.getProperty("password"));

        } catch (IOException e) { // IO 로컬에 있는 파일을 읽거나 쓰거나 수정하는 것, catch 또한 작은 Exception부터 적어야 오류가 안난다.
            e.printStackTrace();
        }

    }
}
