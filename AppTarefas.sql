CREATE DATABASE Tarefa;

USE Tarefa;

CREATE TABLE Usuario (
		Id INT PRIMARY KEY AUTO_INCREMENT,
    Nome VARCHAR(30) NOT NULL,
    Sobrenome VARCHAR(100) NOT NULL    
);

CREATE TABLE Preferencia (
		Id INT PRIMARY KEY AUTO_INCREMENT,
    Nivel_Preferencia INT NOT NULL,
    Descricao_Preferencia VARCHAR(150)
);

CREATE TABLE Agenda (
		Id INT PRIMARY KEY AUTO_INCREMENT,
	Nome_Evento VARCHAR(100) NOT NULL,
    FK_Preferencia INT,
    FK_Administrador INT,
    CONSTRAINT FK_Preferencia FOREIGN KEY(FK_Preferencia) REFERENCES Preferencia(Id),
    CONSTRAINT FK_Administrador FOREIGN KEY(FK_Administrador) REFERENCES Usuario(Id)
);

INSERT INTO Preferencia (Nivel_Preferencia, Descricao_Preferencia)values(1, 'Baixa');
INSERT INTO Preferencia (Nivel_Preferencia, Descricao_Preferencia)values(2, 'Media');
INSERT INTO Preferencia (Nivel_Preferencia, Descricao_Preferencia)values(3, 'Alta');
INSERT INTO Preferencia (Nivel_Preferencia, Descricao_Preferencia)values(4, 'Urgente');
ALTER TABLE Agenda  add Agenda_status bit;