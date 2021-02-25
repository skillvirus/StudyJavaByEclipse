--Book(도서) 테이블 생성
CREATE TABLE Book
(
	ID			VARCHAR(20),
	BookName	VARCHAR(200),
	BookISBN	VARCHAR(20)
);

--User(사용자) 테이블 생성
CREATE TABLE User
(
	ID			VARCHAR(20),
	Name		VARCHAR(100),
	PhoneNum	VARCHAR(13)
);
