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
-- Struktur dari tabel `employee`
--

CREATE TABLE `employee` (
  `IDEmployee` char(10) NOT NULL,
  `NameEmp` varchar(200) NOT NULL,
  `Gender` char(10) NOT NULL,
  `TelephoneNumber` char(20) NOT NULL,
  `Sallary` int(15) NOT NULL,
  `Address` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `employee`
--

INSERT INTO `employee` (`IDEmployee`, `NameEmp`, `Gender`, `TelephoneNumber`, `Sallary`, `Address`) VALUES
('S210150001', 'David Gauetta', 'Male', '(+62) 81234567890', 3200000, 'Bogor'),
('S210150002', 'Roy Marten ', 'Male', '(+62) 89876543210', 3200000, 'Jember'),
('S210150003', 'Wendy Walters', 'Female', '(+62) 87865401876', 3200000, 'Cibinong'),
('S210150004', 'William Louis', 'Male', '(+62) 81108892322', 3200000, 'Depok'),
('S210150005', 'Christian Ronaldo', 'Male', '(+62) 83865119025', 3200000, 'Depok'),
('S210150006', 'Emma Watsons', 'Female', '(+62) 81322112201', 3200000, 'Jakarta');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`IDEmployee`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
