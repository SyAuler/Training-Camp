-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 18-Jul-2019 às 20:41
-- Versão do servidor: 10.1.38-MariaDB
-- versão do PHP: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `data`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `carros`
--

CREATE TABLE `carros` (
  `id` int(11) NOT NULL,
  `nome` varchar(200) NOT NULL,
  `modelo_id` int(11) NOT NULL,
  `anoLancamento` date NOT NULL,
  `precoLocacao` double NOT NULL,
  `observacao` text NOT NULL,
  `created` datetime NOT NULL,
  `modified` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `carros`
--

INSERT INTO `carros` (`id`, `nome`, `modelo_id`, `anoLancamento`, `precoLocacao`, `observacao`, `created`, `modified`) VALUES
(2, 'civic', 0, '2019-07-14', 120, 'disponivel', '2019-07-14 17:42:18', '2019-07-14 17:42:18'),
(3, 'Ka', 2, '2019-07-14', 60, 'disponivel', '2019-07-14 20:26:36', '2019-07-14 20:26:36'),
(4, 'cruze', 3, '2019-07-14', 130, 'disponivel', '2019-07-14 20:48:46', '2019-07-14 20:48:46');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cidades`
--

CREATE TABLE `cidades` (
  `id` int(11) NOT NULL,
  `cidade` varchar(200) NOT NULL,
  `paise_id` int(11) NOT NULL,
  `endereco_id` int(11) NOT NULL,
  `created` datetime NOT NULL,
  `modified` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `cidades`
--

INSERT INTO `cidades` (`id`, `cidade`, `paise_id`, `endereco_id`, `created`, `modified`) VALUES
(1, 'Toledo', 0, 0, '2019-07-14 18:18:10', '2019-07-14 18:18:10'),
(2, 'Cascavel', 1, 0, '2019-07-14 20:31:52', '2019-07-14 20:31:52');

-- --------------------------------------------------------

--
-- Estrutura da tabela `clientes`
--

CREATE TABLE `clientes` (
  `id` int(11) NOT NULL,
  `nome` varchar(200) NOT NULL,
  `cpf` varchar(15) NOT NULL,
  `email` varchar(200) NOT NULL,
  `endereco_id` int(11) NOT NULL,
  `funcionario_id` int(11) NOT NULL,
  `pagamento_id` int(11) NOT NULL,
  `loc_id` int(11) NOT NULL,
  `created` datetime DEFAULT NULL,
  `modified` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `clientes`
--

INSERT INTO `clientes` (`id`, `nome`, `cpf`, `email`, `endereco_id`, `funcionario_id`, `pagamento_id`, `loc_id`, `created`, `modified`) VALUES
(1, 'simone', '010.884.949-00', 'auler.simone@gmail.com', 0, 0, 0, 0, '2019-07-14 17:26:44', '2019-07-14 17:26:44'),
(2, 'simone', '010.884.949-00', 'auler.simone@hotmail.com', 0, 0, 0, 0, '2019-07-14 17:39:43', '2019-07-14 17:39:43'),
(3, 'Cezar', '1236547890', 'teste@teste.com', 0, 1, 0, 0, '2019-07-14 17:44:17', '2019-07-14 17:44:17'),
(4, 'gustavo', '7896432100', 'gustavo@teste.com', 4, 3, 0, 0, '2019-07-14 20:26:18', '2019-07-14 20:26:18'),
(5, 'Maria', '1365549562165', 'teste@test.com', 3, 2, 0, 0, '2019-07-14 20:47:01', '2019-07-14 20:47:01');

-- --------------------------------------------------------

--
-- Estrutura da tabela `enderecos`
--

CREATE TABLE `enderecos` (
  `id` int(11) NOT NULL,
  `endereco` varchar(200) NOT NULL,
  `numero` int(11) NOT NULL,
  `bairro` varchar(200) NOT NULL,
  `cep` varchar(15) NOT NULL,
  `telefone` varchar(200) NOT NULL,
  `cidade_id` int(11) NOT NULL,
  `cliente_id` int(11) NOT NULL,
  `funcionario_id` int(11) NOT NULL,
  `created` datetime NOT NULL,
  `modified` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `enderecos`
--

INSERT INTO `enderecos` (`id`, `endereco`, `numero`, `bairro`, `cep`, `telefone`, `cidade_id`, `cliente_id`, `funcionario_id`, `created`, `modified`) VALUES
(3, 'rua A', 456, 'centro', '85960000', '456987123', 1, 0, 0, '2019-07-14 19:38:53', '2019-07-14 19:38:53'),
(4, 'rua abel alvares', 502, 'ingleses', '856974200', '999999999999999', 1, 0, 0, '2019-07-14 20:25:18', '2019-07-14 20:25:18');

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionarios`
--

CREATE TABLE `funcionarios` (
  `id` int(11) NOT NULL,
  `nome` varchar(200) NOT NULL,
  `user_id` int(11) NOT NULL,
  `endereco_id` int(11) NOT NULL,
  `loja_id` int(11) NOT NULL,
  `loc_id` int(11) NOT NULL,
  `created` datetime NOT NULL,
  `modified` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `funcionarios`
--

INSERT INTO `funcionarios` (`id`, `nome`, `user_id`, `endereco_id`, `loja_id`, `loc_id`, `created`, `modified`) VALUES
(1, 'arthur', 0, 0, 0, 0, '2019-07-14 17:43:55', '2019-07-14 17:43:55'),
(2, 'Simone', 2, 0, 0, 0, '2019-07-14 18:17:29', '2019-07-14 18:17:29'),
(3, 'Fernando', 1, 3, 0, 0, '2019-07-14 20:24:05', '2019-07-14 20:24:05');

-- --------------------------------------------------------

--
-- Estrutura da tabela `inventarios`
--

CREATE TABLE `inventarios` (
  `id` int(11) NOT NULL,
  `carro_id` int(11) NOT NULL,
  `loja_id` int(11) NOT NULL,
  `loc_id` int(11) NOT NULL,
  `created` datetime NOT NULL,
  `modified` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `inventarios`
--

INSERT INTO `inventarios` (`id`, `carro_id`, `loja_id`, `loc_id`, `created`, `modified`) VALUES
(1, 2, 0, 0, '2019-07-14 17:42:28', '2019-07-14 17:42:28'),
(2, 2, 1, 0, '2019-07-14 20:23:22', '2019-07-14 20:23:22');

-- --------------------------------------------------------

--
-- Estrutura da tabela `locs`
--

CREATE TABLE `locs` (
  `id` int(11) NOT NULL,
  `dataLocs` datetime NOT NULL,
  `dataDevolucao` datetime NOT NULL,
  `pagamento_id` int(11) NOT NULL,
  `cliente_id` int(11) NOT NULL,
  `funcionario_id` int(11) NOT NULL,
  `carro_id` int(11) NOT NULL,
  `created` datetime NOT NULL,
  `modified` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `locs`
--

INSERT INTO `locs` (`id`, `dataLocs`, `dataDevolucao`, `pagamento_id`, `cliente_id`, `funcionario_id`, `carro_id`, `created`, `modified`) VALUES
(1, '2019-07-14 20:23:00', '2019-07-14 20:23:00', 0, 1, 1, 2, '2019-07-14 20:23:11', '2019-07-14 20:23:11'),
(2, '2019-07-14 20:47:00', '2019-07-14 20:47:00', 0, 5, 3, 3, '2019-07-14 20:48:01', '2019-07-14 20:48:01'),
(3, '2019-07-14 20:48:00', '2019-07-14 20:48:00', 0, 3, 2, 3, '2019-07-14 20:48:17', '2019-07-14 20:48:17'),
(4, '2019-07-14 20:48:00', '2019-07-14 20:48:00', 0, 3, 1, 2, '2019-07-14 20:48:27', '2019-07-14 20:48:27'),
(5, '2019-07-14 20:48:00', '2019-07-14 20:48:00', 0, 4, 1, 4, '2019-07-14 20:48:58', '2019-07-14 20:48:58');

-- --------------------------------------------------------

--
-- Estrutura da tabela `lojas`
--

CREATE TABLE `lojas` (
  `id` int(11) NOT NULL,
  `nome` varchar(200) NOT NULL,
  `funcionario_id` int(11) NOT NULL,
  `inventario_id` int(11) NOT NULL,
  `endereco_id` int(11) NOT NULL,
  `created` datetime NOT NULL,
  `modified` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `lojas`
--

INSERT INTO `lojas` (`id`, `nome`, `funcionario_id`, `inventario_id`, `endereco_id`, `created`, `modified`) VALUES
(1, 'Loja 10', 0, 0, 1, '2019-07-14 18:18:32', '2019-07-14 18:18:32'),
(3, 'Loja 10', 0, 0, 4, '2019-07-14 20:35:16', '2019-07-14 20:35:16');

-- --------------------------------------------------------

--
-- Estrutura da tabela `modelos`
--

CREATE TABLE `modelos` (
  `id` int(11) NOT NULL,
  `nome` varchar(200) NOT NULL,
  `carro_id` int(11) NOT NULL,
  `created` datetime NOT NULL,
  `modified` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `modelos`
--

INSERT INTO `modelos` (`id`, `nome`, `carro_id`, `created`, `modified`) VALUES
(1, 'honda', 0, '2019-07-14 17:41:46', '2019-07-14 17:41:46'),
(2, 'Ford', 0, '2019-07-14 20:22:13', '2019-07-14 20:22:13'),
(3, 'Chevrolet', 0, '2019-07-14 20:35:31', '2019-07-14 20:35:31');

-- --------------------------------------------------------

--
-- Estrutura da tabela `pagamentos`
--

CREATE TABLE `pagamentos` (
  `id` int(11) NOT NULL,
  `valor` double NOT NULL,
  `dataPagamento` date NOT NULL,
  `loc_id` int(11) NOT NULL,
  `cliente_id` int(11) NOT NULL,
  `funcionario_id` int(11) NOT NULL,
  `created` datetime NOT NULL,
  `modified` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `pagamentos`
--

INSERT INTO `pagamentos` (`id`, `valor`, `dataPagamento`, `loc_id`, `cliente_id`, `funcionario_id`, `created`, `modified`) VALUES
(1, 250, '2019-07-14', 0, 2, 1, '2019-07-14 20:21:32', '2019-07-14 20:21:32');

-- --------------------------------------------------------

--
-- Estrutura da tabela `paises`
--

CREATE TABLE `paises` (
  `id` int(11) NOT NULL,
  `pais` varchar(220) NOT NULL,
  `cidade_id` int(11) NOT NULL,
  `created` datetime NOT NULL,
  `modified` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `paises`
--

INSERT INTO `paises` (`id`, `pais`, `cidade_id`, `created`, `modified`) VALUES
(1, 'Brasil', 0, '2019-07-14 18:18:16', '2019-07-14 18:18:16'),
(2, 'Peru', 0, '2019-07-14 20:21:11', '2019-07-14 20:21:11');

-- --------------------------------------------------------

--
-- Estrutura da tabela `rules`
--

CREATE TABLE `rules` (
  `id` int(11) NOT NULL,
  `rules` varchar(200) NOT NULL,
  `user_id` int(11) NOT NULL,
  `created` datetime NOT NULL,
  `modified` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `rules`
--

INSERT INTO `rules` (`id`, `rules`, `user_id`, `created`, `modified`) VALUES
(1, 'admin', 0, '2019-07-14 17:46:01', '2019-07-14 17:46:01'),
(2, 'moderador', 3, '2019-07-14 20:30:24', '2019-07-14 20:30:24');

-- --------------------------------------------------------

--
-- Estrutura da tabela `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `nome` varchar(200) NOT NULL,
  `username` varchar(200) NOT NULL,
  `email` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL,
  `rule_id` int(11) NOT NULL,
  `created` datetime NOT NULL,
  `modified` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `users`
--

INSERT INTO `users` (`id`, `nome`, `username`, `email`, `password`, `rule_id`, `created`, `modified`) VALUES
(1, 'admin', 'admin', 'teste@gmail.com', '$2y$10$F.b5Qtvw7h/C46zh6XuZ3uvIncvT0hAejotr.kTak0KUEhC5eXd.W', 0, '2019-07-14 17:44:41', '2019-07-14 17:57:16'),
(2, 'ana', 'user', 'teste@teste.com', '$2y$10$KxG/und1vD3HqU81VXd/UefGAsC17GBu4kXnKbjnCec0trLJes4/O', 0, '2019-07-14 17:50:04', '2019-07-14 17:57:09'),
(3, 'root', 'root', 'teste@hotmail.com', '$2y$10$gnXF2F.j6wgZ3e6ZOwbCVOT7pMfe6bUn.DHoGdQARdNYI/GoIafbC', 1, '2019-07-14 20:30:10', '2019-07-14 20:30:10');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `carros`
--
ALTER TABLE `carros`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `cidades`
--
ALTER TABLE `cidades`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `enderecos`
--
ALTER TABLE `enderecos`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `funcionarios`
--
ALTER TABLE `funcionarios`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `inventarios`
--
ALTER TABLE `inventarios`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `locs`
--
ALTER TABLE `locs`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `lojas`
--
ALTER TABLE `lojas`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `modelos`
--
ALTER TABLE `modelos`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pagamentos`
--
ALTER TABLE `pagamentos`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `paises`
--
ALTER TABLE `paises`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `rules`
--
ALTER TABLE `rules`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `carros`
--
ALTER TABLE `carros`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `cidades`
--
ALTER TABLE `cidades`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `clientes`
--
ALTER TABLE `clientes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `enderecos`
--
ALTER TABLE `enderecos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `funcionarios`
--
ALTER TABLE `funcionarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `inventarios`
--
ALTER TABLE `inventarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `locs`
--
ALTER TABLE `locs`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `lojas`
--
ALTER TABLE `lojas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `modelos`
--
ALTER TABLE `modelos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `pagamentos`
--
ALTER TABLE `pagamentos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `paises`
--
ALTER TABLE `paises`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `rules`
--
ALTER TABLE `rules`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
