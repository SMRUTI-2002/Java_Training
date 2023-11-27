-- Display Max. salary from Enp table

select max(sal) from Emp;
select ename from Emp where sal = max(sal);
select ename from Emp where sal = (select max (sal) from Emp);

-- Display 2nd max. salary

select max(sal) from Emp where sal< (select max(sal) from Emp);

-- Display name of person who is getting 2nd max. salary

select ename from Emp where sal = 
(select max(sal) from Emp where sal < (select max(sal) from Emp));

-- Display 2nd min. salary

 select min(sal) from Emp where sal< (select min(sal) from Emp);
 
 -- -- Display name of person who is getting 2nd min. salary
 
 select ename from Emp where sal = 
(select min(sal) from Emp where sal < (select min(sal) from Emp));

