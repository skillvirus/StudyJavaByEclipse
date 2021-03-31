----------DML(Data Manupulation Language)----------
/*
--조회
SELECT		[컬럼명]
FROM		[테이블명]
WHERE		[컬럼명] = 조건 --옵션
			AND [컬럼명] = 조건 --옵션
			OR
			IN ()

--수정
UPDATE		[테이블명]
SET			[컬럼명] = 수정하고싶은 데이터
WHERE		[컬럼명] = 조건 --옵션
			AND [컬럼명] = 조건 --옵션

--삭제
DELETE		
FROM		[테이블명]
WHERE		[컬럼명] = 조건 --옵션
			AND [컬럼명] = 조건 --옵션

--저장(등록)
INSERT INTO [테이블명]
(
[컬럼명],
...
)
VALEUS
(
저장하고싶은 데이터,
...
)
*/

--조회
SELECT		UserID,
			UserName,
			BookID,
			BookTitle,
			InOutType,
			InOutDate,
			InOutTM
FROM		BookInOut

--수정
UPDATE		BookInOut
SET			InOutTM = "08:10"
WHERE		UserID = 1
			AND BooKID = 1
			AND InOutType = 'I'
			AND InOutDate = '2021-02-26'
			
--삭제
DELETE
FROM		BookInOut
WHERE		UserID = 1
			AND BooKID = 1
			AND InOutType = 'I'
			AND InOutDate = '2021-02-26'
			
--저장
INSERT INTO BookInOut
(
	UserID,
	UserName,
	BookID,
	BookTitle,
	InOutType,
	InOutDate,
	InOutTM
)
VALUES
(
	1,
	'홍길동',
	1,
	'공정하다는착각',
	'I',
	'2021-02-26',
	'10:00'
)

