-- This is a testing Database we can change it at any point to make sure the code functionality
-- passes.


BEGIN TRANSACTION;

--Creates the Database table for user
CREATE TABLE users (
  user_id SERIAL PRIMARY KEY,
  username VARCHAR(255) UNIQUE NOT NULL,
  password VARCHAR(255) NOT NULL
);

CREATE TABLE carts (
  cart_id integer REFERENCES users(user_id) UNIQUE
);

CREATE TABLE stocks (
 stockid serial primary key,
 quantity integer, cost decimal(6,2),
 symbol varchar, owner varchar,
 cart_id integer,
 foreign key(cart_id) references carts(cart_id),
 CHECK (quantity >= 0), CHECK (cost >= 0)
);

INSERT into users(username, password)
VALUES ('John Doe', 'Hello');





COMMIT;


