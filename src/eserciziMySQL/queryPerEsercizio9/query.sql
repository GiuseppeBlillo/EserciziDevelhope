SELECT * FROM Customer;

UPDATE Customer
SET f_name = 'Giovanna'
WHERE cus_id = 2;

SELECT * FROM Customer;

DELETE FROM Customer
WHERE cus_id = 3;

SELECT * FROM Customer;

TRUNCATE Customer;

SELECT * FROM Customer;