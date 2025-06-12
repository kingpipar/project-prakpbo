-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 12, 2025 at 11:19 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `prakpbo_krs`
--

-- --------------------------------------------------------

--
-- Table structure for table `jadwal_kuliah`
--

CREATE TABLE `jadwal_kuliah` (
  `id_jadwal` int(11) NOT NULL,
  `kode_mk` varchar(10) NOT NULL,
  `kelas` varchar(5) NOT NULL,
  `hari` varchar(10) NOT NULL,
  `jam_mulai` time NOT NULL,
  `jam_selesai` time NOT NULL,
  `dosen_pengajar` varchar(50) NOT NULL,
  `ruang` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `jadwal_kuliah`
--

INSERT INTO `jadwal_kuliah` (`id_jadwal`, `kode_mk`, `kelas`, `hari`, `jam_mulai`, `jam_selesai`, `dosen_pengajar`, `ruang`) VALUES
(83, '100210072', 'A', 'Senin', '07:00:00', '08:40:00', 'Dr. Ahmad Fauzi, M.Pd', 'PI3A'),
(165, '120210012', 'A', 'Senin', '08:40:00', '10:20:00', 'Prof. Siti Nurhaliza, M.T', 'PI3B'),
(166, '123210013', 'A', 'Senin', '10:30:00', '12:10:00', 'Dr. Budi Santoso, M.Kom', 'PI3C'),
(167, '123210022', 'A', 'Senin', '13:00:00', '14:40:00', 'Dr. Maya Sari, M.Si', 'PI3D'),
(168, '123210032', 'A', 'Selasa', '07:00:00', '08:40:00', 'Ir. Dedi Kurniawan, M.T', 'PII3A'),
(169, '123210043', 'A', 'Selasa', '08:40:00', '10:20:00', 'Dr. Rina Fitriana, M.Kom', 'PII3B'),
(170, '123210052', 'A', 'Selasa', '10:30:00', '12:10:00', 'Prof. Joko Widodo, Ph.D', 'PII3C'),
(171, '100210101', 'A', 'Rabu', '07:00:00', '08:40:00', 'Drs. Agus Setiawan, M.Or', 'PIII3A'),
(172, '123210061', 'A', 'Rabu', '08:40:00', '10:20:00', 'Ir. Dedi Kurniawan Alt, M.T', 'PIII3B'),
(173, '123210071', 'A', 'Rabu', '10:30:00', '12:10:00', 'Dr. Rina Fitriana Alt, M.Kom', 'PIII3C'),
(174, '100210072', 'B', 'Senin', '14:40:00', '16:20:00', 'Dr. Ahmad Fauzi Alt, M.Pd', 'PII3D'),
(175, '120210012', 'B', 'Senin', '16:20:00', '18:00:00', 'Prof. Siti Nurhaliza Alt, M.T', 'PIII3D'),
(176, '123210013', 'B', 'Selasa', '13:00:00', '14:40:00', 'Dr. Budi Santoso Alt, M.Kom', 'PIII3A'),
(177, '123210022', 'B', 'Selasa', '14:40:00', '16:20:00', 'Dr. Maya Sari Alt, M.Si', 'PIII3B'),
(178, '123210032', 'B', 'Selasa', '16:20:00', '18:00:00', 'Ir. Dedi Kurniawan B, M.T', 'PIII3C'),
(179, '123210043', 'B', 'Rabu', '13:00:00', '14:40:00', 'Dr. Rina Fitriana B, M.Kom', 'PIII3D'),
(180, '123210052', 'B', 'Rabu', '14:40:00', '16:20:00', 'Prof. Joko Widodo Alt, Ph.D', 'PI3A'),
(181, '100210101', 'B', 'Rabu', '16:20:00', '18:00:00', 'Drs. Agus Setiawan Alt, M.Or', 'PI3B'),
(182, '123210061', 'B', 'Kamis', '07:00:00', '08:40:00', 'Ir. Dedi Kurniawan C, M.T', 'LAB1'),
(183, '123210071', 'B', 'Kamis', '08:40:00', '10:20:00', 'Dr. Rina Fitriana C, M.Kom', 'LAB2'),
(184, '100210111', 'A', 'Kamis', '10:30:00', '12:10:00', 'Drs. Agus Setiawan B, M.Or', 'PI3C'),
(185, '100210132', 'A', 'Kamis', '13:00:00', '14:40:00', 'Mrs. Diana Johnson, M.A', 'PI3D'),
(186, '123210082', 'A', 'Kamis', '14:40:00', '16:20:00', 'Ir. Dedi Kurniawan D, M.T', 'PII3A'),
(187, '123210093', 'A', 'Kamis', '16:20:00', '18:00:00', 'Dr. Statistika Prima, M.Si', 'PII3B'),
(188, '123210102', 'A', 'Jumat', '07:00:00', '08:40:00', 'Dr. Maya Sari B, M.Si', 'PII3C'),
(189, '123210113', 'A', 'Jumat', '08:40:00', '10:20:00', 'Prof. Network Expert, Ph.D', 'PII3D'),
(190, '123210122', 'A', 'Jumat', '10:30:00', '12:10:00', 'Dr. Linear Algebra, M.Si', 'PIII3A'),
(191, '123210133', 'A', 'Jumat', '13:00:00', '14:40:00', 'Prof. IT System, M.T', 'PIII3B'),
(192, '123210141', 'A', 'Jumat', '14:40:00', '16:20:00', 'Prof. Network Expert Alt, Ph.D', 'LAB3'),
(193, '123210151', 'A', 'Jumat', '16:20:00', '18:00:00', 'Ir. Dedi Kurniawan E, M.T', 'LAB4'),
(194, '100210111', 'B', 'Sabtu', '07:00:00', '08:40:00', 'Drs. Agus Setiawan C, M.Or', 'PI3A'),
(195, '100210132', 'B', 'Sabtu', '08:40:00', '10:20:00', 'Mrs. Diana Johnson Alt, M.A', 'PI3B'),
(196, '123210082', 'B', 'Sabtu', '10:30:00', '12:10:00', 'Ir. Dedi Kurniawan F, M.T', 'PI3C'),
(197, '123210093', 'B', 'Sabtu', '13:00:00', '14:40:00', 'Dr. Statistika Prima Alt, M.Si', 'PI3D'),
(198, '123210102', 'B', 'Sabtu', '14:40:00', '16:20:00', 'Dr. Maya Sari C, M.Si', 'PII3A'),
(199, '123210113', 'B', 'Sabtu', '16:20:00', '18:00:00', 'Prof. Network Expert B, Ph.D', 'PII3B'),
(200, '123210122', 'B', 'Senin', '18:00:00', '19:40:00', 'Dr. Linear Algebra Alt, M.Si', 'PII3C'),
(201, '123210133', 'B', 'Senin', '19:40:00', '21:20:00', 'Prof. IT System Alt, M.T', 'PII3D'),
(202, '123210141', 'B', 'Selasa', '18:00:00', '19:40:00', 'Prof. Network Expert C, Ph.D', 'LAB1'),
(203, '123210151', 'B', 'Selasa', '19:40:00', '21:20:00', 'Ir. Dedi Kurniawan G, M.T', 'LAB2'),
(204, '100210122', 'A', 'Senin', '16:20:00', '18:00:00', 'Dr. Bahasa Indonesia, M.Pd', 'PIII3C'),
(205, '123210163', 'A', 'Selasa', '16:20:00', '18:00:00', 'Dr. Data Structure, M.Kom', 'PIII3A'),
(206, '123210172', 'A', 'Selasa', '18:00:00', '19:40:00', 'Prof. Computer Society, Ph.D', 'PIII3B'),
(207, '123210182', 'A', 'Rabu', '18:00:00', '19:40:00', 'Dr. Numerical Computing, M.Si', 'PIII3D'),
(208, '123210192', 'A', 'Rabu', '19:40:00', '21:20:00', 'Dr. HCI Expert, M.Kom', 'PIII3A'),
(209, '123210202', 'A', 'Kamis', '18:00:00', '19:40:00', 'Ir. Digital System, M.T', 'PIII3B'),
(210, '123210213', 'A', 'Kamis', '19:40:00', '21:20:00', 'Prof. GIS Expert, Ph.D', 'PIII3C'),
(211, '123210222', 'A', 'Jumat', '13:00:00', '14:40:00', 'Dr. Web Developer, M.Kom', 'PI3A'),
(212, '123210231', 'A', 'Jumat', '14:40:00', '16:20:00', 'Dr. Data Structure, M.Kom', 'LAB1'),
(213, '123210241', 'A', 'Jumat', '16:20:00', '18:00:00', 'Dr. Web Developer, M.Kom', 'LAB2'),
(214, '100210153', 'A', 'Senin', '18:00:00', '19:40:00', 'Prof. Entrepreneur, MBA', 'PI3B'),
(215, '123210252', 'A', 'Selasa', '18:00:00', '19:40:00', 'Dr. Algorithm Analysis, Ph.D', 'PI3A'),
(216, '123210263', 'A', 'Selasa', '19:40:00', '21:20:00', 'Prof. Compiler Design, Ph.D', 'PI3B'),
(217, '123210273', 'A', 'Rabu', '18:00:00', '19:40:00', 'Dr. AI Expert, Ph.D', 'PI3C'),
(218, '123210283', 'A', 'Rabu', '19:40:00', '21:20:00', 'Prof. Software Engineering, M.T', 'PI3D'),
(219, '123210293', 'A', 'Kamis', '18:00:00', '19:40:00', 'Dr. Computer Architecture, M.T', 'PII3A'),
(220, '123210303', 'A', 'Kamis', '19:40:00', '21:20:00', 'Prof. OOP Expert, M.Kom', 'PII3B'),
(221, '123210311', 'A', 'Jumat', '18:00:00', '19:40:00', 'Dr. AI Expert, Ph.D', 'LAB3'),
(222, '123210321', 'A', 'Jumat', '19:40:00', '21:20:00', 'Prof. OOP Expert, M.Kom', 'LAB4'),
(223, '123210332', 'A', 'Senin', '19:40:00', '21:20:00', 'Dr. Cryptography Expert, Ph.D', 'PII3C'),
(224, '123210342', 'A', 'Selasa', '19:40:00', '21:20:00', 'Prof. Data Scientist, Ph.D', 'PII3D'),
(225, '123210352', 'A', 'Selasa', '21:20:00', '23:00:00', 'Dr. Capstone Expert, M.Kom', 'PIII3A'),
(226, '123210362', 'A', 'Rabu', '19:40:00', '21:20:00', 'Dr. IoT Specialist, M.T', 'PIII3B'),
(227, '123210373', 'A', 'Rabu', '21:20:00', '23:00:00', 'Prof. Operating System, Ph.D', 'PIII3C'),
(228, '123210382', 'A', 'Kamis', '19:40:00', '21:20:00', 'Dr. Operations Research, M.Si', 'PIII3D'),
(229, '123210392', 'A', 'Kamis', '21:20:00', '23:00:00', 'Prof. Project Management, MBA', 'PI3A'),
(230, '123210401', 'A', 'Jumat', '19:40:00', '21:20:00', 'Dr. IoT Specialist, M.T', 'LAB1'),
(231, '123210411', 'A', 'Jumat', '21:20:00', '23:00:00', 'Prof. Data Scientist, Ph.D', 'LAB2'),
(232, '123210422', 'A', 'Senin', '21:20:00', '23:00:00', 'Dr. Research Methodology, Ph.D', 'PI3B'),
(233, '123210432', 'A', 'Selasa', '21:20:00', '23:00:00', 'Prof. Graphics Expert, M.Kom', 'PI3C'),
(234, '123210442', 'A', 'Rabu', '21:20:00', '23:00:00', 'Dr. OOAD Expert, M.Kom', 'PI3D'),
(235, '123210453', 'A', 'Rabu', '07:00:00', '16:00:00', 'Tim Industri', 'INDUSTRI'),
(236, '123210462', 'A', 'Kamis', '21:20:00', '23:00:00', 'Dr. Software Testing, M.T', 'PII3A'),
(237, '123210472', 'A', 'Kamis', '19:40:00', '21:20:00', 'Prof. Mobile Developer, M.Kom', 'PII3B'),
(238, '123210482', 'A', 'Jumat', '21:20:00', '23:00:00', 'Dr. Cloud Computing, Ph.D', 'PII3C'),
(239, '123210491', 'A', 'Jumat', '19:40:00', '21:20:00', 'Prof. Mobile Developer, M.Kom', 'LAB3'),
(240, '123210501', 'A', 'Jumat', '21:20:00', '23:00:00', 'Dr. Cloud Computing, Ph.D', 'LAB4'),
(241, '100210092', 'A', 'Sabtu', '07:00:00', '08:40:00', 'Dr. Bela Negara, M.Pd', 'PIII3A'),
(242, '123210513', 'A', 'Sabtu', '08:40:00', '10:20:00', 'Tim Pembimbing', 'SEMINAR'),
(243, '100210082', 'A', 'Sabtu', '10:30:00', '12:10:00', 'Dr. Civic Education, M.Pd', 'PIII3B'),
(244, '100210143', 'A', 'Sabtu', '07:00:00', '16:00:00', 'Tim KKN', 'MASYARAKAT'),
(245, '123210523', 'A', 'Sabtu', '13:00:00', '16:00:00', 'Tim Pembimbing TA', 'RUANG_TA');

-- --------------------------------------------------------

--
-- Table structure for table `krs`
--

CREATE TABLE `krs` (
  `id_krs` int(11) NOT NULL,
  `id_jadwal` int(11) NOT NULL,
  `nim` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `krs`
--

INSERT INTO `krs` (`id_krs`, `id_jadwal`, `nim`) VALUES
(2, 100210153, '123230109'),
(3, 123210252, '123230109'),
(4, 123210263, '123230109'),
(5, 123210273, '123230109');

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `nim` varchar(9) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `password` varchar(20) NOT NULL,
  `prodi` varchar(30) NOT NULL,
  `semester` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`nim`, `nama`, `password`, `prodi`, `semester`) VALUES
('123230109', 'Alfaaray', 'user321', 'TEKNIK INFORMATIKA', 4),
('123230140', 'Isyraf Fajar', 'user123', 'TEKNIK INFORMATIKA', 4);

-- --------------------------------------------------------

--
-- Table structure for table `matakuliah`
--

CREATE TABLE `matakuliah` (
  `kode_mk` varchar(10) NOT NULL,
  `nama_mk` varchar(50) NOT NULL,
  `sks` int(5) NOT NULL,
  `semester` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `matakuliah`
--

INSERT INTO `matakuliah` (`kode_mk`, `nama_mk`, `sks`, `semester`) VALUES
('100210072', 'Pendidikan Pancasila', 2, 1),
('100210082', 'Pendidikan Kewarganegaraan', 2, 8),
('100210092', 'Bela Negara dan Widya Mwat Yasa', 2, 7),
('100210101', 'Olah Raga I', 1, 1),
('100210111', 'Olah Raga II', 1, 2),
('100210122', 'Bahasa Indonesia', 2, 3),
('100210132', 'Bahasa Inggris', 2, 2),
('100210143', 'Kuliah Kerja Nyata', 3, 8),
('100210153', 'Techopreneurship', 3, 4),
('120210012', 'Konsep Teknologi', 2, 1),
('123210013', 'Matematika Diskrit', 3, 1),
('123210022', 'Kalkulus', 2, 1),
('123210032', 'Algoritma dan Pemrograman', 2, 1),
('123210043', 'Sistem Teknologi Basis Data', 3, 1),
('123210052', 'Logika Informatika', 2, 1),
('123210061', 'Praktikum Algoritma dan Pemrograman', 1, 1),
('123210071', 'Praktikum Implementasi Basis Data', 1, 1),
('123210082', 'Algoritma dan Pemrograman Lanjut', 2, 2),
('123210093', 'Statistika', 3, 2),
('123210102', 'Kalkulus Lanjut', 2, 2),
('123210113', 'Jaringan Komputer', 3, 2),
('123210122', 'Matrik dan Ruang Vektor', 2, 2),
('123210133', 'Sistem dan Teknologi Informasi', 3, 2),
('123210141', 'Praktikum Jaringan Komputer', 1, 2),
('123210151', 'Praktikum Algoritma dan Pemrograman Lanjut', 1, 2),
('123210163', 'Struktur Data', 3, 3),
('123210172', 'Komputer dan Masyarakat', 2, 3),
('123210182', 'Komputasi Numerik', 2, 3),
('123210192', 'Interaksi Manusia dan Komputer', 2, 3),
('123210202', 'Sistem Digital', 2, 3),
('123210213', 'Geoinformatika', 3, 3),
('123210222', 'Pemrograman Web', 2, 3),
('123210231', 'Praktikum Implementasi Struktur Data', 1, 3),
('123210241', 'Praktikum Pemrograman Web', 1, 3),
('123210252', 'Analisa Algoritma', 2, 4),
('123210263', 'Otomata Dan Pengantar Kompilasi', 3, 4),
('123210273', 'Sistem Cerdas dan Pendukung Keputusan', 3, 4),
('123210283', 'Rekayasa Perangkat Lunak', 3, 4),
('123210293', 'Arsitektur dan Organisasi Komputer', 3, 4),
('123210303', 'Pemrograman Berorientasi Objek', 3, 4),
('123210311', 'Praktikum Sistem Cerdas dan Pendukung Keputusan', 1, 4),
('123210321', 'Praktikum Pemrograman Berorientasi Objek', 1, 4),
('123210332', 'Kriptografi', 2, 5),
('123210342', 'Data Science', 2, 5),
('123210352', 'Kapita Selekta', 2, 5),
('123210362', 'Internet of Things (IoT)', 2, 5),
('123210373', 'Sistem Operasi', 3, 5),
('123210382', 'Riset Operasi', 2, 5),
('123210392', 'Manajemen Proyek Perangkat Lunak', 2, 5),
('123210401', 'Praktikum Internet of Things (IoT)', 1, 5),
('123210411', 'Praktikum Data Science', 1, 5),
('123210422', 'Metodologi Penulisan Ilmiah', 2, 6),
('123210432', 'Grafika Komputer dan Multimedia', 2, 6),
('123210442', 'Analisis dan Disain Berorientasi Objek', 2, 6),
('123210453', 'Kerja Praktek', 3, 6),
('123210462', 'Uji Kualitas Perangkat Lunak', 2, 6),
('123210472', 'Teknologi Dan Pemrograman Mobile', 2, 6),
('123210482', 'Teknologi Cloud Computing', 2, 6),
('123210491', 'Praktikum Teknologi dan Pemrograman Mobile', 1, 6),
('123210501', 'Praktikum Teknologi Cloud Computing', 1, 6),
('123210513', 'Seminar Tugas Akhir', 3, 7),
('123210523', 'Tugas Akhir', 3, 8);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `jadwal_kuliah`
--
ALTER TABLE `jadwal_kuliah`
  ADD PRIMARY KEY (`id_jadwal`),
  ADD KEY `kode_mk` (`kode_mk`) USING BTREE;

--
-- Indexes for table `krs`
--
ALTER TABLE `krs`
  ADD PRIMARY KEY (`id_krs`);

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `matakuliah`
--
ALTER TABLE `matakuliah`
  ADD PRIMARY KEY (`kode_mk`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `jadwal_kuliah`
--
ALTER TABLE `jadwal_kuliah`
  MODIFY `id_jadwal` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=246;

--
-- AUTO_INCREMENT for table `krs`
--
ALTER TABLE `krs`
  MODIFY `id_krs` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
