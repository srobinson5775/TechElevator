--DROP DATABASE IF EXISTS "ArtGallery";
--CREATE DATABASE "ArtGallery";

--DROP TABLE IF EXISTS customer_purchase;
--DROP TABLE IF EXISTS art;
--DROP TABLE IF EXISTS artist;
--DROP TABLE IF EXISTS customer;

BEGIN TRANSACTION;

CREATE TABLE customer
(
	customer_id SERIAL,
	name VARCHAR(100) NOT NULL,
	address VARCHAR(150) NOT NULL,
	phone VARCHAR(11) NULL,
	
	CONSTRAINT pk_customer PRIMARY KEY (customer_id),
	CONSTRAINT uq_customer_phone UNIQUE (phone)
	
);

CREATE TABLE artist
(
	artist_id SERIAL,
	first_name VARCHAR(50) NOT NULL,
	last_name VARCHAR(50) NOT NULL,
	
	CONSTRAINT pk_artist PRIMARY KEY (artist_id)
);


CREATE TABLE art
(
	art_code_id SERIAL,
	artist_id INT NOT NULL,
	title VARCHAR(64) NOT NULL,
	
	CONSTRAINT pk_art PRIMARY KEY (art_code_id),
	CONSTRAINT fk_art_artist FOREIGN KEY (artist_id) REFERENCES artist (artist_id)
	
);

CREATE TABLE customer_purchase
(
	customer_id INT NOT NULL,
	art_code_id INT NOT NULL,
	purchase_date TIMESTAMP NOT NULL,
	price DECIMAL NOT NULL DEFAULT 500,
	
	CONSTRAINT pk_customer_purchase PRIMARY KEY (customer_id, art_code_id, purchase_date),
	CONSTRAINT fk_customer_purchase_customer FOREIGN KEY (customer_id) REFERENCES customer (customer_id),
	CONSTRAINT fk_customer_purchase_art FOREIGN KEY (art_code_id) REFERENCES art (art_code_id),
	CONSTRAINT chk_price CHECK (price < 1000000)
		
);

-- ROLLBACK;

COMMIT TRANSACTION;


