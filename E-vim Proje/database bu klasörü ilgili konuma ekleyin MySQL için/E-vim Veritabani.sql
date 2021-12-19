-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: evim
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `fatura_tbl`
--

DROP TABLE IF EXISTS `fatura_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fatura_tbl` (
  `Fatura_KayitNo` int NOT NULL,
  `Fatura_Turu` varchar(100) DEFAULT NULL,
  `Fatura_Tarihi` date DEFAULT NULL,
  `Fatura_OdemeTarihi` date DEFAULT NULL,
  `Fatura_Miktari` varchar(100) DEFAULT NULL,
  `Fatura_Dekont` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`Fatura_KayitNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fatura_tbl`
--

LOCK TABLES `fatura_tbl` WRITE;
/*!40000 ALTER TABLE `fatura_tbl` DISABLE KEYS */;
INSERT INTO `fatura_tbl` VALUES (1,'Elektrik','2021-12-19','2021-12-29','70','C:/Users/hydon/Downloads/E-vim Proje/E-vim Proje/Faturalar/elektrik.png'),(2,'Telefon','2021-12-10','2021-12-26','120','C:/Users/hydon/Downloads/E-vim Proje/E-vim Proje/Faturalar/telefon.png'),(3,'Su','2021-10-01','2021-11-01','300','C:/Users/hydon/Downloads/E-vim Proje/E-vim Proje/Faturalar/su.png'),(4,'Elektrik','2021-12-01','2021-12-03','90','C:/Users/hydon/Downloads/E-vim Proje/E-vim Proje/Faturalar/telefon.png'),(5,'Digerleri','2021-12-16','2022-01-16','270','C:/Users/hydon/Downloads/E-vim Proje/E-vim Proje/Faturalar/elektrik.png'),(6,'Su','2021-05-13','2021-06-13','80','C:/Users/hydon/Downloads/E-vim Proje/E-vim Proje/Faturalar/su.png'),(7,'Digerleri','2019-05-10','2019-06-10','247','C:/Users/hydon/Downloads/E-vim Proje/E-vim Proje/Faturalar/telefon.png'),(8,'Digerleri','2022-09-01','2022-10-02','65','C:/Users/hydon/Downloads/E-vim Proje/E-vim Proje/Faturalar/telefon.png'),(9,'Digerleri','2021-12-09','2022-01-09','876','C:/Users/hydon/Downloads/E-vim Proje/E-vim Proje/Faturalar/su.png'),(10,'Elektrik','2021-12-31','2021-12-28','213','C:/Users/hydon/Downloads/E-vim Proje/E-vim Proje/Garantti Belgeleri/Bilgisayar fatura.png'),(11,'Elektrik','2021-12-29','2021-12-27','123','C:/Users/hydon/Downloads/E-vim Proje/E-vim Proje/Faturalar/elektrik.png');
/*!40000 ALTER TABLE `fatura_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `garantibelge_tbl`
--

DROP TABLE IF EXISTS `garantibelge_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `garantibelge_tbl` (
  `GarantiBelge_KayitNo` int NOT NULL,
  `GarantiBelge_Turu` varchar(100) DEFAULT NULL,
  `GarantiBelge_Markasi` varchar(100) DEFAULT NULL,
  `GarantiBelge_Modeli` varchar(100) DEFAULT NULL,
  `GarantiBelge_Adi` varchar(100) DEFAULT NULL,
  `GarantiBelge_SeriNo` varchar(100) DEFAULT NULL,
  `GarantiBelge_GarantiBitisTarihi` date DEFAULT NULL,
  `GarantiBelge_Faturasi` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`GarantiBelge_KayitNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `garantibelge_tbl`
--

LOCK TABLES `garantibelge_tbl` WRITE;
/*!40000 ALTER TABLE `garantibelge_tbl` DISABLE KEYS */;
INSERT INTO `garantibelge_tbl` VALUES (1,'Bilgisayar','ASUS','FX','ASUS-TUF','1345678','2022-12-17','C:/Users/hydon/Downloads/E-vim Proje/E-vim Proje/Garantti Belgeleri/Bilgisayar fatura.png'),(2,'Telefon','APPLE','7S','IPOHE-7S','R764590','2023-12-15','C:/Users/hydon/Downloads/E-vim Proje/E-vim Proje/Garantti Belgeleri/Bilgisayar fatura.png'),(3,'Bilgisayar Birimleri','HP','M120','MOUSE','T8372','2021-12-30','C:/Users/hydon/Downloads/E-vim Proje/E-vim Proje/Garantti Belgeleri/Bilgisayar fatura.png'),(4,'Televizyon','ARCELİK','G9745','SMART-TV','87974','2021-12-17','C:/Users/hydon/Downloads/E-vim Proje/E-vim Proje/Garantti Belgeleri/Bilgisayar fatura.png'),(6,'Ev Aletleri','ARZUM','A7663','MIKSER','M7482','2023-07-15','C:/Users/hydon/Downloads/E-vim Proje/E-vim Proje/Garantti Belgeleri/Bilgisayar fatura.png'),(7,'Mobilya','ISTIKBAL','K-543','KOLTUK TAKIMI','K7334','2021-12-11','C:/Users/hydon/Downloads/E-vim Proje/E-vim Proje/Garantti Belgeleri/Bilgisayar fatura.png'),(8,'Bilgisayar','ASUS','ASUS-G531','ASUS-ROG','RS843','2021-10-14','C:/Users/hydon/Downloads/E-vim Proje/E-vim Proje/Garantti Belgeleri/Bilgisayar fatura.png'),(9,'Beyaz Esya','Bosh','Bsh-2343','Bulasik makinesi','b432532','2021-12-16','C:/Users/hydon/Downloads/E-vim Proje/E-vim Proje/Garantti Belgeleri/Bilgisayar fatura.png');
/*!40000 ALTER TABLE `garantibelge_tbl` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-12-20  0:58:22
