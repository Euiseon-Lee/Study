import java.util.Arrays;
import java.util.HashMap;

class Solution {
    /*
      문제 설명
        외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다. 
        정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.

      제한사항
        중복된 원소는 없습니다.
        1 ≤ emergency의 길이 ≤ 10
        1 ≤ emergency의 원소 ≤ 100
    */
    public int[] solution(int[] emergency) {
      int[] copyArr = emergency.clone();
      Arrays.sort(copyArr);
      HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(){{
        int rank = copyArr.length;
        for (int i=0; i<copyArr.length; i++) {
          put(copyArr[i], rank);
          rank--;
        }
      }};


      for (int i=0; i<emergency.length; i++) {
        emergency[i] = map.get(Integer.valueOf(emergency[i]));
      }
        return emergency;
    }
}
