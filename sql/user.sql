# Host: 127.0.0.1  (Version 8.0.26)
# Date: 2021-10-20 13:01:13
# Generator: MySQL-Front 6.1  (Build 1.26)


#
# Structure for table "user"
#

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` int NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `usex` varchar(2) DEFAULT '男',
  `upassword` varchar(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '123456',
  `uidnum` varchar(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `uphonenum` varchar(11) NOT NULL,
  `ustate` tinyint(1) DEFAULT '1',
  `role` varchar(20) DEFAULT 'user',
  PRIMARY KEY (`uid`),
  UNIQUE KEY `uphonenum` (`uphonenum`),
  UNIQUE KEY `uidnum` (`uidnum`)
) ENGINE=InnoDB AUTO_INCREMENT=10000027 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci AVG_ROW_LENGTH=7;

#
# Data for table "user"
#

INSERT INTO `user` VALUES (10000000,'user01','男','111111','486789456789456123','45678912346',1,'user'),(10000002,'user03','女','123456','123456465456545767','21474836411',1,'user'),(10000003,'user04','女','123456','132564564545855888','21474836421',1,'user'),(10000004,'user05','男','123456','123145646774567897','21474836431',1,'user'),(10000005,'user06','女','123456','123146546513214567','21474836441',1,'user'),(10000006,'user07','男','123456','456465613232132132','21474836451',1,'user'),(10000007,'张三','男','111111','123456789123456788','12345678912',1,'user'),(10000015,'小邓','女','123456','420581200109075025','18890154520',1,'user'),(10000019,'zhang','男','123456','123456789123456789','12345678919',1,'user'),(10000021,'张三','男','123456','456787845612345678','78941321789',1,'user'),(10000022,'小唐','男','123456','456413212465464311','78945412312',1,'user'),(10000026,'小张','男','123456','789123456121456789','15573945284',1,'user');
