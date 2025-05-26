class Solution {
    public int solution(String my_string, String is_prefix) {
        /**
         * 🔍 접두사 확인 문제에 대한 구현 비교 분석
         *
         * ✅ 방식 1: substring 비교 방식
         *
         *     if (my_string.length() >= is_prefix.length()) {
         *         return my_string.substring(0, is_prefix.length()).equals(is_prefix) ? 1 : 0;
         *     }
         *     return 0;
         *
         * - 장점: 동작 원리를 직접 구현했기 때문에 내부 로직에 대한 명확한 이해가 드러남
         * - 단점: 불필요한 substring 객체 생성으로 인해 약간의 메모리 낭비 가능
         * - 주의점: 문자열 길이 비교 분기 없이 바로 substring을 수행하면 예외 발생 위험 있음
         *
         * ✅ 방식 2: startsWith 메서드 사용
         *
         *     return my_string.startsWith(is_prefix) ? 1 : 0;
         *
         * - 장점: 간결하고 명확하며, 내부적으로 경계 처리가 자동으로 이루어짐
         * - 단점: 내부 구현을 추상화하기 때문에 로직의 투명도는 낮을 수 있음 (하지만 신뢰도는 높음)
         * - 실무에서 일반적으로 권장되는 방식이며, 예외 처리도 필요 없음
         *
         * ⏱ 성능 비교
         * - 두 방식 모두 O(n) 수준의 성능이지만, startsWith는 내부적으로 최적화된 방식으로 처리되므로
         *   평균적으로 substring보다 안정적인 성능을 보임
         * - 실측에서도 startsWith가 메모리 및 실행 시간에서 약간 더 일관된 성능을 보임
         *
         * 🧠 실무 적합성
         * - startsWith는 Java String API의 대표적인 명시적 의도 표현 메서드로, 유지보수성과 가독성이 매우 뛰어남
         * - 코드 리뷰나 협업 환경에서도 직관적으로 의도를 전달하기 때문에 추천되는 방식
         * - 다만 예외 처리나 사용자 정의 로직이 필요한 경우에는 substring 방식이 더 유연하게 활용 가능함
         *
         * 📌 정리
         * - 단순 prefix 검사라면 startsWith 방식이 가장 적절함
         * - 직접 substring을 비교하는 방식은 문자열 처리 방식에 대한 정확한 이해도를 보여주는 좋은 연습이었음
         * - 이번 비교는 구현력과 API 활용 균형 감각을 모두 높일 수 있는 훌륭한 접근이었음
         */
        int answer = 0;
        int prefixLength = is_prefix.length();
        if (my_string.length() >= prefixLength) {
            answer = my_string.substring(0, prefixLength).equals(is_prefix) ? 1 : 0;
        }
        return answer;
        // return my_string.startsWith(is_prefix) ? 1 : 0;
    }
}
