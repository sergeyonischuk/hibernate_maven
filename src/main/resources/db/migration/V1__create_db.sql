CREATE TABLE Client(
                       id SERIAL PRIMARY KEY NOT NULL,
                       name VARCHAR(200) NOT NULL CHECK (length(name) >= 3));

CREATE TABLE Planet(
                       id VARCHAR,
                       name VARCHAR(500) CHECK (length(name) >= 1),
                       CONSTRAINT planet_name_latin_upper_digit CHECK (id ~ '^[A-Z0-9]+$'));

CREATE TABLE Ticket (
                        id SERIAL PRIMARY KEY NOT NULL,
                        created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                        client_id bigint,
                        from_planet_id VARCHAR,
                        to_planet_id VARCHAR,
                        FOREIGN KEY(client_id) REFERENCES Client(id),
                        CONSTRAINT planet_name_latin_upper_digit
                            CHECK (from_planet_id ~ '^[A-Z0-9]+$' AND to_planet_id ~ '^[A-Z0-9]+$'));