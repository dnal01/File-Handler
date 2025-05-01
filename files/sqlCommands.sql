CREATE TABLE IF NOT EXISTS orders
  ( id BIGINT NOT NULL AUTO_INCREMENT,
    time DATE NOT NULL,
    client_id SMALLINT NOT NULL,
    discount TINYINT NOT NULL,
    total_price DECIMAL(6,2) NOT NULL,
    employee_id TINYINT NOT NULL,
    status VARCHAR(32) NOT NULL,
    PRIMARY KEY (id)
  );

USE demo_db;

CREATE TABLE IF NOT EXISTS orders
         ( id BIGINT NOT NULL AUTO_INCREMENT,
           time DATE NOT NULL,
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
             (CURRENT_TIME(), 1, 0, 25, 1, 'Payed');

DELETE FROM orders
         WHERE id = 1;

ALTER TABLE orders MODIFY time DATETIME;

INSERT INTO orders
         (time, client_id, discount, total_price, employee_id, status)
         VALUES
             (NOW(), 1, 0, 25, 1, 'Payed');

SELECT time, employee_id FROM orders
    WHERE discount > 0
    ORDER BY time DESC
    LIMIT 5;