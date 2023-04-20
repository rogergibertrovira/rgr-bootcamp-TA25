DROP TABLE IF EXISTS departamentos;
DROP TABLE IF EXISTS empleados;


CREATE TABLE departamentos (
	id int NOT NULL AUTO_INCREMENT,
	nombre varchar(100) DEFAULT NULL,
    presupuesto int DEFAULT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE empleados (
	dni varchar(8) NOT NULL,
    nombre varchar(100) DEFAULT NULL, 
    apellidos varchar(100) DEFAULT NULL, 
    departamento_id int DEFAULT NULL,
    PRIMARY KEY (dni),
    CONSTRAINT departamentos_fk FOREIGN KEY (departamento_id) REFERENCES departamentos (id)
    ON UPDATE CASCADE ON DELETE CASCADE
);


INSERT INTO departamentos (nombre, presupuesto) VALUES ('IT', 54000);
INSERT INTO departamentos (nombre, presupuesto) VALUES ('Recursos Humanos', 32000);
INSERT INTO departamentos (nombre, presupuesto) VALUES ('Finanzas', 23000);

INSERT INTO empleados (dni, nombre, apellidos, departamento_id) VALUES ('74121563', 'Roger','Gibert', 1);
INSERT INTO empleados (dni, nombre, apellidos, departamento_id) VALUES ('44596352', 'Jose','Mourinho', 2);
INSERT INTO empleados (dni, nombre, apellidos, departamento_id) VALUES ('85421254', 'Pedro','Pascal', 1);
INSERT INTO empleados (dni, nombre, apellidos, departamento_id) VALUES ('55668877', 'Jordi','Casademont', 2);
INSERT INTO empleados (dni, nombre, apellidos, departamento_id) VALUES ('12548996', 'Maria','Jimenez', 3);