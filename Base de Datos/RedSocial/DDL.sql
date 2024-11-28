	CREATE TABLE usuarios (
	user_id SERIAL PRIMARY KEY,
	username VARCHAR(100) NOT NULL,
	email VARCHAR(100) NOT NULL,
	role VARCHAR(50),
	created_at timestamp
	);
	
	CREATE TABLE posts (
	post_id SERIAL PRIMARY KEY,
	titulo VARCHAR(50),
	mensaje TEXT NOT NULL,
	user_id INT,
	estado VARCHAR(100),
	created_at timestamp
	);

COMMENT ON COLUMN posts.mensaje IS 'Cuerpo del post';

ALTER TABLE posts
ADD CONSTRAINT fk_usuarios 
FOREIGN KEY (user_id) REFERENCES usuarios(user_id);

CREATE TABLE comentarios (
comment_id SERIAL PRIMARY KEY,
comentario TEXT NOT NULL,
user_id INT,
post_id INT,
estado VARCHAR(100),
created_at TIMESTAMP,
FOREIGN KEY (user_id) REFERENCES usuarios(user_id),
FOREIGN KEY (post_id) REFERENCES posts(post_id)
);

COMMENT ON COLUMN comentarios.comentario IS 'comentario sobre un post';

CREATE TABLE seguidores (
seguidor_user_id INT,
seguido_user_id INT,
created_at TIMESTAMP,
FOREIGN KEY (seguidor_user_id) REFERENCES usuarios(user_id),
FOREIGN KEY (seguido_user_id) REFERENCES usuarios(user_id)
);
















