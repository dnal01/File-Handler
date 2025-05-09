CREATE TABLE IF NOT EXISTS orders
(
    id BIGINT NOT NULL AUTO_INCREMENT,
    time DATETIME NOT NULL,
    client_id SMALLINT NOT NULL,
    discount TINYINT NOT NULL,
    total_price DECIMAL(6,2) NOT NULL,
    employee_id TINYINT NOT NULL,
    status VARCHAR(32) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO orders
(time, client_id, discount, total_price, employee_id, status)
VALUES
    (NOW(), 1, 25, 15, 1, 'Payed'),
    (NOW(), 2, 15, 1, 1, 'Payed'),
    (NOW(), 3, 0, 15, 1, 'Payed'),
    (NOW(), 4, 5, 30, 1, 'Payed'),
    (NOW(), 5, 15, 5.5, 2, 'Payed'),
    (NOW(), 0, 0, 20.5, 2, 'Payed');



SELECT * FROM orders;

SELECT * FROM orders
    LIMIT 2;

SELECT SUM(total_price) AS "Total quota"
FROM orders;

SELECT employee_id, SUM(total_price) AS "Total quota"
    FROM orders
    GROUP BY employee_id;

SELECT client_id, COUNT(id) AS "Orders amount", AVG(total_price) AS "Average order cost"
    FROM orders
    GROUP BY client_id;