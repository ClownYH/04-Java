package section02.variable;

public class Application01 {
    public static void main(String[] args){
        /*
        * 수업 목표. 변수의 사용 목적에 대하여 이해할 수 있다.
        *
        * 필기
        * 변수의 사용 목적
        * 1. 값에 의미를 부여하기 위한 목적(의미 전달이 쉬워야 코드를 읽기 쉬워지고, 협업 및 유지보수에 유리하기 때문이다.)
        * 2. 한 번 저장해 둔 값을 재사용하기 위한 목적(변수를 이용하여 코드를 작성하면 값을 변경할 때도 보다 간편하게 변경할 수 있다.)
        * 3. 시간에 따라 변하는 값을 저장하고 사용할 수 있다.(변하는 값을 저장하기 위한 공간이다.)
        * */

        System.out.println("============== 값에 의미를 부여 ==============");
        System.out.println("첫 달 김 과장님 보너스를 포함한 급여 : " + (100+20) + "만원");
        System.out.println("두쨰 달 김과장님 보너스 미포함 급여 : " + 100 + "만원");

        /* 값을 재사용하기 위한 목적으로 사용한다. */
        int salary = 100;
        int bonus = 20;

        System.out.println("첫 달 김 과장님 보너스를 포함한 급여: "+ (salary + bonus) + "만원");
        System.out.println("첫 달 김 과장님 보너스를 포함한 급여: "+ (salary + bonus) + "만원");
        System.out.println("첫 달 김 과장님 보너스를 포함한 급여: "+ (salary + bonus) + "만원");
        System.out.println("두째 달 김 과장님 보너스를 포함한 급여: "+ (salary) + "만원");
        System.out.println("두째 달 김 과장님 보너스를 포함한 급여: "+ (salary) + "만원");
        System.out.println("두째 달 김 과장님 보너스를 포함한 급여: "+ (salary) + "만원");

        /* 시간에 따라 변경되는 값을 저장하고 사용할 수 있다. */
        String name = "김 쿠팡";
        int point = 100;

        System.out.println(name + "은 쇼핑몰 중독이다. \n 지난달 " + name + "의 쿠팡의 보너스 포인트는 " + point + "였다.");
        point += 100;
        point = point + 100;
        System.out.println(name + "이번달 " + name + "의 쿠팡의 보너스 포인트는 " + point + "이다.");
    }
}
