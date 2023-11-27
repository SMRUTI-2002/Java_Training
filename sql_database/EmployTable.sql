create database infinite_august23;

use infinite_august23;

Create Table Employ

(

   Empno INT primary key,

   Name varchar(30),

   Gender enum('MALE', 'FEMALE'),

   Dept varchar(30),

   Desig varchar(30),

   Basic numeric(9,2)

);
Insert into Employ(Empno, Name, Gender, Dept, Desig, Basic) 

values(1,'SubhraPrakash','MALE','Java','Programmer',88422),

(2,'Ganesh','MALE','Dotnet','Expert',77223),

(3,'Sonali','FEMALE','Java','Expert',77245),

(4,'Kaushik','MALE','Sql','Manager',77255),

(5,'Smruti','FEMALE','Sql','Expert',77244),

(6,'Sourabh','MALE','Java','Programmer',77255),

(7,'SatyaPrakash','MALE','Sql','DBA',88422),

(8,'Tanya','FEMALE','Dotnet','Manager',87742);