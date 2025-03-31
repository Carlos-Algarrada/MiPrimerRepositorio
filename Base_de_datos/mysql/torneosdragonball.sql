drop database if exists TorneosDragonBall;
create database if not exists TorneosDragonBall;
use TorneosDragonBall;

create table if not exists Torneos(
    id_torneo INT AUTO_INCREMENT,
    nombre VARCHAR(100) UNIQUE,
    ubicacion VARCHAR(100),
    fecha_inicio DATE,
    fecha_fin DATE NULL,
    PRIMARY KEY (id_torneo)
);

create table if not exists Participantes(
    id_participante INT AUTO_INCREMENT,
    nombre VARCHAR(100),
    edad INT CHECK(edad>=18 AND edad<=150),
    raza VARCHAR(30),
    id_torneo INT,
    PRIMARY KEY (id_participante),
    FOREIGN KEY (id_torneo) REFERENCES Torneos(id_torneo)
        ON DELETE CASCADE
        ON UPDATE CASCADE
);
