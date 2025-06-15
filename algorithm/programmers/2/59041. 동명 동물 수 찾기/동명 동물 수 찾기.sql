/** 📌 이름 중복 데이터 추출 (HAVING 절 활용)

  ✅ 핵심 로직
  - ANIMAL_INS 테이블에서 이름(NAME)이 NULL이 아닌 경우만 필터링
  - 동일한 NAME 기준으로 GROUP BY 후, 각 이름별 등장 횟수를 COUNT로 집계
  - HAVING 절을 사용하여 집계 결과 중 COUNT > 1인 이름만 선택
  - 이름 오름차순 정렬로 결과 출력

  ✅ HAVING 절이란?
  - GROUP BY로 묶인 집계 결과에 조건을 거는 필터링 절
  - WHERE는 집계 이전의 행에 필터를 적용하고,
    HAVING은 집계 이후 결과에 조건을 적용함
  - 예: "이름별 개수가 1개 초과인 경우만 출력" 같은 조건을 적용할 때 사용

  ✅ 성능 분석
  - COUNT 함수는 NULL을 제외하고 세기 때문에 WHERE NAME IS NOT NULL은 중복된 필터이나,
    명시함으로써 쿼리 가독성과 의도 명확성을 높임
  - GROUP BY + HAVING 구조는 인덱스 활용이 제한되므로 대용량 테이블에서는 튜닝 필요

  ✅ 실무 활용도
  - 중복된 사용자 이름, 이메일, 휴대폰 번호 등 데이터 품질 이슈 탐색에 활용
  - 로그 분석, 설문조사 응답, 거래 기록 등에서 "자주 나타나는 항목" 파악
  - BI 대시보드나 리포트용 통계 필터링에서 빈도 조건 설정 시 핵심 쿼리 구조
  - WHERE + GROUP BY + HAVING + ORDER BY 구조는 실무 보고서 쿼리의 기본 골격

  ✅ 보완 포인트
  - COUNT(*)와 COUNT(NAME)은 결과상 동일하지만, 명확성을 위해 칼럼명 사용
  - GROUP BY 대상이 여러 개인 경우 정렬 기준과 컬럼 선택에 유의
  - 데이터 정합성을 위해 정렬 기준과 필터 조건을 명확히 작성해야 함

  ✅ 확장 아이디어
  - HAVING COUNT(*) > 10 처럼 조건을 확장하여 '우수 고객' 선정 등에 활용 가능
  - SELECT NAME, COUNT(*) ... → 차후 JOIN으로 사용자 ID 연결 시도 가능
*/
SELECT NAME
     , COUNT(NAME) AS COUNT
  FROM ANIMAL_INS 
 WHERE NAME IS NOT NULL
 GROUP BY NAME
HAVING COUNT(NAME) > 1
 ORDER BY NAME;
