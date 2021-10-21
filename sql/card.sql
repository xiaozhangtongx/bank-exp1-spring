﻿# Host: 127.0.0.1  (Version 8.0.26)
# Date: 2021-10-20 13:01:03
# Generator: MySQL-Front 6.1  (Build 1.26)


#
# Structure for table "card"
#

DROP TABLE IF EXISTS `card`;
CREATE TABLE `card` (
  `cid` int NOT NULL AUTO_INCREMENT,
  `cpassword` int DEFAULT '123456',
  `cstate` tinyint(1) DEFAULT '1',
  `money` double DEFAULT '0',
  `uid` int NOT NULL,
  PRIMARY KEY (`cid`),
  KEY `uid` (`uid`),
  CONSTRAINT `card_ibfk_1` FOREIGN KEY (`uid`) REFERENCES `user` (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=111132 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

#
# Data for table "card"
#

INSERT INTO `card` VALUES (111115,123456,1,1049,10000002),(111117,123456,1,100000,10000004),(111119,123456,1,1001,10000000),(111120,123456,1,1000,10000000),(111121,123456,1,0,10000000),(111123,123456,1,0,10000003),(111124,123456,1,0,10000005),(111125,123456,1,0,10000006),(111126,123456,1,0,10000007),(111127,123456,1,0,10000015),(111131,123456,1,0,10000026);