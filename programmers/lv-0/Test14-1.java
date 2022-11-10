import java.util.LinkedList;
import java.util.Queue;

class Solution {
    /*
      문제 설명
        문자열 my_string이 매개변수로 주어집니다. 
        my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.

      제한사항
        1 ≤ my_string ≤ 110
        my_string은 대문자, 소문자, 공백으로 구성되어 있습니다.
        대문자와 소문자를 구분합니다.
        공백(" ")도 하나의 문자로 구분합니다.
        중복된 문자 중 가장 앞에 있는 문자를 남깁니다.
    */
    public String solution(String my_string) {
      
        //처리 속도 0.58 ~ 1.25ms
        String[] trans = my_string.split("");
        Queue<String> qu = new LinkedList<>();

        for(int i=0; i<trans.length; i++) {
            if(qu.contains(trans[i])) {
                continue;
            } else {
                qu.add(trans[i]);
            }
        }

        System.out.println(qu);

        StringBuffer sb = new StringBuffer();
         while(!qu.isEmpty()) {
            sb.append(qu.poll());
        }

        return sb.toString();
    }
}
