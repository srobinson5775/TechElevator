-- HotelDB database

BEGIN TRANSACTION;
	-- Table: public.address

	-- DROP TABLE public.address;

	CREATE TABLE IF NOT EXISTS public.address
	(
		address_id serial,
		address character varying(100) COLLATE pg_catalog."default",
		address2 character varying(100) COLLATE pg_catalog."default",
		city character varying(100) COLLATE pg_catalog."default",
		state character varying(100) COLLATE pg_catalog."default",
		zip character varying(10) COLLATE pg_catalog."default",
		CONSTRAINT pk_address PRIMARY KEY (address_id)
	)

	TABLESPACE pg_default;

	ALTER TABLE public.address
		OWNER to postgres;

	GRANT ALL ON TABLE public.address TO postgres;


	-- Table: public.hotel

	-- DROP TABLE public.hotel;

	CREATE TABLE IF NOT EXISTS public.hotel
	(
		hotel_id serial,
		name character varying(50) COLLATE pg_catalog."default" NOT NULL,
		stars integer,
		rooms_available integer,
		cover_image character varying(150) COLLATE pg_catalog."default",
		cost_per_night numeric,
		address_id integer NOT NULL,
		CONSTRAINT pk_hotel PRIMARY KEY (hotel_id),
		CONSTRAINT fk_hotel_address FOREIGN KEY (address_id)
			REFERENCES public.address (address_id) MATCH SIMPLE
			ON UPDATE NO ACTION
			ON DELETE NO ACTION
	)

	TABLESPACE pg_default;

	ALTER TABLE public.hotel
		OWNER to postgres;

	GRANT ALL ON TABLE public.hotel TO postgres;


	-- Table: public.reservation

	-- DROP TABLE public.reservation;

	CREATE TABLE IF NOT EXISTS public.reservation
	(
		reservation_id serial,
		hotel_id integer,
		full_name character varying(100) COLLATE pg_catalog."default",
		checkin_date character varying(100) COLLATE pg_catalog."default",
		checkout_date character varying(100) COLLATE pg_catalog."default",
		guests integer,
		CONSTRAINT pk_reservation PRIMARY KEY (reservation_id),
		CONSTRAINT fk_reservation_hotel FOREIGN KEY (hotel_id)
			REFERENCES public.hotel (hotel_id) MATCH SIMPLE
			ON UPDATE NO ACTION
			ON DELETE NO ACTION
	)

	TABLESPACE pg_default;

	ALTER TABLE public.reservation
		OWNER to postgres;

	GRANT ALL ON TABLE public.reservation TO postgres;
COMMIT

