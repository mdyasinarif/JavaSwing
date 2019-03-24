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
  `presentAddress` varchar(50) DEFAULT NULL,
  `parmanetAddress` varchar(50) DEFAULT NULL,
  `savingType` varchar(20) DEFAULT NULL,
  `savingsAmount` int(20) DEFAULT NULL,
  `nomineName` varchar(20) DEFAULT NULL,
  `relations` varchar(20) DEFAULT NULL,
  `share` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person`
--

LOCK TABLES `person` WRITE;
/*!40000 ALTER TABLE `person` DISABLE KEYS */;
INSERT INTO `person` VALUES (1,'101-102','101','201','2019-03-23','Md Yasin Arif','Yasmin Begum','Sharif Ahmed','Male','Islam','14-11-1992','197985269324599','01676555764','54/56/4 ShtisSorkar Roda ,Gandaria,Dhaka-1204','90/A S K Dash Roda, Gandaria,Dhaka-1204','Monthly',500,'Tawhida Sharif','Sister',100);
/*!40000 ALTER TABLE `person` ENABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transtion`
--

LOCK TABLES `transtion` WRITE;
/*!40000 ALTER TABLE `transtion` DISABLE KEYS */;
INSERT INTO `transtion` VALUES (1,'2019-03-24','101-102','Md Yasin Arif','102',1000,NULL),(2,'2019-03-24','101-102','Md Yasin Arif','102',1000,NULL),(3,'2019-03-24','101-102','Md Yasin Arif','104',NULL,0),(4,'2019-03-24','101-102','Md Yasin Arif','105',NULL,0),(5,'2019-03-24','101-102','Md Yasin Arif','106',NULL,0),(6,'2019-03-24','101-102','Md Yasin Arif','106',NULL,600),(7,'2019-03-24','101-102','Md Yasin Arif','106',500,NULL),(8,'2019-03-24','101-102','Md Yasin Arif','110',500,NULL),(9,'2019-03-24','101-102','Md Yasin Arif','112',NULL,1000),(10,'2019-03-24','101-102','Md Yasin Arif','114',NULL,500),(11,'2019-03-24','101-102','Md Yasin Arif','123',500,NULL),(12,'2019-03-24','101-102','Md Yasin Arif','124',NULL,500),(13,'2019-03-24','101-102','Md Yasin Arif','102',500,NULL),(14,'2019-03-24','101-102','Md Yasin Arif','102',NULL,100);
/*!40000 ALTER TABLE `transtion` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-03-24 19:04:03
