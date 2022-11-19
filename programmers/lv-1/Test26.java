class Solution {
    /*
      문제 설명
        두 정수 left와 right가 매개변수로 주어집니다. 
        left부터 right까지의 모든 수들 중에서, 
        약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.

      제한사항
        1 ≤ left ≤ right ≤ 1,000
    */
    public int solution(int left, int right) {
      
      //약수가 홀수인 숫자는 제곱근을 가지는 경우 외에는 없다
      int answer = 0;

      for(int i=left; i<=right; i++) {
          if(i % Math.sqrt(i) == 0) {
            answer -= i;
          } else {
            answer += i;
          }
        }
        return (int)answer;
      }
}