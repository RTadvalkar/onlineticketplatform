create table theater_details (
	theaterid NUMBER PRIMARY KEY,
	theatername VARCHAR2(255),
	theatercity VARCHAR2(255)
);

create TABLE platform_offers (
	repeate_cust_offer NUMBER,
	afternoon_show_offer NUMBER
);

CREATE TABLE movie_details (
	movieid NUMBER PRIMARY KEY,
	movietitle VARCHAR2(255),
	movielanguage VARCHAR2(255),
	moviegenere VARCHAR2(255)
);

CREATE TABLE show_details(
	showid NUMBER PRIMARY KEY,
	theaterid NUMBER FOREIGN KEY,
	movieid NUMBER FOREIGN KEY,
	showtime DATE,
	totalseats NUMBER,
	availableseats NUMBER,
	showprice NUMBER
);
