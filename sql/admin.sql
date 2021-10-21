# Host: 127.0.0.1  (Version 8.0.26)
# Date: 2021-10-20 13:00:53
# Generator: MySQL-Front 6.1  (Build 1.26)


#
# Structure for table "admin"
#

DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `uid` int NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT 'admin',
  `upassword` int DEFAULT '123456',
  `sex` varchar(2) DEFAULT '男',
  `role` varchar(20) DEFAULT 'admin',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=100002 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

#
# Data for table "admin"
#

INSERT INTO `admin` VALUES (100000,'admin01',123456,'男','admin'),(100001,'admin02',123456,'男','admin');
