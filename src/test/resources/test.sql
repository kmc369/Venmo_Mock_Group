-- This is a testing Database we can change it at any point to make sure the code functionality
-- passes.


BEGIN TRANSACTION;

--Creates the Database table for user
CREATE TABLE users (
  user_id SERIAL PRIMARY KEY,
  username VARCHAR(255) UNIQUE NOT NULL,
  password VARCHAR(255) NOT NULL
);

CREATE TABLE stocks (
 stock_id serial PRIMARY KEY,
 quantity INTEGER,
 cost DECIMAL(6,2),
 symbol VARCHAR,
 owner VARCHAR,
 CHECK (quantity >= 0), CHECK (cost >= 0)
);

CREATE TABLE carts (
  cart_id INTEGER REFERENCES users(user_id) UNIQUE,
  stock_id INTEGER REFERENCES stocks(stock_id) UNIQUE,
  user_stock_quantity_to_buy INTEGER
);

CREATE TABLE portfolio (
    portfolio_id serial PRIMARY KEY,
    user_id INTEGER,
    stock_id INTEGER,
    user_owned_stock_quantity INTEGER,
    FOREIGN KEY(user_id) REFERENCES users(user_id),
    FOREIGN KEY(stock_id) REFERENCES stocks(stock_id)
);


COMMIT;


INSERT INTO users(username, password) VALUES ('John Doe', 'Hello');

INSERT INTO stocks(quantity, cost, symbol, owner) VALUES (1000, 100.00, 'ABC', 'Google Inc.');

INSERT INTO carts(cart_id, stock_id, user_stock_quantity_to_buy) VALUES (1, 1, 100);

INSERT INTO portfolio(user_id, stock_id, quantity) VALUES (1, 1, 100);