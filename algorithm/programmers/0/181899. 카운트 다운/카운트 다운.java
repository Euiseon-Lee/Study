class Solution {
    public int[] solution(int start_num, int end_num) {
        /**
         * 🔽 감소 수열 생성: start_num부터 end_num까지 1씩 감소하는 정수 배열 구성
         *
         * ✅ 문제 충실도
         * - start_num부터 end_num까지 "감소하는 정수 배열"이라는 조건을 정확히 구현함
         * - 종료 조건을 `i > end_num - 1`로 설정하여 inclusive 범위(end_num 포함)를 정확히 다룸 ✔
         * - 배열 크기를 `start_num - end_num + 1`로 사전 계산하여 List 없이 처리 ✔
         *
         * ✅ 성능 및 구조
         * - 배열을 직접 생성하고 바로 값 대입 → GC 부담 없음, 박싱/언박싱 없음
         * - 반복문 조건이 명확하고 종료도 안전하게 설정되어 있어 구조적 안정성 우수
         * - 테스트 전 구간에서 0.01~0.03ms로 일관된 성능을 보임
         *
         * ✅ 실무 적용 팁
         * - 범위 기반 루프에서 증가/감소 방향을 잘못 잡는 실수가 많음 → 종료 조건에 유의할 것
         * - 루프 내 조건 없이 바로 대입 가능하면 idx 관리로 성능과 가독성 모두 챙길 수 있음
         * - 배열 크기가 정해져 있을 때는 List보다 배열이 훨씬 효율적임
         *
         * ✅ 정리
         * - 실수 없이 조건을 정확하게 다룬 점이 인상적이야
         * - 루프 스텝 방향과 종료 조건을 감각적으로 다룰 수 있는 능력이 중요하다는 걸 체감했을 거야
         * - 반복 구조의 방향성과 index 계산이 꼬일 수 있는 문제에서 실수 없이 처리한 점, 굿!
         */
        int[] answer = new int [start_num - end_num + 1];
        for (int i = start_num, idx = 0; i > end_num - 1; i--) {
            answer[idx++] = i;
        }
        return answer;
    }
}
