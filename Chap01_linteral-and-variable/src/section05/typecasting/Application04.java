package section05.typecasting;

public class Application04 {
    public static void main(String[] args){

        int inum = 290;
        byte bnum = (byte) inum;
        System.out.println("inum : " + inum);
        System.out.println("bnum : " + bnum); // 비트 앞부분의 손질로 인해 예측이 어렵다.

        double height = 178.5;
        int floorHeight = (int)height; // 내림처리한다.
        System.out.println("height : " + height);
        System.out.println("floorHeight : " + floorHeight);

        /* 5명의 반 학생이 있으며 학생들의 키는 각각
        *  178.5
        *  170.3
        *  190.7
        *  188. 678
        *  160.8
        *  이다.
        *  우리는 학생의 평균 키를 구해서 화면에 보여주고자 한다.(소수자리 절삭)
        *  화면에 보여지는 양식은 다음과 같다.
        *  1반 학생 5명의 키의 평균은 OOOcm 이다.*/

        int hAverage = (int)((178.5 + 170.3 + 190.7 + 188.678 + 160.8) / 5);
        System.out.println("1반 학생 5명의 키의 평균은 " + hAverage + "이다.");


        /* 문자 z에 대응하는 숫자를 화면에 출력해주세요. */

        char ch = 'z';
        int z = (int)(ch);
        System.out.println("문자 z에 대응하는 숫자 : " + z);


        long lnum = 10L;
        int num = 190;

        /* 아래의 연산의 차이를 옆사람에게 설명해주세요. */
        int sum = (int)num + num; // 계산 시점에서 int 자료형으로 값을 대입해 계산을 진행한다.
        int sum2 = (int)(num + lnum); // 계산 시점에서는 int 자료형으로 제시된 num 값을 long 자료형으로 형변환해 그 값을 lnum와 더한 후 int 자료형으로 다시 형변환한다.

        /* 사업을 시작한 홍길동은 10월 18일 매출에서 부가세(10%)를 제외한 소득을 알고 싶다.
        * 10-18의 매출은 다음과 같다.
        * 15400원
        * 1400원
        * 25000원
        * 30000원
        *
        * 여기서 부가세 10%는 변하지 않는 값이라는 점에 유의하자. */
        int income = 15400 + 1400 + 25000 + 30000;
        final float tax = 0.1f;

        int money = (int)(income-(income * tax));
        System.out.println("10월 18일의 부가세를 제외한 소득은 " + money + "원입니다.");


    }
}
