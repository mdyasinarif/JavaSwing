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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `investment`
--

LOCK TABLES `investment` WRITE;
/*!40000 ALTER TABLE `investment` DISABLE KEYS */;
/*!40000 ALTER TABLE `investment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `investmentsummary`
--

DROP TABLE IF EXISTS `investmentsummary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `investmentsummary` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `accountNO` varchar(20) DEFAULT NULL,
  `projectName` varchar(50) DEFAULT NULL,
  `projectLocation` varchar(20) DEFAULT NULL,
  `startDate` date DEFAULT NULL,
  `directorName` varchar(50) DEFAULT NULL,
  `totalInvestment` double DEFAULT NULL,
  `totalReturn` double DEFAULT NULL,
  `balance` double DEFAULT NULL,
  `projectDuration` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `investmentsummary`
--

LOCK TABLES `investmentsummary` WRITE;
/*!40000 ALTER TABLE `investmentsummary` DISABLE KEYS */;
/*!40000 ALTER TABLE `investmentsummary` ENABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person`
--

LOCK TABLES `person` WRITE;
/*!40000 ALTER TABLE `person` DISABLE KEYS */;
INSERT INTO `person` VALUES (1,'101-102','101','102','2019-04-07','Md Yasin Arif','Yasmin Begum','Md Sharif Ahmed','Male','Islam','1992-11-14','1987456321','01676555464','59/5/4 Shatish Sharkar Road Gandaria Dhaka-1205','90/A S K Dash Road Gandaria Dhaka-1204','Weekly',500,'Tawhida Sharif','Sister',100,_binary '�\��\�\0JFIF\0\0`\0`\0\0�\�\0\"Exif\0\0MM\0*\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0�\�ICC_PROFILE\0\0\0lcms\0\0mntrRGB XYZ \�\0\0\0\0)\09acspAPPL\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0�\�\0\0\0\0\0\�-lcms\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\ndesc\0\0\0�\0\0\0^cprt\0\0\\\0\0\0wtpt\0\0h\0\0\0bkpt\0\0|\0\0\0rXYZ\0\0�\0\0\0gXYZ\0\0�\0\0\0bXYZ\0\0�\0\0\0rTRC\0\0\�\0\0\0@gTRC\0\0\�\0\0\0@bTRC\0\0\�\0\0\0@desc\0\0\0\0\0\0\0c2\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0text\0\0\0\0FB\0\0XYZ \0\0\0\0\0\0�\�\0\0\0\0\0\�-XYZ \0\0\0\0\0\0\0\03\0\0�XYZ \0\0\0\0\0\0o�\0\08�\0\0�XYZ \0\0\0\0\0\0b�\0\0��\0\0\�XYZ \0\0\0\0\0\0$�\0\0�\0\0�\�curv\0\0\0\0\0\0\0\Z\0\0\0\�\�c�k�?Q4!�)�2;�FQw]\�kpz���|�i�}\�\�\�0���\�\0JFIF\0\0\0\0\0\0�\�\06Photoshop 3.0\08BIM\0\0\0\0\0g\0fy3Bna1rUvow5j-ZHq24\0�\�\0C\0		\n\n\r\n\n	\r�\�\0C��\0\0x\0d\"\0�\�\0\0\0\0\0\0\0\0\0\0\0	\n�\�\0�\0\0\0}\0!1AQa\"q2���#B��R\��$3br�	\n\Z%&\'()*456789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz�����������������������������������\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\������������\�\0\0\0\0\0\0\0\0	\n�\�\0�\0\0w\0!1AQaq\"2�B����	#3R�br\�\n$4\�%�\Z&\'()*56789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz������������������������������������\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�����������\�\0\0\0?\0\��\0�x�\��/��<7u�u���|�Jq\�!;Y�Hy\�ھ����|=\�\�\�S\�W�\"�^Y	%_�\�yK��~\�\�\�>��\�\�oͨ\�\�:x�\�e��\�(-\�jG�>_��z���S�l�w࿊��\�\�Z��\�\�\�rN�j&I$�A�`\�bW����4�%ZRr�9k\�u���3���T�̯o5�h�/�O�޻�\�\�\�l:T64�]\�\��L\�\�\0\���=�v�J��Q�\�hn\'KXll|�\�euG~U�w�-{\��f�Y�6��̳�堸E\n%��3��H8+�޾���\0{��\�N�\�\�]i��$�ħr\�/�����\�\�ӫ����?��%{��]\�ߩ\�dS\�\�\r��\"�2�9�^��\�OKw?\'h�\�\�\�x֭4\�R3\�*+6�ͅ�\�}3_@�1���?ق\�\�ė�\ryu�M\�Y~@Y@���p@\�;՟�\�4jږ�\�\�[+)��2\�\�&\�.\�\�q�(\�)\n��0^HRFk\�=\�o�<s�]\�(Ե;?\�O5�\�j�]	D��T�bX\�\�k\�\��WA�n\��[��\�\�\�\�ʊ�+�7{ie���\�\�Z�\�_��\rJx�G�G�\�ռD\"k�.��,.\��w3\�|r3������\�\�淦�b\�\�֭\�\��ہ\rϝ*Ȓ��O\�\�<�W\�D\���|o�\�J\�\�l�K�\�ų\�q�D��	�W?>,\��\�\�W�����\r�\�#�I��\�j\�|õT}̐F\0\�1^\�=xTN�ҍ�V\����ww:h\������\�}�\�Mb\�Z�\'��y\ZM��^\'��qw+\�i<m��bpFq\�\r|��\���]S\�\�$:��\�+?\�\�\�\�\����:*�l<�\�dz\��[��\�ς��\�\�\n\\ZH$�2>B�$X8ݗ\�1�P\�w\�.��\�\�d\��{�hQ�\�\�\�j5d���~�n#���\'\�W\��\�1\�\�G=|vy�aoN��\�R\�)\�\�sk��\�\�o%\�aV��U��%۽���\0\�̿��o\�xF\�/�\�P\�ڭ���i0�\�\�\�օ!H\�r\�$ĲNXc,\�l��\�\�g���)c\��?\��z��g\�\Z��n-\��K�|�Y�E ǀJ��\0|8����O�5�9!���;jw�F|��\�|\�q \���\�H>�\�\��W��\���E_*\�\�\nF��홥\Z=\�\�\�mʪ�$�f\�I�\�橹\�.{�\�}4�\0=|\�ϲ�\�x����ѧ\��?\�\�y�]�|v\���ö��\�\Z���ROG\�7\�y�8.�1���\�Ezޓkq�K_\�n�c�\�^Ab�ʨ\�\�\'*[{!c�A ��HW\�\�\�Մ/-<\�\�RujIϛ#�\�\�>��G\�\�\�SO\�>\���\�ֲ|��\��u�o�u�ǉ�Ю\�\�`�\�\�[J_\�Ip\�0�+珎~ox\��\�\�/&�R%�9\�\�bs�>޽�\�>�q�����\�\Z8\�\�\�\�|�\�]N�\�<»\�R\�¤�6�u\�\�|��)a\\\�\��i��ֿ��\�!���|K�y�YI�^\�q鷥\�8P\�\r�FYyc\���\��\�:���\��>;��m�c\��\��0G*\�_8\�^4�\�i��6\�K_3�B���˲�\�zw�O�^ �=Ef�K;�\�Yo�#}\�q!����m�H*3��y\�7���*��$\��v���\'RX�E\�\�\��\�}\�\�Դ��\�[�X�\�J�pF�!���\�<\� D<`b\�\�\���\�i`�I��\��|�U�C�J\�̘\�\�<\�Ǎ\�,|E�ư\�\�^kW��\�.\�97�\�V\�G#��ܾ�-�M�I\��\����y\"\�ζ\�\��\r���%�8�\�\0\n��F*�-$}\�Z���%�\�\Z��\�\Z]�\�\�[��mm�c$�\��\�5\���>*|E�N\�\�g5\�v�d[Yl\�+��\���ǂA�\�\�\�_�O�&����z\�	4�[\�ApLҍ\�\���^�}\�M+\�vM\r�1\��Z����u\�V\�*I�\�[\��L?\�F��N�\�_\�g��_�_-�\�j;�Z�T����u���v0:�\�=s\�ޗl~-��-�\�\�&��kkC+�ڒM�dk\�\�\�;\�g60A5�\��\�C���x�Uc����i~�\r��\0�DWwn@+\�^=9��\��.���F��\��]]M�x�\�Hg��r`6�s\��j�3�ՕE��\�j:�/t�~v�\�g��O9R�W�������>\'\�e�M����\�Qy�fc�C$\�\�\�:\r��\�\�5���Ɲ\�+Y#�����UfXb\�\�r?\�\����\�U�\'�K�K����� ����[!�\�V?\�\��<g`8��{\�\�\��q�\�\�\�=���\�*+�\�9+�\�8�ܦ�.�*\�jNM�u�\�C\�8�n#\�WvK\�O\��\�jP\�.���0�ŷl�3\���@~T?l�ᗊ�I�k���$�\�Q�BXg�ߊ+�R�~�u�8!\�W,�?�\�\�O\�\�:]\�\�@�k�\�!?\�VX�\0GO�9=\�+�оhp��޹�٬\�>���\rfgİj���9\�G��\�q^\�?e�kĚ����\�P]\�ker���\�ol�@\�\�^Y����c\�k�u	��\�1�ђ[vi�\�\�j��\�V@y9\�\r|\�\ZӥMѨ��kk�\�7\�\�_~����%\�7�=�\�x����6\�=/P�\�G�o6\�{#\�O�6\nw\�\�\�s\�ik�\�M>\�#\�\r\�J�\n\"���\�<m=s\�\�\�\0�3\�?�\Z/��VI5MF�7]��\�5Όb 3\�\�$Vp9\�_>�\0�V?\��\Z\��?h�\0���P�$:G�\n|\�J\�d�Lh\�{��>�URT�ZI5{\�\�m\�2\���q�n��\�y\�\�Q�:\��b�Cmb��gO\�]H���q�\�#q\��H5�\�\�k{�j\�\�J��\�q�|{c�;�\0���Ǌ<i{t�RY�\0d�fH��.O^��\0�\�j�*�\�&��\�\�\�\�_\\]}�؄E�\�K�<aG�I=\0�a��\�:/u�X��%\�8`\�W�\��\�?���\�d˷��w�*ƣ\���\��n�6�\�9�Pw\��\�_.\��U\�\��}\�z\�i\�\�R�\��\�+\�;\�\r\��k3������a�\��\�V\�tMq�\���\�*�4�#%��FN{��3\�B3P��\�M�\���\�\�~=h�o\�φ�%Ӽ9wk�k\Z<n\�\�g,.��g�i��r8��}o�\�>��/�����\�\�\Z\�ݥ�^<\�H\�J�p�p8;�:1�\�|y�=�6����}\�<9o�\�\�s\�i\�y\�\�K�\�\�]@[��w\��;j^4���\�j\\}�{����j$F\�?/�$��A\�\0\�\0\�\�pP�\�/yY�-V�\0ws�$|ӧ^>k�M<̟ڟ\�$\Z�\�\�\�o4\�\�[\����P\�Cg\"\�\�ƹ�c�\0�\0hԾ9\�\�\�4\�o47kՌ.�p\�\�r���\����\�\�~\'\��\0>\�\�k�Y�����b���O(���b�#�\�W�\�o\nx\�\�T�ƶ�d�h\�-̎�\�,�*:�\r\�Ezب�K��l��\�7\�v|O\�W�_\�~��=x�\�֙�5K]B\�mX�\�m4a^\���49a��Cg��+\�$��\�Ax\�P\��F\�j��zv\�Z+ʧ���R�o��\�\�,\�w�4]e\��W\��ox��QD> �\��c)�+�1ta�\�q\�#\�_�ٺ\��ÿ\�\�\�V�O��k��Eaa+#8\\�x�9��~�x\�\�_�\�7R�\�\�.����sq\r\�q4�6E\r�\�q�[Xu �_�I\��ߌ\�����Y\�u�\�}-�KV�(��cW��.A?��#[�\n����oK�ow\��\0\0\��\�%Gj�M���\�|�}\'�m�}oM�M;Ş02\\��\\�\�V)w*�\r�v�b�?{\�>.�S�~\���Ľƞ&���\�\��Kjf�\�\��\�\"7m1�0\�\��#vG3�5|!���1xW^�\�mm#\�qL֛��T�\�9#9 }\�c��|D��.�\�\�7]�\�&�ė\"�\�)h5+grr!\'�q�\�J\����2��iCD\�#oe�����~g�,D>��Q>X\�]�4\�~T�\�>��!�VC�ǫ.���i5��I\�Ǩ\"\"IrF���-��\�����x�⇈a����M\�aR��j&�\0\�68ʎw�ӀO#����+V�G\�3\�Q\�\"���\����R-��OѲ�T128\��wW\�?>$驧[\�]yrI��`�a��P\�w�Z�*\�U+F\�\�~��?d\�\�}�,�����ON\��>]�\0�#�\�\�\�4�5_�G\�c_�\�k�\�a��$\rǴH�\�%���� i�1���> h�/�?�\�\�l�v�\0��%T�\��y�lF\�B\�r�\�q\�?i/\�\'^�Ư�i:ŵ�mz�8*H�w�\�\r��\�\\\'��\0l��\�\��hv�\��?��|\�q�\�\�\�$zv\��I�\�\�k#�8Oݜ�\�wv{o<1\�(�l\��\�\�5%>]\�r��*q\�\�I �=���\0b\�\��?\�ЍB\�-OԌzb+\�Z��\�I���ޕ�Kx�\�O\�|?s���\�\Z�5�\�&Q�����^��G�}��x�SӾx�\�\�@ּE=ޣ`X�\��DIi\ZGP�\�5\�\�5\'W%N��\�x������-_�c�Ƽ�[�3�G���۩ \�\��R\�J���\���*��\�}\���ִ�k\��!�\�IT3\�\�9YP�\0	R\�\\\�\��\�\�^8����v�ʹ�ے�vחp�\�θڹ�wM\�	\�Et\�2\���\�&�g\�[\�k\�L�2\�\\Z\�\�\�mu\�j\�WxS�\��;�f�9R��W�\�\�\�~OV-$\�S��e�\��#O�kVYb\�m����&6U?6{g�\�[~\�\Z�\�[�CI\�m�5-=��\�\�`��P�.�\�g�\�(��q�5p��.I�5�\��\�~\�\�}JE\�\�KƗ\�C��^2ǃ�9<����X�\�\�\�\�\�\�������Y,V�_\���~Ha�\�\�_b\�\�-\�|\�{\�Jk{8\�]�f\\g��\�\'��\�^\��_xS\�6�KXi�#\�\"�u\'?e�i7\�@B�=��W��0x�mu՚��\06ͽ�8\���},\'\��A�[�2[�Fi�D\�\�\�\�?+(�0Ǡts�\0�l�\��.Y<#\���­3$��	���\�x�\�A�O\��M\�-J]b\�~ʫ�\�i\�D>t��b9\�2X/c\�{��n\�]D\�}�7��bTS!B8�}\�\�\�s(}YC�o\�\�\�(6\�̮\�o���\�\��\0\�\��嶓\r���\�\\\\\�dg�\�\�)\nA%K�^x\�\�ׁ\�\r�/�m\�B\�\�z\"�-0�_\�M�k\��?\Z\�~8\�\Z��\��\�c�\�5#Miɗ���nxq�m7z\�|��~#~\�~��&��\�f\�A~\�r\�.G\n$Q�`0W$��>3_��S\�d\�ke�\�{��G�¼O5XQ�\'\�{Z\�y\�{yt\���⥎��j\Ze��f�[\�\����ݶ �l��\��c#9��=CI�\�\�q��\�^:�F�0�\�\��=��\"��!� ʹ\����sɭ\�mcS�{\�w�ֳ�\'�%0ʂ�\�ڷ#�����&���1ߓ�%\�7�zv��ѯA�s����\0��?[�\"��\�b\�\�\�v��\�-2J?\n\'�e��B\�B>ҥ	 \�\�\�<�\'<\�_�\��L]\��\0\��7��w��\0�d�\�Q�\�gߏZ�{�\�\��A\��?��\�&��j1Y\�}�\�\�6a�`\�\��6z.9\�\"�n�`O\0\����}\�laR�(;3Ԍ�{�`�ܓ_s�\�}\�\�g�����\�(\�sGخ�\��\�_�N�S\��\0P�g�Ƴ�c%�7W�\�\�,�8\�ʴ��(�V4a��z_��\0~��N��Y!\�\�;\�\rn[-Fq\Z�-	~�\�Z�1�\�$.+��\�\�\\BXg�c���\�ҹ��</��\0����v���\�`\��\��� 2Ȅ:��A��\�\�j�\�\��\0_���\�©ۗC�\�\�F�g�\�\Z���b���0�R�W��Nqە\�`���\�\��B\r/W\�\�\���\�h\���\�\�\�\�XGw%�jX��U�\�c�Wv0	8\��\�!h��\�\�K2�����M\�u\�麴U���\�q�\�\�\�z�?�^\�_C\�4o\�\�\�y!��3+$1�\�\�X;�n��+ݾ-��\�Ǿ>׼9\��OtK�GS�R\�\��\���:\�8\�\�q�������R\�|�ljS��݋0�\\�u�O\�\�\���\�,b�+8\�\�z�;i\�\�\��<<i:ד\�\�^�_\�\��w�z�\0\�_��ɣ\�%倷��i^2�pB`����W��+\�/�s\�%���j\Z�ƨ\�D�2]Y\�y��Ѹ���\�\�=2k\���?��\�<`�S4\�G\�^ߴf\�UB�\�br\�*\�q\� t�T��<\'\��\0�?	��\Z�\\��=����\n\\����e2�\�.0F)�\�ʪr���\�\�?��̩)\�)I�k_ב��>x/\�ߊ,n,g�Vצ�.6�ZΌ�T\'h\�\�$u�\�Z�\�@�ՏÿI+\ZGi\�e\n\�����p=>��\��s\��\0ٟ\��x寗Śպ[\�jm��k\�-�<Yb\��,̃�~\\�y�\�&��\�XX\�Y���zb�S\�r���]_�z\�ֹ݇\�\�2��Z�\0����/\�=�\���D���R�\�n~Бpbf�\�#\�H\�\'��c\�_1\��$����7K#d:�;\�ν�L�3�|���+i�+o�6��s\�%\�+p���]��\�x�;�jv��͖S�T\�\�\�U\�\Z�L��\'\�\�T���\�\��M�\0�_�~׶��\�\'\�>\�\�RU2\"#dE�\�$��\0�O�~�|�\0��x�\�\�쬮�;�E�\�0�Ѫ8\�m\���I�qF`79M�HA\�>;�\0\��%���g��8�T:��\�c�V��u��\�\�q\"{,w*\��\�\0u5\�	�\�\�P�ԭ~\�ocj\�\r��){\�\�#���\�B�pN8���\�*�_h�-\��>��\Z������.�\0~�\�Wp\�,\�+y3H���[�?\�?�[�\���>\r\�\�v�k�>\�Yda�K!L�sֻ	��\�8G\�4����@\�O�eV�,\��>V[\�X��+O�~3�*Ѿ�o3E�\�i�\�o\�[��_数r\�\�w{�+\�~̖�\"�M}�}�X�R���멎\�͑ʼ1!3ƒ�NFrMzwğ\�wOҼ+f���\�y\�bʻ~R��z\�_���_�<}\r��x����h��Qq�Jc�f\�в.}8\��J�\�\�U���R��}��\�K\��G�O+��e	j�]u�\0?�>G�\�ȼu}���֟�Ac�\�\�oo�&X�`\�c\�vL�\�[+\�\��~\n�\���մ]C��\�z��kvZ��1ˣB�̅J�wy��gj\�\�\�\�:o��\0hH\�2�\�u�O\Zh�jڸ�,�i���\�m\�~RbW\'��\�=H�cx_A�}q�xgmŶ�)��\��\�m\�Y�H\0\�GYH\�R\�}+������\�r_\nm\'�����u\�\�\�Q�U�V]\Z\�z�>\�>(\ZK^۬\�h7Q\�Z\�ܲ:\��\�\0�~jO\�p��\�ɸVkUm\�{�\��\���u���\"�1��r@\'\�\�\�\�\n\��\��&�k#���F�2:\�$\�~���~�J�W�~\�\��|\�Y���lX\�h��TGq\Z-��\�\�0F0����}:~\�9��\��\0�..a�I.Cc�צ�P,d����ψ�YE�����hf�#���kC\�~�\'�\�\�\��<�pBI+�r\�e@X�-|}�����=ݭ�H��\"���ө}u�no�$��\�_\�[cۦX]j�*�I�n\�\'��#�{t\�^\��\�k\�xf)�\0B\�\"\0��u�d\�+��\�|U�jp۴04�\�=|��$UO�\n�?\n�C\�\ZzV��[\�m[�t\�O�\Z�j�5�\��)/\��\�\��؇V������s��V\�<-�\�X��rq�\0\\��\r\\\�\�\Z)%��9?\�/e�^t{7f�\ny��)ݟ\�?�X�\�R\���\�!�n��\0�\��u�����]�\0�y�\�^�\�\�R\�>\\\����`�T\�\����O%���\�.\�\�(��y��\�r��ߵoť񴖖>�η\�\�7z��i\�6��a\�S\�\�\�\n�Ӹ=ǈ<;�_\�\�:\��\���\�Ze\��ib�4m`0b:\� �zQE8֩*����^{���4\�~�r��\\��K��^\�?�#S\�~\�z鼸�Pф�\�б��9�,\�\�d�\�\�\�W�a=Co\�\����r\�ͤچ�]����$C�\�k(�Gs�Q_��]4�9���+\�\�R�4\��/ͣ��Π�F�y3;y�W	^\�{��\�\�ⶃ\\��!Q��{dQE~����W�\��\r�\0�T �{�\�q��\�\'���e�(\�\�jٲ/;\�z�\�f�K4#���G��IT�\0\�AE�؜<%�\�\�\�\�E��u��(\�.ޟ|�>���<8��G!\\v:\�\�^\�{�+[V�\�\�g?S������,k�\�\�\�\�1\�5�\�tXYV;띎\�y�<���\��\�֛\�\�&�m�N�v�^���\0>\�QN4��η��m\��\0�X\��;��L�\�I���+ÔS�~fos�\�'),(2,'201-202','101','102','2019-04-07','Md Yasin Arif','Yasmin Begum','Md Sharif Ahmed','Male','Islam','1992-11-14','1987456321','01676555464','59/5/4 Shatish Sharkar Road Gandaria Dhaka-1205','90/A S K Dash Road Gandaria Dhaka-1204','Weekly',500,'Tawhida Sharif','Sister',100,_binary '�\��\�\0JFIF\0\0`\0`\0\0�\�\0\"Exif\0\0MM\0*\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0�\�ICC_PROFILE\0\0\0lcms\0\0mntrRGB XYZ \�\0\0\0\0)\09acspAPPL\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0�\�\0\0\0\0\0\�-lcms\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\ndesc\0\0\0�\0\0\0^cprt\0\0\\\0\0\0wtpt\0\0h\0\0\0bkpt\0\0|\0\0\0rXYZ\0\0�\0\0\0gXYZ\0\0�\0\0\0bXYZ\0\0�\0\0\0rTRC\0\0\�\0\0\0@gTRC\0\0\�\0\0\0@bTRC\0\0\�\0\0\0@desc\0\0\0\0\0\0\0c2\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0text\0\0\0\0FB\0\0XYZ \0\0\0\0\0\0�\�\0\0\0\0\0\�-XYZ \0\0\0\0\0\0\0\03\0\0�XYZ \0\0\0\0\0\0o�\0\08�\0\0�XYZ \0\0\0\0\0\0b�\0\0��\0\0\�XYZ \0\0\0\0\0\0$�\0\0�\0\0�\�curv\0\0\0\0\0\0\0\Z\0\0\0\�\�c�k�?Q4!�)�2;�FQw]\�kpz���|�i�}\�\�\�0���\�\0JFIF\0\0\0\0\0\0�\�\06Photoshop 3.0\08BIM\0\0\0\0\0g\0fy3Bna1rUvow5j-ZHq24\0�\�\0C\0		\n\n\r\n\n	\r�\�\0C��\0\0x\0d\"\0�\�\0\0\0\0\0\0\0\0\0\0\0	\n�\�\0�\0\0\0}\0!1AQa\"q2���#B��R\��$3br�	\n\Z%&\'()*456789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz�����������������������������������\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\������������\�\0\0\0\0\0\0\0\0	\n�\�\0�\0\0w\0!1AQaq\"2�B����	#3R�br\�\n$4\�%�\Z&\'()*56789:CDEFGHIJSTUVWXYZcdefghijstuvwxyz������������������������������������\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�\�����������\�\0\0\0?\0\��\0�x�\��/��<7u�u���|�Jq\�!;Y�Hy\�ھ����|=\�\�\�S\�W�\"�^Y	%_�\�yK��~\�\�\�>��\�\�oͨ\�\�:x�\�e��\�(-\�jG�>_��z���S�l�w࿊��\�\�Z��\�\�\�rN�j&I$�A�`\�bW����4�%ZRr�9k\�u���3���T�̯o5�h�/�O�޻�\�\�\�l:T64�]\�\��L\�\�\0\���=�v�J��Q�\�hn\'KXll|�\�euG~U�w�-{\��f�Y�6��̳�堸E\n%��3��H8+�޾���\0{��\�N�\�\�]i��$�ħr\�/�����\�\�ӫ����?��%{��]\�ߩ\�dS\�\�\r��\"�2�9�^��\�OKw?\'h�\�\�\�x֭4\�R3\�*+6�ͅ�\�}3_@�1���?ق\�\�ė�\ryu�M\�Y~@Y@���p@\�;՟�\�4jږ�\�\�[+)��2\�\�&\�.\�\�q�(\�)\n��0^HRFk\�=\�o�<s�]\�(Ե;?\�O5�\�j�]	D��T�bX\�\�k\�\��WA�n\��[��\�\�\�\�ʊ�+�7{ie���\�\�Z�\�_��\rJx�G�G�\�ռD\"k�.��,.\��w3\�|r3������\�\�淦�b\�\�֭\�\��ہ\rϝ*Ȓ��O\�\�<�W\�D\���|o�\�J\�\�l�K�\�ų\�q�D��	�W?>,\��\�\�W�����\r�\�#�I��\�j\�|õT}̐F\0\�1^\�=xTN�ҍ�V\����ww:h\������\�}�\�Mb\�Z�\'��y\ZM��^\'��qw+\�i<m��bpFq\�\r|��\���]S\�\�$:��\�+?\�\�\�\�\����:*�l<�\�dz\��[��\�ς��\�\�\n\\ZH$�2>B�$X8ݗ\�1�P\�w\�.��\�\�d\��{�hQ�\�\�\�j5d���~�n#���\'\�W\��\�1\�\�G=|vy�aoN��\�R\�)\�\�sk��\�\�o%\�aV��U��%۽���\0\�̿��o\�xF\�/�\�P\�ڭ���i0�\�\�\�օ!H\�r\�$ĲNXc,\�l��\�\�g���)c\��?\��z��g\�\Z��n-\��K�|�Y�E ǀJ��\0|8����O�5�9!���;jw�F|��\�|\�q \���\�H>�\�\��W��\���E_*\�\�\nF��홥\Z=\�\�\�mʪ�$�f\�I�\�橹\�.{�\�}4�\0=|\�ϲ�\�x����ѧ\��?\�\�y�]�|v\���ö��\�\Z���ROG\�7\�y�8.�1���\�Ezޓkq�K_\�n�c�\�^Ab�ʨ\�\�\'*[{!c�A ��HW\�\�\�Մ/-<\�\�RujIϛ#�\�\�>��G\�\�\�SO\�>\���\�ֲ|��\��u�o�u�ǉ�Ю\�\�`�\�\�[J_\�Ip\�0�+珎~ox\��\�\�/&�R%�9\�\�bs�>޽�\�>�q�����\�\Z8\�\�\�\�|�\�]N�\�<»\�R\�¤�6�u\�\�|��)a\\\�\��i��ֿ��\�!���|K�y�YI�^\�q鷥\�8P\�\r�FYyc\���\��\�:���\��>;��m�c\��\��0G*\�_8\�^4�\�i��6\�K_3�B���˲�\�zw�O�^ �=Ef�K;�\�Yo�#}\�q!����m�H*3��y\�7���*��$\��v���\'RX�E\�\�\��\�}\�\�Դ��\�[�X�\�J�pF�!���\�<\� D<`b\�\�\���\�i`�I��\��|�U�C�J\�̘\�\�<\�Ǎ\�,|E�ư\�\�^kW��\�.\�97�\�V\�G#��ܾ�-�M�I\��\����y\"\�ζ\�\��\r���%�8�\�\0\n��F*�-$}\�Z���%�\�\Z��\�\Z]�\�\�[��mm�c$�\��\�5\���>*|E�N\�\�g5\�v�d[Yl\�+��\���ǂA�\�\�\�_�O�&����z\�	4�[\�ApLҍ\�\���^�}\�M+\�vM\r�1\��Z����u\�V\�*I�\�[\��L?\�F��N�\�_\�g��_�_-�\�j;�Z�T����u���v0:�\�=s\�ޗl~-��-�\�\�&��kkC+�ڒM�dk\�\�\�;\�g60A5�\��\�C���x�Uc����i~�\r��\0�DWwn@+\�^=9��\��.���F��\��]]M�x�\�Hg��r`6�s\��j�3�ՕE��\�j:�/t�~v�\�g��O9R�W�������>\'\�e�M����\�Qy�fc�C$\�\�\�:\r��\�\�5���Ɲ\�+Y#�����UfXb\�\�r?\�\����\�U�\'�K�K����� ����[!�\�V?\�\��<g`8��{\�\�\��q�\�\�\�=���\�*+�\�9+�\�8�ܦ�.�*\�jNM�u�\�C\�8�n#\�WvK\�O\��\�jP\�.���0�ŷl�3\���@~T?l�ᗊ�I�k���$�\�Q�BXg�ߊ+�R�~�u�8!\�W,�?�\�\�O\�\�:]\�\�@�k�\�!?\�VX�\0GO�9=\�+�оhp��޹�٬\�>���\rfgİj���9\�G��\�q^\�?e�kĚ����\�P]\�ker���\�ol�@\�\�^Y����c\�k�u	��\�1�ђ[vi�\�\�j��\�V@y9\�\r|\�\ZӥMѨ��kk�\�7\�\�_~����%\�7�=�\�x����6\�=/P�\�G�o6\�{#\�O�6\nw\�\�\�s\�ik�\�M>\�#\�\r\�J�\n\"���\�<m=s\�\�\�\0�3\�?�\Z/��VI5MF�7]��\�5Όb 3\�\�$Vp9\�_>�\0�V?\��\Z\��?h�\0���P�$:G�\n|\�J\�d�Lh\�{��>�URT�ZI5{\�\�m\�2\���q�n��\�y\�\�Q�:\��b�Cmb��gO\�]H���q�\�#q\��H5�\�\�k{�j\�\�J��\�q�|{c�;�\0���Ǌ<i{t�RY�\0d�fH��.O^��\0�\�j�*�\�&��\�\�\�\�_\\]}�؄E�\�K�<aG�I=\0�a��\�:/u�X��%\�8`\�W�\��\�?���\�d˷��w�*ƣ\���\��n�6�\�9�Pw\��\�_.\��U\�\��}\�z\�i\�\�R�\��\�+\�;\�\r\��k3������a�\��\�V\�tMq�\���\�*�4�#%��FN{��3\�B3P��\�M�\���\�\�~=h�o\�φ�%Ӽ9wk�k\Z<n\�\�g,.��g�i��r8��}o�\�>��/�����\�\�\Z\�ݥ�^<\�H\�J�p�p8;�:1�\�|y�=�6����}\�<9o�\�\�s\�i\�y\�\�K�\�\�]@[��w\��;j^4���\�j\\}�{����j$F\�?/�$��A\�\0\�\0\�\�pP�\�/yY�-V�\0ws�$|ӧ^>k�M<̟ڟ\�$\Z�\�\�\�o4\�\�[\����P\�Cg\"\�\�ƹ�c�\0�\0hԾ9\�\�\�4\�o47kՌ.�p\�\�r���\����\�\�~\'\��\0>\�\�k�Y�����b���O(���b�#�\�W�\�o\nx\�\�T�ƶ�d�h\�-̎�\�,�*:�\r\�Ezب�K��l��\�7\�v|O\�W�_\�~��=x�\�֙�5K]B\�mX�\�m4a^\���49a��Cg��+\�$��\�Ax\�P\��F\�j��zv\�Z+ʧ���R�o��\�\�,\�w�4]e\��W\��ox��QD> �\��c)�+�1ta�\�q\�#\�_�ٺ\��ÿ\�\�\�V�O��k��Eaa+#8\\�x�9��~�x\�\�_�\�7R�\�\�.����sq\r\�q4�6E\r�\�q�[Xu �_�I\��ߌ\�����Y\�u�\�}-�KV�(��cW��.A?��#[�\n����oK�ow\��\0\0\��\�%Gj�M���\�|�}\'�m�}oM�M;Ş02\\��\\�\�V)w*�\r�v�b�?{\�>.�S�~\���Ľƞ&���\�\��Kjf�\�\��\�\"7m1�0\�\��#vG3�5|!���1xW^�\�mm#\�qL֛��T�\�9#9 }\�c��|D��.�\�\�7]�\�&�ė\"�\�)h5+grr!\'�q�\�J\����2��iCD\�#oe�����~g�,D>��Q>X\�]�4\�~T�\�>��!�VC�ǫ.���i5��I\�Ǩ\"\"IrF���-��\�����x�⇈a����M\�aR��j&�\0\�68ʎw�ӀO#����+V�G\�3\�Q\�\"���\����R-��OѲ�T128\��wW\�?>$驧[\�]yrI��`�a��P\�w�Z�*\�U+F\�\�~��?d\�\�}�,�����ON\��>]�\0�#�\�\�\�4�5_�G\�c_�\�k�\�a��$\rǴH�\�%���� i�1���> h�/�?�\�\�l�v�\0��%T�\��y�lF\�B\�r�\�q\�?i/\�\'^�Ư�i:ŵ�mz�8*H�w�\�\r��\�\\\'��\0l��\�\��hv�\��?��|\�q�\�\�\�$zv\��I�\�\�k#�8Oݜ�\�wv{o<1\�(�l\��\�\�5%>]\�r��*q\�\�I �=���\0b\�\��?\�ЍB\�-OԌzb+\�Z��\�I���ޕ�Kx�\�O\�|?s���\�\Z�5�\�&Q�����^��G�}��x�SӾx�\�\�@ּE=ޣ`X�\��DIi\ZGP�\�5\�\�5\'W%N��\�x������-_�c�Ƽ�[�3�G���۩ \�\��R\�J���\���*��\�}\���ִ�k\��!�\�IT3\�\�9YP�\0	R\�\\\�\��\�\�^8����v�ʹ�ے�vחp�\�θڹ�wM\�	\�Et\�2\���\�&�g\�[\�k\�L�2\�\\Z\�\�\�mu\�j\�WxS�\��;�f�9R��W�\�\�\�~OV-$\�S��e�\��#O�kVYb\�m����&6U?6{g�\�[~\�\Z�\�[�CI\�m�5-=��\�\�`��P�.�\�g�\�(��q�5p��.I�5�\��\�~\�\�}JE\�\�KƗ\�C��^2ǃ�9<����X�\�\�\�\�\�\�������Y,V�_\���~Ha�\�\�_b\�\�-\�|\�{\�Jk{8\�]�f\\g��\�\'��\�^\��_xS\�6�KXi�#\�\"�u\'?e�i7\�@B�=��W��0x�mu՚��\06ͽ�8\���},\'\��A�[�2[�Fi�D\�\�\�\�?+(�0Ǡts�\0�l�\��.Y<#\���­3$��	���\�x�\�A�O\��M\�-J]b\�~ʫ�\�i\�D>t��b9\�2X/c\�{��n\�]D\�}�7��bTS!B8�}\�\�\�s(}YC�o\�\�\�(6\�̮\�o���\�\��\0\�\��嶓\r���\�\\\\\�dg�\�\�)\nA%K�^x\�\�ׁ\�\r�/�m\�B\�\�z\"�-0�_\�M�k\��?\Z\�~8\�\Z��\��\�c�\�5#Miɗ���nxq�m7z\�|��~#~\�~��&��\�f\�A~\�r\�.G\n$Q�`0W$��>3_��S\�d\�ke�\�{��G�¼O5XQ�\'\�{Z\�y\�{yt\���⥎��j\Ze��f�[\�\����ݶ �l��\��c#9��=CI�\�\�q��\�^:�F�0�\�\��=��\"��!� ʹ\����sɭ\�mcS�{\�w�ֳ�\'�%0ʂ�\�ڷ#�����&���1ߓ�%\�7�zv��ѯA�s����\0��?[�\"��\�b\�\�\�v��\�-2J?\n\'�e��B\�B>ҥ	 \�\�\�<�\'<\�_�\��L]\��\0\��7��w��\0�d�\�Q�\�gߏZ�{�\�\��A\��?��\�&��j1Y\�}�\�\�6a�`\�\��6z.9\�\"�n�`O\0\����}\�laR�(;3Ԍ�{�`�ܓ_s�\�}\�\�g�����\�(\�sGخ�\��\�_�N�S\��\0P�g�Ƴ�c%�7W�\�\�,�8\�ʴ��(�V4a��z_��\0~��N��Y!\�\�;\�\rn[-Fq\Z�-	~�\�Z�1�\�$.+��\�\�\\BXg�c���\�ҹ��</��\0����v���\�`\��\��� 2Ȅ:��A��\�\�j�\�\��\0_���\�©ۗC�\�\�F�g�\�\Z���b���0�R�W��Nqە\�`���\�\��B\r/W\�\�\���\�h\���\�\�\�\�XGw%�jX��U�\�c�Wv0	8\��\�!h��\�\�K2�����M\�u\�麴U���\�q�\�\�\�z�?�^\�_C\�4o\�\�\�y!��3+$1�\�\�X;�n��+ݾ-��\�Ǿ>׼9\��OtK�GS�R\�\��\���:\�8\�\�q�������R\�|�ljS��݋0�\\�u�O\�\�\���\�,b�+8\�\�z�;i\�\�\��<<i:ד\�\�^�_\�\��w�z�\0\�_��ɣ\�%倷��i^2�pB`����W��+\�/�s\�%���j\Z�ƨ\�D�2]Y\�y��Ѹ���\�\�=2k\���?��\�<`�S4\�G\�^ߴf\�UB�\�br\�*\�q\� t�T��<\'\��\0�?	��\Z�\\��=����\n\\����e2�\�.0F)�\�ʪr���\�\�?��̩)\�)I�k_ב��>x/\�ߊ,n,g�Vצ�.6�ZΌ�T\'h\�\�$u�\�Z�\�@�ՏÿI+\ZGi\�e\n\�����p=>��\��s\��\0ٟ\��x寗Śպ[\�jm��k\�-�<Yb\��,̃�~\\�y�\�&��\�XX\�Y���zb�S\�r���]_�z\�ֹ݇\�\�2��Z�\0����/\�=�\���D���R�\�n~Бpbf�\�#\�H\�\'��c\�_1\��$����7K#d:�;\�ν�L�3�|���+i�+o�6��s\�%\�+p���]��\�x�;�jv��͖S�T\�\�\�U\�\Z�L��\'\�\�T���\�\��M�\0�_�~׶��\�\'\�>\�\�RU2\"#dE�\�$��\0�O�~�|�\0��x�\�\�쬮�;�E�\�0�Ѫ8\�m\���I�qF`79M�HA\�>;�\0\��%���g��8�T:��\�c�V��u��\�\�q\"{,w*\��\�\0u5\�	�\�\�P�ԭ~\�ocj\�\r��){\�\�#���\�B�pN8���\�*�_h�-\��>��\Z������.�\0~�\�Wp\�,\�+y3H���[�?\�?�[�\���>\r\�\�v�k�>\�Yda�K!L�sֻ	��\�8G\�4����@\�O�eV�,\��>V[\�X��+O�~3�*Ѿ�o3E�\�i�\�o\�[��_数r\�\�w{�+\�~̖�\"�M}�}�X�R���멎\�͑ʼ1!3ƒ�NFrMzwğ\�wOҼ+f���\�y\�bʻ~R��z\�_���_�<}\r��x����h��Qq�Jc�f\�в.}8\��J�\�\�U���R��}��\�K\��G�O+��e	j�]u�\0?�>G�\�ȼu}���֟�Ac�\�\�oo�&X�`\�c\�vL�\�[+\�\��~\n�\���մ]C��\�z��kvZ��1ˣB�̅J�wy��gj\�\�\�\�:o��\0hH\�2�\�u�O\Zh�jڸ�,�i���\�m\�~RbW\'��\�=H�cx_A�}q�xgmŶ�)��\��\�m\�Y�H\0\�GYH\�R\�}+������\�r_\nm\'�����u\�\�\�Q�U�V]\Z\�z�>\�>(\ZK^۬\�h7Q\�Z\�ܲ:\��\�\0�~jO\�p��\�ɸVkUm\�{�\��\���u���\"�1��r@\'\�\�\�\�\n\��\��&�k#���F�2:\�$\�~���~�J�W�~\�\��|\�Y���lX\�h��TGq\Z-��\�\�0F0����}:~\�9��\��\0�..a�I.Cc�צ�P,d����ψ�YE�����hf�#���kC\�~�\'�\�\�\��<�pBI+�r\�e@X�-|}�����=ݭ�H��\"���ө}u�no�$��\�_\�[cۦX]j�*�I�n\�\'��#�{t\�^\��\�k\�xf)�\0B\�\"\0��u�d\�+��\�|U�jp۴04�\�=|��$UO�\n�?\n�C\�\ZzV��[\�m[�t\�O�\Z�j�5�\��)/\��\�\��؇V������s��V\�<-�\�X��rq�\0\\��\r\\\�\�\Z)%��9?\�/e�^t{7f�\ny��)ݟ\�?�X�\�R\���\�!�n��\0�\��u�����]�\0�y�\�^�\�\�R\�>\\\����`�T\�\����O%���\�.\�\�(��y��\�r��ߵoť񴖖>�η\�\�7z��i\�6��a\�S\�\�\�\n�Ӹ=ǈ<;�_\�\�:\��\���\�Ze\��ib�4m`0b:\� �zQE8֩*����^{���4\�~�r��\\��K��^\�?�#S\�~\�z鼸�Pф�\�б��9�,\�\�d�\�\�\�W�a=Co\�\����r\�ͤچ�]����$C�\�k(�Gs�Q_��]4�9���+\�\�R�4\��/ͣ��Π�F�y3;y�W	^\�{��\�\�ⶃ\\��!Q��{dQE~����W�\��\r�\0�T �{�\�q��\�\'���e�(\�\�jٲ/;\�z�\�f�K4#���G��IT�\0\�AE�؜<%�\�\�\�\�E��u��(\�.ޟ|�>���<8��G!\\v:\�\�^\�{�+[V�\�\�g?S������,k�\�\�\�\�1\�5�\�tXYV;띎\�y�<���\��\�֛\�\�&�m�N�v�^���\0>\�QN4��η��m\��\0�X\��;��L�\�I���+ÔS�~fos�\�');
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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `summary`
--

LOCK TABLES `summary` WRITE;
/*!40000 ALTER TABLE `summary` DISABLE KEYS */;
INSERT INTO `summary` VALUES (1,'101-102','Md Yasin Arif','Weekly',500,'2019-04-07',1500,0,1500,3,'2019-04-21',0),(2,'201-202','Md Yasin Arif','Weekly',500,'2019-04-07',1000,0,1000,2,'2019-04-14',0);
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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transtion`
--

LOCK TABLES `transtion` WRITE;
/*!40000 ALTER TABLE `transtion` DISABLE KEYS */;
INSERT INTO `transtion` VALUES (1,'2019-04-07','101-102','Md Yasin Arif','45',500,NULL),(2,'2019-04-07','101-102','Md Yasin Arif','50',500,NULL),(3,'2019-04-07','201-202','Md Yasin Arif','54',500,NULL);
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

-- Dump completed on 2019-04-07 18:52:26
