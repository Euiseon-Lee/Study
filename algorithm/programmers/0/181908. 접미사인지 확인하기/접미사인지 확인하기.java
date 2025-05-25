class Solution {
    public int solution(String my_string, String is_suffix) {
        /**
         * 🔍 접미사 확인 문제
         *
         * 주어진 문자열 my_string이 특정 문자열 is_suffix로 끝나는지를 확인하여
         * 조건에 맞으면 1, 아니면 0을 반환함
         *
         * ✅ 현재 구현 방식
         * - is_suffix의 길이가 my_string보다 길면 무조건 0을 반환
         * - my_string의 마지막 인덱스에서 is_suffix가 시작되는 위치를 비교함
         * - my_string.lastIndexOf(is_suffix) == (my_string.length() - is_suffix.length())
         *   이 조건이 만족되면 is_suffix는 접미사에 해당함
         *
         * ✅ 장점
         * - 별도의 문자열 생성 없이 내장 API로 인덱스 위치만 비교하여 처리하므로 간결함
         * - 문자열 길이 체크로 불필요한 연산 방지
         * - 모든 테스트를 정확하게 통과하며 평균 실행 시간도 매우 빠름
         *
         * ⚠️ 개선 여지
         * - Java 11 이상에서는 my_string.endsWith(is_suffix) 메서드를 활용하면
         *   의도를 더 명확하게 표현할 수 있음
         * - 기능은 동일하지만 가독성과 표현력이 향상됨
         *
         * 🛠 개선 코드 예시 (동일 기능, 더 직관적인 방식)
         *
         *     if (my_string.endsWith(is_suffix)) {
         *         return 1;
         *     }
         *     return 0;
         *
         * ⏱ 성능 비교
         * - 두 방식 모두 시간복잡도는 O(n) (n은 is_suffix.length)
         * - lastIndexOf + 길이 비교보다 endsWith는 내부적으로 더 최적화된 방식 사용 가능
         * - 실질적인 속도 차이는 거의 없지만 코드 의도 전달에는 endsWith가 더 유리함
         *
         * 🧠 정리
         * - 현재 구현은 성능과 정확성 모두 우수함
         * - endsWith 사용 시 코드 간결성 및 의미 명확화 가능
         * - 문자열 비교 문제에서는 내장 메서드를 적극 활용하는 것도 좋은 선택
         */        
        int answer = 0;
        if (is_suffix.length() > my_string.length()) {
            return answer;
        }                           
        if (my_string.lastIndexOf(is_suffix) == (my_string.length() - is_suffix.length())) {
            answer = 1;
        }    
        return answer;
    }
}
