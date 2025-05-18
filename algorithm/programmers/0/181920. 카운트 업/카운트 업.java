class Solution {
    public int[] solution(int start_num, int end_num) {
        /*
         * ✅ 정수 범위 배열 생성 문제
         *
         * - 주어진 두 수 start_num, end_num 사이의 모든 정수를 포함하는 배열 생성
         *   예: start_num = 3, end_num = 6 → [3, 4, 5, 6]
         *
         * 🔍 핵심 구현
         *   - 배열의 크기는 (end_num - start_num + 1)
         *   - for 루프를 통해 값들을 순차적으로 배열에 채움
         *
         * ✅ 기존 구현 방식
         *   - 배열 인덱스를 따로 idx로 관리하며, i와는 별도로 증가시킴
         *
         * ❗ 개선 가능 포인트
         *   - 별도의 인덱스 변수(idx)를 사용하지 않고, 루프 인덱스 i 자체를 활용하면 더 간결한 코드가 됨
         *   - 배열의 i번째 요소는 항상 (start_num + i)이므로 계산값을 직접 대입 가능
         *
         * ✅ 개선된 코드
         *
         *   public int[] solution(int start_num, int end_num) {
         *       int[] answer = new int[end_num - start_num + 1];
         *       for (int i = 0; i < answer.length; i++) {
         *           answer[i] = start_num + i;
         *       }
         *       return answer;
         *   }
         *
         * ⏱ 성능
         *   - 시간복잡도 O(n), 공간복잡도 O(n)으로 매우 효율적
         *   - 단순 반복 구조로, 모든 테스트 케이스에서 안정적으로 동작함
         */
        int[] answer = new int[end_num - start_num + 1];
        int idx = 0;
        for (int i = start_num; i < end_num + 1; i++) {
            answer[idx] = i;
            idx++;
        }
        return answer;
    }
}
