select max(accountNo) from bank;

select case when max(accountNo) Is NULL THEN 1 else
max(accountNo)+1 end accno from Bank; 
select (

SELECT MAX(accountNo) 
FROM Bank
) +1 AS accno ;