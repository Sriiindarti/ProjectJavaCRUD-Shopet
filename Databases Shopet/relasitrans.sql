-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 11 Bulan Mei 2021 pada 06.29
-- Versi server: 10.4.17-MariaDB
-- Versi PHP: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `shopet2`
--

-- --------------------------------------------------------

--
-- Struktur untuk view `relasitrans`
--

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `relasitrans`  AS SELECT `transaction`.`No` AS `No`, `transaction`.`IDTransaction` AS `IDTransaction`, `transaction`.`IDEmployee` AS `IDEmployee`, `employee`.`NameEmp` AS `NameEmp`, `employee`.`Gender` AS `Gender`, `employee`.`TelephoneNumber` AS `TelephoneNumber`, `employee`.`Sallary` AS `Sallary`, `employee`.`Address` AS `Address`, `transaction`.`IDCustomer` AS `IDCustomer`, `customer`.`NameCust` AS `NameCust`, `customer`.`Addresss` AS `Addresss`, `customer`.`TelephoneeNumber` AS `TelephoneeNumber`, `transaction`.`IDProduct` AS `IDProduct`, `product`.`Product` AS `Product`, `product`.`PurchasePrice` AS `PurchasePrice`, `product`.`SellingPrice` AS `SellingPrice`, `product`.`Stock` AS `Stock`, `transaction`.`QTY` AS `QTY`, `transaction`.`SubTotal` AS `SubTotal` FROM (((`transaction` join `employee`) join `customer`) join `product`) WHERE `transaction`.`IDEmployee` = `employee`.`IDEmployee` AND `transaction`.`IDCustomer` = `customer`.`IDCustomer` AND `transaction`.`IDProduct` = `product`.`IDProduct` ;

--
-- VIEW `relasitrans`
-- Data: Tidak ada
--

COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
