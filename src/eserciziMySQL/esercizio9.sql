CREATE TABLE Customer (
  cus_id INT AUTO_INCREMENT,
  f_name VARCHAR(255),
  l_name VARCHAR(255),
  email VARCHAR(255),
  PRIMARY KEY (cus_id)
  );

INSERT INTO Customer (f_name, l_name, email)
VALUES ('Giacomo','Leopardi','leop@rdigia.com'),
('Giacomo','Leopardi','leop@rdigia.com'),
('Giacomo','Leopardi','leop@rdigia.com');

-- 6 - Question

CREATE TABLE Customers (
 customer_id INT NOT NULL AUTO_INCREMENT,
 first_name VARCHAR(255) NOT NULL,
 last_name VARCHAR(255) NOT NULL,
 email VARCHAR(255) NOT NULL,
 PRIMARY KEY (customer_id)
);

-- 7- Question

CREATE TABLE Products (
 product_name VARCHAR(255) NOT NULL,
 product_description VARCHAR(255) NOT NULL,
 product_price DECIMAL(10, 2) NOT NULL,
 product_quantity INT NOT NULL,
 PRIMARY KEY (product_name, product_description)  -- maybe with a qr code?
);


-- 8 - Question

CREATE TABLE Orders (
 order_id INT NOT NULL AUTO_INCREMENT,
 customer_id INT NOT NULL,
 expected_arrival_time DATE,
 PRIMARY KEY (order_id, customer_id)
);

-- 9 - Question

CREATE TABLE Product_Orders (
 order_id INT NOT NULL AUTO_INCREMENT,
 product_name VARCHAR(255) NOT NULL,
 total_revenue DOUBLE,
 PRIMARY KEY (order_id, product_name)
);