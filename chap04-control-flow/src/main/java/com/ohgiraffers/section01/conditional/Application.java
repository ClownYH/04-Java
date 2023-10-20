package main.java.com.ohgiraffers.section01.conditional;

public class Application {

    public static void main(String[] args){

        A_if aIf = new A_if();
        B_ifElseIf bIf =new B_ifElseIf();
        D_switch d = new D_switch();

        aIf.testSimlpleIfStatement();

        aIf.testNestedIfStatement();

        bIf.testSimpleIfElseIfStatement();

        bIf.testNestedIfElseIfStatement();

        bIf.improveNestedIfElseIfStatement();

//        d.testSimpleSwitchStatement();

        String result = d.testSwitchVendingMachine();
        System.out.println(result);
    }
}
