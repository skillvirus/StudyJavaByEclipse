----------DDL(Data Define Language)----------
--테이블 만들기
CREATE TABLE BookInfo
(
	BookID		INTEGER NOT NULL,
	BookTitle	TEXT NOT NULL,
	BookISBN	TEXT,
	PRIMARY KEY(BookID AUTOINCREMENT)
)

CREATE TABLE UserInfo
(
	UserID			INTEGER NOT NULL,
	UserName		TEXT NOT NULL,
	UserPhoneNum	TEXT,
	PRIMARY KEY(UserID AUTOINCREMENT)
)

CREATE TABLE BookInOut
(
	UserID		INTEGER NOT NULL,
	UserName 	TEXT NOT NULL,
	BookID		INTEGER NOT NULL,
	BookTitle	TEXT NOT NULL,
	InOutType	TEXT,
	InOutDate	TEXT
)

--테이블 지우기
DROP TABLE BookInOut

--컬럼 추가하기
ALTER TABLE BookInOut
ADD COLUMN InOutTime TEXT

--컬럼 이름 변경하기
ALTER TABLE BookInOut
RENAME COLUMN InOutTime TO InOutTM

--컬럼 지우기(SQLite 는 지워하지 않음)
ALTER TABLE BookInOut
DROP COLUMN InOutTM

/*
1. 새로운 테이블 생성(지우고 싶은 컬럼이 없는 구조)
2. 데이터 옮김
3. 기존 테이블 생성
4. 신규 테이블 이름 변경
*/





