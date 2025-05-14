class Solution {
    public String solution(String str1, String str2) {
        /*
         * ❗ 잘못된 코드 예시:
         *
         *   answer.append((char) str1.charAt(i) + str2.charAt(i));
         *
         * ⛔ 예상 출력: "ababababab"
         * ❌ 실제 출력: "195195195195195"
         *
         * 이유는 자바의 '연산 우선순위'와 '타입 승격 규칙' 때문임.
         *
         * -------------------------------------------------------
         * ✅ 처리 과정 상세 분석:
         *
         * 1. str1.charAt(i) 와 str2.charAt(i) 는 둘 다 char 타입.
         *    예를 들어, 'a' 와 'b' 라면 각각 유니코드 값은 97, 98.
         *
         * 2. 자바에서는 char, byte, short 타입이 산술 연산에 사용되면
         *    자동으로 int로 "승격(promoted)"됨.
         *    → 즉, char + char = int + int = int
         *
         * 3. 표현식 (char) str1.charAt(i) + str2.charAt(i) 는 아래와 같이 평가됨:
         *
         *    1) str1.charAt(i) → 'a' → 97
         *    2) str2.charAt(i) → 'b' → 98
         *    3) (char) 97 + 98 → (char) 195 (⚠ 'a'만 캐스팅되고 덧셈이 먼저 일어남!)
         *    4) 결과는 유니코드 195 → 'Ã'
         *
         * 4. 하지만 append((char)195) 는 'Ã'를 문자로 붙이는 것이 아니라,
         *    내부적으로 정수 오버로드 메서드 append(int)를 호출하여
         *    숫자 195를 문자열 "195"로 변환하여 붙여버림.
         *
         *    즉, append((char)195) → append(int) → "195"
         *
         * -------------------------------------------------------
         * 💡 해결 방법:
         *
         * 1. 가장 안전하고 명확한 방식:
         *    answer.append(str1.charAt(i)).append(str2.charAt(i));
         *
         * 2. 또는 문자열 연결을 유도하기 위해 ""를 붙여도 됨:
         *    answer.append("" + str1.charAt(i) + str2.charAt(i));
         *    → 단, 성능은 append 두 번보다 떨어질 수 있음
         *
         * -------------------------------------------------------
         * 📌 요약:
         * - char + char → int 덧셈이므로 문자 결합이 아님!
         * - (char) 캐스팅보다 + 연산이 먼저 처리됨 (우선순위 때문)
         * - append(char)도 내부에서 int로 처리되면 숫자 출력됨
         * - 문자열 결합이 필요할 때는 append를 명확하게 나눠 쓰는 것이 가장 안전함.
         */
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            answer.append(str1.charAt(i)).append(str2.charAt(i));
        }
        return answer.toString();
    }
}
