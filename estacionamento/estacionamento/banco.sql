CREATE DATABASE IF NOT EXISTS estacionamento;

USE estacionamento;

CREATE TABLE IF NOT EXISTS carro (
    placa CHAR(7) PRIMARY KEY,
    cor VARCHAR(20),
    descricao VARCHAR(100)
);