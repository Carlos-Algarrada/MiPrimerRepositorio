drop database if exists gokus;
create database if not exists gokus;
use gokus;

create table if not exists Personajes(
    id INT AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    raza VARCHAR(50),
    PRIMARY KEY (id)
);

insert into Personajes(nombre, raza) values
    ('Goku', 'Saiyan'),
    ('Vegeta', 'Saiyan'),
    ('Picollo', 'Namekiano'),
    ('Gohan', 'Saiyan-Mestizo'),
    ('Krilin', 'Humano'),
    ('Maestro Tortuga', 'Humano'),
    ('Yamcha', 'Humano'),
    ('Trunks', 'Saiyan'),
    ('Goten', 'Saiyan'),
    ('Bulma', 'Humano'),
    ('Chi-Chi', 'Humano'),
    ('Videl', 'Humano'),
    ('Mr. Satán', 'Humano'),
    ('Dende', 'Namekiano'),
    ('Shenlong', 'Dragón'),
    ('Kami', 'Namekiano'),
    ('Raditz', 'Saiyan'),
    ('Nappa', 'Saiyan'),
    ('Freezer', 'Emperador del Mal'),
    ('Androide 17', 'Androide'),
    ('Androide 18', 'Androide'),
    ('Cell', 'Bio-Androide'),
    ('Majin Boo', 'Majin'),
    ('Beerus', 'Dios de la Destrucción'),
    ('Whis', 'Ángel'),
    ('Zamasu', 'Kaioshin'),
    ('Black Goku', 'Saiyan'),
    ('Jiren', 'Desconocida'),
    ('Broly', 'Saiyan'),
    ('Kale', 'Saiyan'),
    ('Caulifla', 'Saiyan'),
    ('Cabba', 'Saiyan'),
    ('Hit', 'Desconocida'),
    ('Toppo', 'Desconocida'),
    ('Dispo', 'Desconocida'),
    ('Goku Black', 'Saiyan'),
    ('Zeno Sama', 'Rey de Todo'),
    ('Daishinkan', 'Ángel'),
    ('Gowasu', 'Kaioshin'),
    ('Zamasu Fusionado', 'Kaioshin'),
    ('Kefla', 'Saiyan'),
    ('Jiren Full Power', 'Desconocida');