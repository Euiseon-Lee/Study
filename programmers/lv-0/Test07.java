import java.math.BigInteger;

class Solution {
    /*
    문제 설명
      머쓱이는 구슬을 친구들에게 나누어주려고 합니다. 구슬은 모두 다르게 생겼습니다. 
      머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때, 
      balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.

    제한사항
      1 ≤ balls ≤ 30
      1 ≤ share ≤ 30
      구슬을 고르는 순서는 고려하지 않습니다.
      share ≤ balls
    */
    public int solution(int balls, int share) {
        int mns = balls - share;
      
        //서로 다른 n개 중 m개를 뽑는 경우의 수 공식
        // == n!/((n-m)!*m!
        BigInteger answer = Factorial(balls).divide((Factorial(mns).multiply(Factorial(share)))) ;

        return answer.intValue();
    }


    public static BigInteger Factorial (int n) {

        BigInteger fac = BigInteger.ONE;

        for (int i=n; i>0; i--) {
            fac = fac.multiply(BigInteger.valueOf(i));
        }

        return fac;
    }

}
