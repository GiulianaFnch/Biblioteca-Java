-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 31, 2024 at 07:54 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `horsed`
--

-- --------------------------------------------------------

--
-- Table structure for table `livro`
--

CREATE TABLE `livro` (
  `livro_id` int(11) NOT NULL,
  `isbn` varchar(13) NOT NULL,
  `titulo` varchar(100) NOT NULL,
  `autor` varchar(100) NOT NULL DEFAULT 'autor desconhecido',
  `n_paginas` int(11) NOT NULL,
  `editora` varchar(50) NOT NULL DEFAULT 'editora desconhecida',
  `tamanho` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `livro`
--

INSERT INTO `livro` (`livro_id`, `isbn`, `titulo`, `autor`, `n_paginas`, `editora`, `tamanho`) VALUES
(1, 'AB12356789CD', 'Alice no País das Maravilhas', 'Lewis Carroll', 200, 'Porto Editora', '500kb'),
(2, 'BC987654321DE', 'Uma Boa Rapariga', 'Elle Kennedy', 250, 'FNAC', '1mb'),
(3, 'DF1232311EE', 'As vantagens de ser invisível', 'autor desconhecido', 141, 'editora desconhecida', '100 kb'),
(4, '9789895641987', 'A Troca', 'Beth O Leary', 150, 'Intrínseca', '1 mb'),
(6, 'AB213123', 'Tenis em Paris', 'Rafeel Nadal', 150, 'Olimpiadas', '100kb'),
(7, '1111111111', 'Castelo Animado', 'Sei la', 123, 'Magalu', 'sei la'),
(8, 'AB11111111CD', 'Cronicas de Nárnia', 'Discovery', 100, 'Channel', '100mb');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `livro`
--
ALTER TABLE `livro`
  ADD PRIMARY KEY (`livro_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `livro`
--
ALTER TABLE `livro`
  MODIFY `livro_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
