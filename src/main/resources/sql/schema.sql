DROP TABLE IF EXISTS customers;

CREATE TABLE customers (
  ID BIGSERIAL NOT NULL PRIMARY KEY,
  CUSTOMERNAME TEXT NOT NULL,
  CUSTOMERSURNAME TEXT NOT NULL,
  CUSTOMERNUMBER TEXT NOT NULL
);

DROP TABLE IF EXISTS employees;

CREATE TABLE employees (
  ID BIGSERIAL NOT NULL PRIMARY KEY,
  EMPLOYEENAME TEXT NOT NULL,
  EMPLOYEESURNAME TEXT NOT NULL,
  EMPLOYEENUMBER TEXT NOT NULL
);

CREATE TABLE orders (
  ID BIGSERIAL NOT NULL PRIMARY KEY,
  EMPLOYEEID BIGSERIAL NOT NULL,
  CUSTOMERID BIGSERIAL NOT NULL,
  EMPLOYEENUMBER TEXT NOT NULL
);

CREATE TABLE parts (
  ID BIGSERIAL NOT NULL PRIMARY KEY,
  PARTNAME TEXT NOT NULL,
  PARTPRICE BIGSERIAL NOT NULL
);



INSERT INTO customers(ID, CUSTOMERNAME, CUSTOMERSURNAME, CUSTOMERNUMBER) VALUES (106,'AAA','BBB','C55');
INSERT INTO customers(ID, CUSTOMERNAME, CUSTOMERSURNAME, CUSTOMERNUMBER) VALUES (104,'AAA','BBB','C55');
INSERT INTO customers(ID, CUSTOMERNAME, CUSTOMERSURNAME, CUSTOMERNUMBER) VALUES (105,'AAA','BBB','C55');
UPDATE customers SET customername='FFF', customersurname='ggr',customernumber='rrr' WHERE id = 106;

-- DELETE FROM customers;