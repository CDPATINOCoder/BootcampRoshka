CREATE TABLE fases (
id_fase SERIAL PRIMARY KEY,
nombre_fase VARCHAR(50)
);

CREATE TABLE grupos (
id_grupo SERIAL PRIMARY KEY,
nombre_grupo VARCHAR(50)
);

CREATE TABLE equipos (
id_equipo SERIAL PRIMARY KEY,
nombre_equipo VARCHAR(50),
pais VARCHAR(50),
id_grupo INT,
FOREIGN KEY (id_grupo) REFERENCES grupos(id_grupo)
);


CREATE TABLE partidos (
id_partido SERIAL PRIMARY KEY,
id_fase INT,
FOREIGN KEY (id_fase) REFERENCES fases(id_fase)
);

CREATE TABLE partido_equipo (
id_partido INT,
id_equipo INT,
PRIMARY KEY(id_partido, id_equipo)
);

ALTER TABLE partido_equipo
ADD CONSTRAINT fk_partidos
FOREIGN KEY (id_partido) REFERENCES partidos(id_partido);

ALTER TABLE partido_equipo
ADD CONSTRAINT fk_equipos
FOREIGN KEY (id_equipo) REFERENCES equipos(id_equipo);

CREATE TABLE jugadores (
id_jugador SERIAL PRIMARY KEY,
nombre_jugador VARCHAR(50),
nacionalidad VARCHAR(50),
id_equipo INT,
FOREIGN KEY (id_equipo) REFERENCES equipos(id_equipo)
);


