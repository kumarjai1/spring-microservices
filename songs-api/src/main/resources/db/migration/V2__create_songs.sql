CREATE TABLE songs (
    id SERIAL,
    title VARCHAR(100) NOT NULL,
    length INT
);

INSERT INTO songs(title, length)
VALUES ('song1', 500), ('song2', 600),
('song3', 650), ('song4', 400);