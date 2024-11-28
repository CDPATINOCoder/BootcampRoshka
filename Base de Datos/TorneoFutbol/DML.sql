INSERT INTO fases (nombre_fase) 
VALUES ('Final'), ('Final');

INSERT INTO partidos (id_fase)
VALUES (1), (2);


INSERT INTO grupos (nombre_grupo)
VALUES ('A'), ('C');


INSERT INTO equipos (nombre_equipo, pais, id_grupo) 
VALUES ('Olimpia', 'Paraguay', 2),('Boca Juniors', 'Paraguay', 1);

INSERT INTO partido_equipo (id_partido, id_equipo)
VALUES (2, 1), (1, 2);


INSERT INTO jugadores (nombre_jugador, nacionalidad, id_equipo)
VALUES ('Derlis Gonzales', 'Paraguayo', 2), ('Lucas Pratto', 'Argentino', 2), ('Luis Advincula', 'Peruano', 1), ('Edison Cavani', 'Uruguayo', 1);


