drop database if exists WednesDay;
create database WednesDay;
use WednesDay;

CREATE TABLE Customer(
	Cust_ID INT Primary Key Auto_Increment,
	customer_Firstname varchar(30),
	customer_LastName varchar(30),
	customer_UserName varchar(30),
	customer_Password varchar(200),
	customer_Email  varchar(30),
	customer_PhoneNo varchar(15),
	Customer_Status varchar(20),
	Customer_ActivatedOn DateTime
);

Insert into Customer(customer_Firstname ,customer_LastName,customer_UserName,customer_Password,customer_Email,customer_PhoneNo,Customer_Status ,Customer_ActivatedOn)
values('Smruti','Rath','smrutirath','rath2002','smrutirath@gmail.com','7614567478','Active','2023-09-20 12:00:00'),
('Sriya','Ray','sriyaray','ray2003','sriyaray@gmail.com','9876766378','Inactive','2023-09-19 10:00:00'),
('Sukant','Dash','sukantdash','dash2004','sukantdash@gmail.com','9985673321','Blocking','2023-09-20 01:00:00'),
('Mira','Rout','mirarout','rout1002','mirarout@gmail.com','8876541324','Active','2023-09-20 03:00:00'),
('Subham','Sahu','subhamsahu','sahu2005','subhamsahu@gmail.com','9987345225','Inactive','2023-09-20 07:00:00');

CREATE TABLE Otp(
    Otp_ID INT Primary Key Auto_Increment,
	Cust_ID int,
	OptCode varchar(10),
	GeneratedOn DateTime,
    foreign key(Cust_ID) REFERENCES  Customer(Cust_ID)

);

Insert into Otp(Cust_ID,Optcode,GeneratedOn)
values(1,'3345','2023-09-20 07:00:00'),
(2,'4567','2023-09-19 12:00:00'),
(3,'6785','2023-09-18 02:00:00'),
(4,'5698','2023-09-20 12:00:00'),
(5,'9876','2023-09-19 02:00:00');
