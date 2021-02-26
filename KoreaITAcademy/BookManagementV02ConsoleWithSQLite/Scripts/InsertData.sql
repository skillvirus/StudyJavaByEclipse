
DELETE FROM BookInfo;
--도서 정보 INSERT
INSERT INTO BookInfo (BookID, BookTitle, BookISBN) VALUES 
(1, '공정하다는착각', '9791164136452'),
(2, '역사의쓸모', '9791130621968'),
(3, '사피엔스', '9788934972464'),
(4, '정의란무엇인가', '9788937834790'),
(5, '어른의어휘력', '9791190710053')
;


DELETE FROM UserInfo;
--사용자정보 INSERT
INSERT INTO UserInfo (UserID, UserName, UserPhoneNum) VALUES
(1, '홍길동', '010-1111-1111'),
(2, '이순신', '010-2222-2222'),
(3, '강감찬', '010-3333-3333'),
(4, '이율곡', '010-4444-4444')
;




