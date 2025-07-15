-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 15 Jul 2025 pada 06.24
-- Versi server: 10.4.32-MariaDB
-- Versi PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `simawa`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `mata_kuliah`
--

CREATE TABLE `mata_kuliah` (
  `id` int(100) NOT NULL,
  `kodeMK` varchar(20) NOT NULL,
  `nama_matkul` varchar(100) NOT NULL,
  `ruangan` varchar(100) NOT NULL,
  `sks` varchar(100) NOT NULL,
  `jam` varchar(100) NOT NULL,
  `kelas` varchar(100) NOT NULL,
  `hari` varchar(100) NOT NULL,
  `nama_dosen` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `mata_kuliah`
--

INSERT INTO `mata_kuliah` (`id`, `kodeMK`, `nama_matkul`, `ruangan`, `sks`, `jam`, `kelas`, `hari`, `nama_dosen`) VALUES
(72, '-', 'Aplikasi Mobile 1', 'C2/Lab2', '3', '10.00-12.30', '3B', 'kamis', 'Risna Sari, S.Kom., M.Kom.'),
(73, '-', 'Data Mining', 'B7', '3', '13.00-15.30', '3B', 'kamis', 'Jumarniati, S.Pd, M.Pd.'),
(74, '-', 'Jaringan Komputer', 'Lab7', '3', '10.00-12.30', '3B', 'rabu', 'Dra. Rusmala Dewi, M.T.'),
(75, '-', 'Multimedia Dan Konversi', 'B8/Lab1', '3', '13.00-15.30', '3B', 'jumat', 'Nashir Takbir, S.Kom., M.Pd.'),
(76, '-', 'Sistem Informasi Geografis', 'Lab6', '3', '13.00-15.30', '3B', 'rabu', 'Aryadi Nurfalaq, S.Si., M.T.'),
(77, '-', 'Teknik Optimasi', 'C3', '2', '15.30-17.10', '3B', 'kamis', 'Syukur Daming, S.Pd., M.Si.'),
(78, '-', 'Web Design', 'B10/Lab1', '3', '10.00-12.30', '3B', 'senin', 'Nurhaisa, S.Pd., M.Pd.');

-- --------------------------------------------------------

--
-- Struktur dari tabel `program_studi`
--

CREATE TABLE `program_studi` (
  `jenjang` varchar(10) NOT NULL,
  `program` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `program_studi`
--

INSERT INTO `program_studi` (`jenjang`, `program`) VALUES
('S2', 'Magister pendidikan matematika');

-- --------------------------------------------------------

--
-- Struktur dari tabel `wisudawan_terbaik`
--

CREATE TABLE `wisudawan_terbaik` (
  `id` int(10) NOT NULL,
  `nama_mhs` varchar(100) NOT NULL,
  `fakultas` varchar(100) NOT NULL,
  `ipk` varchar(100) NOT NULL,
  `Prodi` varchar(100) NOT NULL,
  `tahun` varchar(100) NOT NULL,
  `studi` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `wisudawan_terbaik`
--

INSERT INTO `wisudawan_terbaik` (`id`, `nama_mhs`, `fakultas`, `ipk`, `Prodi`, `tahun`, `studi`) VALUES
(1, 'Muhammad Ainun Idrus', 'Keguruan dan Ilmu Pendidikan', '3.97', 'Keguruan dan Ilmu Pendidikan', '1 Tahun 2025', '3 Tahun 8 bulan'),
(2, 'Firmanto Arsan', 'Teknik Komputer', '3.95', 'Informatika', '1 Tahun 2025', '3 Tahun 8 bulan'),
(3, 'Armawati ', 'Pertanian', '4.00', 'Agribisnis', '1 Tahun 2025', '3 Tahun 8 bulan'),
(4, 'Wayan wulandari', 'Sains', '3.98', 'Fisika', '1 Tahun 2025', '3 Tahun 8 bulan');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `mata_kuliah`
--
ALTER TABLE `mata_kuliah`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `wisudawan_terbaik`
--
ALTER TABLE `wisudawan_terbaik`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `mata_kuliah`
--
ALTER TABLE `mata_kuliah`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=79;

--
-- AUTO_INCREMENT untuk tabel `wisudawan_terbaik`
--
ALTER TABLE `wisudawan_terbaik`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
