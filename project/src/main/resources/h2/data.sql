INSERT INTO `product` (`idx`, `name`, `detail`, `price`, `category`, `status`, `image`, `highlight`) VALUES
	(2, '더블콤보', '팝콘(M)x2 + 탄산음료(M)x2', 13000, '세트', 1, '더블콤보.jpg', 1),
	(4, '라지콤보', '팝콘(L)x2 + 탄산음료(L)x2', 15000, '세트', 1, '라지콤보.jpg', 0),
	(5, 'DEC 골드클래스', '영화관람권', 40000, '관람권', 1, 'DEC 골드클래스.jpg', 0),
	(6, 'DEC 프리미엄 관람권', '영화관람권', 50000, '관람권', 1, 'DEC 프리미엄 관람권.jpg', 0),
	(7, 'DEC 영화관람권', '영화관람권', 13000, '관람권', 1, 'DEC 영화관람권.jpg', 0),
	(9, '동의 패키지ver2', '관람권x4 + 더블콤보x2', 72000, '콜라보', 1, '동의 패키지.jpg', 1),
	(10, '칠리치즈나쵸', '과자', 4000, '스낵', 1, '칠리치즈나쵸.jpg', 0),
	(11, '플레인핫도그', '핫도그', 4500, '스낵', 1, '플레인.jpg', 1),
	(12, '칠리치즈핫도그', '핫도그', 5000, '스낵', 1, '칠리치즈.jpg', 0),
	(13, '맛밤', '맛밤', 3500, '스낵', 1, '맛밤.jpg', 1),
	(15, '데이트 패키지', '관람권x2 + DEC콤보x1', 34000, '콜라보', 1, '데이트 패키지.jpg', 0),
	(16, '스몰세트', '팝콘(M)x1 + 탄산음료(M)x1', 7000, '세트', 1, '스몰세트.jpg', 0),
	(17, '좋은 날 패키지', '관람권x1 + 스몰세트x1', 18000, '콜라보', 1, '좋은 날 패키지.jpg', 1),
	(18, 'DEC콤보', '팝곤(L)x1 + 탄산음료(M)x2', 10000, '세트', 1, 'DEC콤보.jpg', 1);

	INSERT INTO `member` (`id`, `pw`, `name`, `regdt`, `gender`, `birthday`, `mail`, `grade`, `phone`, `mileage`, `authority`) VALUES
	('aaa', '$2a$12$RMvsDCXuu8uQTDu1WE/syOTPsNJ4TqC8COkfrGOSVFmlXWC7e8BAG', '홍길동', '2023-04-28 06:11:08', 1, '1990-01-01', 'aaa@mail.com', 'vip', '010-1234-5678', 1000, 'user'),
	('admin', '1234', '관리자', '2023-04-28 06:11:08', 0, '2023-04-11', 'xoals4831@naver.com', 'Bronze', '010-9391-4831', 1000, 'admin'),
	('asdfg', '12341234', 'ㅌㅅㅌ', '2023-05-04 05:39:49', 0, '2023-05-02', 'xoals4831@naver.com', 'Bronze', '010-3333-3333', 1000, 'user'),
	('bbb', '1234', '둘리', '2023-04-28 06:11:08', 1, '1990-01-01', 'bbb@mail.com', 'Bronze', '010-1234-5678', 1000, 'user'),
	('ccc', '1234', '도우너', '2023-04-28 06:12:10', 0, '2023-04-11', 'ccc@naver.com', 'Bronze', '010-1234-5678', 1000, 'user'),
	('hello', 'xoals123', '테스트', '2023-05-04 05:11:45', 0, '2023-03-16', 'asdf@naver.com', 'Bronze', '010-3333-3333', 1000, 'user'),
	('khg1894', 'goflvhxj1!', '김홍규', '2023-05-04 06:00:10', 0, '1998-08-03', 'khg1894@gmail.com', 'Bronze', '010-2333-5835', 1000, 'user'),
	('tested', '12341234', '홍길동', '2023-05-04 08:17:35', 0, '2023-02-08', 'xoals4831@naver.com', 'Bronze', '010-1234-5678', 1000, 'user'),
	('xoals', 'xoals123', '조영문', '2023-05-04 07:50:36', 0, '2023-05-02', 'asdf@naver.com', 'Bronze', '010-1111-1111', 1000, 'user');


INSERT INTO `board` (`idx`, `id`, `subject`, `content`, `secret`, `reg_date`, `count`, `filename`, `filesize`, `answer`) VALUES
                                                                                                                          (1, 'admin', '문의게시판 관리자 입니다.', '안녕하세요. \r\n\r\n문의게시판 관리자 입니다. \r\n\r\n많은 관심 부탁드립니다. \r\n\r\n감사합니다. ', '0', '2023-05-04 11:49:55', 9, NULL, 0, '이 곳에 답변이 등록됩니다. '),
                                                                                                                          (2, 'aaa', '영화 예매 어떻게 하나요? ', '영화 예매 어떻게 하나요? ', '0', '2023-05-04 11:50:20', 15, NULL, 0, '안녕하세요.  문의내용 답변 드립니다.\r\n--------------------------------------------------------------\r\n\r\n홈페이지 상단 - 예매 페이지에서 예매하실 수 있습니다.\r\n\r\n감사합니다. '),
                                                                                                                          (3, 'aaa', '질문드립니다.', '비밀글 질문이에요 ! ', '1', '2023-05-04 11:56:51', 5, NULL, 0, '안녕하세요.  문의내용 답변 드립니다.\r\n--------------------------------------------------------------\r\n\r\n비밀글 답변 드립니다. \r\n\r\n감사합니다. \r\n\r\n\r\n\r\n'),
                                                                                                                          (4, 'bbb', '문의드립니다! ', '팝콘을 사고 싶어요. ', '0', '2023-05-04 11:59:03', 4, NULL, 0, '안녕하세요.  문의내용 답변 드립니다.\r\n--------------------------------------------------------------\r\n\r\n팝콘은 스토어 페이지에서 구매 가능합니다.\r\n\r\n감사합니다. \r\n\r\n\r\n'),
                                                                                                                          (5, 'ccc', '안녕하세요.', '이렇게 글 남기면 되나요?', '1', '2023-05-04 12:00:26', 1, 'dd1.txt', 5209, NULL),
                                                                                                                          (6, 'aaa', '질문드립니다.', '질문이에요 ! ', '0', '2023-05-04 12:06:06', 1, NULL, 0, NULL),
                                                                                                                          (7, 'aaa', '문의드립니다. ', '질문입니다. ', '0', '2023-05-04 12:06:06', 1, NULL, 0, NULL),
                                                                                                                          (8, 'ccc', '질문있습니다.', '질문입니다.', '0', '2023-05-04 12:06:06', 1, 'dd1.txt', 5209, NULL),
                                                                                                                          (9, 'bbb', '질문드립니다.', '질문이에요 ! ', '0', '2023-05-04 12:14:57', 0, NULL, 0, NULL),
                                                                                                                          (10, 'bbb', '문의드립니다. ', ' 질문입니다. ', '1', '2023-05-04 12:14:57', 2, NULL, 0, '답변이 등록되지 않았습니다.'),
                                                                                                                          (11, 'ccc', '질문있습니다.', '질문입니다.', '0', '2023-05-04 12:14:57', 1, NULL, 0, NULL),
                                                                                                                          (12, 'ccc', '질문드립니다.', '질문입니다.', '0', '2023-05-04 12:14:57', 2, NULL, 0, NULL),
                                                                                                                          (13, 'aaa', '문의드립니다. ', ' 질문입니다. \r\n\r\n수정했어요', '0', '2023-05-04 12:14:57', 4, NULL, 0, '답변이 등록되지 않았습니다.'),
                                                                                                                          (14, 'ccc', '질문있습니다.', '질문입니다.', '0', '2023-05-04 12:14:57', 2, NULL, 0, NULL),
                                                                                                                          (15, 'bbb', '문의드립니다! ', '팝콘을 사고 싶어요. ', '0', '2023-05-04 12:14:57', 5, NULL, 0, '안녕하세요.  문의내용 답변 드립니다.\r\n--------------------------------------------------------------\r\n\r\n팝콘은 스토어 페이지에서 구매 가능합니다.\r\n\r\n감사합니다. \r\n\r\n\r\n'),
                                                                                                                          (16, 'ccc', '안녕하세요.', ' 이렇게 글 남기면 되나요? ', '1', '2023-05-04 12:14:57', 5, NULL, 5209, '넵 그렇습니다.'),
                                                                                                                          (17, 'bbb', '영화 예매 어떻게 하나요? ', ' 영화 예매 어떻게 하나요?  ', '0', '2023-05-04 12:20:00', 6, NULL, 0, '안녕하세요.  문의내용 답변 드립니다.\r\n--------------------------------------------------------------\r\n\r\n홈페이지 상단 - 예매 페이지에서 예매하실 수 있습니다.\r\n\r\n감사합니다. '),
                                                                                                                          (18, 'bbb', '팝콘 사고싶어요', '팝콘 사고싶어요', '0', '2023-05-04 12:24:23', 3, NULL, 0, NULL);

