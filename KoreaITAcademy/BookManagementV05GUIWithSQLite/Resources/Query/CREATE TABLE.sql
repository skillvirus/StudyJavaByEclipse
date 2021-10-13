--사용자 정보
CREATE TABLE UserInfo
(
	UserID		 INTEGER,
	UserName 	 TEXT,
	UserPhoneNum TEXT
)

--도서 정보
CREATE TABLE BookInfo
(
	BookID		INTEGER,
	BookTitle	TEXT,
	BookISBN	TEXT
)

--도서 대여 이력 정보
CREATE TABLE BookRentalHistoryInfo
(
	UserID		INTEGER,
	UserName	TEXT,
	BookID		INTEGER,
	BookName	TEXT,
	RentalReturnType TEXT,
	RentalReturnDate TEXT
)