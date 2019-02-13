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
-- Table structure for table `savingaccountinfo`
--

DROP TABLE IF EXISTS `savingaccountinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `savingaccountinfo` (
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
  `SavingType` varchar(45) DEFAULT NULL,
  `SavingsAmount` varchar(45) DEFAULT NULL,
  `NomineName` varchar(45) DEFAULT NULL,
  `Relations` varchar(45) DEFAULT NULL,
  `Share` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`AccountNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `savingaccountinfo`
--

LOCK TABLES `savingaccountinfo` WRITE;
/*!40000 ALTER TABLE `savingaccountinfo` DISABLE KEYS */;
INSERT INTO `savingaccountinfo` VALUES (1236,'125','20','fgdh','fghgfh','gfhfgh','fghgf hgfh hfgh gfhgfhg','fghfg fhgfhg hgfh fhfg','12-05-2019','01-02-2019','455889965','01956897965','Weekly','500','fhfghgf','hfghgf','100');
/*!40000 ALTER TABLE `savingaccountinfo` ENABLE KEYS */;
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
