-- 코드를 입력하세요
SELECT t1.TITLE, t1.BOARD_ID, t2.REPLY_ID, t2.WRITER_ID, t2.CONTENTS, TO_CHAR(t2.CREATED_DATE, 'YYYY-MM-DD') AS CREATED_DATE
  FROM USED_GOODS_BOARD t1
 INNER JOIN USED_GOODS_REPLY t2
    ON t1.BOARD_ID = t2.BOARD_ID
 WHERE t1.CREATED_DATE BETWEEN TO_DATE(20221001, 'YYYY-MM-DD') AND TO_DATE(20221031, 'YYYY-MM-DD')
 ORDER BY t2.CREATED_DATE ASC, t1.TITLE ASC;