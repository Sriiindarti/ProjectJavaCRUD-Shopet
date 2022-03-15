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
-- Struktur dari tabel `product`
--

CREATE TABLE `product` (
  `IDProduct` int(7) NOT NULL,
  `Product` varchar(150) NOT NULL,
  `PurchasePrice` int(15) NOT NULL,
  `SellingPrice` int(15) NOT NULL,
  `Stock` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `product`
--

INSERT INTO `product` (`IDProduct`, `Product`, `PurchasePrice`, `SellingPrice`, `Stock`) VALUES
(2101301, 'Excel Salmon 500g  ', 10000, 15000, 82),
(2101302, 'Excel Tuna 500g ', 10000, 15000, 44),
(2101303, 'Excel Chicken & Salmon 500g  ', 10000, 15000, 38),
(2101304, 'Bolt Tuna 1kg ', 20000, 25000, 46),
(2101305, 'Bolt Salmon 1kg ', 20000, 25000, 39),
(2101306, 'Felibite Tuna 500g ', 10000, 15000, 75),
(2101308, 'Cat Choice Adult 800g  ', 15000, 18000, 51),
(2101318, 'Whiskas Pouch Adult 85g ', 5000, 7000, 74),
(2101319, 'Whiskas Pouch Kitten 85g ', 5000, 7000, 70),
(2101502, 'Markotop Cat Litter 10 L ', 50000, 55000, 96),
(2101801, 'Sakura Fish Food ', 3000, 5000, 98),
(2101803, 'Pf 500 Fish Food 1kg ', 18000, 21000, 78);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`IDProduct`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
