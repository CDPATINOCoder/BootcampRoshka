INSERT INTO usuarios (username, email, role, created_at)
VALUES ('cesarpatino__', 'cesardavidpatinovera@gmail.com', 'usuario', '2024-11-28 12:08:00')
, ('carloslopez', 'carloslopez@gmail.com', 'admin', CURRENT_TIMESTAMP);

INSERT INTO posts (titulo, mensaje, user_id, estado, created_at) 
VALUES ('Programando', 'Testeando progamas :P', 1, 'No Molestar', CURRENT_TIMESTAMP)
, ('Jugando', 'Muriendo en valorant', 2, 'Activo', CURRENT_TIMESTAMP);

INSERT INTO comentarios (comentario, user_id, post_id, estado, created_at)
VALUES ('Que churro', 1, 1, 'Enviado', CURRENT_TIMESTAMP), ('Sos malisimo', 2, 2, 'Enviado', CURRENT_TIMESTAMP);

INSERT INTO seguidores (seguidor_user_id, seguido_user_id, created_at) 
VALUES (1, 2, CURRENT_TIMESTAMP), (2, 1, CURRENT_TIMESTAMP);


