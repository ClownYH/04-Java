package main.java.com.ohgiraffers.section02.set.run;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application01 {

    public static void main(String[] args){

        /*
        * SET 인터페이스를 구현한 set 컬렉션 클래스의 특징
        * 1. 요소의 저장 순서를 유지하지 않는다.
        * 2. 같은 요소의 중복 저장을 허락하지 않는다.(null 값도 중복하지 않게 하나 null만 저장한다.)
        * */

        /*
        * hasSet
        * set 컬렉션 클래스에서 가장 많이 사용되는 클래스 중 하나이다.
        * jdk 1.2 부터 제공되고 있으며 해시 알고리즘을 사용하여 검색 속도가 빠르다는 장점을 가진다.
        * */

        HashSet<String> hset = new HashSet<>();

//        // 아래와 같이 다형성을 적용할 수 있다.
//        Set hset2 = new HashSet();
//        Collection hset3 = new HashSet();
        hset.add(new String("java"));
        hset.add(new String("jdbc"));
        hset.add(new String("oracle"));
        hset.add(new String("css"));
//        hset.add("java"); 값을 기준으로 중복을 허용하지 않는다.
        // 출력 순서가 우리가 등록한 순서와 다르다. (Set은 데이터의 순서를 보장하지 않기 때문이다.)
        System.out.println(hset);

        System.out.println(hset.size());
        System.out.println(hset.contains("java"));

        Object[] obj = hset.toArray(); // toArray() : 반환을 배열로 해줌
        for (Object ob :  hset.toArray()) {
            System.out.println(ob);
        }

        System.out.println();
        Iterator<String> iter = hset.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        hset.clear();
        System.out.println(hset.isEmpty());
    }
}
