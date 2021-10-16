--사용자 정보
CREATE TABLE UserInfo
(
	UserID		 TEXT,
	UserName 	 TEXT,
	UserPhoneNum TEXT
)

--도서 정보
CREATE TABLE BookInfo
(
	BookID		TEXT,
	BookTitle	TEXT,
	BookISBN	TEXT
)

--도서 대여 이력 정보
CREATE TABLE BookRentalHistoryInfo
(
	UserID		TEXT,
	UserName	TEXT,
	BookID		TEXT,
	BookTitle	TEXT,
	RentalReturnType TEXT,
	RentalReturnDate TEXT
)
