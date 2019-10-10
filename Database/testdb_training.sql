-- MySQL dump 10.13  Distrib 5.7.12, for Win32 (AMD64)
--
-- Host: localhost    Database: testdb
-- ------------------------------------------------------
-- Server version	5.7.26-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `training`
--

DROP TABLE IF EXISTS `training`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `training` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  `amount_received` float DEFAULT NULL,
  `amount_to_mentor` varchar(255) DEFAULT NULL,
  `commission_amount` float DEFAULT NULL,
  `end_date` datetime DEFAULT NULL,
  `end_time` varchar(255) DEFAULT NULL,
  `fees` float DEFAULT NULL,
  `progress` int(11) DEFAULT NULL,
  `rating` int(11) DEFAULT NULL,
  `start_date` datetime DEFAULT NULL,
  `start_time` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `mentor_id` int(11) DEFAULT NULL,
  `technology_id` int(11) DEFAULT NULL,
  `commission_percent` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKrawaxmeqdkrlhpl2e4ntkseu1` (`mentor_id`),
  KEY `FK6bf4c5red18kptcrmrjca5h7f` (`technology_id`),
  CONSTRAINT `FK6bf4c5red18kptcrmrjca5h7f` FOREIGN KEY (`technology_id`) REFERENCES `technology` (`id`),
  CONSTRAINT `FKrawaxmeqdkrlhpl2e4ntkseu1` FOREIGN KEY (`mentor_id`) REFERENCES `mentor` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `training`
--

LOCK TABLES `training` WRITE;
/*!40000 ALTER TABLE `training` DISABLE KEYS */;
INSERT INTO `training` VALUES (1,'2019-01-01 00:00:00','2019-02-02 00:00:00',8000,'200',8000,'2019-02-01 00:00:00','08:00:00',7000,50,2,'2019-01-01 00:00:00','07:00:00','in progress',1,1,0),(2,'2019-01-01 00:00:00','2019-02-02 00:00:00',7000,'2',6000,'2019-02-01 00:00:00','09:00:00',6000,50,2,'2019-01-02 00:00:00','09:00:00','completed',2,2,0),(3,'2019-02-02 00:00:00','2019-03-03 00:00:00',9000,'4000',1000,'2019-02-02 00:00:00','02:00:00',6000,25,6,'2019-03-03 00:00:00','08:00:00','in progress',3,3,80),(4,'2019-01-01 05:30:00','2019-02-02 05:30:00',6000,'4000',7000,'2019-10-18 05:30:00','10:00:00',5444,25,12,'2019-10-12 05:30:00','09:00:00','In Progress',4,4,50);
/*!40000 ALTER TABLE `training` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-10-10 17:23:08
