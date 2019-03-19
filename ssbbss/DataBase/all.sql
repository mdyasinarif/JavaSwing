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
-- Table structure for table `investmentinfo`
--

DROP TABLE IF EXISTS `investmentinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `investmentinfo` (
  `AccountNo` int(11) NOT NULL,
  `FromNO` varchar(45) NOT NULL,
  `CardNo` varchar(45) NOT NULL,
  `ProjectName` varchar(45) DEFAULT NULL,
  `ProjectLocation` varchar(45) DEFAULT NULL,
  `InvestedAmount` varchar(45) DEFAULT NULL,
  `StartDate` varchar(45) DEFAULT NULL,
  `ProjectDuration` varchar(45) DEFAULT NULL,
  `Name` varchar(45) DEFAULT NULL,
  `MotherName` varchar(45) DEFAULT NULL,
  `FatherHusbendName` varchar(45) DEFAULT NULL,
  `PresentAddress` varchar(150) DEFAULT NULL,
  `ParmanetAddress` varchar(150) DEFAULT NULL,
  `NIDNo` varchar(45) DEFAULT NULL,
  `MobileNo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`AccountNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `investmentinfo`
--

LOCK TABLES `investmentinfo` WRITE;
/*!40000 ALTER TABLE `investmentinfo` DISABLE KEYS */;
INSERT INTO `investmentinfo` VALUES (45,'45','54','gdf','gfdgdfg','5654','654','54654','fdgfd','fdg','gdfg','dfgdf 654 gdf 654','gdf 654 gdfg 65','54654','654'),(1212,'121212','21212','','','','','','','','','   ','   ','',''),(5445,'454','454','dshfsd','dsfsdf','10000','12-03-2019','5','dsfsd','dfsd','dsfsd','fsd fsdf fsdf dsfsd','dsfsd dfsd dsfsd sdfsd','56456456','54554564'),(5656,'5665','565','','','','','','','','','   ','   ','',''),(56546,'645645','45645','gfdgdf','gdfgf','56565','12-03-2019','65','dgdfg','gfgdf','fdgf','gdf gfdg gdfgfdg fgfdg','fgfd dfgfg gfgf cggf','55656565','5656546');
/*!40000 ALTER TABLE `investmentinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `login` (
  `Name` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  PRIMARY KEY (`Name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES ('aaa','111');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

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
INSERT INTO `savingaccountinfo` VALUES (101279,'693','456','Tawhida Sharif','Yasmin Begum','Sharif Ahmed','54/56/4 Sotis Sor  Road Gandaria Dhaka-1204','90/A S K Dash Roda Gandaria Dhaka-1204','14/08/1996','18/02/2019','1965896329','01686017809','Monthly','500','Md Yasin Arif','Brither','100'),(101786,'123','369','Md Yasin Arif','Yasmin Begum','Md Sharif','54/55/4 Sotis Sorkar Lain Gandaria Dhaka-1204','90/A S K Dash Road , Gandaria , Dhaka-1204','14/11/1992','18/03/2019','196326987562','01676555764','Monthly','500','Tawhida Sharif','Sister','100');
/*!40000 ALTER TABLE `savingaccountinfo` ENABLE KEYS */;
UNLOCK TABLES;

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
INSERT INTO `shareaccountinfo` VALUES (565,'565','565','','','','   ','   ','','','','','','','','',''),(5565,'65656','6565','fgdfg','dfgdf','gdf','gdfg dfdf dfgdf fdsfds','gdfg dfdsfds dfgfdg fdfdf','01-02-2019','12-02-2019','4546565','6556','5555','50','fgfdgfd','gdfgdf','565');
/*!40000 ALTER TABLE `shareaccountinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `statement`
--

DROP TABLE IF EXISTS `statement`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `statement` (
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
  `Total Deposit` double DEFAULT NULL,
  `Balance` double DEFAULT NULL,
  `Installment No` int(11) DEFAULT NULL,
  `Cover Date` date DEFAULT NULL,
  `Due` int(11) DEFAULT NULL,
  PRIMARY KEY (`AccountNo`),
  CONSTRAINT `AccountNo` FOREIGN KEY (`AccountNo`) REFERENCES `savingaccountinfo` (`AccountNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `statement`
--

LOCK TABLES `statement` WRITE;
/*!40000 ALTER TABLE `statement` DISABLE KEYS */;
/*!40000 ALTER TABLE `statement` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transationdetels`
--

DROP TABLE IF EXISTS `transationdetels`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `transationdetels` (
  `Id` int(11) NOT NULL,
  `Account No` int(11) DEFAULT NULL,
  `Name` varchar(45) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  `Deposit Amount` double DEFAULT NULL,
  `Total Deposit` double DEFAULT NULL,
  `Balance` double DEFAULT NULL,
  `Installment No` int(11) DEFAULT NULL,
  `Cover Date` date DEFAULT NULL,
  `Due` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `Account No_idx` (`Account No`),
  CONSTRAINT `Account No` FOREIGN KEY (`Account No`) REFERENCES `savingaccountinfo` (`AccountNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transationdetels`
--

LOCK TABLES `transationdetels` WRITE;
/*!40000 ALTER TABLE `transationdetels` DISABLE KEYS */;
/*!40000 ALTER TABLE `transationdetels` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-03-18 18:37:23
