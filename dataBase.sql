CREATE DATABASE prueba_octans;
USE prueba_octans;

CREATE TABLE Roles(
	id_role int NOT NULL UNIQUE,
    name varchar(255) NOT NULL UNIQUE,
    PRIMARY KEY (id_role)
);

CREATE TABLE Users (
  id_user int NOT NULL UNIQUE AUTO_INCREMENT,
  id_role int NOT NULL,
  name varchar(255) NOT NULL UNIQUE,
  active char(3) NOT NULL,
  PRIMARY KEY (id_user),
  FOREIGN KEY(id_role) REFERENCES Roles(id_role)
);

INSERT INTO Roles VALUES
	(1, 'ADMINISTRADOR'),
    (2, 'AUDITOR'),
    (3, 'AUXILIAR');
