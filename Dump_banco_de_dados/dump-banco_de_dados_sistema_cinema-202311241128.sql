-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: banco_de_dados_sistema_cinema
-- ------------------------------------------------------
-- Server version	8.0.34

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
-- Table structure for table `cidade`
--

DROP TABLE IF EXISTS `cidade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cidade` (
  `id` int NOT NULL,
  `nome` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cidade`
--

LOCK TABLES `cidade` WRITE;
/*!40000 ALTER TABLE `cidade` DISABLE KEYS */;
INSERT INTO `cidade` VALUES (1,'Campo Mourão'),(2,'Maringá'),(3,'Londrina');
/*!40000 ALTER TABLE `cidade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cinema`
--

DROP TABLE IF EXISTS `cinema`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cinema` (
  `id` int NOT NULL,
  `id_cidade` int DEFAULT NULL,
  `nome` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_cidade` (`id_cidade`),
  CONSTRAINT `cinema_ibfk_1` FOREIGN KEY (`id_cidade`) REFERENCES `cidade` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cinema`
--

LOCK TABLES `cinema` WRITE;
/*!40000 ALTER TABLE `cinema` DISABLE KEYS */;
INSERT INTO `cinema` VALUES (1,1,'StarlineCinema'),(2,2,'StarlineCinema'),(3,3,'StarlineCinema');
/*!40000 ALTER TABLE `cinema` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `id` int NOT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `sobrenome` varchar(50) DEFAULT NULL,
  `genero` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `cpf` varchar(50) DEFAULT NULL,
  `usuario` varchar(100) DEFAULT NULL,
  `senha` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'João','Silva','Masculino','joao@email','12345','joaosilva','1234'),(2,'Maria','Oliveira','Feminino','mariaaa@email','54321','mariaoliveira','54321'),(3,'Bruno','Da Costa','Masculino','bruno@email','56789','brunocosta','515253'),(4,'Flavia','Braz','Feminino','flavia@email','4321','flaviabraz','12345'),(5,'Miguel','Alves','Masculino','miguel@email','414243','miguelalves','4241');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `filme`
--

DROP TABLE IF EXISTS `filme`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `filme` (
  `id` int NOT NULL,
  `id_genero` int DEFAULT NULL,
  `nome` varchar(100) DEFAULT NULL,
  `diretor_filme` varchar(50) DEFAULT NULL,
  `classificacao_etaria` varchar(50) DEFAULT NULL,
  `duracao` time DEFAULT NULL,
  `sinopse` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `data_lancamento` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_genero` (`id_genero`),
  CONSTRAINT `filme_ibfk_1` FOREIGN KEY (`id_genero`) REFERENCES `genero` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `filme`
--

LOCK TABLES `filme` WRITE;
/*!40000 ALTER TABLE `filme` DISABLE KEYS */;
INSERT INTO `filme` VALUES (1,4,'Taylor Swift: The Eras Tour','Sam Wrench','Livre (para todas as idades)','02:49:00','Taylor Swift faz um show onde apresenta canções de todas as fases de sua carreira.','2023-10-13'),(2,5,'Super Mario Bros. O Filme','Aaron Horvath','Livre (para todas as idades)','01:32:00','Mario e Luigi vão parar no reino dos cogumelos, que está sendo ameaçado pelo rei dos Koopas.','2023-04-05'),(3,2,'Five Nights at Freddy\'s - O Pesadelo Sem Fim','Emma Tammi','14 anos','01:49:00','No Freddy Fazbear\'s Pizza, robôs animados fazem a festa das crianças durante o dia. Mas, quando chega a noite, eles se transformam em assassinos psicopatas.','2023-10-26'),(4,1,'Jogos Vorazes: A Cantiga dos Pássaros e das Serpentes','Francis Lawrence','12 anos','02:38:00','Anos antes de se tornar o presidente tirânico de Panem, Coriolanus Snow, de 18 anos, vê uma chance de mudar sua sorte quando se torna o mentor de Lucy Gray Baird, o tributo feminino do Distrito 12.','2023-11-15'),(5,3,'Todos Menos Você','Will Gluck','12 anos','02:00:00','Bea e Ben, dois antigos colegas de faculdade, são forçados a conviver quando recebem o convite do casamento de um amigo em comum. Porém, quando descobrem que seus respectivos ex-namorados também vão à cerimônia, os dois decidem fingir ser um casal.','2023-12-22');
/*!40000 ALTER TABLE `filme` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `genero`
--

DROP TABLE IF EXISTS `genero`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `genero` (
  `id` int NOT NULL,
  `nome` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `genero`
--

LOCK TABLES `genero` WRITE;
/*!40000 ALTER TABLE `genero` DISABLE KEYS */;
INSERT INTO `genero` VALUES (1,'Ação'),(2,'Terror'),(3,'Comédia Romântica'),(4,'Documentário'),(5,'Animação');
/*!40000 ALTER TABLE `genero` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ingressos`
--

DROP TABLE IF EXISTS `ingressos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ingressos` (
  `id` int NOT NULL,
  `nome` varchar(100) DEFAULT NULL,
  `preco_ingresso` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ingressos`
--

LOCK TABLES `ingressos` WRITE;
/*!40000 ALTER TABLE `ingressos` DISABLE KEYS */;
INSERT INTO `ingressos` VALUES (1,'REGULAR',20),(2,'MEIA-ENTRADA',10),(3,'CRIANÇA',10),(4,'IDOSO',10);
/*!40000 ALTER TABLE `ingressos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salas`
--

DROP TABLE IF EXISTS `salas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `salas` (
  `id` int NOT NULL,
  `id_cinema` int DEFAULT NULL,
  `nome` varchar(100) DEFAULT NULL,
  `descricao` varchar(50) DEFAULT NULL,
  `quantidade_assentos` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_cinema` (`id_cinema`),
  CONSTRAINT `salas_ibfk_1` FOREIGN KEY (`id_cinema`) REFERENCES `cinema` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salas`
--

LOCK TABLES `salas` WRITE;
/*!40000 ALTER TABLE `salas` DISABLE KEYS */;
INSERT INTO `salas` VALUES (1,1,'Sala 1 vip','Primeira Sala vip',100),(2,3,'Sala 1','Segunda Sala',50),(3,2,'Sala Vip','Sala vip',80),(4,1,'Sala 2 ','Segunda sala',50),(5,3,'Sala 2 vip','Primeira sala vip',100);
/*!40000 ALTER TABLE `salas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sessao`
--

DROP TABLE IF EXISTS `sessao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sessao` (
  `id` int NOT NULL,
  `id_salas` int DEFAULT NULL,
  `id_filme` int DEFAULT NULL,
  `data` date DEFAULT NULL,
  `horario` time DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_salas` (`id_salas`),
  KEY `id_filme` (`id_filme`),
  CONSTRAINT `sessao_ibfk_1` FOREIGN KEY (`id_salas`) REFERENCES `salas` (`id`),
  CONSTRAINT `sessao_ibfk_2` FOREIGN KEY (`id_filme`) REFERENCES `filme` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sessao`
--

LOCK TABLES `sessao` WRITE;
/*!40000 ALTER TABLE `sessao` DISABLE KEYS */;
INSERT INTO `sessao` VALUES (1,2,2,'2023-04-05','19:00:00','Ativa'),(2,1,1,'2023-10-13','18:00:00','Ativa'),(3,3,3,'2023-10-26','22:00:00','Esgotada'),(4,2,4,'2023-11-15','20:00:00','Esgotada'),(5,4,5,'2023-12-22','19:00:00','Cancelada');
/*!40000 ALTER TABLE `sessao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sessao_cliente`
--

DROP TABLE IF EXISTS `sessao_cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sessao_cliente` (
  `id_cliente` int NOT NULL,
  `id_sessao` int NOT NULL,
  `id_ingresso` int NOT NULL,
  PRIMARY KEY (`id_sessao`,`id_cliente`,`id_ingresso`),
  KEY `id_cliente` (`id_cliente`),
  KEY `id_ingresso` (`id_ingresso`),
  CONSTRAINT `sessao_cliente_ibfk_1` FOREIGN KEY (`id_sessao`) REFERENCES `sessao` (`id`),
  CONSTRAINT `sessao_cliente_ibfk_2` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id`),
  CONSTRAINT `sessao_cliente_ibfk_3` FOREIGN KEY (`id_ingresso`) REFERENCES `ingressos` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sessao_cliente`
--

LOCK TABLES `sessao_cliente` WRITE;
/*!40000 ALTER TABLE `sessao_cliente` DISABLE KEYS */;
INSERT INTO `sessao_cliente` VALUES (1,4,4),(2,2,2),(3,3,2),(4,5,1),(5,1,3);
/*!40000 ALTER TABLE `sessao_cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'banco_de_dados_sistema_cinema'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-24 11:28:14
