package main.java.com.ohgiraffers.section01.init;

public class Application {
    public static void main(String[] args){
        /*
         * 객체 배열은 레퍼런스 변수에 대한 배열이다.
         * 생성한 인스턴스도 배열을 이용해서 관리하면
         * 동일한 타입의 여러 개 인스턴스를 각각 취급하지 않고 연속 처리할 수 있어서 유용하다.
         * 또한 반환값은 1개의 값만 반환할 수 있기 때문에
         * 동일한 타입의 여러 인스턴스를 반환해야 하는 경우가 객체배열을 이용할 수 있다.
         * */

        Car car1 = new Car("페라리", 300, 5000);
        Car car2 = new Car("람보르기니", 350, 2000);
        Car car3 = new Car("롤스로이스", 250, 2000);
        Car car4 = new Car("부가티베이론", 400, 1800);
        Car car5 = new Car("포터",500, 3300);

        car1.driveMaxSpeed();
        car2.driveMaxSpeed();
        car3.driveMaxSpeed();
        car4.driveMaxSpeed();
        car5.driveMaxSpeed();
        //수가 많아질수록 비효율적임 그래서 객체배열을 사용한다

        Car[] carArray = new Car[6];

        carArray[0] = new Car("페라리", 300, 5000);
        carArray[1] = new Car("람보르기니", 350, 4000);
        carArray[2] = new Car("롤스로이스", 250, 3000);
        carArray[3] = new Car("부가티베이론", 400, 2500);
        carArray[4] = new Car("포터",500, 3300);
        carArray[5] = new Car("d",100, 4500);

        System.out.println("===================== carArray ========================");
        for(int i = 0; i<carArray.length; i++){
            carArray[i].driveMaxSpeed();
        }
        System.out.println("===================== carArray ========================");
        Car[] carArray2 = {
                new Car("페라리",300,5000),
                new Car("티코",400,2000),
                new Car("포터",400,3000)
        };

        //2의 배수의 인덱스의 값만 변경하고자 하는경우는 for문이 편함

        for(Car car :carArray2) { //carArray2에 있는 0번째 인덱스부터 3번쨰 인덱스까지 쭉 실행됨
            car.driveMaxSpeed();
        }
    }
}

//과제
//바둑판 만들기 (2차원 배열을 사용)

//주말과제
//콘솔 프로그램
//객체지향 적으로