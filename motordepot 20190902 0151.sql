--
-- Script was generated by Devart dbForge Studio 2019 for MySQL, Version 8.2.23.0
-- Product home page: http://www.devart.com/dbforge/mysql/studio
-- Script date 02.09.2019 1:51:22
-- Server version: 8.0.17
-- Client version: 4.1
--

-- 
-- Disable foreign keys
-- 
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;

-- 
-- Set SQL mode
-- 
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

--
-- Set default database
--
USE motordepot;

--
-- Drop table `order_cars`
--
DROP TABLE IF EXISTS order_cars;

--
-- Drop table `cars`
--
DROP TABLE IF EXISTS cars;

--
-- Drop table `order_items`
--
DROP TABLE IF EXISTS order_items;

--
-- Drop table `orders`
--
DROP TABLE IF EXISTS orders;

--
-- Drop table `users`
--
DROP TABLE IF EXISTS users;

--
-- Drop table `drivers`
--
DROP TABLE IF EXISTS drivers;

--
-- Set default database
--
USE motordepot;

--
-- Create table `drivers`
--
CREATE TABLE drivers (
  driver_id INT(11) NOT NULL AUTO_INCREMENT,
  fullname VARCHAR(255) DEFAULT NULL,
  age INT(11) DEFAULT NULL,
  driving_experience INT(11) DEFAULT NULL,
  driving_licence_number BIGINT(19) DEFAULT NULL,
  PRIMARY KEY (driver_id)
)
ENGINE = INNODB,
CHARACTER SET utf8,
COLLATE utf8_general_ci;

--
-- Create table `users`
--
CREATE TABLE users (
  user_id INT(11) NOT NULL AUTO_INCREMENT,
  login VARCHAR(255) DEFAULT NULL,
  password VARCHAR(255) DEFAULT NULL,
  driver_id INT(11) DEFAULT NULL,
  is_admin TINYINT(1) DEFAULT NULL,
  PRIMARY KEY (user_id)
)
ENGINE = INNODB,
CHARACTER SET utf8mb4,
COLLATE utf8mb4_0900_ai_ci;

--
-- Create foreign key
--
ALTER TABLE users 
  ADD CONSTRAINT FK_users_driver_id FOREIGN KEY (driver_id)
    REFERENCES drivers(driver_id);

--
-- Create table `orders`
--
CREATE TABLE orders (
  order_id INT(11) NOT NULL AUTO_INCREMENT,
  description VARCHAR(255) DEFAULT NULL,
  deploy_from VARCHAR(255) DEFAULT NULL,
  arrival_at VARCHAR(255) DEFAULT NULL,
  distance VARCHAR(255) DEFAULT NULL,
  weight DECIMAL(8, 2) DEFAULT NULL,
  driver_id INT(11) DEFAULT NULL,
  PRIMARY KEY (order_id)
)
ENGINE = INNODB,
CHARACTER SET utf8mb4,
COLLATE utf8mb4_0900_ai_ci;

--
-- Create foreign key
--
ALTER TABLE orders 
  ADD CONSTRAINT FK_orders_driver_id FOREIGN KEY (driver_id)
    REFERENCES drivers(driver_id);

--
-- Create table `order_items`
--
CREATE TABLE order_items (
  order_item_id INT(11) NOT NULL AUTO_INCREMENT,
  cargo_type VARCHAR(255) DEFAULT NULL,
  cargo_weight VARCHAR(255) DEFAULT NULL,
  cargo_features VARCHAR(255) DEFAULT NULL,
  order_id INT(11) DEFAULT NULL,
  PRIMARY KEY (order_item_id)
)
ENGINE = INNODB,
CHARACTER SET utf8mb4,
COLLATE utf8mb4_0900_ai_ci;

--
-- Create foreign key
--
ALTER TABLE order_items 
  ADD CONSTRAINT FK_order_items_order_id FOREIGN KEY (order_id)
    REFERENCES orders(order_id);

--
-- Create table `cars`
--
CREATE TABLE cars (
  car_id INT(11) NOT NULL AUTO_INCREMENT,
  model VARCHAR(255) DEFAULT NULL,
  number INT(11) DEFAULT NULL,
  mileage INT(11) DEFAULT NULL,
  category VARCHAR(255) DEFAULT NULL,
  state TINYINT(1) DEFAULT NULL,
  max_cargo_weight DECIMAL(10, 2) DEFAULT NULL,
  PRIMARY KEY (car_id)
)
ENGINE = INNODB,
CHARACTER SET utf8mb4,
COLLATE utf8mb4_0900_ai_ci;

--
-- Create table `order_cars`
--
CREATE TABLE order_cars (
  order_cars_id INT(11) NOT NULL AUTO_INCREMENT,
  order_id INT(11) DEFAULT NULL,
  car_id INT(11) DEFAULT NULL,
  PRIMARY KEY (order_cars_id)
)
ENGINE = INNODB,
CHARACTER SET utf8mb4,
COLLATE utf8mb4_0900_ai_ci;

--
-- Create foreign key
--
ALTER TABLE order_cars 
  ADD CONSTRAINT FK_order_cars_car_id FOREIGN KEY (car_id)
    REFERENCES cars(car_id);

--
-- Create foreign key
--
ALTER TABLE order_cars 
  ADD CONSTRAINT FK_order_cars_order_id FOREIGN KEY (order_id)
    REFERENCES orders(order_id);

-- 
-- Dumping data for table drivers
--
INSERT INTO drivers VALUES
(1, 'Ivanov Ivan Ivanovich', 31, 10, 524035),
(7, 'Ignatiev Sergey Leonidovich', 55, 30, 112233),
(8, 'Petrov Ilia Vasilievich', 40, 20, 116777),
(9, 'Shevchuck Anton Ivanovich', 29, 11, 112233),
(10, 'Nikitin Savelii Innokintievich', 81, 9, 619042),
(11, 'Ustinov Vlasii Demianovich', 29, 10, 448899),
(12, 'Sorokin Nison Anatolevich', 32, 9, 223366),
(13, 'Strelkov Varlam Glebovich', 45, 15, 965231),
(14, 'Kuznetsov Vadim Platonovich', 24, 3, 786523),
(15, 'Grishin Viktor Feliksovich', 31, 7, 786321);

-- 
-- Dumping data for table orders
--
-- Table motordepot.orders does not contain any data (it is empty)

-- 
-- Dumping data for table cars
--
-- Table motordepot.cars does not contain any data (it is empty)

-- 
-- Dumping data for table users
--
-- Table motordepot.users does not contain any data (it is empty)

-- 
-- Dumping data for table order_items
--
-- Table motordepot.order_items does not contain any data (it is empty)

-- 
-- Dumping data for table order_cars
--
-- Table motordepot.order_cars does not contain any data (it is empty)

-- 
-- Restore previous SQL mode
-- 
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;

-- 
-- Enable foreign keys
-- 
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;