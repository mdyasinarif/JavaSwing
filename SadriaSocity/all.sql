-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: sadriasocity
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `investment`
--

DROP TABLE IF EXISTS `investment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `investment` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `accountNo` varchar(20) DEFAULT NULL,
  `projectName` varchar(50) DEFAULT NULL,
  `projectLocation` varchar(100) DEFAULT NULL,
  `totalInvestment` double DEFAULT NULL,
  `startDate` date DEFAULT NULL,
  `projectDuration` int(10) DEFAULT NULL,
  `directortName` varchar(20) DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `religion` varchar(20) DEFAULT NULL,
  `dateofBirth` varchar(20) DEFAULT NULL,
  `nIDNo` varchar(20) DEFAULT NULL,
  `mobileNo` varchar(20) DEFAULT NULL,
  `presentAddress` varchar(100) DEFAULT NULL,
  `parmanetAddress` varchar(100) DEFAULT NULL,
  `picture` blob,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `investment`
--

LOCK TABLES `investment` WRITE;
/*!40000 ALTER TABLE `investment` DISABLE KEYS */;
INSERT INTO `investment` VALUES (1,'104-105','firmaing','Aminpara',100000,'2019-03-30',5,'Md Yasin Arif','Male','islam','1999-12-12','19874563321','6546546546','Gandaria','konapara',NULL);
/*!40000 ALTER TABLE `investment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `person`
--

DROP TABLE IF EXISTS `person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `person` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `accountNo` varchar(20) DEFAULT NULL,
  `fromNO` varchar(20) DEFAULT NULL,
  `cardNo` varchar(20) DEFAULT NULL,
  `admissionDate` date DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `motherName` varchar(20) DEFAULT NULL,
  `fatherHusbendName` varchar(20) DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `religion` varchar(20) DEFAULT NULL,
  `dateofBirth` varchar(20) DEFAULT NULL,
  `nIDNo` varchar(20) DEFAULT NULL,
  `mobileNo` varchar(20) DEFAULT NULL,
  `presentAddress` varchar(100) DEFAULT NULL,
  `parmanetAddress` varchar(100) DEFAULT NULL,
  `savingType` varchar(20) DEFAULT NULL,
  `annunity` int(20) DEFAULT NULL,
  `nomineName` varchar(20) DEFAULT NULL,
  `relations` varchar(20) DEFAULT NULL,
  `share` int(20) DEFAULT NULL,
  `picture` blob,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person`
--

LOCK TABLES `person` WRITE;
/*!40000 ALTER TABLE `person` DISABLE KEYS */;
INSERT INTO `person` VALUES (1,'101-102','101','102','2019-03-29','gfgff','gfdgfdg','fdgdfg','Male','fgfdg','1992-12-12','654654564654','5456','fdgdfg','fdgdfgdf','Weekly',500,'fdgfd','fdgfd',100,NULL),(2,'201-202','201','202','2019-03-29','gdfgdf','gdfgdf','gdfgdf','Male','gdfgfd','1992-12-12','45464654','645645645','fdgdfgd','fgdfgdf','Weekly',500,'gdfgdf','gdfg',100,NULL),(3,'202-203','102','103','2019-03-29','Md Yasin Arif','Yasmin Begum','MD Sharif Ahmed','Male','islam','1992-12-12','197854631','45654654654','Gandaria','Wari','Share',1000,'Mim','sister',100,NULL);
/*!40000 ALTER TABLE `person` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `summary`
--

DROP TABLE IF EXISTS `summary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `summary` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `accountNo` varchar(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `savingType` varchar(20) DEFAULT NULL,
  `annunity` int(20) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `totalDeposit` int(20) DEFAULT NULL,
  `totalWithdraw` int(20) DEFAULT NULL,
  `balance` int(20) DEFAULT NULL,
  `installmentNo` int(20) DEFAULT NULL,
  `coverDate` date DEFAULT NULL,
  `due` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `summary`
--

LOCK TABLES `summary` WRITE;
/*!40000 ALTER TABLE `summary` DISABLE KEYS */;
INSERT INTO `summary` VALUES (2,'101-102','dfgdfd','Monthly',500,'2019-03-28',41500,26500,15000,30,'2019-03-29',1),(3,'101-102','gdfgdf','Monthly',500,'2019-03-29',41500,26500,15000,30,'2019-03-29',1),(4,'101-102','gdfgdf','Monthly',500,'2019-03-29',41500,26500,15000,30,'2019-03-29',1),(5,'101-102','fgfdg','Weekly',500,'2019-03-29',41500,26500,15000,30,'2019-03-29',1),(6,'101-102','gfgff','Weekly',500,'2019-03-29',41500,26500,15000,30,'2019-03-29',1),(7,'201-202','gdfgdf','Weekly',500,'2019-03-29',500,0,500,1,'2019-03-29',0),(8,'202-203','Md Yasin Arif','Share',1000,'2019-03-29',1000,0,1000,1,'2019-03-29',0);
/*!40000 ALTER TABLE `summary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transtion`
--

DROP TABLE IF EXISTS `transtion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `transtion` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `Date` date DEFAULT NULL,
  `accountNo` varchar(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `slipNO` varchar(20) DEFAULT NULL,
  `Deposit` int(20) DEFAULT NULL,
  `Withdraw` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=163 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transtion`
--

LOCK TABLES `transtion` WRITE;
/*!40000 ALTER TABLE `transtion` DISABLE KEYS */;
INSERT INTO `transtion` VALUES (7,'2019-03-28','101-102','dfgdfd','56',500,NULL),(8,'2019-03-28','101-102','dfgdfd','454',500,NULL),(9,'2019-03-29','101-102','gfgff','564',500,NULL),(10,'2019-03-29','101-102','gfgff','45',500,NULL),(11,'2019-03-29','101-102','gfgff','45',NULL,500),(12,'2019-03-29','101-102','gfgff','45',500,NULL),(13,'2019-03-29','101-102','gfgff','45',500,NULL),(14,'2019-03-29','101-102','gfgff','45',500,NULL),(15,'2019-03-29','101-102','gfgff','654',500,NULL),(16,'2019-03-29','101-102','gfgff','654',500,NULL),(17,'2019-03-29','101-102','gfgff','654',NULL,500),(18,'2019-03-29','101-102','gfgff','654',NULL,500),(19,'2019-03-29','101-102','gfgff','654',NULL,500),(20,'2019-03-29','101-102','gfgff','654',NULL,500),(21,'2019-03-29','101-102','gfgff','654',NULL,500),(22,'2019-03-29','101-102','gfgff','654',NULL,500),(23,'2019-03-29','101-102','gfgff','45',500,NULL),(24,'2019-03-29','101-102','gfgff','45',500,NULL),(25,'2019-03-29','101-102','gfgff','45',500,NULL),(26,'2019-03-29','101-102','gfgff','45',NULL,500),(27,'2019-03-29','101-102','gfgff','45',500,NULL),(28,'2019-03-29','101-102','gfgff','45',500,NULL),(29,'2019-03-29','101-102','gfgff','45',500,NULL),(30,'2019-03-29','101-102','gfgff','45',500,NULL),(31,'2019-03-29','101-102','gfgff','45',500,NULL),(32,'2019-03-29','101-102','gfgff','45',500,NULL),(33,'2019-03-29','101-102','gfgff','45',500,NULL),(34,'2019-03-29','101-102','gfgff','45',500,NULL),(35,'2019-03-29','101-102','gfgff','45',500,NULL),(36,'2019-03-29','101-102','gfgff','45',500,NULL),(37,'2019-03-29','101-102','gfgff','45',500,NULL),(38,'2019-03-29','101-102','gfgff','45',NULL,500),(39,'2019-03-29','101-102','gfgff','45',NULL,500),(40,'2019-03-29','101-102','gfgff','45',NULL,500),(41,'2019-03-29','101-102','gfgff','45',NULL,500),(42,'2019-03-29','101-102','gfgff','45',NULL,500),(43,'2019-03-29','101-102','gfgff','45',500,NULL),(44,'2019-03-29','101-102','gfgff','45',500,NULL),(45,'2019-03-29','101-102','gfgff','45',500,NULL),(46,'2019-03-29','101-102','gfgff','45',NULL,500),(47,'2019-03-29','101-102','gfgff','45',NULL,500),(48,'2019-03-29','101-102','gfgff','45',500,NULL),(49,'2019-03-29','101-102','gfgff','45',500,NULL),(50,'2019-03-29','101-102','gfgff','45',500,NULL),(51,'2019-03-29','101-102','gfgff','45',500,NULL),(52,'2019-03-29','101-102','gfgff','45',NULL,500),(53,'2019-03-29','101-102','gfgff','45',500,NULL),(54,'2019-03-29','101-102','gfgff','45',NULL,500),(55,'2019-03-29','101-102','gfgff','45',NULL,500),(56,'2019-03-29','101-102','gfgff','45',NULL,500),(57,'2019-03-29','101-102','gfgff','45',NULL,500),(58,'2019-03-29','101-102','gfgff','4465',500,NULL),(59,'2019-03-29','101-102','gfgff','4465',NULL,500),(60,'2019-03-29','101-102','gfgff','4465',500,NULL),(61,'2019-03-29','101-102','gfgff','4465',500,NULL),(62,'2019-03-29','101-102','gfgff','4465',500,NULL),(63,'2019-03-29','101-102','gfgff','4465',NULL,500),(64,'2019-03-29','101-102','gfgff','4465',NULL,500),(65,'2019-03-29','101-102','gfgff','4465',NULL,500),(66,'2019-03-29','101-102','gfgff','4465',NULL,500),(67,'2019-03-29','101-102','gfgff','4465',NULL,500),(68,'2019-03-29','101-102','gfgff','4465',NULL,500),(69,'2019-03-29','101-102','gfgff','4465',NULL,500),(70,'2019-03-29','101-102','gfgff','4465',NULL,500),(71,'2019-03-29','101-102','gfgff','4465',NULL,500),(72,'2019-03-29','101-102','gfgff','4465',500,NULL),(73,'2019-03-29','101-102','gfgff','4465',500,NULL),(74,'2019-03-29','101-102','gfgff','4465',500,NULL),(75,'2019-03-29','101-102','gfgff','4465',500,NULL),(76,'2019-03-29','101-102','gfgff','4465',500,NULL),(77,'2019-03-29','101-102','gfgff','4465',500,NULL),(78,'2019-03-29','101-102','gfgff','4465',500,NULL),(79,'2019-03-29','101-102','gfgff','4465',500,NULL),(80,'2019-03-29','101-102','gfgff','4465',500,NULL),(81,'2019-03-29','101-102','gfgff','4465',500,NULL),(82,'2019-03-29','101-102','gfgff','4465',500,NULL),(83,'2019-03-29','101-102','gfgff','4465',NULL,500),(84,'2019-03-29','101-102','gfgff','50',500,NULL),(85,'2019-03-29','101-102','gfgff','50',NULL,500),(86,'2019-03-29','101-102','gfgff','45',500,NULL),(87,'2019-03-29','101-102','gfgff','45',NULL,500),(88,'2019-03-29','101-102','gfgff','45',NULL,500),(89,'2019-03-29','101-102','gfgff','45',NULL,500),(90,'2019-03-29','101-102','gfgff','45',NULL,500),(91,'2019-03-29','101-102','gfgff','456',500,NULL),(92,'2019-03-29','101-102','gfgff','456',500,NULL),(93,'2019-03-29','101-102','gfgff','456',500,NULL),(94,'2019-03-29','101-102','gfgff','456',500,NULL),(95,'2019-03-29','101-102','gfgff','456',500,NULL),(96,'2019-03-29','101-102','gfgff','456',500,NULL),(97,'2019-03-29','101-102','gfgff','456',500,NULL),(98,'2019-03-29','101-102','gfgff','456',500,NULL),(99,'2019-03-29','101-102','gfgff','45',500,NULL),(100,'2019-03-29','101-102','gfgff','45',500,NULL),(101,'2019-03-29','101-102','gfgff','45',500,NULL),(102,'2019-03-29','101-102','gfgff','45',500,NULL),(103,'2019-03-29','101-102','gfgff','45',500,NULL),(104,'2019-03-29','101-102','gfgff','45',500,NULL),(105,'2019-03-29','101-102','gfgff','45',500,NULL),(106,'2019-03-29','101-102','gfgff','45',500,NULL),(107,'2019-03-29','101-102','gfgff','45',500,NULL),(108,'2019-03-29','101-102','gfgff','45',500,NULL),(109,'2019-03-29','101-102','gfgff','45',500,NULL),(110,'2019-03-29','101-102','gfgff','45',500,NULL),(111,'2019-03-29','101-102','gfgff','45',500,NULL),(112,'2019-03-29','101-102','gfgff','45',500,NULL),(113,'2019-03-29','101-102','gfgff','45',500,NULL),(114,'2019-03-29','101-102','gfgff','45',NULL,500),(115,'2019-03-29','101-102','gfgff','45',NULL,500),(116,'2019-03-29','101-102','gfgff','45',500,NULL),(117,'2019-03-29','101-102','gfgff','45',500,NULL),(118,'2019-03-29','101-102','gfgff','45',500,NULL),(119,'2019-03-29','101-102','gfgff','45',NULL,500),(120,'2019-03-29','101-102','gfgff','45',NULL,500),(121,'2019-03-29','101-102','gfgff','45',NULL,500),(122,'2019-03-29','101-102','gfgff','56',500,NULL),(123,'2019-03-29','101-102','gfgff','56',500,NULL),(124,'2019-03-29','101-102','gfgff','56',500,NULL),(125,'2019-03-29','101-102','gfgff','56',500,NULL),(126,'2019-03-29','101-102','gfgff','56',500,NULL),(127,'2019-03-29','101-102','gfgff','56',NULL,500),(128,'2019-03-29','101-102','gfgff','56',NULL,500),(129,'2019-03-29','101-102','gfgff','56',NULL,500),(130,'2019-03-29','101-102','gfgff','56',NULL,500),(131,'2019-03-29','101-102','gfgff','545',500,NULL),(132,'2019-03-29','101-102','gfgff','545',500,NULL),(133,'2019-03-29','101-102','gfgff','545',500,NULL),(134,'2019-03-29','101-102','gfgff','545',500,NULL),(135,'2019-03-29','101-102','gfgff','545',500,NULL),(136,'2019-03-29','101-102','gfgff','545',500,NULL),(137,'2019-03-29','101-102','gfgff','45',500,NULL),(138,'2019-03-29','101-102','gfgff','45',500,NULL),(139,'2019-03-29','101-102','gfgff','45',500,NULL),(140,'2019-03-29','101-102','gfgff','45',500,NULL),(141,'2019-03-29','101-102','gfgff','45',500,NULL),(142,'2019-03-29','101-102','gfgff','45',500,NULL),(143,'2019-03-29','101-102','gfgff','45',500,NULL),(144,'2019-03-29','101-102','gfgff','45',500,NULL),(145,'2019-03-29','101-102','gfgff','45',500,NULL),(146,'2019-03-29','101-102','gfgff','45',500,NULL),(147,'2019-03-29','101-102','gfgff','45',500,NULL),(148,'2019-03-29','101-102','gfgff','45',NULL,500),(149,'2019-03-29','101-102','gfgff','45',NULL,500),(150,'2019-03-29','101-102','gfgff','45',NULL,500),(151,'2019-03-29','101-102','gfgff','45',NULL,500),(152,'2019-03-29','101-102','gfgff','45',NULL,500),(153,'2019-03-29','101-102','gfgff','45',500,NULL),(154,'2019-03-29','101-102','gfgff','45',500,NULL),(155,'2019-03-29','101-102','gfgff','45',500,NULL),(156,'2019-03-29','101-102','gfgff','45',NULL,500),(157,'2019-03-29','101-102','gfgff','45',NULL,500),(158,'2019-03-29','101-102','gfgff','45',NULL,500),(159,'2019-03-29','101-102','gfgff','45',500,NULL),(160,'2019-03-29','101-102','gfgff','45',500,NULL),(161,'2019-03-29','101-102','gfgff','45',500,NULL),(162,'2019-03-29','101-102','gfgff','45',500,NULL);
/*!40000 ALTER TABLE `transtion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'sadriasocity'
--

--
-- Dumping routines for database 'sadriasocity'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-03-30 12:55:44
