package main.java.com.ohgiraffers.section02.set.run;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Application02 {

    public static void main(String[] args){

        /*
        * linkedHashSet 클래스
        * hashSet이 가지는 기능으 모두 가지고 있고
        * 추가적으로 저장 순서를 유지하는 특징을 가지고 있다.
        * jdk 1.4부터 제공한다.
        * */

        LinkedHashSet<String> lhset = new LinkedHashSet<>();
        lhset.add("java");
        lhset.add("oracle");
        lhset.add("jdbc");
        lhset.add("html");
        lhset.add("css");

        System.out.println(lhset);

        // 오름차순 정렬을 하고자 하는 경우 아래와 같이 진행
        // 여기서 정렬을 희망하는 경우 같은 자료형에 한해서 지원한다.
        TreeSet<String> test = new TreeSet<>(lhset);
        System.out.println(test);
    }
}
