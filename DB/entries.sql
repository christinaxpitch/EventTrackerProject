-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema codeconnectionsdb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `codeconnectionsdb` ;

-- -----------------------------------------------------
-- Schema codeconnectionsdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `codeconnectionsdb` DEFAULT CHARACTER SET utf8 ;
USE `codeconnectionsdb` ;

-- -----------------------------------------------------
-- Table `song`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `song` ;

CREATE TABLE IF NOT EXISTS `song` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `artist` VARCHAR(75) NOT NULL,
  `album` VARCHAR(75) NULL,
  `song_title` VARCHAR(75) NOT NULL,
  `apple_music_link` VARCHAR(1000) NULL,
  `date` DATE NULL,
  `description` VARCHAR(1000) NULL,
  `album_pic` VARCHAR(1000) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
GRANT USAGE ON *.* TO cc@localhost;
 DROP USER cc@localhost;
SET SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';
CREATE USER 'cc'@'localhost' IDENTIFIED BY 'cc';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'cc'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `song`
-- -----------------------------------------------------
START TRANSACTION;
USE `codeconnectionsdb`;
INSERT INTO `song` (`id`, `artist`, `album`, `song_title`, `apple_music_link`, `date`, `description`, `album_pic`) VALUES (1, 'Bombay Bicycle Club', 'A Different Kind of Fix', 'Lights Out, Words Gone', NULL, '2020-11-13', 'A happy mood and a feel good song for the nice weather :)', NULL);
INSERT INTO `song` (`id`, `artist`, `album`, `song_title`, `apple_music_link`, `date`, `description`, `album_pic`) VALUES (2, 'The Drums', 'Abysmal Thoughts', 'I\'ll Fight for Your Life', NULL, '2020-11-14', 'Listened to this on a long walk and thought it was a good song of the day to dance around to.', NULL);
INSERT INTO `song` (`id`, `artist`, `album`, `song_title`, `apple_music_link`, `date`, `description`, `album_pic`) VALUES (3, 'Free Throw', 'Bear Your Mind', 'Hope Spot', NULL, '2020-11-15', 'Trying to learn this on the guitar so I listened to this on repeat a lot today!', NULL);
INSERT INTO `song` (`id`, `artist`, `album`, `song_title`, `apple_music_link`, `date`, `description`, `album_pic`) VALUES (4, 'The Cure', 'DIsintegration', 'Lovesong', NULL, '2020-11-16', 'The waether is gloomy and The Cure is the best way to celebrate that.', NULL);
INSERT INTO `song` (`id`, `artist`, `album`, `song_title`, `apple_music_link`, `date`, `description`, `album_pic`) VALUES (5, 'Goth Babe', 'Goth Babe', 'Weekend Friend', NULL, '2020-11-17', 'A very feel good song to help bring the spirits of Monday up!', NULL);
INSERT INTO `song` (`id`, `artist`, `album`, `song_title`, `apple_music_link`, `date`, `description`, `album_pic`) VALUES (6, 'Hazel English', 'Just Give In/Never Going Home', 'Never Going Home', NULL, '2020-11-18', 'This song is so beautiful and it makes me want to get in my car and drive all the way to the Oregon coast and frolic around. ', NULL);
INSERT INTO `song` (`id`, `artist`, `album`, `song_title`, `apple_music_link`, `date`, `description`, `album_pic`) VALUES (7, 'The Lumineers', 'The Lumineers', 'Flowers in Your Hair', NULL, '2020-11-19', 'I am trying to learn this on the guitar so I listened to this on repeat a lot, especially the intro! ', NULL);
INSERT INTO `song` (`id`, `artist`, `album`, `song_title`, `apple_music_link`, `date`, `description`, `album_pic`) VALUES (8, 'Joyce Manor', 'Cody', 'Last You Heard of Me', NULL, '2020-11-20', 'Classic emo Christina listening to joyce manor on repeat. Way to go, Christina.', NULL);

COMMIT;
