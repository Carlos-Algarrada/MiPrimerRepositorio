drop database  if exists DBZ_Ejercicio_Calculos;
create database if not exists DBZ_Ejercicio_Calculos;
use DBZ_Ejercicio_Calculos;

create table if not exists Guerreros(
    id_guerrero int auto_increment,
    nombre varchar(50),
    raza varchar(50),
    nivel_poder int,
    cantidad_transformaciones int,
    primary key (id_guerrero)
);
insert into Guerreros(nombre,raza,nivel_poder,cantidad_transformaciones) values
    ('Goku', 'Saiyan', 9000, 6),
    ('Vegeta', 'Saiyan', 8500, 4),
    ('Gohan', 'Saiyan', 8000, 4),
    ('Piccolo', 'Namekiano', 7000, 1),
    ('Trunks', 'Saiyan', 7500, 2),
    ('Frezzer', 'Emperador del Mal', 10000, 5),
    ('Cell', 'Bio-Androide', 8500, 3),
    ('Majin Buu', 'Majin', 8000, 3),
    ('Goten', 'Saiyan', 6000, 1),
    ('Krilin','Humano', 5000, 0);