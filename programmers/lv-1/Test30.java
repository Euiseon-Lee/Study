class Solution {
    /*
      문제 설명
        두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 
        배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 
        예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.

      제한 사항
        두 수는 1이상 1000000이하의 자연수입니다.
    */
    public int[] solution(int n, int m) {
	    //처리 속도 0.02 ~ 0.11ms
      int[] answer = new int[2];
      answer[0] = gcd(n, m);
      int transN = n/answer[0];
      int transM = m/answer[0];
      answer[1] = answer[0]*transM*transN;

      return answer;		
    }
	
   public static int gcd(int num1, int num2) {

        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);
        int tmp = a;
        int c = 0;

        while (b!=0) {
            c = a%b;
            a = b;
            b = c;
        }
        return a;
    }
}
