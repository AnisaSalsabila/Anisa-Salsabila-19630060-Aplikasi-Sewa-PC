-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 08, 2022 at 01:58 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 7.3.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_sewa`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `id` int(11) NOT NULL,
  `merk_pc` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`id`, `merk_pc`) VALUES
(1, 'Asus TUF Gaming'),
(2, 'Acer Chromebook'),
(3, 'Toshiba Portege'),
(4, 'HP 15-bw'),
(5, 'Asus VivoBook'),
(6, 'Lenovo IdeaPad'),
(7, 'Dell Inspiron'),
(8, 'Acer Aspire'),
(9, 'Xiaomi Mi Notebook'),
(10, 'Samsung Notebook');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` int(35) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `username`, `password`) VALUES
(1, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `sewa`
--

CREATE TABLE `sewa` (
  `id` int(50) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `merk` varchar(100) NOT NULL,
  `lama` varchar(100) NOT NULL,
  `biaya` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sewa`
--

INSERT INTO `sewa` (`id`, `nama`, `merk`, `lama`, `biaya`) VALUES
(1, 'Rian', 'Asus TUF Gaming', '3 Hari', '200000'),
(2, 'Nisa', 'Toshiba Portege', '5 hari', '700000'),
(3, 'Jaka', 'Acer Chromebook', '3 Hari', '350000'),
(4, 'Ahmad', 'HP 15-bw', '10 Hari', '2000000'),
(5, 'Fadly', 'Asus Vivobook', '5 Hari', '800000'),
(6, 'Salma', 'Lenovo IdeaPad', '3 Hari', '600000'),
(7, 'Alex', 'Dell Inspiron', '14 Hari', '4000000'),
(8, 'Raya', 'Acer Aspire', '5 Hari', '850000'),
(9, 'Anya', 'Xiaomi Mi Notebook', '7 Hari', '2500000');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id` int(50) NOT NULL,
  `no` varchar(100) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `merk` varchar(100) NOT NULL,
  `lama` varchar(100) NOT NULL,
  `biaya` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`id`, `no`, `nama`, `merk`, `lama`, `biaya`) VALUES
(1, '10', 'Rian', 'Asus TUF Gaming', '3 Hari', '200000'),
(2, '27', 'Nisa', 'Toshiba Portege', '5 Hari', '700000'),
(3, '32', 'Jaka', 'Acer Chromebook', '3 Hari', '350000'),
(4, '36', 'Ahmad', 'HP 15-bw', '10 Hari', '2000000'),
(5, '39', 'Fadly', 'Asus Vivobook', '5 Hari', '800000'),
(6, '42', 'Salma', 'Lenovo IdeaPad', '3 Hari', '600000'),
(7, '47', 'Alex', 'Dell Inspiron', '14 Hari', '4000000'),
(8, '53', 'Raya', 'Acer Aspire', '5 Hari', '850000'),
(9, '57', 'Anya', 'Xiaomi Mi Notebook', '7 Hari', '2500000');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `sewa`
--
ALTER TABLE `sewa`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `barang`
--
ALTER TABLE `barang`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `id` int(35) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `sewa`
--
ALTER TABLE `sewa`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
