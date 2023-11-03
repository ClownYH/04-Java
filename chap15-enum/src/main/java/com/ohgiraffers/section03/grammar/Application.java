package main.java.com.ohgiraffers.section03.grammar;

import java.util.EnumSet;
import java.util.Iterator;

public class Application {

    public static void main(String[] args){

        UserRole1 admin = UserRole1.ADMIN;
        System.out.println(admin);
        System.out.println(admin.getNameToLowerCase());

        System.out.println("========================");

        UserRole2 consumer = UserRole2.CONSUMER;
        UserRole2 consumer2 = UserRole2.CONSUMER;
        System.out.println(consumer == consumer2); // 값을 꺼내와서 비교하는 것. enum는 이름을 기준으로 비교하기 때문에 그렇다.

        System.out.println(consumer.hashCode());
        System.out.println(consumer2.hashCode());
        System.out.println("========================");

        EnumSet<UserRole2> roles = EnumSet.allOf(UserRole2.class);
        Iterator<UserRole2> iter = roles.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next().name());
        }

        System.out.println("==========================");
        EnumSet<UserRole2> notGuest = EnumSet.complementOf(EnumSet.of(UserRole2.GUEST)); // complementOf() 빼기
        Iterator<UserRole2> notGuestIter = notGuest.iterator();

        while(notGuestIter.hasNext()){
            UserRole2 role2 = notGuestIter.next();
            System.out.println(role2.ordinal() + " " + role2.getDescription());
        }

    }
}
