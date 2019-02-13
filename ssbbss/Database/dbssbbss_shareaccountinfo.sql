-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: dbssbbss
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
-- Table structure for table `shareaccountinfo`
--

DROP TABLE IF EXISTS `shareaccountinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `shareaccountinfo` (
  `AccountNo` int(11) NOT NULL,
  `FromNO` varchar(45) NOT NULL,
  `CardNo` varchar(45) NOT NULL,
  `Name` varchar(45) DEFAULT NULL,
  `MotherName` varchar(45) DEFAULT NULL,
  `Father/HusbendName` varchar(45) DEFAULT NULL,
  `PresentAddress` varchar(45) DEFAULT NULL,
  `ParmanetAddress` varchar(45) DEFAULT NULL,
  `DateofBirth` varchar(45) DEFAULT NULL,
  `AdmissionDate` varchar(45) DEFAULT NULL,
  `NIDNo` varchar(45) DEFAULT NULL,
  `MobileNo` varchar(45) DEFAULT NULL,
  `ShareAmount` varchar(45) DEFAULT NULL,
  `NoOfShare` varchar(45) DEFAULT NULL,
  `NomineName` varchar(45) DEFAULT NULL,
  `Relations` varchar(45) DEFAULT NULL,
  `Share` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`AccountNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shareaccountinfo`
--

LOCK TABLES `shareaccountinfo` WRITE;
/*!40000 ALTER TABLE `shareaccountinfo` DISABLE KEYS */;
INSERT INTO `shareaccountinfo` VALUES (5565,'65656','6565','fgdfg','dfgdf','gdf','gdfg dfdf dfgdf fdsfds','gdfg dfdsfds dfgfdg fdfdf','01-02-2019','12-02-2019','4546565','6556','5555','50','fgfdgfd','gdfgdf','565');
/*!40000 ALTER TABLE `shareaccountinfo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-02-13 15:08:34
