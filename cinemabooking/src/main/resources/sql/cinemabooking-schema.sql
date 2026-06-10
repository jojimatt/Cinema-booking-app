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
   CONSTRAINT fk_movie_actors_movie FOREIGN KEY (movie_id) REFERENCES movies(id) on DELETE CASCADE,
   CONSTRAINT fk_movie_actors_actor FOREIGN KEY (actor_id) REFERENCES actors(id) on DELETE CASCADE
);
CREATE TABLE IF NOT EXISTS seats (
                                     id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                     seatrow VARCHAR(255) NOT NULL,
                                     number INT NOT NULL,
                                     hall_id BIGINT NOT NULL,
                                     CONSTRAINT fk_seats_hall FOREIGN KEY (hall_id) REFERENCES halls(id) ON DELETE CASCADE
);
CREATE TABLE IF NOT EXISTS users (
                                     id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                     email VARCHAR(255) NOT NULL UNIQUE,
                                     password_hash VARCHAR(255) NOT NULL,
                                     first_name VARCHAR(255) NOT NULL,
                                     last_name VARCHAR(255) NOT NULL
);
CREATE TABLE IF NOT EXISTS bookings (
                                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                        user_id BIGINT NOT NULL,
                                        seat_id BIGINT NOT NULL,
                                        screening_id BIGINT NOT NULL,
                                        booked_at DATETIME NOT NULL,
                                        version INT,
                                        CONSTRAINT uq_bookings_seat_screening UNIQUE (seat_id, screening_id),
                                        CONSTRAINT fk_bookings_user FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE,
                                        CONSTRAINT fk_bookings_seat FOREIGN KEY (seat_id) REFERENCES seats(id) ON DELETE CASCADE,
                                        CONSTRAINT fk_bookings_screening FOREIGN KEY (screening_id) REFERENCES screenings(id) ON DELETE CASCADE
);
CREATE TABLE IF NOT EXISTS screenings (
                                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                          movie_id BIGINT NOT NULL,
                                          hall_id BIGINT NOT NULL,
                                          start_time DATETIME NOT NULL,
                                          end_time DATETIME NOT NULL,
                                          CONSTRAINT fk_screenings_movie FOREIGN KEY (movie_id) REFERENCES movies(id) ON DELETE CASCADE,
                                          CONSTRAINT fk_screenings_hall FOREIGN KEY (hall_id) REFERENCES halls(id) ON DELETE CASCADE
);
CREATE TABLE halls (
                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                       name VARCHAR(255) NOT NULL,
                       capacity INTEGER NOT NULL
);
