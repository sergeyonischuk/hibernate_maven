INSERT INTO client(name) VALUES('Septimus'), ('Julius'), ('Servius'), ('Romulus'), ('Remus');
INSERT INTO planet(id, name) VALUES ('MARS', 'Mars'), ('VEN', 'Venus'), ('EAR', 'Earth'), ('NEP', 'Neptune'), ('O42', 'Object 42');
INSERT INTO Ticket(client_id, from_planet_id, to_planet_id)
VALUES (1, 'MARS', 'EAR'),
       (1, 'MARS', 'EAR'),
       (2, 'VEN', 'NEP'),
       (2, 'NEP', 'O42'),
       (3, 'MARS', 'VEN'),
       (3, 'VEN', 'EAR'),
       (4, 'O42', 'EAR'),
       (4, 'EAR', 'NEP'),
       (5, 'NEP', 'MARS'),
       (5, 'MARS', 'O42');