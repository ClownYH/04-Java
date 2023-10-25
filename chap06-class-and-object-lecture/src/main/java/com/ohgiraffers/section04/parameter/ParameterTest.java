package main.java.com.ohgiraffers.section04.parameter;

public class ParameterTest {

    public void testPrimaryTypeParameter(int num){
        System.out.println("매개변수로 잔달받은 값 : " + num);
    }

    public void testPrimaryTypeArrayParameter(int[] iarr){
        System.out.println("매개변수로 전달받은 값 : " + iarr);

        System.out.println("배열의 값 출력 : ");
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
        iarr[0] = 99;
        System.out.println("변경 후 배열의 값 출력 : ");
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
    }

    public void testClassTypeParameter(RectAngle rectAngle){
        System.out.println("매개변수로 전달받은 값 : " + rectAngle);

        System.out.println("변경 전 사각형의 넓이와 둘레 =======");
        rectAngle.calcArea();
        rectAngle.calcRound();
        System.out.println("변경 후 사각형의 넓이와 둘레 =======");
        rectAngle.setWidth(100);
        rectAngle.setHeight(100);
        rectAngle.calcArea();
        rectAngle.calcRound();
    }

    public void testVariableLengthArrayParameter(String name, String... hobby){ // ... : 가변별, 내용갯수를 알 수 없을 때

        System.out.println("이름 : " + name);
        System.out.println("취미의 갯수 : " + hobby.length);
        System.out.println(hobby.hashCode());
        System.out.print("취미 : ");
        for (String hobbys: hobby) {
            System.out.println(hobbys + " ");
        }
        System.out.println();
    }
}
