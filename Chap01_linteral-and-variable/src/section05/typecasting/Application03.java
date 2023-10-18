package section05.typecasting;

public class Application03 {
    public static void main(String[] args){
        /* 자동 형변환과 강제 형변환을 이용한 다른 자료형끼리의 연산
        * 다른 자료형 끼리 연산은 큰 자료형으로 자동 형변환 후 연산처리 된다.
        * */

        int inum = 10;
        long lnum = 10L;

        /* 자바에서는 같은 자료형끼리만 연산이 가능하다
        * 따라서 서로 자료형이 다른 두 자료를 연산할 때 자료형이 같아지도록 형 변환을 해주어야 한다. */

        int isum = inum + (int)lnum;
        // 1번 10 + (int)10; int로 변환해서 계산
        isum = (int)(inum + lnum);
        // 10L + 10L = (int)20; 결과를 int로 변환

        byte bnum = 1;
        short snum = 2;
        short snum2 = 3;
        short snum3 = 3;

        int result1 = bnum + snum2; // byte를 short로 자동형변환해 계산한 후 결과값을 int로 형변환한다. 실제로 int로 모두 변환된 상태(long 제외)에서 계산해 제시된 자료형으로 결과값을 내놓는다.
        int result2 = snum2 + bnum;
        int result3 = bnum + result1;
    }
}
