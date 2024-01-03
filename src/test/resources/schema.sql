DROP TABLE if EXISTS employees;

CREATE TABLE if NOT EXISTS employees (
    id serial,
    employee_id VARCHAR(10),
    employee_name VARCHAR(255),
    employee_password VARCHAR(10),
    PRIMARY KEY(id)
);