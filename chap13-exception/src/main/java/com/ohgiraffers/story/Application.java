package main.java.com.ohgiraffers.story;

public class Application {
    public static void main(String[] args){
        /*
        * 개발관련 목표가 없던 지올팍
        * 그는 강사에게 과제를 받았다.
        * 과제는 job에 대한 조사를 하는 것이다.
        * 생각보다 직업이 많아서 고민을 하던 지올팍
        * 배열을 가지고 직업 리스트를 만들기로 하였다.
        * */
        // 처음 개발 관련 직군이 몇 개가 있는지 모르는 지올팍
        // ArrayList를 사용하는 것이 아직은 익숙하지 않아
        // 상대적으로 접근하기 쉬운 배열로 관리하기로 했다.

        jobs[] jobList = new jobs[5];

        try {
            jobList[0] = new jobs(1, "백엔드");
            jobList[1] = new jobs(2, "프론트엔드");
            jobList[2] = new jobs(3, "데브옵스");
            jobList[3] = new jobs(4, "DBA");
            jobList[4] = new jobs(5, "PM");
            // ArrayIndexOutOfBoundsException가 발생함에 따라서 프로그램이 동작을 멈춤
            jobList[5] = new jobs(6, "PL");
            jobList[6] = new jobs(7, "BigData");
//        }catch(Exception e){ // Exception으로 쓸 경우 광범위하게 잡아주기 때문에 추후에 처리를 모두 쓸모없게 만든다. 단, 이럴 경우 예외를 상속받아 재정의할 때 문제가 생길 수 있다.
//            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e){ // 예외 또한 클래스, 예외가 catch에 해당하는 것이 아니면 처리하지 못한다. 그 경우는 프로그램이 종료된다.
            e.printStackTrace(); // 에러를 출력하지 않는 것은 개발에 좋은 일이 아니다.
        }finally { // 예외가 발생하든 아니든 무조건 실행됨
            System.out.println("실행됨");
        }

        for(int i = 0; i < jobList.length; i++){
            System.out.println(jobList[i]);
        }
    }
}
