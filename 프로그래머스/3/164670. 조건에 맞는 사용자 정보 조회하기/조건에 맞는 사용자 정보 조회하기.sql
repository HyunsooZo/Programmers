SELECT
    ugu.USER_ID,
    ugu.NICKNAME,
    CONCAT(ugu.CITY,' ',ugu.STREET_ADDRESS1,' ',ugu.STREET_ADDRESS2) AS '전체주소',
    CASE LENGTH(ugu.TLNO)
        WHEN 11 THEN CONCAT(LEFT(ugu.TLNO, 3), '-', MID(ugu.TLNO, 4, 4), '-', RIGHT(ugu.TLNO, 4))
        WHEN 10 THEN CONCAT(LEFT(ugu.TLNO, 3), '-', MID(ugu.TLNO, 4, 3), '-', RIGHT(ugu.TLNO, 4))
    END AS '전화번호'
FROM (
    SELECT 
        WRITER_ID,
        COUNT(*)
    FROM USED_GOODS_BOARD 
    GROUP BY WRITER_ID
    HAVING COUNT(*) >= 3
    ) AS ugb
LEFT JOIN USED_GOODS_USER AS ugu
ON ugb.WRITER_ID = ugu.USER_ID
ORDER BY 1 DESC