class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        /*
         * ✅ 현재 코드 구조 분석
         *
         * - 주어진 배열 arr의 쌍 인덱스를 담고 있는 queries 배열에 대해,
         *   arr[a]와 arr[b]를 순차적으로 swap하여 결과 배열을 반환함
         * - 배열을 직접 수정하며 in-place 방식으로 처리됨
         *
         * - 시간 복잡도: O(q) (q = queries.length)
         * - 공간 복잡도: O(1) (추가 메모리 없음)
         *
         * - 현재 구조는 성능상 가장 효율적인 형태이며, 테스트 결과도 매우 빠름
         *   → 대부분 테스트에서 0.01ms ~ 0.09ms 사이로 수행됨
         *
         *
         * ✅ 변수 분리 사용에 대한 고려
         *
         * - queries[i][0], queries[i][1]을 각각 a, b로 분리하여 의미 명확화
         *
         *   예)
         *     int a = queries[i][0];
         *     int b = queries[i][1];
         *
         * - 변수 사용은 성능 저하 없이 다음과 같은 이점을 줌
         *   - 중복 표현 제거 및 오타 방지
         *   - 쿼리 구조가 변경될 경우 수정이 쉬움
         *   - 디버깅 시 a, b를 로그로 출력하거나 추적하기 유리
         *
         * 🔍 테스트 결과
         *   - 변수 미사용 vs 사용 간 실행 시간 차이는 0.01ms 이내의 미세 차이
         *   - 루프 규모가 작을 경우 성능상 무의미하며, 오히려 가독성 측면에서 변수 분리가 권장됨
         *
         *
         * ✅ 다른 사람의 코드 (Arrays.copyOf 사용 방식)
         *
         *   int[] answer = Arrays.copyOf(arr, arr.length);
         *   ...
         *   swap(answer[a], answer[b]);
         *   return answer;
         *
         * - 이 방식은 입력 배열 arr을 보호하고, 복사된 배열에 대해 작업함
         * - 외부로부터 받은 배열이 변경되면 안 되는 경우나, side effect 방지가 필요한 상황에서 매우 유용함
         *
         * 🔍 실무 적용 포인트
         *   - public API나 외부 의존성이 있는 메서드에서 원본 보호가 필요할 경우 Arrays.copyOf 사용
         *   - 테스트나 임시 처리에서는 직접 수정이 성능상 유리
         *
         * 💡 선택 기준 정리
         *   - 원본 배열을 안전하게 보존해야 한다면 → Arrays.copyOf
         *   - 내부 계산, 일회성 작업, 성능 우선 → in-place swap 방식
         *
         *
         * ✅ 결론
         *
         * - 현재 작성된 코드는 in-place 방식으로 성능이 가장 우수하며, 문제 요구사항에 정확히 부합함
         * - 변수 분리는 성능 차이는 없지만, 안정성과 명확한 의미 전달을 위해 좋은 습관
         * - 실무에서는 입력 데이터를 직접 수정할지 여부에 따라 복사 방식 선택이 중요함
         */
        for (int i = 0; i < queries.length; i++) {
            int tmp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = tmp;
        }
        return arr;
    }
}
