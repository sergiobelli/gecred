# --------------------------------------------------------
# Host:                         127.0.0.1
# Server version:               5.5.16-log
# Server OS:                    Win32
# HeidiSQL version:             6.0.0.3603
# Date/time:                    2013-08-05 15:13:17
# --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

# Dumping database structure for gecred
DROP DATABASE IF EXISTS `gecred`;
CREATE DATABASE IF NOT EXISTS `gecred` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `gecred`;


# Dumping structure for table gecred.gc_users
DROP TABLE IF EXISTS `gc_users`;
CREATE TABLE IF NOT EXISTS `gc_users` (
  `ID` int(20) NOT NULL AUTO_INCREMENT,
  `USERNAME` varchar(50) NOT NULL DEFAULT '0',
  `PASSWORD` varchar(50) NOT NULL DEFAULT '0',
  `DESCRIZIONE` varchar(255) DEFAULT '0',
  PRIMARY KEY (`ID`,`USERNAME`,`PASSWORD`),
  UNIQUE KEY `ID_USERNAME_PASSWORD` (`ID`,`USERNAME`,`PASSWORD`),
  UNIQUE KEY `USERNAME` (`USERNAME`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

# Dumping data for table gecred.gc_users: ~4 rows (approximately)
/*!40000 ALTER TABLE `gc_users` DISABLE KEYS */;
INSERT INTO `gc_users` (`ID`, `USERNAME`, `PASSWORD`, `DESCRIZIONE`) VALUES
	(1, 'sergio.belli', 'sergio', 'Sergio Belli'),
	(2, 'giuliano.premoli', 'giuliano', 'GP'),
	(3, 'corrado.bonardi', 'corrado', 'CB'),
	(4, 'test', 'test', 'Utenza di TEST');
/*!40000 ALTER TABLE `gc_users` ENABLE KEYS */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
