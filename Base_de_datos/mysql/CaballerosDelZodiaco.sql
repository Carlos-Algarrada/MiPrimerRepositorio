drop database if exists CaballerosDelZodiaco;
create database if not exists CaballerosDelZodiaco;
use CaballerosDelZodiaco;

create table if not exists Constelaciones (
    id INT AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    Descripcion VARCHAR(255),
    PRIMARY KEY (id)
);

create table if not exists Caballeros_de_Zodiaco (
    id INT AUTO_INCREMENT,
    nombre VARCHAR(50),
    SignoZodiacal VARCHAR(50),
    ConstelacionID INT,
    PRIMARY KEY (id),
    FOREIGN KEY (ConstelacionID) REFERENCES Constelaciones(id)
        ON DELETE CASCADE
        ON UPDATE CASCADE
);

Insert into Constelaciones (nombre, Descripcion) values
    ('Pegaso', 'Una constelación celestial en forma de caballo alado.'),
    ('Dragón', 'Una de las constelaciones más grandes y prominentes del cielo nocturno.'),
    ('Cisne', 'Representa a un cisne que vuela a lo largo de la Vía Láctea.'),
    ('Fénix', 'Una ave mítica que renace de sus propias cenizas.'),
    ('Andrómeda', 'Una constelación que representa a la princesa de la mitología griega, encadenada a una roca como sacrificio.');

Insert into Caballeros_de_Zodiaco (nombre, SignoZodiacal, ConstelacionID) values
    ('Seiya', 'Sagitario', 1),
    ('Shiryu', 'Capricornio', 2),
    ('Hyoga', 'Acuario', 3),
    ('Ikki', 'Escorpio', 4),
    ('Shun', 'Piscis', 5);

ALTER TABLE Caballeros_de_Zodiaco
CHANGE COLUMN SignoZodiacal Zodiaco VARCHAR(50) NOT NULL;

ALTER TABLE Caballeros_de_Zodiaco
ADD COLUMN Estrella_Principal VARCHAR(50) AFTER ConstelacionID;

ALTER TABLE Caballeros_de_Zodiaco
RENAME TO Caballeros;

ALTER TABLE Caballeros
MODIFY COLUMN nombre VARCHAR(100) NOT NULL;

UPDATE Constelaciones
SET Descripcion = 'Andrómeda es una constelación del hemisferio norte, cerca del Polo Norte Celeste, conocida por su vínculo con la mitología griega y la galaxia de Andrómeda (M31), una de las más grandes y brillantes observables desde la Tierra.'
WHERE nombre = 'Andrómeda';