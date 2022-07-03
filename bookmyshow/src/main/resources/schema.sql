create schema IF NOT EXISTS booking_platform;

create table IF NOT EXISTS booking_platform.theater_details (
	theaterid NUMBER PRIMARY KEY,
	theatername VARCHAR2(255),
	theatercity VARCHAR2(255)
);

create TABLE IF NOT EXISTS booking_platform.platform_offers (
	repeate_cust_offer NUMBER,
	afternoon_show_offer NUMBER
);

CREATE TABLE IF NOT EXISTS booking_platform.movie_details (
	movieid NUMBER PRIMARY KEY,
	movietitle VARCHAR2(255),
	movielanguage VARCHAR2(255),
	moviegenere VARCHAR2(255)
);

CREATE TABLE IF NOT EXISTS booking_platform.show_details(
	showid NUMBER PRIMARY KEY,
	theaterid NUMBER,
	movieid NUMBER,
	showtime DATE,
	totalseats NUMBER,
	availableseats NUMBER,
	showprice NUMBER,
	cityname VARCHAR2(150)
);

INSERT INTO booking_platform.theater_details VALUES (1, 'ALKA', 'PUNE');
INSERT INTO booking_platform.platform_offers (repeate_cust_offer, afternoon_show_offer) VALUES (50, 20);
INSERT INTO booking_platform.movie_details (movieid, movietitle, movielanguage, moviegenere) VALUES (1, 'BATMAN', 'ENGLISH', 'ACTION');
INSERT INTO booking_platform.show_details (showid, theaterid, movieid, showtime, totalseats, availableseats, showprice) VALUES (1, 1, 1, TO_DATE( '2-DEC-2006', 'DD-MON-YYYY' ), 50, 25, 300);