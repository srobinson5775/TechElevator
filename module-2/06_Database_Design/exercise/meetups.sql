BEGIN TRANSACTION;

CREATE TABLE member
(
	member_id SERIAL NOT NULL,
	first_name VARCHAR(50) NOT NULL,
	last_name VARCHAR(50) NOT NULL,
	phone_number VARCHAR(10) NULL,
	email_address VARCHAR(100) NOT NULL,
	date_of_birth DATE NOT NULL,
	reminder_emails BOOLEAN NOT NULL,
	
	CONSTRAINT pk_member PRIMARY KEY(member_id)
);

CREATE TABLE interest_group
(
	group_id SERIAL NOT NULL,
	name VARCHAR (100) NOT NULL,

CONSTRAINT pk_interest_group PRIMARY KEY(group_id),
CONSTRAINT uq_interest_group UNIQUE(name)
);

CREATE TABLE event
(
	event_id SERIAL NOT NULL,
	name VARCHAR (100) NOT NULL,
	description VARCHAR (400) NOT NULL,
	start_date DATE NOT NULL,
	start_time TIMESTAMP NOT NULL,
	event_group VARCHAR NOT NULL,
	
	CONSTRAINT pk_event PRIMARY KEY(event_id)

);

CREATE TABLE member_event
(
	event_id SERIAL NOT NULL,
	member_id SERIAL NOT NULL,
	event_group VARCHAR(100) NOT NULL,
	
	CONSTRAINT pk_member_event PRIMARY KEY(event_group),
	CONSTRAINT fk_member_event FOREIGN KEY(member_id) REFERENCES member(member_id)
	--CONSTRAINT fk_member_event FOREIGN KEY(event_id) REFERENCES event(event_id)
);

CREATE TABLE member_interest_group
(
	member_id SERIAL NOT NULL,
	group_name VARCHAR(100) NOT NULL,
	
	CONSTRAINT pk_member_interest_group PRIMARY KEY(group_name),
	CONSTRAINT fk_member_interest_group FOREIGN KEY(group_name) REFERENCES interest_group(name) 

);

--ROLLBACK;
