drop database if exists Sunday;
create database Sunday;
use Sunday;

drop table if exists pesonal;
create table pesonal(
 id INT primary key,
 name varchar(50),
 age INT,
 gender char(2),
 phone varchar(15),
 city varchar(15)
);

Insert into pesonal(id,name,age,gender,phone,city)
values(1,'Ram Kumar',19,'M','387434362','Agra'),
(2,'Sarita Kumari',21,'	F','387434362','Delhi'),
(3,'Salman Khan',20,'M','877434362','Agra'),
(4,'Juhi Chawla',18,'F','387434362','Bhopal'),
(6,'Anil Kapoor',22,'M','87434362','Agra'),
(7,'John Abraham',21,'M','997434362','Delhi');


select * from pesonal;