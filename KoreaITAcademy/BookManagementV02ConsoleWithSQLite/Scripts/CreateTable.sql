--BookInfo(도서) 테이블 생성
CREATE TABLE "BookInfo" (
	"BookID"	INTEGER NOT NULL,
	"BookTitle"	TEXT NOT NULL,
	"BookISBN"	TEXT,
	PRIMARY KEY("BookID" AUTOINCREMENT)
);

--UserInfo(사용자) 테이블 생성
CREATE TABLE "UserInfo" (
	"UserID"	INTEGER NOT NULL,
	"UserName"	TEXT NOT NULL,
	"UserPhoneNum"	TEXT,
	PRIMARY KEY("UserID" AUTOINCREMENT)
);

--BookInOut(도서 대여) 테이블 생성
CREATE TABLE "BookInOut" (
	"UserID"	INTEGER NOT NULL,
	"UserName"	TEXT NOT NULL,
	"BookID"	INTEGER NOT NULL,
	"BookTitle"	TEXT NOT NULL,
	"InOutType"	TEXT,
	"InOutDate"	TEXT
);

DROP TABLE BookInfo;
DROP TABLE UserInfo;
DROP TABLE BookInOut;
