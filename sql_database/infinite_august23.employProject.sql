drop database if exists infinite_august23;

create database infinite_august23;

use infinite_august23;

drop table if exists Employ ;

Create Table Employ (Empno INT primary key, Name varchar(30),Gender enum('MALE','FEMALE'),
Dept varchar(30), desig varchar(30),basic numeric(9,2));
desc employ;

select * from Employ1;

Insert into Employ (Empno,name,gender,dept,desig,basic) 
values(1,'Ganesh','MALE','Java','Programmer',89798),
(2,'ananya routray','FEMALE','Java','Programmer',89868),
(3,'sonali','FEMALE','dotnet','Expert',89098),
(4,'kushik','MALE','sql','Manager',82398),
(5,'Smruti','FEMALE','Java','Programmer',89998),
(6,'sourabh','MALE','dotnet','Expert',89888),
(7,'satyaPrakash','MALE','sql','DBA',89756),
(8,'Tanya','FEMALE','JAva','Programmer',89898);

select * from Employ;

create table Login
(
   userName varchar(30) primary key,
   passCode varchar(200)
);

Insert into login(UserName,PassCode)
values('Smruti','smruti');