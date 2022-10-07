CREATE DATABASE 'Phoenix_Airline';

USE Phoenix_Airline;


CREATE TABLE User (
  User_ID int(5),
  User_Name varchar(25),
  User_Email varchar(25),
  Last_Login_Time time,
  IP float,
  Staff_ID int(5),
  Staff_Email varchar(25),
  Admin_ID varchar(25),
  PRIMARY KEY (User_ID),
  PRIMARY KEY (User_Email)
);


ALTER TABLE Ticket ADD FOREIGN KEY (User_ID) REFERENCES User (User_ID);

ALTER TABLE Ticket ADD FOREIGN KEY (User_Email) REFERENCES User (User_Email);



ALTER TABLE Ticket ADD FOREIGN KEY (Flight_ID) REFERENCES Flight (Flight_ID);

ALTER TABLE Flight ADD FOREIGN KEY (User_ID) REFERENCES User (User_ID);

ALTER TABLE Flight ADD FOREIGN KEY (User_Email) REFERENCES User (User_Email);

ALTER TABLE Flight ADD FOREIGN KEY (Staff_ID) REFERENCES Staff (Staff_ID);

ALTER TABLE Flight ADD FOREIGN KEY (Ticket_ID) REFERENCES Ticket (Ticket_ID);
