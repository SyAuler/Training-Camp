-- phpMyAdmin SQL Dump
-- version 4.1.6
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 01-Maio-2019 às 03:42
-- Versão do servidor: 5.6.16
-- PHP Version: 5.5.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `cliente`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `fornecedor`
--

CREATE TABLE IF NOT EXISTS `fornecedor` (
  `id` int(100) NOT NULL AUTO_INCREMENT,
  `cnpj` varchar(14) NOT NULL,
  `raz_social` varchar(50) NOT NULL,
  `nome_fantasia` varchar(50) NOT NULL,
  `cidade` varchar(50) NOT NULL,
  `rua` varchar(50) NOT NULL,
  `numero` varchar(50) NOT NULL,
  `estado` varchar(50) NOT NULL,
  `telefone` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `vendedor` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=5 ;

--
-- Extraindo dados da tabela `fornecedor`
--

INSERT INTO `fornecedor` (`id`, `cnpj`, `raz_social`, `nome_fantasia`, `cidade`, `rua`, `numero`, `estado`, `telefone`, `email`, `vendedor`) VALUES
(1, '456789321010', 'utfpr', 'teste', 'toledo', 'rua a', '123', 'parana', '9999999999999', 'aaa@bbb.com', 'simone'),
(2, '', 'universidade', 'utfpr', 'mal cdo rondon', 'rua b', '456', 'PR', '88888888888', 'qqq@hhh.com', 'luiz'),
(3, '1234567890', 'teste', 'aluno', 'cascavel', 'rua c', '988', 'parana', '666666666666', 'asdf@hhjk.com', 'maria'),
(4, '', 'tecnologica federal', 'Funcionando', 'toledo', 'rua becker', '951', 'parana', '33333333333333', 'www#uuu.com', 'simone');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
