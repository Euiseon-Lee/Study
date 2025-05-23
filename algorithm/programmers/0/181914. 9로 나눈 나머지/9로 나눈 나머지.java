class Solution {
    public int solution(String number) {
        /**
         * 문자열로 주어진 큰 수를 9로 나눈 나머지를 계산함
         *
         * 💡 문제 배경:
         * - 어떤 수의 각 자리수를 더한 값은 원래 수를 9로 나눈 나머지와 같음
         * - 해당 성질을 이용해 큰 수에 대한 나머지 계산을 수행함
         *
         * ✅ 코드 구현:
         * - 문자열 길이가 18자리 초과 시, 각 자리수를 더해 나머지를 구함
         * - 18자리 이하일 경우 long으로 파싱 후 % 9 연산 수행함
         * - List → int[] 변환에는 stream().mapToInt(Integer::intValue).toArray() 사용 가능함
         *
         * ⚠ long 사용 이유:
         * - int 범위: 최대 10자리, long 범위: 최대 19자리
         * - 숫자가 클 경우 int 파싱 중 예외 발생 가능함
         * - 일반적으로 18자리를 기준으로 분기 처리함
         * - long 사용 시 파싱 안정성과 계산 정확성 확보 가능함
         *
         * ⏱ 시간복잡도:
         * - O(n), n은 문자열 길이
         * - 자리수 합산만 수행하므로 연산량 적음
         */
        int answer = 0;
        
        // Long 범위 (일반적으로 18자리 이하)를 초과하는 경우, 직접 자리수 합산
        if (number.length() > 18) {
            for (int i = 0; i < number.length(); i++) {
                char c = number.charAt(i);
                answer += c - '0';
            }
            answer %= 9;
        } else {
            // 18자리 이하일 경우, long으로 변환 후 나머지 연산 수행
            answer = (int) (Long.parseLong(number) % 9);
        }
        return answer;
    }
}
