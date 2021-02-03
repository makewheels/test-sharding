/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.31-log : Database - test-sharding-author-db0
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE = ''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS = @@UNIQUE_CHECKS, UNIQUE_CHECKS = 0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS = @@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS = 0 */;
/*!40101 SET @OLD_SQL_MODE = @@SQL_MODE, SQL_MODE = 'NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES = @@SQL_NOTES, SQL_NOTES = 0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS */`test-sharding-author-db0` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `test-sharding-author-db0`;

/*Table structure for table `author_0` */

DROP TABLE IF EXISTS `author_0`;

CREATE TABLE `author_0`
(
    `id`          bigint(20) NOT NULL,
    `sequence`    bigint(20) NOT NULL,
    `name`        varchar(255)  DEFAULT NULL,
    `dynasty`     int(11)       DEFAULT NULL,
    `description` varchar(5000) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  ROW_FORMAT = DYNAMIC;

/*Table structure for table `author_1` */

DROP TABLE IF EXISTS `author_1`;

CREATE TABLE `author_1`
(
    `id`          bigint(20) NOT NULL,
    `sequence`    bigint(20) NOT NULL,
    `name`        varchar(255)  DEFAULT NULL,
    `dynasty`     int(11)       DEFAULT NULL,
    `description` varchar(5000) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  ROW_FORMAT = DYNAMIC;

/*Table structure for table `dynasty` */

DROP TABLE IF EXISTS `dynasty`;

CREATE TABLE `dynasty`
(
    `id`   int(11) NOT NULL,
    `name` varchar(255) DEFAULT NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  ROW_FORMAT = DYNAMIC;

/*!40101 SET SQL_MODE = @OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS = @OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS = @OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES = @OLD_SQL_NOTES */;

INSERT INTO `dynasty`
VALUES (0, '宋');
INSERT INTO `dynasty`
VALUES (1, '唐');

/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.31-log : Database - test-sharding-author-db1
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE = ''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS = @@UNIQUE_CHECKS, UNIQUE_CHECKS = 0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS = @@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS = 0 */;
/*!40101 SET @OLD_SQL_MODE = @@SQL_MODE, SQL_MODE = 'NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES = @@SQL_NOTES, SQL_NOTES = 0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS */`test-sharding-author-db1` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `test-sharding-author-db1`;

/*Table structure for table `author_0` */

DROP TABLE IF EXISTS `author_0`;

CREATE TABLE `author_0`
(
    `id`          bigint(20) NOT NULL,
    `sequence`    bigint(20) NOT NULL,
    `name`        varchar(255)  DEFAULT NULL,
    `dynasty`     int(11)       DEFAULT NULL,
    `description` varchar(5000) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  ROW_FORMAT = DYNAMIC;

/*Table structure for table `author_1` */

DROP TABLE IF EXISTS `author_1`;

CREATE TABLE `author_1`
(
    `id`          bigint(20) NOT NULL,
    `sequence`    bigint(20) NOT NULL,
    `name`        varchar(255)  DEFAULT NULL,
    `dynasty`     int(11)       DEFAULT NULL,
    `description` varchar(5000) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  ROW_FORMAT = DYNAMIC;

/*Table structure for table `dynasty` */

DROP TABLE IF EXISTS `dynasty`;

CREATE TABLE `dynasty`
(
    `id`   int(11) NOT NULL,
    `name` varchar(255) DEFAULT NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  ROW_FORMAT = DYNAMIC;

/*!40101 SET SQL_MODE = @OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS = @OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS = @OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES = @OLD_SQL_NOTES */;

INSERT INTO `dynasty`
VALUES (0, '宋');
INSERT INTO `dynasty`
VALUES (1, '唐');

/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.31-log : Database - test-sharding-poem-db0
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE = ''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS = @@UNIQUE_CHECKS, UNIQUE_CHECKS = 0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS = @@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS = 0 */;
/*!40101 SET @OLD_SQL_MODE = @@SQL_MODE, SQL_MODE = 'NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES = @@SQL_NOTES, SQL_NOTES = 0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS */`test-sharding-poem-db0` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `test-sharding-poem-db0`;

/*Table structure for table `dynasty` */

DROP TABLE IF EXISTS `dynasty`;

CREATE TABLE `dynasty`
(
    `id`   int(11) NOT NULL,
    `name` varchar(255) DEFAULT NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  ROW_FORMAT = DYNAMIC;

/*Table structure for table `poem_0` */

DROP TABLE IF EXISTS `poem_0`;

CREATE TABLE `poem_0`
(
    `id`         bigint(20) NOT NULL,
    `sequence`   bigint(20) NOT NULL,
    `title`      varchar(255)  DEFAULT NULL,
    `dynasty`    int(11)       DEFAULT NULL,
    `author`     varchar(255)  DEFAULT NULL,
    `paragraphs` varchar(5000) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  ROW_FORMAT = DYNAMIC;

/*Table structure for table `poem_1` */

DROP TABLE IF EXISTS `poem_1`;

CREATE TABLE `poem_1`
(
    `id`         bigint(20) NOT NULL,
    `sequence`   bigint(20) NOT NULL,
    `title`      varchar(255)  DEFAULT NULL,
    `dynasty`    int(11)       DEFAULT NULL,
    `author`     varchar(255)  DEFAULT NULL,
    `paragraphs` varchar(5000) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  ROW_FORMAT = DYNAMIC;

/*!40101 SET SQL_MODE = @OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS = @OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS = @OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES = @OLD_SQL_NOTES */;

INSERT INTO `dynasty`
VALUES (0, '宋');
INSERT INTO `dynasty`
VALUES (1, '唐');

/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.31-log : Database - test-sharding-poem-db1
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE = ''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS = @@UNIQUE_CHECKS, UNIQUE_CHECKS = 0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS = @@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS = 0 */;
/*!40101 SET @OLD_SQL_MODE = @@SQL_MODE, SQL_MODE = 'NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES = @@SQL_NOTES, SQL_NOTES = 0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS */`test-sharding-poem-db1` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `test-sharding-poem-db1`;

/*Table structure for table `dynasty` */

DROP TABLE IF EXISTS `dynasty`;

CREATE TABLE `dynasty`
(
    `id`   int(11) NOT NULL,
    `name` varchar(255) DEFAULT NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  ROW_FORMAT = DYNAMIC;

/*Table structure for table `poem_0` */

DROP TABLE IF EXISTS `poem_0`;

CREATE TABLE `poem_0`
(
    `id`         bigint(20) NOT NULL,
    `sequence`   bigint(20) NOT NULL,
    `title`      varchar(255)  DEFAULT NULL,
    `dynasty`    int(11)       DEFAULT NULL,
    `author`     varchar(255)  DEFAULT NULL,
    `paragraphs` varchar(5000) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  ROW_FORMAT = DYNAMIC;

/*Table structure for table `poem_1` */

DROP TABLE IF EXISTS `poem_1`;

CREATE TABLE `poem_1`
(
    `id`         bigint(20) NOT NULL,
    `sequence`   bigint(20) NOT NULL,
    `title`      varchar(255)  DEFAULT NULL,
    `dynasty`    int(11)       DEFAULT NULL,
    `author`     varchar(255)  DEFAULT NULL,
    `paragraphs` varchar(5000) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  ROW_FORMAT = DYNAMIC;

/*!40101 SET SQL_MODE = @OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS = @OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS = @OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES = @OLD_SQL_NOTES */;

INSERT INTO `dynasty`
VALUES (0, '宋');
INSERT INTO `dynasty`
VALUES (1, '唐');