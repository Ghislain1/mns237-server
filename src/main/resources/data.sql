DROP TABLE IF EXISTS greeting;

CREATE TABLE greeting (
	id serial PRIMARY KEY,
	content VARCHAR ( 50 ) UNIQUE NOT NULL
);

INSERT INTO greeting ( content)
VALUES('Hello world !!');
INSERT INTO greeting ( content)
VALUES('Bonjour le Monde   !!');
INSERT INTO greeting ( content)
VALUES('Hallo die Welt !!');
INSERT INTO greeting ( content)
VALUES('Hallo die Welt 2!!');
