package main.java.com.ohgiraffers.section01.list.run;

import java.util.Stack;

public class Application04 {

    public static void main(String[] args){
        /*
        * Stack
        * Stack은 리스트 계열 클래스의 Vector 클래스를 상속받아 구현되었으며
        * 스택 메모리 구조는 선형 메모리 공간에 데이터를 저장하며
        * 후입 선출(:LIFO : last Input first out)방식의 자료 구조라고 불린다.
        * */
        Stack<Integer> integerStack = new Stack<>();

        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.add(5);
        System.out.println(integerStack);
        /*
        * 스택에서 요소를 찾을 때 search()를 이용할 수 있다.
        * 인덱스가 아닌 위에서부터 순번을 의미한다.
        * 또한 가장 상단이 위치가 0이 아닌 1부터 시작한다.
        * */
        System.out.println(integerStack.search(4));

        /*
        * stack에서 값을 꺼내는 메소드는 크게 2가지로 볼 수 있다.
        * peek() : 해당 스택의 가장 마지막에 있는(상단에 있는) 요소 반환
        * pop() : 해당 스택의 가장 마지막에 있는(상단에 있는) 요소 반환 후 제거
        * */
        System.out.println("peek() : " + integerStack.peek());
        System.out.println(integerStack);
        System.out.println("pop() : " + integerStack.pop());
        System.out.println(integerStack);

        // stack의 저장된 요소가 없을 때 참고하고자 하는 경우 stack이 비어있다는 오류를 발생하게 된다.
        // EmptyStackException
    }
}
