CREATE TABLE IF NOT EXISTS movies (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL UNIQUE,
    movie_language VARCHAR(100) NOT NULL,
    director VARCHAR(300) NOT NULL,
    release_date DATE NOT NULL,
    duration INT NOT NULL,
    summary TINYTEXT,
    genre VARCHAR(50) NOT NULL
    );
CREATE TABLE IF NOT EXISTS actors (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(300) NOT NULL,
    age INT,
    industry VARCHAR(300)
    );
