CREATE DATABASE  IF NOT EXISTS `biblioteca` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `biblioteca`;
-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: biblioteca
-- ------------------------------------------------------
-- Server version	8.0.37

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
-- Table structure for table `articulo`
--

DROP TABLE IF EXISTS `articulo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `articulo` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  `resumen` text,
  `fecha_creacion` varchar(255) DEFAULT NULL,
  `autor_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `autor_id` (`autor_id`),
  CONSTRAINT `articulo_ibfk_1` FOREIGN KEY (`autor_id`) REFERENCES `autor` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `articulo`
--

LOCK TABLES `articulo` WRITE;
/*!40000 ALTER TABLE `articulo` DISABLE KEYS */;
INSERT INTO `articulo` VALUES (6,'Base de datos avanzada','el mejos libro de base de datos avanzada','23/11/23',1),(7,'PROGRAMCION','SDAFASDFASD','23/12/12',2),(8,'BASE DE DATOS AVANZADA V.1','EL MEJOR LIBRO DE LA HISTORIA','12/10/2001',2),(9,'Balas y sangre','Increible','12/09/2021',4);
/*!40000 ALTER TABLE `articulo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `autor`
--

DROP TABLE IF EXISTS `autor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `autor` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  `pais` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `autor`
--

LOCK TABLES `autor` WRITE;
/*!40000 ALTER TABLE `autor` DISABLE KEYS */;
INSERT INTO `autor` VALUES (1,'Yerson Omar','Peru'),(2,'Marcelo','argentina'),(3,'Marcelo','Alemania'),(4,'Ivan','Rusia');
/*!40000 ALTER TABLE `autor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cds`
--

DROP TABLE IF EXISTS `cds`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cds` (
  `id` int NOT NULL AUTO_INCREMENT,
  `numero_musica` int DEFAULT NULL,
  `articulo_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `articulo_id` (`articulo_id`),
  CONSTRAINT `cds_ibfk_1` FOREIGN KEY (`articulo_id`) REFERENCES `articulo` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cds`
--

LOCK TABLES `cds` WRITE;
/*!40000 ALTER TABLE `cds` DISABLE KEYS */;
/*!40000 ALTER TABLE `cds` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comentario`
--

DROP TABLE IF EXISTS `comentario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comentario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `titulo` varchar(255) DEFAULT NULL,
  `body` text,
  `copia_articulo_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `copia_articulo_id` (`copia_articulo_id`),
  CONSTRAINT `comentario_ibfk_1` FOREIGN KEY (`copia_articulo_id`) REFERENCES `copia_articulo` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comentario`
--

LOCK TABLES `comentario` WRITE;
/*!40000 ALTER TABLE `comentario` DISABLE KEYS */;
/*!40000 ALTER TABLE `comentario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `copia_articulo`
--

DROP TABLE IF EXISTS `copia_articulo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `copia_articulo` (
  `id` int NOT NULL AUTO_INCREMENT,
  `articulo_id` int DEFAULT NULL,
  `codigo_interno` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  `prestado` int DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `articulo_id` (`articulo_id`),
  CONSTRAINT `copia_articulo_ibfk_1` FOREIGN KEY (`articulo_id`) REFERENCES `articulo` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `copia_articulo`
--

LOCK TABLES `copia_articulo` WRITE;
/*!40000 ALTER TABLE `copia_articulo` DISABLE KEYS */;
INSERT INTO `copia_articulo` VALUES (1,6,'23234324','nuevo',0),(2,7,'ASDFASFA','nuevo',0),(3,7,'WERQWERQW','nuevo',0),(4,8,'324324324','nuevo',0),(5,9,'8001','nuevo',0),(6,9,'8002','nuevo',0);
/*!40000 ALTER TABLE `copia_articulo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `libro`
--

DROP TABLE IF EXISTS `libro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `libro` (
  `id` int NOT NULL AUTO_INCREMENT,
  `numero_pagina` int DEFAULT NULL,
  `articulo_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `articulo_id` (`articulo_id`),
  CONSTRAINT `libro_ibfk_1` FOREIGN KEY (`articulo_id`) REFERENCES `articulo` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `libro`
--

LOCK TABLES `libro` WRITE;
/*!40000 ALTER TABLE `libro` DISABLE KEYS */;
INSERT INTO `libro` VALUES (2,444,6),(3,333,7),(4,400,8);
/*!40000 ALTER TABLE `libro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pelicula`
--

DROP TABLE IF EXISTS `pelicula`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pelicula` (
  `id` int NOT NULL AUTO_INCREMENT,
  `duracion` varchar(255) DEFAULT NULL,
  `articulo_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `articulo_id` (`articulo_id`),
  CONSTRAINT `pelicula_ibfk_1` FOREIGN KEY (`articulo_id`) REFERENCES `articulo` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pelicula`
--

LOCK TABLES `pelicula` WRITE;
/*!40000 ALTER TABLE `pelicula` DISABLE KEYS */;
INSERT INTO `pelicula` VALUES (1,'2hrs05min',9);
/*!40000 ALTER TABLE `pelicula` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prestamo`
--

DROP TABLE IF EXISTS `prestamo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prestamo` (
  `id` int NOT NULL AUTO_INCREMENT,
  `socio_id` int DEFAULT NULL,
  `copia_articulo_id` int DEFAULT NULL,
  `fecha_prestacion` timestamp NULL DEFAULT NULL,
  `fecha_tope` timestamp NULL DEFAULT NULL,
  `fecha_devolucion` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `socio_id` (`socio_id`),
  KEY `copia_articulo_id` (`copia_articulo_id`),
  CONSTRAINT `prestamo_ibfk_1` FOREIGN KEY (`socio_id`) REFERENCES `socio` (`id`),
  CONSTRAINT `prestamo_ibfk_2` FOREIGN KEY (`copia_articulo_id`) REFERENCES `copia_articulo` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prestamo`
--

LOCK TABLES `prestamo` WRITE;
/*!40000 ALTER TABLE `prestamo` DISABLE KEYS */;
INSERT INTO `prestamo` VALUES (1,1,1,'2024-08-13 01:02:34','2024-08-16 01:02:34','2024-08-21 16:19:34'),(2,2,2,'2024-08-19 15:33:48','2024-08-31 15:33:48','2024-08-19 15:34:51'),(3,3,4,'2024-08-21 16:06:39','2024-08-25 16:06:39',NULL),(4,4,6,'2024-08-21 16:17:41','2024-08-24 16:17:41','2024-08-21 16:19:03');
/*!40000 ALTER TABLE `prestamo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `socio`
--

DROP TABLE IF EXISTS `socio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `socio` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  `apellidos` varchar(255) DEFAULT NULL,
  `codigo` varchar(255) DEFAULT NULL,
  `dni` varchar(255) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `codigo` (`codigo`),
  UNIQUE KEY `dni` (`dni`),
  KEY `dni_2` (`dni`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `socio`
--

LOCK TABLES `socio` WRITE;
/*!40000 ALTER TABLE `socio` DISABLE KEYS */;
INSERT INTO `socio` VALUES (1,'Yerson Omar','Sanchez Leiva','324324234','75015834','Guadalupe'),(2,'Juan','Perez','55353245','7654554','chepen'),(3,'marcelo','lozano','1931212','1931212','asfasdf'),(4,'Omar','Tejada','9456412','74569081','omar.tj@gmail.com');
/*!40000 ALTER TABLE `socio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `telefono`
--

DROP TABLE IF EXISTS `telefono`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `telefono` (
  `id` int NOT NULL AUTO_INCREMENT,
  `numero_telefono` varchar(255) NOT NULL,
  `socio_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `socio_id` (`socio_id`),
  CONSTRAINT `telefono_ibfk_1` FOREIGN KEY (`socio_id`) REFERENCES `socio` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `telefono`
--

LOCK TABLES `telefono` WRITE;
/*!40000 ALTER TABLE `telefono` DISABLE KEYS */;
INSERT INTO `telefono` VALUES (1,'954566233',1),(2,'95654545',2),(3,'987654321',3),(4,'998345641',4);
/*!40000 ALTER TABLE `telefono` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'biblioteca'
--
/*!50003 DROP PROCEDURE IF EXISTS `crearPrestamo` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_unicode_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'IGNORE_SPACE,ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `crearPrestamo`(
    IN p_socio_id INT,
    IN p_copia_articulo_id INT,
    IN p_dia INT
)
BEGIN
    DECLARE EXIT HANDLER FOR SQLEXCEPTION
    BEGIN       
        ROLLBACK;
    END;

    START TRANSACTION;

    INSERT INTO prestamo (socio_id, copia_articulo_id, fecha_prestacion, fecha_tope)
    VALUES (p_socio_id, p_copia_articulo_id, NOW(), DATE_ADD(NOW(), INTERVAL p_dia DAY));

    COMMIT;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `devolverPrestamo` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_unicode_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'IGNORE_SPACE,ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `devolverPrestamo`(
    IN p_prestamo_id INT
)
BEGIN
    DECLARE EXIT HANDLER FOR SQLEXCEPTION
    BEGIN
        ROLLBACK;
    END;

    START TRANSACTION;

    UPDATE prestamo
    SET fecha_devolucion = NOW()
    WHERE id = p_prestamo_id;

    COMMIT;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `listarAutor` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_unicode_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'IGNORE_SPACE,ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `listarAutor`()
BEGIN
    SELECT 
    a.id,    
    a.nombre,
    a.pais,    
    COUNT(t.id) AS total_articulo
    FROM 
        autor a
    LEFT JOIN 
        articulo t ON a.id = t.autor_id    
    GROUP BY 
        a.id,    
        a.nombre,
        a.pais;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `listarSocio` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_unicode_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'IGNORE_SPACE,ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `listarSocio`()
BEGIN
    SELECT 
    s.id,
    s.dni,
    s.codigo,
    s.nombre,
    s.apellidos,
    GROUP_CONCAT(t.numero_telefono) AS telefonos,
    COUNT(p.id) AS total_prestamos
    FROM 
        socio s
    LEFT JOIN 
        telefono t ON s.id = t.socio_id
    LEFT JOIN 
        prestamo p ON s.id = p.socio_id
    GROUP BY 
        s.id,
        s.dni,
        s.codigo,
        s.nombre,
        s.apellidos;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `listar_Articulo` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_unicode_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'IGNORE_SPACE,ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `listar_Articulo`()
BEGIN
    SELECT 
    a.id,    
    a.nombre,
    a.fecha_creacion,
    t.nombre as Autor,
    COUNT(c.id) AS Cantidad,
    COUNT(p.id) AS Numero_Prestado
    FROM 
        Articulo a
    LEFT JOIN 
        autor t ON t.id = a.autor_id
    LEFT JOIN 
        copia_articulo c ON a.id = c.articulo_id
    LEFT JOIN 
        prestamo p ON c.id = p.copia_articulo_id   
    GROUP BY 
        a.id,    
        a.nombre,
        a.fecha_creacion;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `listar_Copias` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_unicode_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'IGNORE_SPACE,ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `listar_Copias`()
BEGIN
    SELECT 
    c.id,    
    c.codigo_interno,
    a.nombre AS Nombre,
    c.estado,
    COUNT(p.id) AS Numero_Prestado
    FROM 
        copia_articulo c
    LEFT JOIN 
        articulo a ON a.id = c.articulo_id    
    LEFT JOIN 
        prestamo p ON c.id = p.copia_articulo_id   
    GROUP BY 
        c.id,    
        c.codigo_interno,    
        c.estado;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `listar_Prestamos` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_unicode_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'IGNORE_SPACE,ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `listar_Prestamos`()
BEGIN
    SELECT 
    p.id,    
    s.codigo,
    s.nombre,
    c.codigo_interno,
    a.nombre,
    p.fecha_prestacion,
    p.fecha_tope,
    p.fecha_devolucion
    FROM 
        prestamo p
    LEFT JOIN 
        copia_articulo c ON p.copia_articulo_id = c.id 
    LEFT JOIN 
        articulo a ON a.id = c.articulo_id    
    LEFT JOIN 
        socio s ON s.id = p.socio_id   
    GROUP BY 
        p.id,     
        p.fecha_prestacion,
        p.fecha_tope,
        p.fecha_devolucion;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-12-31 16:56:58
