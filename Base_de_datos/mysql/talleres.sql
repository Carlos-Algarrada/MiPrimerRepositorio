DROP DATABASE IF EXISTS talleres;
CREATE DATABASE IF NOT EXISTS talleres;
USE talleres;
CREATE TABLE IF NOT EXISTS COCHES(
    mat VARCHAR(8) NOT NULL,
    marca VARCHAR(15),
    an_fab CHAR(2),
    modelo VARCHAR(15),
    PRIMARY KEY (mat)
);
CREATE TABLE IF NOT EXISTS MECANICOS(
    dni CHAR(9) NOT NULL,
    nombre VARCHAR(15) NOT NULL,
    puesto VARCHAR(15),
    parcial char(1),
    PRIMARY KEY (dni)
);
CREATE TABLE IF NOT EXISTS TRABAJOS(
    mat VARCHAR(8) NOT NULL,
    dni CHAR(9) NOT NULL,
    horas FLOAT CHECK(horas > 0.5),
    fecha_rep DATE,
    PRIMARY KEY (mat, dni), 
    FOREIGN KEY (mat) REFERENCES COCHES(mat)
        ON DELETE CASCADE
        ON UPDATE CASCADE,
    FOREIGN KEY (dni) REFERENCES MECANICOS(dni)
        ON DELETE CASCADE
        ON UPDATE CASCADE
);
CREATE TABLE IF NOT EXISTS CLIENTES(
    id_cliente CHAR(10) NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    telefono CHAR(15),
    PRIMARY KEY (id_cliente)
);
CREATE TABLE IF NOT EXISTS PIEZAS(
    id_pieza CHAR(10) NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    precio DECIMAL(10,2) CHECK(precio > 0) NOT NULL,
    PRIMARY KEY (id_pieza)
);
CREATE TABLE IF NOT EXISTS FACTURAS(
    id_factura CHAR(10) NOT NULL,
    id_cliente CHAR(10) NOT NULL,
    fecha_emision DATE,
    total DECIMAL(10,2) CHECK(total > 0) NOT NULL,
    PRIMARY KEY (id_factura, id_cliente),
    FOREIGN KEY (id_cliente) REFERENCES CLIENTES(id_cliente)
        ON DELETE CASCADE
        ON UPDATE CASCADE

);
