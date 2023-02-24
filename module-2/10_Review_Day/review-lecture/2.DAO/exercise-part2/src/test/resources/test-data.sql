BEGIN TRANSACTION;

DROP TABLE IF EXISTS reservation;
DROP TABLE IF EXISTS site;
DROP TABLE IF EXISTS campground;
DROP TABLE IF EXISTS park;

CREATE TABLE park (
  park_id serial,
  name varchar(80) NOT NULL,          -- Name of the park
  location varchar(50) NOT NULL,      -- State name(s) where park is located
  establish_date date NOT NULL,       -- Date park was established
  area integer NOT NULL,              -- Area in acres
  visitors integer NOT NULL,          -- Latest recorded number of annual visitors
  description varchar(500) NOT NULL,
  CONSTRAINT pk_park_park_id PRIMARY KEY (park_id)
);

CREATE TABLE campground (
  campground_id serial,
  park_id integer NOT NULL,           -- Parent park
  name varchar(80) NOT NULL,          -- Name of the campground
  open_from_mm integer NOT NULL,      -- Campground is open from month: 1=January, 2=February, ... 12=December
  open_to_mm integer NOT NULL,        -- Campground is open to month: 1=January, 2=February, ... 12=December
  daily_fee money NOT NULL,
  CONSTRAINT pk_campground_campground_id PRIMARY KEY (campground_id)
);

CREATE TABLE site (
  site_id serial,
  campground_id integer NOT NULL,
  site_number integer NOT NULL,                   -- Site numbers are
  max_occupancy integer NOT NULL DEFAULT 6,       -- Sites are limited to 6 people, however some sites are "doubled" (12 people)
  accessible boolean NOT NULL DEFAULT FALSE,      -- Accessible site, reserved for campers with disabilities
  max_rv_length integer NOT NULL DEFAULT 0,       -- RVs/Trailers not permitted if length is 0
  utilities boolean NOT NULL DEFAULT FALSE,       -- Electricity, running water available.
  CONSTRAINT pk_site_site_number_campground_id PRIMARY KEY (site_id)
);

CREATE TABLE reservation (
  reservation_id serial,
  site_id integer NOT NULL,	  					-- ID of site the reservation is at
  name varchar(80) NOT NULL,					-- Name for the reservation
  from_date date NOT NULL,						-- Start date of reservation
  to_date date NOT NULL,						-- End date of reservation
  create_date date NOT NULL DEFAULT now(),		-- Date the reservation was booked
  CONSTRAINT pk_reservation_reservation_id PRIMARY KEY (reservation_id)
);


/* test parks */
INSERT INTO park (name, location, establish_date, area, visitors, description)
VALUES ('Park 1', 'Pennsylvania', '1/1/1970', 1024, 512, 'Test description 1'); -- park_id will be 1 due to serial

INSERT INTO park (name, location, establish_date, area, visitors, description)
VALUES ('Park 2', 'Ohio', '1/1/1970', 2048, 1024, 'Test description 2'); -- park_id will be 2 due to serial


/* test campgrounds */
INSERT INTO campground(park_id, name, open_from_mm, open_to_mm, daily_fee)
VALUES (1, 'Test Campground 1', 1, 12, 35); -- campground_id will be 1 due to serial

INSERT INTO campground(park_id, name, open_from_mm, open_to_mm, daily_fee)
VALUES (1, 'Test Campground 2', 1, 12, 35); -- campground_id will be 2 due to serial


/* test sites */
/**** accepts RVs */
INSERT INTO site(campground_id, site_number, max_occupancy, accessible, max_rv_length, utilities)
VALUES (1, 1, 10, true, 33, true); -- site_id will be 1 due to serial

INSERT INTO site(campground_id, site_number, max_occupancy, accessible, max_rv_length, utilities)
VALUES (1, 2, 10, true, 30, true); -- site_id will be 2 due to serial

/**** doesn't accept RVs */
INSERT INTO site(campground_id, site_number, max_occupancy, accessible, max_rv_length, utilities)
VALUES (1, 3, 10, true, 0, true); -- site_id will be 3 due to serial

INSERT INTO site(campground_id, site_number, max_occupancy, accessible, max_rv_length, utilities)
VALUES (1, 4, 10, true, 0, true); -- site_id will be 4 due to serial

INSERT INTO site(campground_id, site_number, max_occupancy, accessible, max_rv_length, utilities)
VALUES (1, 5, 10, true, 0, true); -- site_id will be 5 due to serial

INSERT INTO site(campground_id, site_number, max_occupancy, accessible, max_rv_length, utilities)
VALUES (1, 6, 10, true, 0, true); -- site_id will be 6 due to serial

INSERT INTO site(campground_id, site_number, max_occupancy, accessible, max_rv_length, utilities)
VALUES (1, 7, 10, true, 0, true); -- site_id will be 7 due to serial

INSERT INTO site(campground_id, site_number, max_occupancy, accessible, max_rv_length, utilities)
VALUES (1, 8, 10, true, 0, true); -- site_id will be 8 due to serial

INSERT INTO site(campground_id, site_number, max_occupancy, accessible, max_rv_length, utilities)
VALUES (1, 9, 10, true, 0, true); -- site_id will be 9 due to serial

INSERT INTO site(campground_id, site_number, max_occupancy, accessible, max_rv_length, utilities)
VALUES (1, 10, 10, true, 0, true); -- site_id will be 10 due to serial

INSERT INTO site(campground_id, site_number, max_occupancy, accessible, max_rv_length, utilities)
VALUES (1, 11, 10, true, 0, true); -- site_id will be 11 due to serial

/* test reservations */

/** site 1 reservations in past only */
/**** past to past */
INSERT INTO reservation(site_id, name, from_date, to_date, create_date)
VALUES (1, 'Amy Adams', CURRENT_DATE - 18, CURRENT_DATE - 11, CURRENT_DATE - 23); -- reservation_id will be 1 due to serial

INSERT INTO reservation(site_id, name, from_date, to_date, create_date)
VALUES (1, 'Bob Billings', CURRENT_DATE - 2, CURRENT_DATE - 1, CURRENT_DATE - 3); -- reservation_id will be 2 due to serial

/** site 2 reservations */
/**** past to past */
INSERT INTO reservation(site_id, name, from_date, to_date, create_date)
VALUES (2, 'Carl Cook', CURRENT_DATE - 15, CURRENT_DATE -10, CURRENT_DATE - 20); -- reservation_id will be 3 due to serial

/** site 3 reservations */
/**** past to past */
INSERT INTO reservation(site_id, name, from_date, to_date, create_date)
VALUES (3, 'Denise Davies', CURRENT_DATE -3, CURRENT_DATE - 1, CURRENT_DATE - 10); -- reservation_id will be 4 due to serial

/** site 4 reservations */
/**** past to current */
INSERT INTO reservation(site_id, name, from_date, to_date, create_date)
VALUES (4, 'Eddie Eddies', CURRENT_DATE - 5, CURRENT_DATE, CURRENT_DATE - 10); -- reservation_id will be 5 due to serial

/** site 5 reservations */
/**** past to current */
INSERT INTO reservation(site_id, name, from_date, to_date, create_date)
VALUES (5, 'Fred Funston', CURRENT_DATE - 1, CURRENT_DATE, CURRENT_DATE - 10); -- reservation_id will be 6 due to serial

/** site 6 reservations */
/**** past to future */
INSERT INTO reservation(site_id, name, from_date, to_date, create_date)
VALUES (6, 'Gina Garbot', CURRENT_DATE - 1, CURRENT_DATE + 1, CURRENT_DATE - 10); -- reservation_id will be 7 due to serial

/** site 7 reservations */
/**** past to future */
INSERT INTO reservation(site_id, name, from_date, to_date, create_date)
VALUES (7, 'Hank Howard', CURRENT_DATE - 10, CURRENT_DATE + 10, CURRENT_DATE - 15); -- reservation_id will be 8 due to serial

/** site 8 reservations */
/**** current to future */
INSERT INTO reservation(site_id, name, from_date, to_date, create_date)
VALUES (8, 'Jen Johnson', CURRENT_DATE, CURRENT_DATE + 1, CURRENT_DATE - 10); -- reservation_id will be 9 due to serial

/** site 9 reservations */
/**** current to future */
INSERT INTO reservation(site_id, name, from_date, to_date, create_date)
VALUES (9, 'Leonard Leonardson', CURRENT_DATE, CURRENT_DATE + 10, CURRENT_DATE - 10); -- reservation_id will be 10 due to serial

/** site 10 reservations */
/**** future to future */
INSERT INTO reservation(site_id, name, from_date, to_date, create_date)
VALUES (10, 'Mark Mandel', CURRENT_DATE + 1, CURRENT_DATE + 2, CURRENT_DATE - 10); -- reservation_id will be 11 due to serial

/** site 11 reservations */
/**** future to future */
INSERT INTO reservation(site_id, name, from_date, to_date, create_date)
VALUES (11, 'Nancy Norbert', CURRENT_DATE + 5, CURRENT_DATE + 10, CURRENT_DATE - 10); -- reservation_id will be 12 due to serial

ALTER TABLE campground ADD FOREIGN KEY (park_id) REFERENCES park(park_id);
ALTER TABLE site ADD FOREIGN KEY (campground_id) REFERENCES campground(campground_id);
ALTER TABLE reservation ADD FOREIGN KEY (site_id) REFERENCES site(site_id);

COMMIT;
