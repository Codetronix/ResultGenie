/*
SQLyog Community v12.09 (64 bit)
MySQL - 5.5.46-0ubuntu0.14.04.2 : Database - resultgenie
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`resultgenie` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `resultgenie`;

/*Table structure for table `branch` */

DROP TABLE IF EXISTS `branch`;

CREATE TABLE `branch` (
  `branch_id` int(11) NOT NULL,
  `branch_value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`branch_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `branch` */

/*Table structure for table `college` */

DROP TABLE IF EXISTS `college`;

CREATE TABLE `college` (
  `college_id` int(10) NOT NULL AUTO_INCREMENT,
  `college_name` varchar(255) NOT NULL,
  `college_code` varchar(20) NOT NULL,
  PRIMARY KEY (`college_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `college` */

/*Table structure for table `semester` */

DROP TABLE IF EXISTS `semester`;

CREATE TABLE `semester` (
  `semester_id` int(11) NOT NULL,
  `sem_value` int(11) NOT NULL,
  PRIMARY KEY (`semester_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `semester` */

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `student_id` int(11) NOT NULL AUTO_INCREMENT,
  `student_usn` varchar(20) NOT NULL,
  `student_name` varchar(255) NOT NULL,
  `college_id` int(11) DEFAULT NULL,
  `subject_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`student_id`),
  KEY `college_id` (`college_id`),
  KEY `student_ibfk_2` (`subject_id`),
  CONSTRAINT `student_ibfk_1` FOREIGN KEY (`college_id`) REFERENCES `college` (`college_id`),
  CONSTRAINT `student_ibfk_2` FOREIGN KEY (`subject_id`) REFERENCES `subject` (`subject_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `student` */

/*Table structure for table `subject` */

DROP TABLE IF EXISTS `subject`;

CREATE TABLE `subject` (
  `subject_id` int(11) NOT NULL AUTO_INCREMENT,
  `subject_name` varchar(255) NOT NULL,
  `subject_code` varchar(50) NOT NULL,
  `branch_id` int(11) DEFAULT NULL,
  `semester_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`subject_id`),
  KEY `branch_id` (`branch_id`),
  KEY `semester_id` (`semester_id`),
  CONSTRAINT `subject_ibfk_1` FOREIGN KEY (`branch_id`) REFERENCES `branch` (`branch_id`),
  CONSTRAINT `subject_ibfk_2` FOREIGN KEY (`semester_id`) REFERENCES `semester` (`semester_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `subject` */

/*Table structure for table `theory_practical` */

DROP TABLE IF EXISTS `theory_practical`;

CREATE TABLE `theory_practical` (
  `theory_practical_id` int(11) NOT NULL AUTO_INCREMENT,
  `internal_score` varchar(20) NOT NULL,
  `external_score` varchar(255) NOT NULL,
  `is_practical` tinyint(1) DEFAULT NULL,
  `student_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`theory_practical_id`),
  KEY `student_id` (`student_id`),
  CONSTRAINT `theory_practical_ibfk_1` FOREIGN KEY (`student_id`) REFERENCES `student` (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `theory_practical` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `u_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_password` varchar(255) DEFAULT NULL,
  `u_username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`u_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `user` */

insert  into `user`(`u_id`,`u_password`,`u_username`) values (1,'123','shree');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
