DROP TABLE IF EXISTS fabricantes;
DROP TABLE IF EXISTS articulos;


CREATE TABLE fabricantes (
	id int NOT NULL AUTO_INCREMENT,
	nombre varchar(100) DEFAULT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE articulos (
	id int NOT NULL AUTO_INCREMENT,
    nombre varchar(100) DEFAULT NULL, 
    precio int DEFAULT NULL,
    fabricante_id int,
    PRIMARY KEY (id),
    CONSTRAINT fabricantes_fk FOREIGN KEY (fabricante_id) REFERENCES fabricantes (id)
    ON UPDATE CASCADE ON DELETE CASCADE
);


INSERT INTO fabricantes (nombre) VALUES ('Yamaha');
INSERT INTO fabricantes (nombre) VALUES ('Honda');
INSERT INTO fabricantes (nombre) VALUES ('Aprilia');

INSERT INTO articulos (nombre, precio, fabricante_id) VALUES ('Pastilla freno', 150, 1);
INSERT INTO articulos (nombre, precio, fabricante_id) VALUES ('Pastilla freno', 170, 2);
INSERT INTO articulos (nombre, precio, fabricante_id) VALUES ('Pastilla freno', 140, 3);
INSERT INTO articulos (nombre, precio, fabricante_id) VALUES ('Luces delanteras', 205, 1);
INSERT INTO articulos (nombre, precio, fabricante_id) VALUES ('Luces delanteras', 200, 2);
INSERT INTO articulos (nombre, precio, fabricante_id) VALUES ('Luces delanteras', 210, 3);
INSERT INTO articulos (nombre, precio, fabricante_id) VALUES ('Tubo escape', 500, 1);
INSERT INTO articulos (nombre, precio, fabricante_id) VALUES ('Tubo escape', 550, 2);
INSERT INTO articulos (nombre, precio, fabricante_id) VALUES ('Tubo escape', 520, 3);