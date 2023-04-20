DROP TABLE IF EXISTS almacenes;
DROP TABLE IF EXISTS cajas;


CREATE TABLE almacenes (
	id int NOT NULL AUTO_INCREMENT,
	lugar varchar(100) DEFAULT NULL,
    capacidad int,
    PRIMARY KEY (id)
);

CREATE TABLE cajas (
	num_referencia char(5) NOT NULL,
    contenido varchar(100) DEFAULT NULL, 
    valor int DEFAULT NULL,
    almacen_id int,
    PRIMARY KEY (num_referencia),
    CONSTRAINT almacenes_fk FOREIGN KEY (almacen_id) REFERENCES almacenes (id)
    ON UPDATE CASCADE ON DELETE CASCADE
);


INSERT INTO almacenes (lugar, capacidad) VALUES ('Tarragona', 250);
INSERT INTO almacenes (lugar, capacidad) VALUES ('Reus', 150);
INSERT INTO almacenes (lugar, capacidad) VALUES ('Valls', 300);

INSERT INTO cajas (num_referencia, contenido, valor, almacen_id) VALUES ('rka3', 'Tinta impresora', 820, 1);
INSERT INTO cajas (num_referencia, contenido, valor, almacen_id) VALUES ('oir2', 'Botellas', 570, 2);
INSERT INTO cajas (num_referencia, contenido, valor, almacen_id) VALUES ('rea8', 'Vasos', 490, 3);
INSERT INTO cajas (num_referencia, contenido, valor, almacen_id) VALUES ('mkd8', 'Gafas de sol', 340, 3);
INSERT INTO cajas (num_referencia, contenido, valor, almacen_id) VALUES ('zxn4', 'Portatiles', 1200, 2);
