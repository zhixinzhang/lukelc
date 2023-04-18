-- INSERT IGNORE INTO vets VALUES (1, 'James', 'Carter');
-- INSERT IGNORE INTO vets VALUES (2, 'Helen', 'Leary');
-- INSERT IGNORE INTO vets VALUES (3, 'Linda', 'Douglas');
-- INSERT IGNORE INTO vets VALUES (4, 'Rafael', 'Ortega');
-- INSERT IGNORE INTO vets VALUES (5, 'Henry', 'Stevens');
-- INSERT IGNORE INTO vets VALUES (6, 'Sharon', 'Jenkins');
-- INSERT INTO vets VALUES (7, 'a', 'b');

INSERT IGNORE INTO  flights VALUES (1, 'BOS', 'LAX', '2022-10-1 16:00:00', '2022-10-1 21:05:00', 5, 210, 'Spirit');
INSERT IGNORE INTO  flights VALUES (2, 'BOS', 'LAX', '2022-10-2 16:00:00', '2022-10-2 21:05:00', 20, 209, 'Spirit');
INSERT IGNORE INTO  flights VALUES (3, 'BOS', 'LAX', '2022-10-1 14:00:00', '2022-10-1 19:20:00', 1, 200, 'Delta');
INSERT IGNORE INTO  flights VALUES (4, 'BOS', 'LAX', '2022-10-1 18:00:00', '2022-10-1 22:00:00', 10, 220, 'American');
INSERT IGNORE INTO  flights VALUES (5, 'BOS', 'JFK', '2022-11-3 10:20:00', '2022-11-3 12:30:00', 1, 199, 'JetBlue');
INSERT IGNORE INTO  flights VALUES (6, 'LAX', 'JFK', '2022-11-3 10:20:00', '2022-11-3 12:30:00', 1, 199, 'JetBlue');

-- Add some test flights
-- INSERT INTO flights 
-- VALUES   (1, 'BOS', 'LAX', '2022-10-1 16:00:00', '2022-10-1 21:05:00', 5, 210, 'Spirit'),
--          (2, 'BOS', 'LAX', '2022-10-2 16:00:00', '2022-10-2 21:05:00', 20, 209, 'Spirit'),
--          (3, 'BOS', 'LAX', '2022-10-1 14:00:00', '2022-10-1 19:20:00', 1, 200, 'Delta'),
--          (4, 'BOS', 'LAX', '2022-10-1 18:00:00', '2022-10-1 22:00:00', 10, 220, 'American'),
--          (5, 'BOS', 'JFK', '2022-11-3 10:20:00', '2022-11-3 12:30:00', 1, 199, 'JetBlue');

  SELECT * FROM flights
  WHERE destination = 'LAX' 
  AND tickets_count > 1
  AND departure >= '2022-09-01 16:00:00'
  AND arrival <= '2022-11-01 21:05:00'
  ORDER By price ASC;


  UPDATE flights
  SET tickets_count = 10
  WHERE id = 2;


INSERT INTO orders (id, source, destination, departure, arrival, tickets_count, price, carrier)
  VALUES (1, 'BOS', 'LAX', '2022-10-01 16:00:00', '2022-10-01 21:05:00', 1, 210, 'Spirit');


START TRANSACTION or BEGIN; --statement1
UPDATE bankaccounts SET funds=funds-100 WHERE accountno='ACC1'; --statement2
UPDATE bankaccounts SET funds=funds+100 WHERE accountno='ACC2'; --statement3
COMMIT; --statement4


START TRANSACTION; --statement1
UPDATE bankaccounts SET funds=funds-100 WHERE accountno='ACC1'; --statement2
UPDATE bankaccounts SET funds=funds+100 WHERE accountno='ACC2'; --statement3
ROLLBACK; --statement4

