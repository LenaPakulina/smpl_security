CREATE TABLE users (
	id serial primary key,
	name VARCHAR(255) NOT NULL,
	login VARCHAR(255) NOT NULL,
	hash_password text NOT NULL,
	UNIQUE(login)
);