CREATE TABLE users (
    id SERIAL,
    user_name VARCHAR(100) NOT NULL,
    first_name VARCHAR(50),
    last_name VARCHAR(50)
);

INSERT INTO users(user_name, first_name, last_name)
VALUES ('quinto', 'timothy', 'quinto'),
('darkness', 'charlie', 'murphy'),
('hilldawg', 'hillary', 'clinton'),
('onionfan', 'ser', 'davos'),
('1337codr', 'mad', 'hax'),
('badstash', 'charlie', 'chaplin');