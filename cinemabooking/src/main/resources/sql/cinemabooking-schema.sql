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
CREATE TABLE IF NOT EXISTS movie_actors(
   movie_id BIGINT NOT NULL,
   actor_id BIGINT NOT NULL,
   PRIMARY KEY (movie_id, actor_id),
   CONSTRAINT fk_movie_actors_user FOREIGN KEY (movie_id) REFERENCES movies(id) on DELETE CASCADE,
   CONSTRAINT fk_movie_actors_actor FOREIGN KEY (actor_id) REFERENCES actors(id) on DELETE CASCADE
);
