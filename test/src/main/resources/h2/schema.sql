DROP TABLE IF EXISTS `product`;
CREATE TABLE `product`
(
  idx int NOT NULL AUTO_INCREMENT,
  name varchar(20) NOT NULL,
  detail varchar(50) DEFAULT NULL,
  price int NOT NULL,
  category varchar(50) NOT NULL DEFAULT '',
  status int NOT NULL,
  image varchar(50) DEFAULT NULL,
  highlight int DEFAULT NULL,
  PRIMARY KEY (idx)
);
DROP TABLE IF EXISTS `member`;
CREATE TABLE `member` (
  id varchar(20) NOT NULL,
  pw varchar(255) NOT NULL,
  name varchar(20) DEFAULT NULL,
  regdt timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  gender tinyint(1) DEFAULT NULL,
  birthday date DEFAULT NULL,
  mail varchar(20) NOT NULL,
  grade varchar(20) NOT NULL,
  phone varchar(20) NOT NULL,
  mileage int DEFAULT NULL,
  authority varchar(20) NOT NULL,
  PRIMARY KEY (id)
) 