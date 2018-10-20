-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema gymdb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `gymdb` ;

-- -----------------------------------------------------
-- Schema gymdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `gymdb` DEFAULT CHARACTER SET utf8 ;
USE `gymdb` ;

-- -----------------------------------------------------
-- Table `gym`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `gym` ;

CREATE TABLE IF NOT EXISTS `gym` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `classes_attended` VARCHAR(45) NULL DEFAULT 'Has yet to attend any class',
  `favorite_equipment` VARCHAR(100) NULL DEFAULT 'Has yet to choose a favorite peice of equipment',
  `age` INT NOT NULL,
  `gender` VARCHAR(1) NOT NULL,
  `weight` DOUBLE NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS gymuser@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'gymuser'@'localhost' IDENTIFIED BY 'gymuser';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'gymuser'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `gym`
-- -----------------------------------------------------
START TRANSACTION;
USE `gymdb`;
INSERT INTO `gym` (`id`, `first_name`, `last_name`, `classes_attended`, `favorite_equipment`, `age`, `gender`, `weight`) VALUES (1, 'Becky', 'Biceps', 'Yoga', 'Dumbbells', 32, 'F', 153);
INSERT INTO `gym` (`id`, `first_name`, `last_name`, `classes_attended`, `favorite_equipment`, `age`, `gender`, `weight`) VALUES (2, 'Tommy', 'Triceps', 'TRX', 'Cables', 25, 'M', 180);
INSERT INTO `gym` (`id`, `first_name`, `last_name`, `classes_attended`, `favorite_equipment`, `age`, `gender`, `weight`) VALUES (3, 'Gina', 'Glutes', 'H.I.T', 'Squat Rack', 26, 'F', 178);
INSERT INTO `gym` (`id`, `first_name`, `last_name`, `classes_attended`, `favorite_equipment`, `age`, `gender`, `weight`) VALUES (4, 'John', 'JuicedUp', 'Full-Body-Attack', 'Bench Press', 30, 'M', 210);
INSERT INTO `gym` (`id`, `first_name`, `last_name`, `classes_attended`, `favorite_equipment`, `age`, `gender`, `weight`) VALUES (5, 'Samantha', 'Shredded', 'Ab-Attack', 'Ab-blaster', 45, 'F', 140);
INSERT INTO `gym` (`id`, `first_name`, `last_name`, `classes_attended`, `favorite_equipment`, `age`, `gender`, `weight`) VALUES (6, 'Michael', 'Meathead', 'Cycle', 'Dumbells', 23, 'M', 250);
INSERT INTO `gym` (`id`, `first_name`, `last_name`, `classes_attended`, `favorite_equipment`, `age`, `gender`, `weight`) VALUES (7, 'Cindy', 'Crunch', 'Ab-Attack', 'Ab-blaster', 19, 'F', 142);
INSERT INTO `gym` (`id`, `first_name`, `last_name`, `classes_attended`, `favorite_equipment`, `age`, `gender`, `weight`) VALUES (8, 'Roger', 'Roids', 'TRX', 'Bench Press', 56, 'M', 195);
INSERT INTO `gym` (`id`, `first_name`, `last_name`, `classes_attended`, `favorite_equipment`, `age`, `gender`, `weight`) VALUES (9, 'Frankie', 'Forearms', 'Back-Attack', 'Pull-Up', 67, 'M', 185);
INSERT INTO `gym` (`id`, `first_name`, `last_name`, `classes_attended`, `favorite_equipment`, `age`, `gender`, `weight`) VALUES (10, 'Jane', 'Jogger', 'Full-Body-Attack', 'Treadmill', 45, 'F', 130);

COMMIT;

