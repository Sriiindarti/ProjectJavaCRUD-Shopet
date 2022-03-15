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
-- Struktur dari tabel `transaction`
--

CREATE TABLE `transaction` (
  `No` int(5) NOT NULL,
  `IDTransaction` varchar(15) NOT NULL,
  `IDEmployee` char(10) NOT NULL,
  `IDCustomer` char(10) NOT NULL,
  `IDProduct` char(10) NOT NULL,
  `QTY` int(15) NOT NULL,
  `SubTotal` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `transaction`
--

INSERT INTO `transaction` (`No`, `IDTransaction`, `IDEmployee`, `IDCustomer`, `IDProduct`, `QTY`, `SubTotal`) VALUES
(1, 'T0001', 'S210150006', 'CS00000001', '2101305', 2, 50000),
(2, 'T0001', 'S210150006', 'CS00000001', '2101308', 1, 18000),
(3, 'T0002', 'S210150005', 'CS00000002', '2101319', 1, 7000),
(4, 'T0003', 'S210150004', 'CS00000006', '2101303', 4, 60000),
(5, 'T0003', 'S210150004', 'CS00000006', '2101319', 2, 14000),
(6, 'T0004', 'S210150002', 'CS00000003', '2101302', 2, 30000),
(7, 'T0004', 'S210150002', 'CS00000003', '2101319', 5, 35000),
(8, 'T0005', 'S210150003', 'CS00000005', '2101318', 7, 49000),
(9, 'T0005', 'S210150003', 'CS00000005', '2101319', 5, 35000),
(10, 'T0005', 'S210150003', 'CS00000005', '2101306', 3, 45000),
(11, 'T0005', 'S210150003', 'CS00000005', '2101305', 2, 50000),
(12, 'T0005', 'S210150003', 'CS00000005', '2101801', 10, 50000),
(13, 'T0005', 'S210150003', 'CS00000005', '2101305', 5, 125000),
(14, 'T0005', 'S210150003', 'CS00000005', '2101308', 3, 54000),
(15, 'T0006', 'S210150006', 'CS00000002', '2101301', 1, 15000),
(16, 'T0006', 'S210150006', 'CS00000002', '2101801', 10, 50000),
(17, 'T0006', 'S210150006', 'CS00000002', '2101318', 7, 49000),
(18, 'T0007', 'S210150002', 'CS00000001', '2101302', 5, 75000);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `transaction`
--
ALTER TABLE `transaction`
  ADD PRIMARY KEY (`No`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `transaction`
--
ALTER TABLE `transaction`
  MODIFY `No` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
