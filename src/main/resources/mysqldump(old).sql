-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: sample_hospital_pricing_schema
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `hospital`
--

DROP TABLE IF EXISTS `hospital`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hospital` (
  `id` int NOT NULL AUTO_INCREMENT,
  `hospital_Name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hospital`
--

LOCK TABLES `hospital` WRITE;
/*!40000 ALTER TABLE `hospital` DISABLE KEYS */;
INSERT INTO `hospital` (`id`, `hospital_Name`) VALUES (1,'Monroe Clinic'),(2,'St. Mary\'s Hospital'),(3,'St. Anges Hospital'),(4,'Fake Test Hospital');
/*!40000 ALTER TABLE `hospital` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hospital_procedure_price`
--

DROP TABLE IF EXISTS `hospital_procedure_price`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hospital_procedure_price` (
  `procedure_id` int NOT NULL,
  `hospital_id` int NOT NULL,
  `price` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`procedure_id`,`hospital_id`),
  KEY `hospital_procedure_price_hospital_id_fk` (`hospital_id`),
  CONSTRAINT `hospital_procedure_price_hospital_id_fk` FOREIGN KEY (`hospital_id`) REFERENCES `hospital` (`id`),
  CONSTRAINT `hospital_procedure_price_procedure_id_fk` FOREIGN KEY (`procedure_id`) REFERENCES `procedure` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hospital_procedure_price`
--

LOCK TABLES `hospital_procedure_price` WRITE;
/*!40000 ALTER TABLE `hospital_procedure_price` DISABLE KEYS */;
INSERT INTO `hospital_procedure_price` (`procedure_id`, `hospital_id`, `price`) VALUES (1,1,'1611'),(1,2,'1198'),(1,3,'632'),(2,1,'4843'),(2,2,'4667'),(2,3,'4086'),(3,1,'123'),(3,2,'352'),(3,3,'174'),(4,1,'16561'),(4,2,'11328'),(4,3,'5838'),(5,1,'786'),(5,2,'892'),(5,3,'1083');
/*!40000 ALTER TABLE `hospital_procedure_price` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `procedure`
--

DROP TABLE IF EXISTS `procedure`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `procedure` (
  `id` int NOT NULL AUTO_INCREMENT,
  `hcpcs_code` varchar(30) NOT NULL,
  `code_desc` varchar(200) DEFAULT NULL,
  `code_desc_english` varchar(400) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `procedure`
--

LOCK TABLES `procedure` WRITE;
/*!40000 ALTER TABLE `procedure` DISABLE KEYS */;
INSERT INTO `procedure` (`id`, code, `code_desc`, `code_desc_english`) VALUES (1,'76700','HC US ABDOMEN COMPLETE','Ultrasound, abdominal, real time with image documentation'),(2,'78452','HT MUSCLE IMAGE SPECT, MULT','Myocardial perfusion imaging, tomographic (SPECT) (including attenuation correction, qualitative or quantitative wall motion, ejection fraction by first pass or gated technique, additional quantification, when performed)'),(3,'80048','METABOLIC PANEL TOTAL CA','BASIC METABOLIC PANEL - Glucose, Urea Nitrogen (BUN), Creatinine, Sodium (Na), Potassium (K),\r\n                        Chloride (CL), Carbon Dioxide (CO2), Anion Gap, Calcium'),(4,'DRG806','VAGINAL DELIVERY WITHOUT STERILIZATION/D&C WITH CC','VAGINAL DELIVERY WITHOUT STERILIZATION/D&C WITH CC'),(5,'93017','HC CARD STRESS TEST ROUTINE','Cardiovascular stress test using maximal or submaximal treadmill or bicycle exercise, continuous electrocardiographic monitoring, and/or pharmacological stress'),(24,'24500','Under Fracture',' Under Fracture and/or Dislocation Procedures on the Humerus (Upper Arm) and Elbow');
/*!40000 ALTER TABLE `procedure` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-13 22:14:18
