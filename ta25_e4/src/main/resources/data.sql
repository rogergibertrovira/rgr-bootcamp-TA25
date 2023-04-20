DROP TABLE IF EXISTS peliculas;
DROP TABLE IF EXISTS salas;

CREATE TABLE peliculas (
	id int NOT NULL AUTO_INCREMENT,
    nombre varchar(100) DEFAULT NULL, 
    cal_edad int DEFAULT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE salas (
	id int NOT NULL AUTO_INCREMENT,
	nombre varchar(100) DEFAULT NULL,
    pelicula_id int,
    PRIMARY KEY (id),
    CONSTRAINT peliculas_fk FOREIGN KEY (pelicula_id) REFERENCES peliculas (id)
    ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO peliculas (nombre, cal_edad) VALUES ('Mad Max: Fury Road', 16);
INSERT INTO peliculas (nombre, cal_edad) VALUES ('300', 18);
INSERT INTO peliculas (nombre, cal_edad) VALUES ('Wacthmen', 18);
INSERT INTO peliculas (nombre, cal_edad) VALUES ('The Batman', 18);
INSERT INTO peliculas (nombre, cal_edad) VALUES ('The Dark Knight Rises', 18);

INSERT INTO salas (nombre, pelicula_id) VALUES ('Ocine Gavarres', 1);
INSERT INTO salas (nombre, pelicula_id) VALUES ('Ocine Reus', 2);
INSERT INTO salas (nombre, pelicula_id) VALUES ('Cines Yelmo Tarragona', 3);