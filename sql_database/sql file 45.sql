create database august;
use august;

Create table personal(

   Id INT,
   name varchar(50),
   birth_date DATE,
   phoneNo varchar(12),
   Gender varchar(1)
   );
   
   insert into personal(Id,name,birth_date,phoneNo,Gender)
   values(1,'Smruti','2023-09-12','9808213080','F'),
   (2,'Khafia','2023-11-12','9838883080','F');
   
   select * from personal;