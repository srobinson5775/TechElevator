--DROP DATABASE IF EXISTS "EventMeetups";
--CREATE DATABASE "EventsDB";

BEGIN TRANSACTION;

CREATE TABLE member
(
	member_id SERIAL NOT NULL,
	first_name VARCHAR(50) NOT NULL,
	last_name VARCHAR(50) NOT NULL,
	phone_number VARCHAR (10) NULL,
	email_address VARCHAR (100) NOT NULL,
	date_of_birth DATE NOT NULL,
	reminder_emails BOOLEAN NOT NULL,
	event int,
	
	CONSTRAINT pk_member_number PRIMARY KEY (member_id),
	CONSTRAINT fk_member_event fOREIGN KEY (event) REFERENCES event (event_id)
);

CREATE TABLE interest_group
(
	group_id SERIAL NOT NULL,
	name VARCHAR (100) NOT NULL,
	
	CONSTRAINT pk_interest_group_group_id PRIMARY KEY (group_id),
	CONSTRAINT uq_group_name UNIQUE (name)
);
CREATE TABLE event
(
	event_id SERIAL NOT NULL,
	name VARCHAR (100) NOT NULL,
	description VARCHAR (400) NOT NULL,
	start_date DATE NOT NULL,
	start_time TIMESTAMP NOT NULL,
	duration TIMESTAMP NOT NULL,
	event_group VARCHAR NOT NULL,

	CONSTRAINT pk_event_event_id PRIMARY key (event_id),
	CONSTRAINT fk_event_event_group FOREIGN KEY (event_group) REFERENCES interest_group (group_id)
);

CREATE TABLE event_interest_group
(
	number SERIAL NOT NUll,
	event int,
	
	CONSTRAINT pk_event_interest_group PRIMARY KEY(number),
	CONSTRAINT fk_event_interest_group_event FOREIGN KEY (event) REFERENCES event(event_id),
	CONSTRAINT fk_event_interest_group_interest_group FOREIGN KEY (interest_group) REFERENCES interest_group (group_id)
);

END TRANSACTION;