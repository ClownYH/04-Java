package main.java.com.ohgiraffers.section01.list.run;

import main.java.com.ohgiraffers.section01.list.comparator.AscendingPrice;
import main.java.com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application02 {
    public static void main(String[] args){
        List<BookDTO> bookList = new ArrayList<>();
        bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
        bookList.add(new BookDTO(2, "목민심서", "정약용", 30000));
        bookList.add(new BookDTO(3, "동의보감", "허준", 40000));
        bookList.add(new BookDTO(4, "삼국사기", "김부식", 46000));
        bookList.add(new BookDTO(5, "삼국유사", "일연", 58000));

        for (BookDTO book : bookList) {
            System.out.println(book);
        }

        //Comparator 구현체를 구현하지 않아서 실행이 안됨?
        /*
        * Comparator 인터페이스를 상속받아 정렬의 기준을 정해준 뒤 list의 default 메소드인 sort() 메소드의 인자로
        * 정렬 기준이 되는 인스턴스를 넣어주게 되면 내부적으로 우리가 오버라이딩한 메소드가 동작하게 되며
        * 그것을 정렬의 기준으로 삼는다.
        * */
//        Collections.sort(bookList); 이렇게 할 경우 주소값을 가져와서 비교하기 때문에 정렬할 수 없다. 원시자료형이면 이렇게 정렬할 수 있다.
        System.out.println("비교대상--------------");

        bookList.sort(new AscendingPrice()); // sort의 괄호 안에 들어갈 것은 정렬의 방식을 집어넣는다. 참조자료형은 이런 식으로 사용한다.

        for (BookDTO book : bookList) {
            System.out.println(book);
        }

//        bookList.sort(new Comparator<BookDTO>() { // 이렇게 직접 바로 정렬 방식을 재정의할 수도 있다.
//            @Override
//            public int compare(BookDTO o1, BookDTO o2) {
//                return 0;
//            }
//        });

        System.out.println("여기까지 가격 내림차순 정렬----------");

        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });

        for (BookDTO book : bookList) {
            System.out.println(book);
        }
        System.out.println("책 제목을 기준으로 오름차순 정렬==========");

        for(BookDTO bo : bookList){
            System.out.println(bo);
        }

        System.out.println("람다 표현식=======");
        bookList.sort((BookDTO b1, BookDTO b2) -> b2.getTitle().compareTo(b1.getTitle())); // (매개변수) -> 반환값

        for (BookDTO book : bookList) {
            System.out.println(book);
        }


    }
}
