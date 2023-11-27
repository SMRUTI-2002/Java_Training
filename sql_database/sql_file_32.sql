use practice23;

drop table if Exists empTest;
create table EmpTest
(
   Empno INT auto_increment,
   Name varchar(10),
   Sal int
);

-- Change the field name size to 30 chars

alter table EmpTest modify Name varchar(30);

desc EmpTest; 

-- 	Add new field gender to the particular table

alter table EmpTest Add Gender ENUM('MALE','FEMALE');

-- Add primary Key on Empno Field 

alter table EmpTest add primary key(empno);

desc EmpTest;
   