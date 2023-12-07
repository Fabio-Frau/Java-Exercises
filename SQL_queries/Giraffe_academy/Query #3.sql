CREATE DATABASE automobile;
USE automobile;

CREATE TABLE vehicle(vehicleID VARCHAR(10), ownerID VARCHAR(10), plateNumber VARCHAR(10), phoneNumber INT);

ALTER TABLE vehicle ADD CONSTRAINT PK_vehicleID PRIMARY KEY  (vehicleID);
ALTER TABLE vehicle MODIFY COLUMN vehicleID VARCHAR(10) NOT NULL;

CREATE TABLE OWNER (
	ownerID VARCHAR(10),
	ownerName VARCHAR(50),
	ownerAddress VARCHAR(255),
	PRIMARY KEY (ownerId)
);

ALTER TABLE vehicle ADD FOREIGN KEY (ownerID) REFERENCES owner(ownerID);

SHOW COLUMNS FROM vehicle;