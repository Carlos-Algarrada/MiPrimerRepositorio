drop database if exists DragonBallZ;
create database if not exists DragonBallZ;
use DragonBallZ;
create table if not exists Personajes(
    id INT AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    raza VARCHAR(50),
    nivel_poder INT,
    PRIMARY KEY (id)
);
 CREATE TABLE IF NOT EXISTS Guerreros (
     id INT AUTO_INCREMENT,
     nombre VARCHAR(50) NOT NULL,
     raza VARCHAR(50),
     poder INT,
     PRIMARY KEY (id)
 );
CREATE TABLE IF NOT EXISTS Peleas (
     id INT AUTO_INCREMENT,
     fecha DATE NOT NULL,
     lugar VARCHAR(100),
     id_guerrero INT,
     resultado VARCHAR(20),
     PRIMARY KEY (id),
     FOREIGN KEY (id_guerrero) REFERENCES Guerreros(id)
         ON DELETE CASCADE
         ON UPDATE CASCADE
 );