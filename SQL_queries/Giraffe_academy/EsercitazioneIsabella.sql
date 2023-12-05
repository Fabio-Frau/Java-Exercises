 DROP DATABASE IF EXISTS library;
 CREATE DATABASE library;

USE library;

-- Creazione tabelle

CREATE TABLE `Users` (
	UserId INT NOT NULL AUTO_INCREMENT,
	Username VARCHAR(50) NOT NULL,
	Password VARCHAR(50) NOT NULL ,
	RoleId INT,
	PRIMARY KEY (UserId)
	);
	
CREATE TABLE Books (
	BookId INT NOT NULL AUTO_INCREMENT,
	Title VARCHAR(50),
	AuthorId INT NOT NULL,
	PublisherId INT NOT NULL,
	Quantity INT,
	PRIMARY KEY (BookId)
);

CREATE TABLE Reservations (
	ReservationId INT NOT NULL AUTO_INCREMENT,
	UserId INT NOT NULL,
	BookId INT NOT NULL,
	StartDate DATETIME DEFAULT NOW(),
	EndDate DATETIME,
	PRIMARY KEY (ReservationId)
);

CREATE TABLE Authors (
	AuthorId INT NOT NULL AUTO_INCREMENT,
	`Name` VARCHAR(50),
	Surname VARCHAR(50),
	PRIMARY KEY (AuthorId)
);

CREATE TABLE PublishingHouse (
	PublisherId INT NOT NULL AUTO_INCREMENT,
	PublishingHouseName VARCHAR(50),
	PRIMARY KEY(PublisherId)
);

CREATE TABLE Roles(
	RoleId INT NOT NULL AUTO_INCREMENT,
	`Role` VARCHAR(50),
	PRIMARY KEY(RoleId)
);


-- Creazione chiavi esterne

ALTER TABLE `Users`
ADD (	CONSTRAINT FK_UsersRoles FOREIGN KEY (RoleId) REFERENCES Roles(RoleId) );
	

ALTER TABLE Books
ADD (
	CONSTRAINT FK_BooksAuthors FOREIGN KEY (AuthorId) REFERENCES Authors(AuthorId),
	CONSTRAINT FK_BookPublishingHouse FOREIGN KEY (PublisherId) REFERENCES PublishingHouse(PublisherId)
	);
	

ALTER TABLE Reservations ADD (
	CONSTRAINT FK_Reservations_Users FOREIGN KEY (UserId) REFERENCES `Users` (UserId) ,
	CONSTRAINT FK_Reservation_Book FOREIGN KEY (BookId) REFERENCES Books(BookId)
);


-- StartDate and EndDate => DATE

ALTER TABLE Reservations MODIFY StartDate DATE DEFAULT (CURRENT_DATE) ;
ALTER TABLE Reservations MODIFY EndDate DATE;



	












	
	
	
	