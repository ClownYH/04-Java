package main.java.com.ohgiraffers.section04.override;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass  extends SuperClass{

//    @Override
//    public void method(){
//        정상
//    }

//    @Override
//    public void method() throws IOException{
//        같은 유형의 예외를 던지는 경우도 가능하다.
//    }

//    @Override
//    public void method() throws Exception{
//        부모의 예외보다 더 큰 예외를 던질 수 없다.
//    }

    @Override
    public void method() throws FileNotFoundException {

    }

    /*
    * 오버라이드 시 throws 성립 요건
    * 1. 예외를 던지지 않는 경우
    * 2. 같은 유형의 예외인 경우
    * 3. 부모의 예외의 후손 예외인 경우
    *
    * 주의 : 부모의 예외보다 더 큰 유형의 예외를 발생할 수 없다.
    * */
}
