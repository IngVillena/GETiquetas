-- MySQL dump 10.13  Distrib 5.6.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: bd_etiquetas
-- ------------------------------------------------------
-- Server version	5.1.73-community

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
-- Table structure for table `etiquetas2_1`
--

DROP TABLE IF EXISTS `etiquetas2_1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `etiquetas2_1` (
  `ID` varchar(20) NOT NULL,
  `Codigo_SAT` varchar(20) NOT NULL,
  `Orden_Fabricacion` varchar(20) NOT NULL,
  `Fecha_Vencimiento` varchar(20) NOT NULL,
  `Numero_Paleta` varchar(20) NOT NULL,
  `Gestion_Lote` varchar(20) NOT NULL,
  `Descripcion_Producto` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `etiquetas2_1`
--

LOCK TABLES `etiquetas2_1` WRITE;
/*!40000 ALTER TABLE `etiquetas2_1` DISABLE KEYS */;
INSERT INTO `etiquetas2_1` VALUES ('1','','','','','','');
/*!40000 ALTER TABLE `etiquetas2_1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `etiquetas2_2`
--

DROP TABLE IF EXISTS `etiquetas2_2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `etiquetas2_2` (
  `ID` varchar(20) NOT NULL,
  `Codigo_SAT` varchar(20) NOT NULL,
  `Orden_Fabricacion` varchar(20) NOT NULL,
  `Fecha_Vencimiento` varchar(20) NOT NULL,
  `Numero_Paleta` varchar(20) NOT NULL,
  `Gestion_Lote` varchar(20) NOT NULL,
  `Descripcion_Producto` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `etiquetas2_2`
--

LOCK TABLES `etiquetas2_2` WRITE;
/*!40000 ALTER TABLE `etiquetas2_2` DISABLE KEYS */;
INSERT INTO `etiquetas2_2` VALUES ('1','','','','','','');
/*!40000 ALTER TABLE `etiquetas2_2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `etiquetas4_1`
--

DROP TABLE IF EXISTS `etiquetas4_1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `etiquetas4_1` (
  `ID` varchar(20) NOT NULL,
  `Codigo_SAT` varchar(20) NOT NULL,
  `Orden_Fabricacion` varchar(20) NOT NULL,
  `Fecha_Vencimiento` varchar(20) NOT NULL,
  `Numero_Paleta` varchar(20) NOT NULL,
  `Gestion_Lote` varchar(20) NOT NULL,
  `Descripcion_Producto` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `etiquetas4_1`
--

LOCK TABLES `etiquetas4_1` WRITE;
/*!40000 ALTER TABLE `etiquetas4_1` DISABLE KEYS */;
INSERT INTO `etiquetas4_1` VALUES ('1','','','','','','');
/*!40000 ALTER TABLE `etiquetas4_1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `etiquetas4_2`
--

DROP TABLE IF EXISTS `etiquetas4_2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `etiquetas4_2` (
  `ID` varchar(20) NOT NULL,
  `Codigo_SAT` varchar(20) NOT NULL,
  `Orden_Fabricacion` varchar(20) NOT NULL,
  `Fecha_Vencimiento` varchar(20) NOT NULL,
  `Numero_Paleta` varchar(20) NOT NULL,
  `Gestion_Lote` varchar(20) NOT NULL,
  `Descripcion_Producto` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `etiquetas4_2`
--

LOCK TABLES `etiquetas4_2` WRITE;
/*!40000 ALTER TABLE `etiquetas4_2` DISABLE KEYS */;
INSERT INTO `etiquetas4_2` VALUES ('1','','','','','','');
/*!40000 ALTER TABLE `etiquetas4_2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `etiquetas4_3`
--

DROP TABLE IF EXISTS `etiquetas4_3`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `etiquetas4_3` (
  `ID` varchar(20) NOT NULL,
  `Codigo_SAT` varchar(20) NOT NULL,
  `Orden_Fabricacion` varchar(20) NOT NULL,
  `Fecha_Vencimiento` varchar(20) NOT NULL,
  `Numero_Paleta` varchar(20) NOT NULL,
  `Gestion_Lote` varchar(20) NOT NULL,
  `Descripcion_Producto` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `etiquetas4_3`
--

LOCK TABLES `etiquetas4_3` WRITE;
/*!40000 ALTER TABLE `etiquetas4_3` DISABLE KEYS */;
INSERT INTO `etiquetas4_3` VALUES ('1','','','','','','');
/*!40000 ALTER TABLE `etiquetas4_3` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `etiquetas4_4`
--

DROP TABLE IF EXISTS `etiquetas4_4`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `etiquetas4_4` (
  `ID` varchar(20) NOT NULL,
  `Codigo_SAT` varchar(20) NOT NULL,
  `Orden_Fabricacion` varchar(20) NOT NULL,
  `Fecha_Vencimiento` varchar(20) NOT NULL,
  `Numero_Paleta` varchar(20) NOT NULL,
  `Gestion_Lote` varchar(20) NOT NULL,
  `Descripcion_Producto` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `etiquetas4_4`
--

LOCK TABLES `etiquetas4_4` WRITE;
/*!40000 ALTER TABLE `etiquetas4_4` DISABLE KEYS */;
INSERT INTO `etiquetas4_4` VALUES ('1','','','','','','');
/*!40000 ALTER TABLE `etiquetas4_4` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `etiquetas6_1`
--

DROP TABLE IF EXISTS `etiquetas6_1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `etiquetas6_1` (
  `ID` varchar(20) NOT NULL,
  `Codigo_SAT` varchar(20) NOT NULL,
  `Orden_Fabricacion` varchar(20) NOT NULL,
  `Fecha_Vencimiento` varchar(20) NOT NULL,
  `Numero_Paleta` varchar(20) NOT NULL,
  `Gestion_Lote` varchar(20) NOT NULL,
  `Descripcion_Producto` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `etiquetas6_1`
--

LOCK TABLES `etiquetas6_1` WRITE;
/*!40000 ALTER TABLE `etiquetas6_1` DISABLE KEYS */;
INSERT INTO `etiquetas6_1` VALUES ('1','','','','','','');
/*!40000 ALTER TABLE `etiquetas6_1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `etiquetas6_2`
--

DROP TABLE IF EXISTS `etiquetas6_2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `etiquetas6_2` (
  `ID` varchar(20) NOT NULL,
  `Codigo_SAT` varchar(14) NOT NULL,
  `Orden_Fabricacion` varchar(20) NOT NULL,
  `Fecha_Vencimiento` varchar(14) NOT NULL,
  `Numero_Paleta` varchar(20) NOT NULL,
  `Gestion_Lote` varchar(14) NOT NULL,
  `Descripcion_Producto` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `etiquetas6_2`
--

LOCK TABLES `etiquetas6_2` WRITE;
/*!40000 ALTER TABLE `etiquetas6_2` DISABLE KEYS */;
INSERT INTO `etiquetas6_2` VALUES ('1','','','','','','');
/*!40000 ALTER TABLE `etiquetas6_2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `etiquetas6_3`
--

DROP TABLE IF EXISTS `etiquetas6_3`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `etiquetas6_3` (
  `ID` varchar(20) NOT NULL,
  `Codigo_SAT` varchar(20) NOT NULL,
  `Orden_Fabricacion` varchar(20) NOT NULL,
  `Fecha_Vencimiento` varchar(20) NOT NULL,
  `Numero_Paleta` varchar(20) NOT NULL,
  `Gestion_Lote` varchar(20) NOT NULL,
  `Descripcion_Producto` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `etiquetas6_3`
--

LOCK TABLES `etiquetas6_3` WRITE;
/*!40000 ALTER TABLE `etiquetas6_3` DISABLE KEYS */;
INSERT INTO `etiquetas6_3` VALUES ('1','','','','','','');
/*!40000 ALTER TABLE `etiquetas6_3` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `etiquetas6_4`
--

DROP TABLE IF EXISTS `etiquetas6_4`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `etiquetas6_4` (
  `ID` varchar(20) NOT NULL,
  `Codigo_SAT` varchar(20) NOT NULL,
  `Orden_Fabricacion` varchar(20) NOT NULL,
  `Fecha_Vencimiento` varchar(20) NOT NULL,
  `Numero_Paleta` varchar(20) NOT NULL,
  `Gestion_Lote` varchar(20) NOT NULL,
  `Descripcion_Producto` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `etiquetas6_4`
--

LOCK TABLES `etiquetas6_4` WRITE;
/*!40000 ALTER TABLE `etiquetas6_4` DISABLE KEYS */;
INSERT INTO `etiquetas6_4` VALUES ('1','','','','','','');
/*!40000 ALTER TABLE `etiquetas6_4` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `etiquetas6_5`
--

DROP TABLE IF EXISTS `etiquetas6_5`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `etiquetas6_5` (
  `ID` varchar(20) NOT NULL,
  `Codigo_SAT` varchar(20) NOT NULL,
  `Orden_Fabricacion` varchar(20) NOT NULL,
  `Fecha_Vencimiento` varchar(20) NOT NULL,
  `Numero_Paleta` varchar(20) NOT NULL,
  `Gestion_Lote` varchar(20) NOT NULL,
  `Descripcion_Producto` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `etiquetas6_5`
--

LOCK TABLES `etiquetas6_5` WRITE;
/*!40000 ALTER TABLE `etiquetas6_5` DISABLE KEYS */;
INSERT INTO `etiquetas6_5` VALUES ('1','','','','','','');
/*!40000 ALTER TABLE `etiquetas6_5` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `etiquetas6_6`
--

DROP TABLE IF EXISTS `etiquetas6_6`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `etiquetas6_6` (
  `ID` varchar(20) NOT NULL,
  `Codigo_SAT` varchar(20) NOT NULL,
  `Orden_Fabricacion` varchar(20) NOT NULL,
  `Fecha_Vencimiento` varchar(20) NOT NULL,
  `Numero_Paleta` varchar(20) NOT NULL,
  `Gestion_Lote` varchar(20) NOT NULL,
  `Descripcion_Producto` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `etiquetas6_6`
--

LOCK TABLES `etiquetas6_6` WRITE;
/*!40000 ALTER TABLE `etiquetas6_6` DISABLE KEYS */;
INSERT INTO `etiquetas6_6` VALUES ('1','','','','','','');
/*!40000 ALTER TABLE `etiquetas6_6` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `etiquetas8_1`
--

DROP TABLE IF EXISTS `etiquetas8_1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `etiquetas8_1` (
  `ID` varchar(20) NOT NULL,
  `Codigo_SAT` varchar(20) NOT NULL,
  `Orden_Fabricacion` varchar(20) NOT NULL,
  `Fecha_Vencimiento` varchar(20) NOT NULL,
  `Numero_Paleta` varchar(20) NOT NULL,
  `Gestion_Lote` varchar(20) NOT NULL,
  `Descripcion_Producto` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `etiquetas8_1`
--

LOCK TABLES `etiquetas8_1` WRITE;
/*!40000 ALTER TABLE `etiquetas8_1` DISABLE KEYS */;
INSERT INTO `etiquetas8_1` VALUES ('1','','','','','','');
/*!40000 ALTER TABLE `etiquetas8_1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `etiquetas8_2`
--

DROP TABLE IF EXISTS `etiquetas8_2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `etiquetas8_2` (
  `ID` varchar(20) NOT NULL,
  `Codigo_SAT` varchar(20) NOT NULL,
  `Orden_Fabricacion` varchar(20) NOT NULL,
  `Fecha_Vencimiento` varchar(20) NOT NULL,
  `Numero_Paleta` varchar(20) NOT NULL,
  `Gestion_Lote` varchar(20) NOT NULL,
  `Descripcion_Producto` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `etiquetas8_2`
--

LOCK TABLES `etiquetas8_2` WRITE;
/*!40000 ALTER TABLE `etiquetas8_2` DISABLE KEYS */;
INSERT INTO `etiquetas8_2` VALUES ('1','','','','','','');
/*!40000 ALTER TABLE `etiquetas8_2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `etiquetas8_3`
--

DROP TABLE IF EXISTS `etiquetas8_3`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `etiquetas8_3` (
  `ID` varchar(20) NOT NULL,
  `Codigo_SAT` varchar(20) NOT NULL,
  `Orden_Fabricacion` varchar(20) NOT NULL,
  `Fecha_Vencimiento` varchar(20) NOT NULL,
  `Numero_Paleta` varchar(20) NOT NULL,
  `Gestion_Lote` varchar(20) NOT NULL,
  `Descripcion_Producto` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `etiquetas8_3`
--

LOCK TABLES `etiquetas8_3` WRITE;
/*!40000 ALTER TABLE `etiquetas8_3` DISABLE KEYS */;
INSERT INTO `etiquetas8_3` VALUES ('1','','','','','','');
/*!40000 ALTER TABLE `etiquetas8_3` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `etiquetas8_4`
--

DROP TABLE IF EXISTS `etiquetas8_4`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `etiquetas8_4` (
  `ID` varchar(20) NOT NULL,
  `Codigo_SAT` varchar(20) NOT NULL,
  `Orden_Fabricacion` varchar(20) NOT NULL,
  `Fecha_Vencimiento` varchar(20) NOT NULL,
  `Numero_Paleta` varchar(20) NOT NULL,
  `Gestion_Lote` varchar(20) NOT NULL,
  `Descripcion_Producto` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `etiquetas8_4`
--

LOCK TABLES `etiquetas8_4` WRITE;
/*!40000 ALTER TABLE `etiquetas8_4` DISABLE KEYS */;
INSERT INTO `etiquetas8_4` VALUES ('1','','','','','','');
/*!40000 ALTER TABLE `etiquetas8_4` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `etiquetas8_5`
--

DROP TABLE IF EXISTS `etiquetas8_5`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `etiquetas8_5` (
  `ID` varchar(20) NOT NULL,
  `Codigo_SAT` varchar(20) NOT NULL,
  `Orden_Fabricacion` varchar(20) NOT NULL,
  `Fecha_Vencimiento` varchar(20) NOT NULL,
  `Numero_Paleta` varchar(20) NOT NULL,
  `Gestion_Lote` varchar(20) NOT NULL,
  `Descripcion_Producto` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `etiquetas8_5`
--

LOCK TABLES `etiquetas8_5` WRITE;
/*!40000 ALTER TABLE `etiquetas8_5` DISABLE KEYS */;
INSERT INTO `etiquetas8_5` VALUES ('1','','','','','','');
/*!40000 ALTER TABLE `etiquetas8_5` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `etiquetas8_6`
--

DROP TABLE IF EXISTS `etiquetas8_6`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `etiquetas8_6` (
  `ID` varchar(20) NOT NULL,
  `Codigo_SAT` varchar(20) NOT NULL,
  `Orden_Fabricacion` varchar(20) NOT NULL,
  `Fecha_Vencimiento` varchar(20) NOT NULL,
  `Numero_Paleta` varchar(20) NOT NULL,
  `Gestion_Lote` varchar(20) NOT NULL,
  `Descripcion_Producto` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `etiquetas8_6`
--

LOCK TABLES `etiquetas8_6` WRITE;
/*!40000 ALTER TABLE `etiquetas8_6` DISABLE KEYS */;
INSERT INTO `etiquetas8_6` VALUES ('1','','','','','','');
/*!40000 ALTER TABLE `etiquetas8_6` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `etiquetas8_7`
--

DROP TABLE IF EXISTS `etiquetas8_7`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `etiquetas8_7` (
  `ID` varchar(20) NOT NULL,
  `Codigo_SAT` varchar(20) NOT NULL,
  `Orden_Fabricacion` varchar(20) NOT NULL,
  `Fecha_Vencimiento` varchar(20) NOT NULL,
  `Numero_Paleta` varchar(20) NOT NULL,
  `Gestion_Lote` varchar(20) NOT NULL,
  `Descripcion_Producto` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `etiquetas8_7`
--

LOCK TABLES `etiquetas8_7` WRITE;
/*!40000 ALTER TABLE `etiquetas8_7` DISABLE KEYS */;
INSERT INTO `etiquetas8_7` VALUES ('1','','','','','','');
/*!40000 ALTER TABLE `etiquetas8_7` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `etiquetas8_8`
--

DROP TABLE IF EXISTS `etiquetas8_8`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `etiquetas8_8` (
  `ID` varchar(20) NOT NULL,
  `Codigo_SAT` varchar(20) NOT NULL,
  `Orden_Fabricacion` varchar(20) NOT NULL,
  `Fecha_Vencimiento` varchar(20) NOT NULL,
  `Numero_Paleta` varchar(20) NOT NULL,
  `Gestion_Lote` varchar(20) NOT NULL,
  `Descripcion_Producto` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `etiquetas8_8`
--

LOCK TABLES `etiquetas8_8` WRITE;
/*!40000 ALTER TABLE `etiquetas8_8` DISABLE KEYS */;
INSERT INTO `etiquetas8_8` VALUES ('1','','','','','','');
/*!40000 ALTER TABLE `etiquetas8_8` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `UserName` varchar(20) NOT NULL,
  `UserPass` varchar(20) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES (1,'admin','admin');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `requisitos`
--

DROP TABLE IF EXISTS `requisitos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `requisitos` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Img_Reportes` longtext NOT NULL,
  `Img_PP` longtext NOT NULL,
  `Img_PS` longtext NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `requisitos`
--

LOCK TABLES `requisitos` WRITE;
/*!40000 ALTER TABLE `requisitos` DISABLE KEYS */;
/*!40000 ALTER TABLE `requisitos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `respaldo`
--

DROP TABLE IF EXISTS `respaldo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `respaldo` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Codigo_SAT` varchar(50) NOT NULL,
  `Orden_Fabricacion` varchar(50) NOT NULL,
  `Fecha_Vencimiento` varchar(50) NOT NULL,
  `Numero_Paleta` varchar(50) NOT NULL,
  `Gestion_Lote` varchar(50) NOT NULL,
  `Descripcion_Producto` text NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `respaldo`
--

LOCK TABLES `respaldo` WRITE;
/*!40000 ALTER TABLE `respaldo` DISABLE KEYS */;
/*!40000 ALTER TABLE `respaldo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'bd_etiquetas'
--

--
-- Dumping routines for database 'bd_etiquetas'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-02-17 21:40:25
